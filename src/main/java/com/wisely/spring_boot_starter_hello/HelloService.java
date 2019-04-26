package com.wisely.spring_boot_starter_hello;

/**
 * Created by zy on 2019/2/20
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "Hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
