package com.lihb.designpattern.ObervserPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class Client {

    public static void main(String[] args) {
        SubjectInstance subject = new SubjectInstance();

        MyObserver observer1 = new ObserverInstanceStocker("炒股的小明", subject);
        MyObserver observer2 = new ObserverInstanceNBA("看NBA的小李", subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setCurrState("老板回来了");
        subject.notifyObserver();


    }
}
