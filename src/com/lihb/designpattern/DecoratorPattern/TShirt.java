package com.lihb.designpattern.DecoratorPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class TShirt extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.println("T恤");
    }
}
