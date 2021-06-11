package com.javaex.ex01;

import javax.xml.stream.events.EntityReference;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		//아래부분을 try~catch문을 사용하여 수정하세요

		
		try {	//감시(예외발생 가능성 있는 코드 넣어줌)
			result = intArray[3];	//배열중 3번방은 없음
			System.out.println(result);	//result 출력
		} catch (ArrayIndexOutOfBoundsException e) {	//예외발생해서 넘어오면 잡아냄
			System.out.println("배열의 범위를 벗어났습니다.");
		}
	}

}
