package com.alibaba.Enum.java4;

public class Demo {

	public static void main(String[] args) {
		
//		D a = D.A;
//		System.out.println(a.toString());
//		System.out.println(a);
		
		Subclass subclass = new Subclass();
		System.out.println(subclass);
	}
}


class Super{
	
	@Override
	public String toString() {
		return "aaa";
	}
}

class Subclass extends Super{
	
}

//enum D{
//	A,B,C;
//}
