package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println("打乱后：");
        for (Integer i:numbers) {
            System.out.print(i+" ");
        }
        List<Integer> rates = new ArrayList<>();
        rates.add(20);
        rates.add(30);
        rates.add(50);
        int start = 0;
        for (int part:rates) {
            System.out.println("\n" + part + "%的数据编号如下：");
            for (int i=start; i<part; i++) {
                System.out.print(numbers.get(i) + " ");
            }
            start = part;
        }
    }
}
