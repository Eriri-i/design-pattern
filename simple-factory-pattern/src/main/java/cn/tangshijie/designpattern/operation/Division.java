package cn.tangshijie.designpattern.operation;

import cn.tangshijie.designpattern.BaseException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-16 23:51
 */
public class Division extends Operate {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new BaseException("除数不能为0");
        }
        return getNumberA() + getNumberB();
    }
}
