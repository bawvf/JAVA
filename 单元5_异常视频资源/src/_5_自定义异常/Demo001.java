package _5_自定义异常;

public class Demo001 {
    public static void main(String[] args) {
        try {
            divide(6,0);
        } catch (MyDivideException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(int num1,int num2) throws MyDivideException {
        if (num2 == 0) {
            throw new MyDivideException("除数不能为0");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
