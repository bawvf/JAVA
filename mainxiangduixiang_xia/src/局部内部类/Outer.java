package 局部内部类;

public class Outer {
    //外部类的成员变量
    int outer = 10;

    //外部类的成员方法
    public void outerMethod() {
        System.out.println("我是外部类的成员方法");
    }

    public void function() {
        //局部内部类
        class Inner {
            //内部类的成员变量
            int inner = 20;

            //内部类的成员方法
            public void innerMethod() {
                System.out.println("我是内部类的成员方法");
                System.out.println(outer);
                outerMethod();
            }
        }

        //创建局部内部类对象
        Inner i = new Inner();
        System.out.println(i.inner);
        i.innerMethod();

        }

    }

