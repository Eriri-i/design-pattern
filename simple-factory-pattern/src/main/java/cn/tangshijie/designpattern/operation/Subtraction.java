package cn.tangshijie.designpattern.operation;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-16 23:51
 */
public class Subtraction extends Operate {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
