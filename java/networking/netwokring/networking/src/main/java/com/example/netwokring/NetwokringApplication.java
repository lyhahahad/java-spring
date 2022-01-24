package com.example.netwokring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		byte[] data = new byte[1024];
		inputStream.read(data);


//입력 스트림 예외 3가지.


//출력 스트림 가져오기 및 데이터 쓰기.
//서버 데이터를 보내기.
		urlCon.setDoOutput(true);


//연결을 닫으려면 close 메서드 호출.

	}
}
