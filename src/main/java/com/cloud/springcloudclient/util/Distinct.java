package com.cloud.springcloudclient.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.until
 * @Class Distinct
 * @Date 2021/8/4 9:38
 */
public class Distinct {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //添加数据
        list.add("123abc");
        list.add("abc123");
        list.add("1234abcd");
        list.add("abcd1234");


        for (int i = 0; i < list.size(); i++) {

            //将字符串中的数字提取出来
            Pattern p = Pattern.compile("[^0-9]");
            Matcher m = p.matcher(list.get(i));
            String result = (m.replaceAll(""));

            for (int j=0;j<list.size();j++) {
                if (i != j) {
                    Pattern p2 = Pattern.compile("[^0-9]");
                    Matcher m2 = p2.matcher(list.get(j));
                    String result2= (m2.replaceAll(""));

                    if (result.equals(result2)) {
                        list.remove(j);
                    }
                }
            }

        }

        System.out.println(list);
    }
}

