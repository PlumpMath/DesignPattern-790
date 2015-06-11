package com.lihb.designpattern.ObervserPattern;

/**
 * 类说明：
 * 司机观察者
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class ObserverInstanceNBA extends MyObserver{

    private String name;

    private SubjectInstance subject;  //subject参数，确定是哪个subjet发生了变化。

    public ObserverInstanceNBA(String name, SubjectInstance subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getCurrState() + "," + name +"关闭NAB直播，专心工作。");
    }
}
