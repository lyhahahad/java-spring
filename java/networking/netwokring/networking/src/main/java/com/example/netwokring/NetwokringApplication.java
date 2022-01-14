package com.example.netwokring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;
public class NetwokringApplication {


	public static void main(String[] args) throws MalformedURLException {
		InetAddress ip = null;
		InetAddress[] ipArr = null;

		try{
			ip = InetAddress.getByName("www.daum.net");
			System.out.println("getHostName() :" + ip.getHostName());
			System.out.println("getHostAddress() :" + ip.getHostAddress());
			System.out.println("toString() :" + ip.toString());

			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() :" + Arrays.toString(ipAddr));

			String result = "";
			for (int i=0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
			}
			System.out.println("getAddress() + 256 :" + result);
			System.out.println();
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}

		try{
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() :" + ip.getHostName());
			System.out.println("getHostAddress() :" + ip.getHostAddress());
			System.out.println();
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}

		try{
			ipArr = InetAddress.getAllByName("www.daum.net");

			for (int i=0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"]" + ipArr[i]);
			}
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}

		try {
			URL url = new URL("https://news.daum.net/");

			System.out.println("url.getAuthority() :" + url.getAuthority());
			System.out.println("url.getContent() :" + url.getContent().toString());
			System.out.println("url.getDefaultPort() :" + url.getDefaultPort());
			System.out.println("url.getPort() :" + url.getPort());
			System.out.println("url.getFile() :" + url.getFile());
			System.out.println("url.getHost() :" + url.getHost());
			System.out.println("url.getPath() :" + url.getPath());
			System.out.println("url.getProtocol() :" + url.getProtocol());
			System.out.println("url.getQuery() :" + url.getQuery());
			System.out.println("url.getRef() :" + url.getRef());
			System.out.println("url.getUserInfo() :" + url.getUserInfo());
			System.out.println("url.toExternalForm() :" + url.toExternalForm());
			System.out.println("url.toURI() :" + url.toURI());


		} catch (Exception ex) {
			ex.printStackTrace();
		}
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.codechobo.com";
		String line = "";
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null){
				System.out.println(line);
			}
			input.close();

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
