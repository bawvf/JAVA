package _5_自定义异常;

public class MyDivideException extends Exception {
    public MyDivideException() {}

    public MyDivideException(String s) {
        super(s);
    }
}
