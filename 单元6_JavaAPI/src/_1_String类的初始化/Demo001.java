package _1_String类的初始化;

public class Demo001 {
    public static void main(String[] args) {
        String s1 = "你好啊！";
        System.out.println(s1);

        String s2 = new String("你好啊！");
        System.out.println(s2);

        char[] arr = {'你','好','啊','！'};
        String s3 = new String(arr);
        System.out.println(s3);

        byte[] arr2 = {97,98,99};
        String s4 = new String(arr2);
        System.out.println(s4);

        //作业的
        byte[] arr3 = {97,98,99};
        String s5 = new String(arr3,2,1);
        System.out.println(s5);
    }
}
