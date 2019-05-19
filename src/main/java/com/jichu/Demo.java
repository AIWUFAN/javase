package com.jichu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
//        String s =null;
//       testString(s);
        //ystem.out.println(test1());
        // test2();
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(test3(arr, target)));
        System.out.println("demo1");

    }

    public static void testString(String str) {
        if (str == null) {
            return;
        }
        System.out.println("1");
    }

    public static String test1() {
        return "2";
    }

    public static void test2() {
        System.out.println(CourseTypeEnum.OFFLIVE_COURSE);
        if (2 == CourseTypeEnum.OFFLIVE_COURSE.getSeq()) {
            System.out.println("2");
        }
        System.out.println(CourseTypeEnum.VIDE0_COURSE);
    }


    public static void getMax() {
        int[] arr = {10, 6, 2, 8, 20, 80};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    public static int[] getNums(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static int[] test3(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
