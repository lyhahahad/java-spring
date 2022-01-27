package com.example.netwokring;

import java.io.*;
import java.net.*;
import java.util.*;
public class NetwokringApplication {
	public static void main(String[] args) throws IOException {
//	url 객체 생성
		URL url = new URL("https://www.google.com/");
//	url 객체에서 urlconnection 객체 얻기.
		URLConnection urlCon = url.openConnection();
//프로토콜이 http일 경우 HttpURLConnection객체로 캐스팅할 수 있다.


//urlconnection 구성

//헤더 필드 지필.


//입력 스트임 가져오기 및 데이터 읽기.
//내용 읽어오기.
		InputStream inputStream = urlCon.getInputStream();
		byte[] data_1 = new byte[1024];
//		read는 데이터를 바이트의 배열로 읽는 low level의 메서드이다.
		inputStream.read(data_1);

//		문자 데이터를 읽기 위해서는 InputStreamReader에서 보다 편하게 조작하기 위해 래핑한다.
		InputStreamReader reader = new InputStreamReader(inputStream);
		int character = reader.read();
//		단일 character를 읽는다.
		char[] buffer = new char[4096];
//		charaters의 배열을 읽는다.
		reader.read(buffer);

//		문자열로 읽기 위해 InputStreamReader를 BufferedReader로 래핑한다.
		BufferedReader reader_1 = new BufferedReader(new InputStreamReader(inputStream));
		String line = reader_1.readLine();
//	InputStream->InputStreamReader->BufferedReader

//		예외
//		IOException : 입력 스트림을 생성하는 동안 I/O 오류가 발생한 경우
//		SocketTimeoutException : 데이터를 읽을 수 있기 전에 읽기 제한 시간이 만료되는 경우
//		UnknoenServiceException : 프로토콜이 입력을 지원하지 않는 경우.


//입력 스트림 예외 3가지.


//출력 스트림 가져오기 및 데이터 쓰기.
//서버 데이터를 보내기.
		urlCon.setDoOutput(true);
		OutputStream outputStream = urlCon.getOutputStream();
		byte[] data_2 = new byte[1024];
		outputStream.write(data_2);

		OutputStreamWriter writer = new OutputStreamWriter(outputStream);
		int character_1 = 'a';
		writer.write(character_1);

		char[] buffer_1 = new char[4096];
		writer.write(buffer_1);

		PrintWriter writer_1 = new PrintWriter(outputStream);
		String line_1 = "This is String";
		writer_1.print(line_1);


//연결을 닫으려면 close 메서드 호출.

	}
}
