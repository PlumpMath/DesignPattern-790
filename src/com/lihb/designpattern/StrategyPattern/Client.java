package com.lihb.designpattern.StrategyPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class Client {

    public static void main(String[] args) {

        // 正常收费模式
        CashSuper cashSuper = CashFactory.createCash(1);
        System.out.println("正常收费： " + cashSuper.acceptCash(200));

        //打折收费模式
        cashSuper = CashFactory.createCash(2);
        System.out.println("打折收费（8折）： " + cashSuper.acceptCash(200));

        // 返利收费模式
        cashSuper = CashFactory.createCash(3);
        System.out.println("返利收费（满160减20）： " + cashSuper.acceptCash(200));
    }

}
