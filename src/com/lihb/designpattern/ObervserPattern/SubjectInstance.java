package com.lihb.designpattern.ObervserPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class SubjectInstance extends Subject {

    // 被观察者的当前状态，发送给通知者
    private String currState;

    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }
}
