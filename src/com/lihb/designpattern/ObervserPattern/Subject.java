package com.lihb.designpattern.ObervserPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public abstract class Subject {

    private List<MyObserver> observerList = new ArrayList<MyObserver>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(MyObserver observer) {
        observerList.add(observer);

    }

    /**
     * 移除观察者
     * @param observer
     */
    public void remove(MyObserver observer){
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {

        for (MyObserver observer : observerList) {
            // 通知观察者更新数据
            observer.update();
        }

    }
}
