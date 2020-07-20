package com.alibaba.classMutilTai.exer2;

public class PointTest {

	public static void main(String[] args) {
		
		Point point = new Point(1, 1, 1);
		System.out.println(point.getDistance());
	}
}

/*
 *3.定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标）。要求如下：
    1通过有参构造器可以生成具有特定坐标的点对象。
    2）提供可以设置三个坐标的方法。
    3）提供可以计算该“点”距原点距离平方的方法。

 */
class Point{
	
	private int x;
	private int y;
	private int z;
	
	public Point(int xx,int yy,int zz){
		x = xx;
		y = yy;
		z = zz;
	}
	
	/*
	 * 该“点”距原点距离的平方
	 */
	public int getDistance(){
		return x * x + y * y + z * z;
	}
	
	public void setX(int xx){
		x = xx;
	}
	
	public void setY(int yy){
		y = yy;
	}
	
	public void setZ(int zz){
		z = zz;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getZ(){
		return z;
	}
	
}
