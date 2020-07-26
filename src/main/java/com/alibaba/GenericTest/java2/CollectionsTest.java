package com.alibaba.GenericTest.java2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * Collections工具类
 */
public class CollectionsTest {
	
	/**
	 	Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("b");
		list.add("c");
		list.add("d");
//		
//		System.out.println(Collections.max(list));
//		
//		System.out.println(Collections.frequency(list, "a"));
		
		
		List list2 = new ArrayList();
//		list2.add("aa");
//		list2.add("bb");
//		list2.add("cc");
		
		copy(list2, list);
		
		System.out.println(list2);
	}
	
	public void copy(List desc,List src){
		for (Object obj : src) {
			desc.add(obj);
		}
	}

	/**
	 *  reverse(List)：反转 List 中元素的顺序
		shuffle(List)：对 List 集合元素进行随机排序
		sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
		sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
		swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

	 */
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		
		//reverse(List)：反转 List 中元素的顺序
//		Collections.reverse(list);
		
		//shuffle(List)：对 List 集合元素进行随机排序
//		Collections.shuffle(list);
		
		//sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
//		Collections.sort(list);
		
		/*
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String){
					String s1 = (String) o1;
					String s2 = (String) o2;
					return -(s1.compareTo(s2));
				}
				return 0;
			}
		});
		*/
		
		Collections.swap(list, 0, 2);
		
		System.out.println(list);
		
	}
}
