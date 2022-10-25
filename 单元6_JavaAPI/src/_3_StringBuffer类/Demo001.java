package _3_StringBuffer类;

public class Demo001 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb2);  //Hello

        //StringBuffer append(char c)添加字符到StringBuffer 对象中末尾
        sb2.append("World");
        System.out.println(sb2);  //HelloWorld

        //StringBuffer insert(int offset,String str) 在StringBuffer对象中的offset
        // 位置插入字符串str
        sb2.insert(5,"Java");
        System.out.println(sb2);

        //StringBuffer deleteCharAt(int index) 移除StringBuffer对象中指定位置的字符
        sb2.deleteCharAt(4);
        System.out.println(sb2);

        //StringBuffer delete(int start,int end)删除StringBuffer对象中指定范围的字符
        // 或字符串
        sb2.delete(0,4);
        System.out.println(sb2);

        //StringBuffer replace(int start,int end String s)将StringBuffer对象中指定
        //范围的字符或字符串s进行替换
        sb2.replace(0,4,"Hello");
        System.out.println(sb2);

        //void setCharAt(int index, char ch)修改指定位置index处的字符
        sb2.setCharAt(5,'w');
        System.out.println(sb2);

        //StringBuffer reverse()将此StringBuffer对象其反转形式取代
        System.out.println(sb2.reverse());

        //String toString() 返回StringBuffer缓冲区中的字符串对象
        String str = sb2.toString();
        System.out.println(str);
    }
}
