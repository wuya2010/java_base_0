package com.alibaba.GenericTest.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;

import org.junit.Test;

/**
 
 	Map(双列集合)：
 	
 	|-------Map:
 		|-------HashMap:是Map的主要实现类。是线程不安全的，效率高一些.HashMap中的key和value能存放null
 		
 			|-------LinkedHashMap:LinkedHashMap是HashMap的子类，底层实现和HashMap一样。
	     			LinkedHashMap可以安照元素添加的顺序进行遍历。因为底层使用了双向链表用来记录元素添加的顺序。
	     			
 		|-------TreeMap:可以对集合中的key（对Key中指定的属性）进行排序。
 		
 		|-------Hashtable:是古老的实现类，是线程安全的，效率低一些。Hashtable中的key和value不能存放null
 		
 			|-------Properties:key和value都是String类型，一般用来读取配置文件。
 	
 	二 说明：
 		1.Map中所有的key可以看成是Set的集合。Key是无序的且不可重复的。Key中存放的自定义类的对象必须重写
 				hashCode和equlas方法。
 		2.Map中所有的value可以看成是Collection的集合。value是无序的可重复的。value中存放的自定义类的对象
 				必须重写equals方法
 		3.Map中存放的键值对可以看成是Entry(Node实现了Entry接口)。entry是无序的且不可重复的。
 				entry在数组中的位置由key决定。
 	三 
 		3.1 HashMap的构造器？
 			new HashMap() : 当我们创建对象时，底层会创建一个长度为16的数组（Node类型），加载因子为0.75
 				当我们向集合中添加的元素的数量达到12(16 * 0.75)底层便会扩容，扩容为原来的2倍。
 		
 		3.2[面试题] HashMap的底层实现原理？
 			当我们向集合中添加（K1，V1）时，先根据K1的hashCode方法算出的哈希值来决定在数组中存放的位置。
 			如果该位置上没有其他元素。则直接存入。如果该位置上已经存在其他元素（K2,V2），
 			这时会调用K1的equals方法和K2进行比较。如果比较的结果为true，那么V1覆盖V2。
 			如果比较的结果为false。那么将以链表的形式将K1,V1存放在该位置上。
 			（jdk1.8当链表上的元素个数达到8时会将链表转换成红黑树）。

 		3.3 为什么需要扩容2倍
 			①我们发现像  16-1 、32 - 1 得到的数字的二进制全部是1
 			②通过运算发现：如果二进制位上的数字全是1的话那么在该数组范围内的任意索引值都是可以获取的，
 					否则将会浪费内存（有些索引值永远无法算出）
 				0000 1111  ->  15
 				0000 1010  -> 哈希值
 				--------------------
 				0000 1010 (无论哈希值的最后四位是什么得到的结果就是那个数（0-15所有的数字都可以算出）)
 				
 			如果 
 				0000 1101  （后四位中存在0）
 				0000 0010      哈希值
 				----------------
 				0000 0000 （那么这个结果永远不可以得到 像 2和3这样的数值，也就是说，
 							数组索引为2和3的元素永远只能为null）	
 	
 	四
 		 HashSet底层其实就是HashMap,向HashSet中添加的数据其实添加到了HashMap的Key中。
 		 LinkedHashSet底层就是LinkedHashMap.
 		 TreeSet的底层就是TreeMap.
 		 
 */
public class MapTest {
	
	/**
	 	Properties : 用来读取配置文件
	 * @throws Exception 
	 */
	@Test
	public void test5(){
		//2.创建流对象(明天就讲)
		FileInputStream fis = null;
		try {
			//1.创建Properties的对象
			Properties properties = new Properties();
			fis = new FileInputStream("person.properties");
			//3.加载流
			properties.load(fis);
			//4.读取内容
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			System.out.println(username + " " + password);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//5.关流
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 	TreeMap:可以对集合中的key（对Key中指定的属性）进行排序。 
	 	
	 	说明：
	 		1.TreeMap底层数据结构是红黑树
	 		2.TreeMap的Key中添加的元素的类型应该保持一致。
	 		
	 		
	 	排序方式 ：自定排序  vs 定制排序
	 */
	@Test
	public void test4(){
		
		TreeMap treeMap = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student){
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					//安照名字进行排序
					return s1.name.compareTo(s2.name);
				}
				return 0;
			}
		});
//		treeMap.put("aaa", 12);
//		treeMap.put("ddd", 120);
//		treeMap.put("bbb", 13);
//		treeMap.put("ccc", 15);
//		treeMap.put("eee", 20);
		
		treeMap.put(new Student("aa",18), 26);
		treeMap.put(new Student("cc",28), 56);
		treeMap.put(new Student("bb",58), 66);
		treeMap.put(new Student("ee",8), 36);
		
		System.out.println(treeMap);
	}
	
	
	/**
	  LinkedHashMap : LinkedHashMap是HashMap的子类，底层实现和HashMap一样。
	     LinkedHashMap可以安照元素添加的顺序进行遍历。因为底层使用了双向链表用来记录元素添加的顺序。
	 */
	@Test
	public void test3(){
		LinkedHashMap map = new LinkedHashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		System.out.println(map);
	}
	
	/**
	 * HashMap和Hashtable的区别？
	 */
	@Test
	public void test2(){
		//HashMap中的key和value能存放null
		/*
		HashMap hashMap = new HashMap();
		hashMap.put(null, null);
		System.out.println(hashMap);
		*/
		//Hashtable中的key和value不能存放null
		Hashtable table = new Hashtable();
		table.put(null, null);
		System.out.println(table);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test(){
		
		HashMap map = new HashMap();
		map.put(new Person("aaa"), "AAA");
		map.put(new Person("bbb"), "BBB");
		
		
		System.out.println(map);
	}
}




