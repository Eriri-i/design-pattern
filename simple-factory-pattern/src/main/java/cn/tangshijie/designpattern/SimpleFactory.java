package cn.tangshijie.designpattern;

import cn.tangshijie.designpattern.operation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-16 23:46
 */
public class SimpleFactory {

    public Operate createOperate(String operate) {
        Operate result = null;
        switch (operate) {
            case "+":
                result = new Addition();
                break;
            case "-":
                result = new Subtraction();
                break;
            case "*":
                result = new Multiplication();
                break;
            case "/":
                result = new Division();
                break;
            default:
        }
        return result;
    }
}
