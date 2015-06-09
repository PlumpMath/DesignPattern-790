package com.lihb.designpattern.simpleFactory;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class OperationFactory {

    public static Operation createOperation(int oper) {
        Operation operation = null;
        switch (oper){
            case 1:
                operation =  new AddOperation();
                break;
            case 2:
                operation =  new SubOperation();
                break;
            default:
                break;
        }
        return operation;
    }
}
