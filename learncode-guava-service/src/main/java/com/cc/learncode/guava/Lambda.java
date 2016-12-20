package com.cc.learncode.guava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Lambda {
	public static void main(String[] args) {
		
		// 处理每个角色
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		final List<Integer> doubleNumbers = numbers.stream().map(number -> number * 2).collect(Collectors.toList());

		System.out.println(doubleNumbers);
		
		// 逐个相加
		final List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
		final Optional<Integer> sum = numbers2.stream().reduce((a, b) -> a + b);
		sum.orElseGet(() -> 0);
		
		System.out.println(sum.get());
		
		// 逐个相加
		final List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);
        final Integer sum3 = numbers3.stream()
                .reduce(0, (a, b) -> a + b);
        
        System.out.println(sum3);

		System.out.println("Hello World!");
	}
}
