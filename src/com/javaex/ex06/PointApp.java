package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);	//p1,p2의 주소값이 다름
		System.out.println(p2 == p3);	//p2,p3의 주소값이 다름
		System.out.println(p3 == p4);	//p3,p4의 주소값이 다름
		System.out.println(p4 == p1);		//p4와 p1의 주소값이 같음
		System.out.println(p1.equals(p2));	//p1,p2의 주소값이 다름
		System.out.println(p4.equals(p1));	//p4와 p1의 주소값이 같음
		
		/*
		equals()메소드가 Point 클래스에는 없지만 가장 최상위의 부모인 Object 클래스에
		equals()메소드가 있기때문에 실행된다.
		*/ 
	}

}


