package com.alibaba.mapTest.java3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**

 Map(双列集合)：

 |-------Map:
 |-------HashMap:
 |-------LinkedHashMap:
 |-------TreeMap:
 |-------Hashtable:
 |-------Properties:

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


 */
public class MapTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test2(){
		HashMap map = new HashMap();
		map.put("aa", "AA");
		map.put("bb", "AA");
		map.put("cc", "AA");
		map.put("dd", "AA");
		map.put("ee", "AA");
		map.put("ff", "AA");
		map.put("gg", "AA");
		map.put("qwe", "AA");
		map.put("asdf", "AA");
		map.put("aasdfaa", "AA");
		map.put("asdfasdf", "AA");
		map.put("adsfasdf", "AA");
		map.put("adfa123", "AA");
	}

	@Test
	public void test(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("aaa", "AAA");
		map.put("bbb", "AAA");
		map.put("ccc", "AAA");
		map.put("ddd", "AAA");

		System.out.println(map);
	}
}
