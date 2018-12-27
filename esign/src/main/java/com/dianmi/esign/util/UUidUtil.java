package com.dianmi.esign.util;

import java.util.UUID;

/**
 * @program: esign
 * @description: 主键生成类
 * @author: gbai
 * @create: 2018-06-15 15:15
 **/
public class UUidUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }
}
