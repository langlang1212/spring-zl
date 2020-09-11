package com.dywy;

import java.util.HashMap;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.dywy
 * @Author: zhanglang
 * @CreateTime: 2020-05-21 11:04
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        Object[] empty_table = {};

        Object[] table = empty_table;
        System.out.println(table == empty_table);
    }
}
