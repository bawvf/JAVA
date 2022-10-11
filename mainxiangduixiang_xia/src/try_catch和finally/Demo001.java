package try_catch和finally;

public class Demo001 {
    public static void main(String[] args) {
        try {
            int num1 = 5;
            int num2 = 0;

            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } finally {
            //一般适用于释放资源，无论是否出现异常，finally都会执行到
            System.out.println("释放掉了系统资源");
        }

        System.out.println("后续代码");
    }
}
