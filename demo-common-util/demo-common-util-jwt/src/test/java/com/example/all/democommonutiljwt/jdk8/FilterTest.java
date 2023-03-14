package com.example.all.democommonutiljwt.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Project Name: demo-all
 * @File Name: FilterTest
 * @Date: 2023/3/14 16:43
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
public class FilterTest {

    @Test
    public void TestFilter() {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
        List<Apple> greenApples = filter(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println("===>" + greenApples);//===>[FilterTest.Apple(weight=80, color=green), FilterTest.Apple(weight=155, color=green)]
    }


    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate {
        public boolean test(Apple a);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Apple {
        private int weight = 0;
        private String color = "";
    }

}
