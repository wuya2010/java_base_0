package com.alibaba.GenericTest.java3;

/**
	自定义泛型接口
 */
public class GenericTest4 {

	public static void main(String[] args) {
		
		MyEnglish<String,String> name = new MyEnglish<String,String>() {

			@Override
			public String getK() {
				//
				return null;
			}

			@Override
			public void setV(String v) {
				//
				
			}
		};
	}
}

class Demo implements MyEnglish<String,Integer>{

	@Override
	public String getK() {
		//
		return null;
	}

	@Override
	public void setV(Integer v) {
		//
		
	}
}

interface MyEnglish<K,V>{
	
	K getK();
	
	void setV(V v);
}
