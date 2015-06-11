package com.lihb.designpattern.DecoratorPattern;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/11
 */

public class Client {

    public static void main(String[] args) {
        Person p = new Person("小魅");

        Finery tshirt = new TShirt();
        Finery sneaker = new Sneaker();
        Finery bigTrouser = new BigTrouser();

        tshirt.decorator(p);
        sneaker.decorator(tshirt);
        bigTrouser.decorator(sneaker);
        bigTrouser.show();

    }
}
