package com.lihb.designpattern.StrategyPattern;

/**
 * 类说明：
 * 正常收费子类
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
