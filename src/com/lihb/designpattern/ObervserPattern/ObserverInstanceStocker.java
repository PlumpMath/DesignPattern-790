package com.lihb.designpattern.ObervserPattern;

/**
 * 类说明：
 * 股票观察者
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class ObserverInstanceStocker extends MyObserver{

    private String name;

    private SubjectInstance subject;

    public ObserverInstanceStocker(String name, SubjectInstance subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getCurrState() + "," + name +"关闭股票行情软件，专心工作。");
    }
}
