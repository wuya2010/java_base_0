package com.alibaba.collection.java3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 	Collection子接口之List
 	
 	List : 存储的元素是有序的且可重复的
 	
 */
public class ListTest {
	
	/*
	 * [面试题]
	 */
	@Test
	public void test3(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("ccc");
		list.add(1);//自动装箱了
		
//		Object obj = list.remove(new Integer(1)); -- 删除的内容为1的元素
//		list.remove(1); --删除的是索引值为1的元素
//		System.out.println("obj=" + obj);
		System.out.println(list);
	}

	/*
void add(int index, Object ele):在index位置插入ele元素
boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
Object get(int index):获取指定index位置的元素
int indexOf(Object obj):返回obj在集合中首次出现的位置
int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
Object remove(int index):移除指定index位置的元素，并返回此元素
Object set(int index, Object ele):设置指定index位置的元素为ele
List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
		注意 ：左闭右开（包头不包尾）

	 */
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("aaa");
		
		
		System.out.println(list);
//		list.add(0,"AAA");
//		list.add(1,"DDD");
		
		System.out.println("---------------------------------------");
		
//		List list2 = new ArrayList();
//		list2.add(111);
//		list2.add(222);
//		list.addAll(0, list2);
		
		System.out.println("---------------------------------------");
		
//		Object obj = list.get(3);
//		System.out.println(obj);
		
		System.out.println("---------------------------------------");
		
//		int index = list.indexOf("aaa");
//		System.out.println(index);
//		
//		System.out.println(list.lastIndexOf("aaa"));
		
		System.out.println("---------------------------------------");
		
//		Object obj = list.remove(0);
//		System.out.println("obj=" + obj);
//		System.out.println(list);
		
		System.out.println("---------------------------------------");
		
//		list.set(0, "AAA");
//		System.out.println(list);
		
		System.out.println("---------------------------------------");
		
		List subList = list.subList(0, 4);
		System.out.println(subList);
	}
}






