package com.example.netwokring;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

//    https://docs.oracle.com/javase/7/docs/api/java/net/URLConnection.html#URLConnection(java.net.URL)
//urlconnection은 애플리케이션과 url간의 통신 링크를 나타내는 수퍼 클래스이다.
//1.openConnection연결 개체는 URL에서 메서드를 호출하여 생성됩니다 .
//2.설정 매개변수 및 일반 요청 속성이 조작됩니다.
//3.connect이 메서드 를 사용하여 원격 개체에 대한 실제 연결이 이루어집니다 .
//4.원격 개체를 사용할 수 있게 됩니다. 헤더 필드와 원격 개체의 내용에 액세스할 수 있습니다.

public class URLConnection_lyh extends URLConnection {
    /**
     * Constructs a URL connection to the specified URL. A connection to
     * the object referenced by the URL is not created.
     *
     * @param url the specified URL.
     */
    protected URLConnection_lyh(URL url) {
        super(url);
    }

    @Override
    public void connect() throws IOException {

    }

}
