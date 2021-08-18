package cn.tangshijie.designpattern;

import cn.tangshijie.designpattern.cash.CashSuper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-18 23:49
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public CashSuper getCashSuper() {
        return cashSuper;
    }

    public void setCashSuper(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
