package cn.tangshijie.designpattern.test;

import cn.tangshijie.designpattern.SimpleFactory;
import cn.tangshijie.designpattern.operation.Operate;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-17 0:03
 */
public class ApiTest {

    @Test
    public void test_SimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Operate operate = simpleFactory.createOperate("+");
        operate.setNumberA(1);
        operate.setNumberB(2);
        System.out.println(operate.getResult());
    }
}
