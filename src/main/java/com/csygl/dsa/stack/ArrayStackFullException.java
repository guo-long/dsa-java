package com.csygl.dsa.stack;


/**
 * 基于数组实现栈而定义的栈满异常
 */
public class ArrayStackFullException extends RuntimeException {

    public ArrayStackFullException() {
        super("stack is full");
    }

    public ArrayStackFullException(String msg) {
        super(msg);
    }
}
