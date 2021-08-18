package cn.tangshijie.designpattern.cash;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-18 23:32
 */
public class CashDiscount extends CashSuper {

    private double discount;

    public CashDiscount() {
    }

    public CashDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double money) {
        return discount * money;
    }
}
