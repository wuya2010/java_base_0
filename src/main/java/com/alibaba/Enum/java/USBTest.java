package com.alibaba.Enum.java;

/*
 	接口和类之间的多态性：
 	
 */
interface USB{
	void start();
	void close();
}

interface Bluetooth{
	void connect();
	void disconnect();
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("-------打印机开始工作了---------");
	}

	@Override
	public void close() {
		System.out.println("-------打印机停止工作了---------");
	}
	
}

class Camera implements USB,Bluetooth{

	@Override
	public void start() {
		System.out.println("------摄像头开始工作了-----------");
	}

	@Override
	public void close() {
		System.out.println("------摄像头停止工作了-------------");
	}

	@Override
	public void connect() {
		System.out.println("-------摄像头连接蓝牙成功----------");
	}

	@Override
	public void disconnect() {
		System.out.println("-------摄像头断开蓝牙成功----------");
	}
	
}

class Computer{
	
	public void runBluetooth(Bluetooth bluetooth){
		bluetooth.connect();
		System.out.println("--------蓝牙工作中----");
		bluetooth.disconnect();
	}
	
	public void runUSB(USB usb){//可以传实现了该接口的实现类的对象
		usb.start();
		System.out.println("----------工作中--------");
		usb.close();
	}
}


public class USBTest {

	public static void main(String[] args) {
		
		//创建一台电脑
		Computer computer = new Computer();
		
//		Printer printer = new Printer();
//		computer.runUSB(printer);
		
		Camera camera = new Camera();
//		computer.runUSB(camera);
		computer.runBluetooth(camera);
		
		System.out.println("----------------接口和类之间的多态性-----------------------------");
		//接口和类之间的多态性
		USB usb = new Camera(); //接口类型的引用指向该接口实现类的对象
		if(usb instanceof Camera){
			System.out.println("我是一个摄像头");
			//向下转型
			Camera c = (Camera) usb;
			System.out.println(c);
		}
	}
}



















