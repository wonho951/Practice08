package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");	//공백구분 해야하니까 split?
		String numLine = sc.nextLine();

		//코드를 작성하세요
		
		
		
		String [] sArray = numLine.split(" ");	//공백구분해야 하니 ""사이에 "  " 공백을 넣어줌	
		
		
	      for(int i=0; i< sArray.length; i++) {
	    	  
	          sum = sum + Integer.valueOf(sArray[i]);	// inter.valueof: 문자를 숫자로 변환. sum 값은 기존 sum값 + int로 변환된 숫자값. 
	          
	       }
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
