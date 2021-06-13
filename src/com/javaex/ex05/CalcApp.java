package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	
    	Scanner sc = new Scanner(System.in);
    	  	

    	while (true) {
    		
			System.out.print(">>"); // 반복시켜줌
			
			String cal = sc.nextLine();

			
			if (cal.equals("/q")) {	//배열 잡아주고 int a 안에 자꾸 /q를 넣으려고 하니 오류났음.				
				System.out.println("종료합니다.");
				break;
			}

			
			String[] cArray = cal.split(" ");
			int a = Integer.parseInt(cArray[0]);	//a를 cArray의 0번방에 배치 
			int b = Integer.parseInt(cArray[2]);	//b를 cArray의 2번방에 배치

			
			try {	// 오류가 발생하냐를 감시하는 영역 --> 최소한으로 코딩할것.
				if (cArray[1].equals("+")) { 
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(">>" + add.calculate());
					
					continue;
				} else if (cArray[1].equals("-")) { 
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(">>" + sub.calculate());
					
					continue;
				} else if (cArray[1].equals("*")) { 
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(">>" + mul.calculate());
					continue;
					
				} else if (cArray[1].equals("/")) { 
					Div div = new Div();
					div.setValue(a, b);
					System.out.println(">>" + div.calculate());
					continue;
					
				} else {
					System.out.println("알 수 없는 연산입니다.");
				}
				
			} catch (NumberFormatException e) { //오류잡아내는 영역
				System.out.println("알 수 없는 연산입니다.");
				
			} catch (ArithmeticException e) {
				System.out.println("알 수 없는 연산입니다.");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("알 수 없는 연산입니다.");
				
			}	
				
			
				
    	
	
    		
    	}
    	
    	
 
    	
    	sc.close();
    	
    }
}
