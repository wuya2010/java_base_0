package com.alibaba.juc.juc;


// 通常情况下，线程是为了执行一些耗时的操作
// 例如Flume框架， 使用Source类型的对象，读取数据，封装为消息。
// 例如使用Flume中的ExecSource，负责监听某个端口tcp连接发送的数据.
// Source需要一致监听某个端口，适合在线程中一直运行！ while(true){},发生意外，线程结束
// netcat 向某个端口发送数据
//  netcat(工具)  -h 192.169.6.3 33333  hello


//实现类中，重写run方法
class Thread5 implements Runnable{
	
	private boolean flag=true;

	@Override
	public void run() {
		
		while(flag) {
			
			synchronized (this) {
				
				// 如果有wait()
				try {
					wait();
				} catch (InterruptedException e) {
					changeFlag();
					e.printStackTrace();
				}
				
				// 如果没有wait()，join等方法，可以使用下述
				if (Thread.currentThread().isInterrupted()) {
					return;
				}
				
				/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
				
				System.out.println(Thread.currentThread().getName()+"===》working!");
			}
			
			
		}
		
		System.out.println(Thread.currentThread().getName()+"===》stoping!");
		
	}
	
	public void changeFlag() {
		
		System.out.println("尝试将flag设置为flase");
		
		flag=false;
		
	}
	
	
	
}





//main方法
public class StopThread {
	
	public static void main(String[] args) {
		
		Thread5 thread5 = new Thread5();
		
		Thread t1=new Thread(thread5, "线程1");
		
		Thread t2=new Thread(thread5, "线程2");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 20; i++) {
			
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			if (i==3) {
				System.out.println("尝试停止t1");
				// 停止t1
				//thread5.changeFlag();
				t1.interrupt();
				t2.interrupt();
				
			}
			
		}
		
		System.out.println("主线程结束！");
		
		
	}
	

}
