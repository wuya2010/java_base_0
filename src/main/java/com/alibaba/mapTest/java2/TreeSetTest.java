package com.alibaba.mapTest.java2;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/**

 TreeSet :可以对集合中的元素（指定的属性）进行排序

 说明：
 1.TreeSet的底层是红黑树
 2.TreeSet中存放的元素的类型应该保持一致

 排序方式 ：自然排序　vs 定制排序

 自然排序：
 1.自定义的类实现Comparable接口
 2.重写compareTo方法
 3.安照指定的某个属性进行排序
 4.将该类的对象存放到TreeSet集合中

 定制排序：
 1.创建一个Comparator接口的实现类的对象
 2.重写compare方法
 3.安照指定的属性进行排序
 4.将Comparator实现类的对象作为实参传给TreeSet的构造器中
 5.将对象添加到TreeSet的集合中

 思考：
 1.自然排序和定制排序哪个更灵活？
 2.即有自然排序又有定制排序哪个起作用？

 */
public class TreeSetTest {

	@Test
	public void test4(){
		TreeSet set = new TreeSet();
		set.add("aaa");
		set.add("ddd");
		set.add("ccc");
//		set.add(111);

		System.out.println(set);
	}

	/**

	 定制排序：
	 1.创建一个Comparator接口的实现类的对象
	 2.重写compare方法
	 3.安照指定的属性进行排序
	 4.将Comparator实现类的对象作为实参传给TreeSet的构造器中
	 5.将对象添加到TreeSet的集合中

	 */
	@Test
	public void test2(){

		Comparator c = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Animal && o2 instanceof Animal){
					Animal a1 = (Animal) o1;
					Animal a2 = (Animal) o2;
					//安照年纪进行排序
					return a1.age - a2.age;
				}
				return 0;
			}
		};

		TreeSet set = new TreeSet(c);
		set.add(new Animal("aa", 16));
		set.add(new Animal("dd", 18));
		set.add(new Animal("bb", 26));
		set.add(new Animal("cc", 30));

		System.out.println(set);
	}

	/**
	 * TreeSet : 可以对集合中的元素（指定的属性）进行排序
	 *
	 *
	 * 排序方式 ：自然排序　vs 定制排序

	 自然排序：
	 1.自定义的类实现Comparable接口
	 2.重写compareTo方法
	 3.安照指定的某个属性进行排序
	 4.将该类的对象存放到TreeSet集合中

	 */
	@Test
	public void test3() {

		TreeSet set = new TreeSet();
		// set.add("aaa");
		// set.add("ddd");
		// set.add("bbb");
		// set.add("ccc");

		// set.add(111);
		// set.add(12);
		// set.add(34);
		// set.add(5);

		set.add(new Student("cc", 18));
		set.add(new Student("dd", 18));
		set.add(new Student("ee", 18));
		set.add(new Student("aa", 23));
		set.add(new Student("bb", 16));

		System.out.println(set);
	}

}
