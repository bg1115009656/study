package com.gbai.exception;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-11 17:09
 **/
public class NewUserNotFoundException
        extends RuntimeException

{

    public NewUserNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public NewUserNotFoundException(String msg) {
        super(msg);
    }
}
