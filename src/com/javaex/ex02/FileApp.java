package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		// try~catch문을 사용하여 에러를 수정하세요
		//fileRead();
		
		try {	//감시(예외 발생 가능성 코드 넣어줌)
			fileRead();
		} catch (Exception e) {	//예외 발생하면 잡아옴.
			System.out.println("파일을 읽을 수 없습니다.");
		}

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException{
		throw new IOException(); // 강제로 예외 발생
	}
}


