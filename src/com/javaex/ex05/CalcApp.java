package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print(">>");
    	int setValue = sc.nextInt();
    	
    	int a= setValue;
    	int b= setValue;
    	
    	if (setValue == a && setValue == b) {
    		
    		System.out.println(a + b);
    	}
    	
    	sc.close();
    	
    }
}
