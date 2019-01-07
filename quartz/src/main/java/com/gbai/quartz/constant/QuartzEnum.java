package com.gbai.quartz.constant;

public enum QuartzEnum {

    RUNNING(0),

    PAUSE(1),

    ERROR(2);

    private Integer value;

    QuartzEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
