package _2_try_catch和finally异常;

public class DEmo001 {
    public static void main(String[] args) {
        try {
            int num1 = 5;
            int num2 = 0;

            int result = num1 / num2;
            System.out.println(result);
        }catch (ArithmeticException a) {
            a.printStackTrace();
        }finally {
//            finally一般适用于释放资源,无论是否出现异常，finally都会执行到
            System.out.println("释放掉了系统资源");

        }

        System.out.println("这是我的后续代码");
    }
}
