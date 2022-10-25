package _4_System类;

import java.util.Properties;

public class Demo001 {
    public static void main(String[] args) {
        //static void exit(int status)
//        for (int i = 0; i <= 10; i++) {
//            if (i == 5) {
//                System.exit(0);
//            }
//            System.out.println(i);
//        }

        //static void gc()
//        System.gc();

        //static native long currentTimeMillis()
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//
//        long start = System.currentTimeMillis();
//        for (int i = 0; i <= 100; i++) {
//           System.out.println(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        //static void arraycopy(Object src,int srcPos,Object dest,int destPos,
        // int length)
        //Object src  要复制的源数组
        //int srcPos  源数组中的开始索引位置
        //Object dest   要复制的目标数组
        //nt destPos   目标数组的开始接受的索引位置
        //int destPos   复制的个数
//

        //static Properties getProperties()
//        Properties prop = System.getProperties();
//        System.out.println(prop);

        //static String getProperty(String key)
        String os =System.getProperty("os.name");
        System.out.println(os);
    }
}
