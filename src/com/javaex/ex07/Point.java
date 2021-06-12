package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.

	public boolean equals(Object obj) {
		
		Point p = ((Point)obj);
		
		if (this.x == p.x) {	//Point 클래스의 x의 값과 Object의 x값이 같다면
			return true;	//true
		} else {	//그렇지 않다면
			return false;	//false

		}
	}
	
}
