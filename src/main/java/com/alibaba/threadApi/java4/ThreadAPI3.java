package com.alibaba.threadApi.java4;

public class ThreadAPI3 {

	
//	    static  void  yield()：线程让步
//				暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
//				若队列中没有同优先级的线程，忽略此方法
//		join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将被阻塞，直到 join() 
//				方法加入的 join 线程执行完为止   低优先级的线程也可以获得执行 
//		static  void  sleep(long millis)：(指定时间:毫秒)
//			令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
//			抛出InterruptedException异常
//		stop(): 强制线程生命期结束
//		boolean isAlive()：返回boolean，判断线程是否还活着

	 
	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + " === " + i);
				}
			}
		};
		t1.setName("线程1");
		t1.start();
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				
				for (int i = 0; i < 50; i++) {
					if(i == 5){
//						yield();
				//------------------------------------------------------
						try {
							//当前线程（t2）会阻塞，t1线程继续执行，t1线程执行完毕再继续执行当前线程
							t1.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			  //------------------------------------------------------		
//						try {
//							//令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重新排队
//							Thread.sleep(10000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
			//------------------------------------------------------	
						//t1.stop();
					}
					
					System.out.println(Thread.currentThread().getName() + " === " + i);
					//返回boolean，判断线程是否还活着
					//System.out.println(t1.isAlive());
				}
			}
		};
		t2.setName("线程2");
		t2.start();
	}
}
