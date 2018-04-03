package com.cl.test;

public class Game {
	public static void main(String[] args) throws Exception {
		System.out.println("Game : "+ Game.class.getClassLoader().getClass().getName());
		Drawbox drawBox = new Drawbox();
		System.out.println("Drawbox : "+ Drawbox.class.getClassLoader().getClass().getName());
		ClassLoader sysCL = Game.class.getClassLoader();
		Class drawBoxClass = Class.forName("com.cl.test.Drawbox", true, sysCL);
		System.out.println("2nd Game : "+ drawBoxClass.getClassLoader().getClass().getName());
	}
}







