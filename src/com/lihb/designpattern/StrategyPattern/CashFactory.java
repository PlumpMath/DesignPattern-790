package com.lihb.designpattern.StrategyPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class CashFactory  {

    public static CashSuper createCash(int cashType) {

        CashSuper cashSuper = null;
        switch (cashType) {
            case 1:
                cashSuper = new CashNormal();
                break;
            case 2:
                cashSuper = new CashRebate(0.8); //8折
                break;
            case 3:
                cashSuper = new CashReturn(160, 20);
                break;
            default:
                break;
        }
        return cashSuper;
    }
}
