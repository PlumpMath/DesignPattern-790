package com.lihb.designpattern.DecoratorPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class Person {

    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("正在打扮的" + name);
    }
}
