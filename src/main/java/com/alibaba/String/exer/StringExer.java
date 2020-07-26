package com.alibaba.String.exer;



import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * 
 * 精力充足就做一下，否则就以后再看
 * @author Administrator
 *
 */

/*
 * 1.模拟一个trim方法，去除字符串两端的空格。
 * 
 * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 * 
 * 3.获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”    
      中出现的次数
      
4.获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
   提示：将短的那个串进行长度依次递减的子串与较长  
   的串比较。

5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
提示：
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
3）将排序后的数组变成字符串。

 */
public class StringExer {
	
	//第5题
	@Test
	public void testSort(){
		String str = "abcwerthelloyuiodef";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		String newStr = new String(arr);
		System.out.println(newStr);
	}
	
	//第4题
	@Test
	public void testGetMaxSameSubString(){
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnmiodef";
		List<String> list = getMaxSameSubString(str1, str2);
		System.out.println(list);
	}
	
	public List<String> getMaxSameSubString(String str1,String str2){
		if(str1 != null && str2 != null){
			List<String> list = new ArrayList<String>();
			String maxString = (str1.length() > str2.length())? str1 : str2;
			String minString = (str1.length() > str2.length())? str2 : str1;
			
			int len = minString.length();
			for(int i = 0;i < len;i++){
				for(int x = 0,y = len - i;y <= len;x++,y++){
					String subString = minString.substring(x, y);
					if(maxString.contains(subString)){
						list.add(subString);
					}
				}
				if(list.size() != 0){
					break;
				}
			}
			return list;
		}
		
		
		return null;
	}
	
	//第3题
	@Test
	public void testGetCount(){
		String str1 = "cdabkkcadkabkebfkabkskab";
		String str2 = "ab";
		int count = getCount(str1, str2);
		System.out.println(count);
	}
	
	//判断str2在str1中出现的次数
	public int getCount(String str1,String str2){
		if(str1.length() >= str2.length()){
			int count = 0;
			int index = 0;
//			while((index = str1.indexOf(str2)) != -1){
//				count++;
//				str1 = str1.substring(index + str2.length());
//			}
			//改进：
			while((index = str1.indexOf(str2, index) )!= -1){
				index += str2.length();
				count++;
			}
			
			return count;
		}else{
			return 0;
		}
		
	}
	
	//第2题
	@Test
	public void testReverse(){
		String str = "abcdefg";
		String str1 = reverse3(str,2,5);
		System.out.println(str1);//abfedcg

	}
	
	//方式三：推荐 （相较于方式二做的改进）
	public String reverse3(String str,int start,int end){//ArrayList list = new ArrayList(80);
		//1.
		StringBuffer s = new StringBuffer(str.length());
		//2.
		s.append(str.substring(0, start));//ab
		//3.
		for(int i = end;i >= start;i--){
			s.append(str.charAt(i));
		}
		
		//4.
		s.append(str.substring(end + 1));
		
		//5.
		return s.toString();
		
	}
	
	
	//方式二：
	public String reverse2(String str,int start,int end){
		//1.
		String newStr = str.substring(0, start);//ab
		//2.
		for(int i = end;i >= start;i--){
			newStr += str.charAt(i);
		}//abfedc
		//3.
		newStr += str.substring(end + 1);
		return newStr;
	}
	
	//方式一：
	public String reverse1(String str,int start,int end){//start:2,end:5
		if(str != null ){
			//1.
			char[] charArray = str.toCharArray();
			//2.
			for(int i = start,j = end;i < j;i++,j--){
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
			}
			//3.
			return new String(charArray);
			
		}
		return null;
		
	}
	
	//第1题
	@Test
	public void testMyTrim(){
		String str = "   a   ";
		//str = "        ";
		String newStr = myTrim(str);
		System.out.println("---" + newStr + "---");
	}
	
	public String myTrim(String str){
		if(str != null){
			int start = 0;//用于记录从前往后首次索引位置不是空格的位置的索引
			int end = str.length() - 1;//用于记录从后往前首次索引位置不是空格的位置的索引
			
			
			while(start < end && str.charAt(start) == ' '){
				start++;
			}
			
			while(start < end && str.charAt(end) == ' '){
				end--;
			}
			if(str.charAt(start) == ' '){
				return "";
			}

			
			return str.substring(start,end + 1);
		}
		return null;
	}
}
