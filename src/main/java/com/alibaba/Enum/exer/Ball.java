package com.alibaba.Enum.exer;

interface Playable {
	void play();
}

interface Bounceable {
	void play();
}

interface Rollable extends Playable, Bounceable {
	public static final Ball ball = new Ball("PingPang");

}

class Ball implements Rollable {
	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name = name;
	}

	public void play() {
//		ball = new Ball("Football");
		System.out.println(ball.getName());
	}
}
