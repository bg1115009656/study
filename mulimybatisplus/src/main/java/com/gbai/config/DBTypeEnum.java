package com.gbai.config;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 17:28
 **/
public enum DBTypeEnum {
    test("test"), book("book");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}