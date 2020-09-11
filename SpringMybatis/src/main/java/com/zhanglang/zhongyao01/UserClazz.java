package com.zhanglang.zhongyao01;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring-zl
 * @BelongsPackage: com.zhanglang.zhongyao01
 * @Author: zhanglang
 * @CreateTime: 2020-04-01 10:27
 * @Description:
 */
@Component
public class UserClazz {

    private OrderClazz orderClazz;

    public OrderClazz getOrderClazz() {
        return orderClazz;
    }

    public void setOrderClazz(OrderClazz orderClazz) {
        this.orderClazz = orderClazz;
    }
}
