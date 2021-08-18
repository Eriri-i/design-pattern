package cn.tangshijie.designpattern;

import cn.tangshijie.designpattern.cash.CashDiscount;
import cn.tangshijie.designpattern.cash.CashNormal;
import cn.tangshijie.designpattern.cash.CashReturn;
import cn.tangshijie.designpattern.cash.CashSuper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-18 23:49
 */
public class CashContextWithSimpleFactory {

    private CashSuper cashSuper;

    public CashContextWithSimpleFactory(String cashType) {
        switch (cashType) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "打五折":
                cashSuper = new CashDiscount(0.5);
                break;
            case "满300减200":
                cashSuper = new CashReturn(300, 200);
                break;
            default:
        }
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
