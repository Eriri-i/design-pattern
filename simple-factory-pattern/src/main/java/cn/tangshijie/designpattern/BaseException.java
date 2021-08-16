package cn.tangshijie.designpattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : tangshijie
 * @since : 2021-08-16 23:55
 */
public class BaseException extends RuntimeException {

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message,cause);
    }
}
