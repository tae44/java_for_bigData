package com.jason.priv.entity;

public class Person {
    // public可以被任何类访问
    public String name;

    // protected不能被不同包里的类访问,除了子类
    // protected String name;

    // 默认的不能被不同包里的类访问,包括子类
    // String name;

    // 只能自己访问
    // private String name;

    public void introduce() {
        this.name = "";
    }
}

/*
    归纳:
             public      protected       default     private
    同一类中    *             *              *           *
    同一包中    *             *              *
      子类      *             *
    不同包中    *
 */
