package com.alibaba.GenericTest.java3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 	泛型：
 	
 	主要学习的内容：
 		1.在集合中使用泛型
		2.自定义泛型类，自定义泛型接口，自定义泛型方法
		3.泛型在继承上的体现
		4.通配符的使用
 	
 */
public class GenericTest {
	
	
	@Test
	public void test3(){
		new Object();
	}
	
	/**
	 	集合在使用泛型之后
	 	1.我们可以指明泛型的类型
	 	2.当我们创建泛型类的对象时，指明的泛型的类型是什么，那么泛型类中使用到泛型的地方的这些类型就变成了什么。
	 	3.当我们创建泛型类的对象时，如果没有指明泛型的类型。那么默认是Object
	 */
	@Test
	public void test2(){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		
		String string = list.get(0);
		
		System.out.println(string);
		System.out.println("-----------");
		
		for (String str : list) {
			System.out.println(str.toUpperCase());
		}
		
		
		
		String name = list.get(0);
		
		System.out.println("---------------------------------");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("aaa", 111);
		
		Integer value = map.get("aaa");
		//获取集合中所有的value
		Collection<Integer> values = map.values();
		//获取集合中所有的key
		Set<String> keySet = map.keySet();
		
		//遍历集合中的entry
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("---------------------------------------");
		
		TreeSet<String> treeSet = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		treeSet.add("aaa");
	}

	/**
	  集合在没有使用泛型之前 :
	  
	  1.存在数据类型不安全的问题。
	  2.每个数据都需要向下转型（操作起来比较繁琐）。
	 */
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		Object obj = list.get(0);
		
		show(list);
	}
	
	
	public void show(List list){
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(str.toUpperCase());
		}
	}
}

















