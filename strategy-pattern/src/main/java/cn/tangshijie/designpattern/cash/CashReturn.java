package cn.tangshijie.designpattern.cash;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-18 23:38
 */
public class CashReturn extends CashSuper {

    private double returnCondition;
    private double returnMoney;

    public double getReturnCondition() {
        return returnCondition;
    }

    public void setReturnCondition(double returnCondition) {
        this.returnCondition = returnCondition;
    }

    public double getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public CashReturn() {
    }

    public CashReturn(double returnCondition, double returnMoney) {
        this.returnCondition = returnCondition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= returnCondition) {
            result = money - Math.floor(money / returnCondition) * returnMoney;
        }
        return result;
    }
}
