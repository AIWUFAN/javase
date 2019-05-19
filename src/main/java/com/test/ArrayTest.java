package com.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
    public static void main(String[] args) {
        //mapTest();
//        int a =10;
//        int b =20;
//        test1(a,b);
//        System.out.println(a);
//        System.out.println(b);

//        Student student = new Student();
//        student.setAge(10);
//        test1(student);
//        System.out.println(student);
        //  test2();


    }

    public static void mapTest() {
        Map<String, String> map = new HashMap<>();
//        map.put("1","a");
//        map.put("2","b");
//        map.put("3","c");
//        for (Map.Entry<String,String> mm: map.entrySet()) {
//            System.out.println(map);
//        }
        //  System.out.println(map.containsKey("1"));

        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
        Integer integer = Integer.valueOf(1);
        Integer intege2 = Integer.valueOf(1);
        System.out.println(integer == intege2);
    }

    public static void test1(Student obj) {
//        int temp = x;
//        x = y;
//        y = temp;
//        System.out.println(x);
//        System.out.println(y);
        Student student = new Student();
        student.setAge(20);
        // System.out.println(obj);
    }

    public static void test2() {
        //  String str = "hello";
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < 10; i++) {
            sb.append("world");
        }
        System.out.println(sb.toString());
    }

    public void test3() {
    }


}
