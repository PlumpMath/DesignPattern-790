package com.lihb.designpattern.StrategyPattern;

/**
 * 类说明：
 * 打折收费子类
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class CashRebate extends CashSuper {

    private  double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
