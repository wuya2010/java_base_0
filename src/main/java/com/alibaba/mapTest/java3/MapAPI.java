package com.alibaba.mapTest.java3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

public class MapAPI {

	/*
	 * Set keySet() : 获取当前集合中所有的key 
	 * Collection values() : 获取当前集合中所有的value 
	 * Set entrySet() : 获取当前集合中所有的entry
	 */
	@Test
	public void test4() {
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");

		
		
		System.out.println(map);
		System.out.println("xxxxxxxxxxxxxxxxxxxxx");
		// 获取当前集合中所有的key
		Set keySet = map.keySet();//没有重复元素的集合
		for (Object key : keySet) {
			System.out.println(key);
		}

		// 获取当前集合中所有的value
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}

		System.out.println("--------------entrySet------------------");

		Set entrySet = map.entrySet();

		for (Object es : entrySet) {
			// 向下转型
			Entry e = (Entry) es;
			System.out.println(e.getKey() + "------" + e.getValue());
		}
	}

	/*
	 * Object get(Object key) : 根据指定的key获取对应的value boolean 
	 * containsKey(Object k): 当前集合的key中是否包含k 
	 * boolean containsValue(Object v) : 当前集合的value中是否包含v 
	 * int size() ：当前集合中的元素的个数
	 * boolean  isEmpty() ： 当前集合是否为空 
	 * boolean equals(Object obj) : 比较两个集中的元素（个数，内容）
	 * 
	 */
	@Test
	public void test3() {
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");

		Map map2 = new HashMap();
		map2.put("ccc", "CCC");
		map2.put("ddd", "DDD");
		map2.put("aaa", "AAA");
		map2.put("bbb", "BBB");

		Object value = map.get("aaa");
		System.out.println(value);

		System.out.println(map.containsKey("ccc"));
		System.out.println(map.containsValue("DDD"));

		System.out.println("equals=" + map.equals(map2));

		System.out.println("----------------------------------------------------------");

		Map map3 = new HashMap();
		map3.put(new KeyTest(10), new ValueTest(20));
		// map3.put(new KeyTest(10), new ValueTest(50));
		map3.put(new KeyTest(15), new ValueTest(30));
		map3.put(new KeyTest(20), new ValueTest(40));

		System.out.println(map3.containsValue(new ValueTest(30)));

		System.out.println(map3);
	}

	/*
	 * Object put(Object key,Object value) : 向当前集合中添加元素
	 * 注意：如果添加的数据的key已经存在，那么后添加的key所对应的value会覆盖前面已经存在的key所对应的value Object
	 * remove(Object key):根据key删除当前集合中的元素，返回删除掉的key所对应的value
	 * value void putAll(Map t) : 将t中的所有元素分别添加到当前集合中 
	 * void clear() : 清除当前集合中所有的元素
	 * 
	 */
	@Test
	public void test2() {
		Map map = new HashMap();
		map.put("aaa", 111);
		// 注意：如果添加的数据的key已经存在，那么后添加的key所对应的value会覆盖前面已经存在的key所对应的value
		map.put("aaa", 222);

		map.put("ccc", "CCC");

		System.out.println("删除前" + map);

		// 根据key删除当前集合中的元素，返回删除掉的key所对应的value
		Object obj = map.remove("ccc");
		System.out.println("obj=" + obj);
		System.out.println("删除后" + map);

		System.out.println("--------------------------------------------");

		Map map2 = new HashMap();
		map2.put(111, "abc");
		map2.put(222, "cba");
		// void putAll(Map t) ：将t中的所有元素分别添加到当前集合中
		map.putAll(map2);

		// clear() : 清除当前集合中所有的元素
		//map.clear();

		System.out.println(map);
	}

}
