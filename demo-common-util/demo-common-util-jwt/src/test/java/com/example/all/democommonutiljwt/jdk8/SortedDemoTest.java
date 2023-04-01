package com.example.all.democommonutiljwt.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @Project Name: demo-all
 * @File Name: SortedDemoTest
 * @Date: 2023/4/2 1:37
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
public class SortedDemoTest {

    @Test
    public void lowCaloricDishesName() {
        List<Dishes> inventory = Arrays.asList(new Dishes(80, "fish"), new Dishes(500, "meat"), new Dishes(65, "tofu"));
        List<String> lowCaloricDishesName =
                inventory.parallelStream()
                        .filter(d -> d.getCalories() < 400)
                        .sorted(comparing(Dishes::getCalories))
                        .map(Dishes::getName)
                        .collect(toList());
        System.out.println(lowCaloricDishesName);

    }


    @Data
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    class Dishes {
        private int calories;
        private String name;
    }
}
