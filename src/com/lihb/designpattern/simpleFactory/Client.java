package com.lihb.designpattern.simpleFactory;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class Client {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation(1);
        operation.oper_numA = 100;
        operation.oper_numB = 10;
        System.out.println(operation.getResult());


        Operation operation2 = OperationFactory.createOperation(2);
        operation2.oper_numA = 100;
        operation2.oper_numB = 10;
        System.out.println(operation2.getResult());

    }
}
