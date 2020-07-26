package com.alibaba.LambadaTest.java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/*
      操作Stream的三个步骤
  
		1- 创建 Stream
		一个数据源（如：集合、数组），获取一个流
		2- 中间操作
		一个中间操作链，对数据源的数据进行处理
		3- 终止操作(终端操作)
		一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用

 */
public class StreamAPI02 {
	
	
	
	/*
	 * //生成public static<T> Stream<T> generate(Supplier<T> s) 
	 */
	@Test
	public void test3(){
		Stream.generate(Math::random).forEach(System.out::println);
	}
	
	
	
	
	
	/*
	 *   创建无限流
	 * 	//迭代public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
		
		
	 */
	@Test
	public void test2(){
//		Stream.iterate(1, new UnaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				
//				return t + 1;
//			}
//		})
//		.limit(5) //限制几条数据
//		.forEach(System.out::println); //遍历
		
		System.out.println("-----------------------lambda表达式 ---------------");
		
		Stream.iterate(1, t -> t + 1).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	}

	/*
	 * 创建Stream
	 */
	@Test
	public void test(){
		//1.将数组创建成Stream - 通过Arrays中的stream方法
		int[] numbers = {1,2,3,4,5};
		IntStream stream = Arrays.stream(numbers);
		
		//2.通过Stream的of()
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		
		
		System.out.println("--------------------------------");
		//3.通过集合获取Stream
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		
		list.stream().forEach(System.out::println);
		
	}
}














