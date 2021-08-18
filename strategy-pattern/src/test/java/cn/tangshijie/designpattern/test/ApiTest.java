package cn.tangshijie.designpattern.test;

import cn.tangshijie.designpattern.CashContext;
import cn.tangshijie.designpattern.CashContextWithSimpleFactory;
import cn.tangshijie.designpattern.cash.CashDiscount;
import cn.tangshijie.designpattern.cash.CashNormal;
import cn.tangshijie.designpattern.cash.CashReturn;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-18 23:57
 */
public class ApiTest {

    @Test
    public void test_CashContext() {
        CashContext cashContext;
        double price = 1000;
        int amount = 1;
        // 正常收费
        cashContext = new CashContext(new CashNormal());
        System.out.println("正常收费，最终价格为:" + cashContext.getResult(amount * price));

        // 打五折
        cashContext = new CashContext(new CashDiscount(0.5));
        System.out.println("打五折，最终价格为:" + cashContext.getResult(amount * price));

        // 满300减200
        cashContext = new CashContext(new CashReturn(300,200));
        System.out.println("满300减200，最终价格为:" + cashContext.getResult(amount * price));
    }

    @Test
    public void test_CashContextWithSimpleFactory() {
        double price = 1000;
        int amount = 1;
        String cashType = "打五折";
        CashContextWithSimpleFactory cc = new CashContextWithSimpleFactory(cashType);
        System.out.println(cashType + ",最终价格为:" + cc.getResult(amount * price));
    }
}
