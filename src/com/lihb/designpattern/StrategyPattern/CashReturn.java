package com.lihb.designpattern.StrategyPattern;

/**
 * 类说明：
 * 返利收费子类
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }


    @Override
    public double acceptCash(double money) {
        double result = 0.0d;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
