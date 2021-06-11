package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(3, 3);
		
		System.out.println(p.toString());
		/*
		
		Point 클래스에 toString 작성하지 않으면 
		Object에 있는 toString(com.javaex.ex03.Point@26f0a63f) 불러옴.
		
		Point 클래스에 toString 작성한 후 출력하면
		Point [x=3, y=3] 출력된다.
		
		*/
	}

}


