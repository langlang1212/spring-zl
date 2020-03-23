package com.zhanglang.proxy;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.proxy
 * @Author: zhanglang
 * @CreateTime: 2020-03-20 13:51
 * @Description:
 */
import com.zhanglang.handler.ParamInvocationHandler;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ProxyParamUtil {


    /**
     *  content --->string
     *  .java  io
     * .class
     *
     *
     *
     * .new   反射----》class
     * @return
     */
    public static Object newInstance(Class targetInf, ParamInvocationHandler h){
        Object proxy=null;
        //String handlerName = CoustomInvocationHandler.class.
        Method methods[] =targetInf.getDeclaredMethods();
        String line="\n";
        String tab ="\t";
        String infName = targetInf.getSimpleName();
        String content ="";
        String packageContent = "package com.google;"+line;
        String importContent = "import "+targetInf.getName()+";"+line
                +"import com.zhanglang.handler.ParamInvocationHandler;"+line
                +"import java.lang.Exception;"
                +"import java.lang.reflect.Method;"+line;
        String clazzFirstLineContent = "public class $Proxy implements "+infName+"{"+line;
        String filedContent  =tab+"private ParamInvocationHandler h;"+line;
        String constructorContent =tab+"public $Proxy (ParamInvocationHandler h){" +line
                +tab+tab+"this.h =h;"
                +line+tab+"}"+line;
        String methodContent = "";
        for (Method method : methods) {
            // 获取方法返回类型 如 String Object
            String returnTypeName = method.getReturnType().getSimpleName();
            // 获取方法的名称
            String methodName =method.getName();
            // Sting.class String.class
            // 获取方法的所有参数
            Class args[] = method.getParameterTypes();
            String argsContent = "";
            String paramsContent="";
            int flag =0;
            for (Class arg : args) {
                String temp = arg.getSimpleName();
                //String
                //String p0,Sting p1,
                argsContent+=temp+" p"+flag+",";
                paramsContent+="p"+flag+",";
                flag++;
            }
            if (argsContent.length()>0){
                argsContent=argsContent.substring(0,argsContent.lastIndexOf(",")-1);
                paramsContent=paramsContent.substring(0,paramsContent.lastIndexOf(",")-1);
            }
            methodContent+=tab+"public "+returnTypeName+" "+methodName+"("+argsContent+")throws Exception {"+line
                    +tab+tab+"Class[] params = {String.class};"+line
                    +tab+tab+"Method method = Class.forName(\""+targetInf.getName()+"\").getDeclaredMethod(\""+methodName+"\",params);"+line
                    +tab+tab+"String paras = "+paramsContent+";"+line
                    +tab+tab+"Object[] args = paras.split(\",\");"+line
                    +tab+tab+"return ("+returnTypeName+")h.invoke(method,args);"+line;
            methodContent+=tab+"}"+line;
        }

        content=packageContent+importContent+clazzFirstLineContent+filedContent+constructorContent+methodContent+"}";

        File file =new File("D:\\com\\google\\$Proxy.java");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();


            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileMgr.getJavaFileObjects(file);

            JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
            t.call();
            fileMgr.close();

            URL[] urls = new URL[]{new URL("file:D:\\\\")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class clazz = urlClassLoader.loadClass("com.google.$Proxy");

            Constructor constructor = clazz.getConstructor(ParamInvocationHandler.class);
            proxy = constructor.newInstance(h);
            //clazz.newInstance();
            //Class.forName()
        }catch (Exception e){
            e.printStackTrace();
        }





        /**
         * public UserDaoLog(UserDao target){
         * 		this.target =target;
         *
         *        }
         */
        return proxy;
    }
}
