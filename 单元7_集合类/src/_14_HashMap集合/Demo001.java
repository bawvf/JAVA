package _14_HashMap集合;

import java.util.HashMap;

public class Demo001 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String,String> map = new HashMap<String,String>();

        //void put(Object key,Object value) 向map集合中添加指定键值映射的元素
        map.put("hm001","张三");
        map.put("hm002","李四");
        map.put("hm003","王五");
        String oldValue = map.put("hm003","赵六");  //键不能重复，使用新值将老值替换，并返回老值
        System.out.println(oldValue);
        System.out.println(map);        //{hm003=赵六, hm002=李四, hm001=张三}

        //int size() 返回Map集合键值对映射的个数
        System.out.println(map.size());

        //Object get(Object key) 返回指定键所映射的值，如果此映射不包含该键的映射关系，则返回null
        String value = map.get("hm001");
        System.out.println(value);      //张三

        //boolean containsKey(Object key) 查看Map集合中是否存在指定的键对象key
        boolean b = map.containsKey("hm002");
        System.out.println(b);          //true

        //boolean containsValue(Object value) 查看Map集合中是否存在指定的值对象value
        b = map.containsValue("王五");
        System.out.println(b);          //false

        //Object remove(Object key) 删除并返回Map集合中指定键对象key的键值映射元素
//        map.remove("hm003");
//        System.out.println(map);       //{hm002=李四, hm001=张三}

        //boolean remove(Object key,Object value) 删除Map集合中键值映射同时匹配的元素(JDK 8新方法)
        map.remove("hm003","赵六");
        System.out.println(map);

        //void clear() 清空整个Map集合中的键值映射元素
//        map.clear();
//        System.out.println(map);        //{}

        //String replace(Object key,Object value) 将Map集合中指定键对象key所映射的值修改为value(JDK 8新方法)
        map.replace("hm001","田老八");
        System.out.println(map);        //{hm002=李四, hm001=田老八}
    }
}
