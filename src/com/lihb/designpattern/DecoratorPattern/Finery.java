package com.lihb.designpattern.DecoratorPattern;

/**
 * 类说明：
 * 装饰模型
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class Finery extends Person{

    protected Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }

}
