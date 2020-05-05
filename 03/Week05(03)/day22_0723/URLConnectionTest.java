package day22_0723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnectionTest {
public static void main(String[] args) {
	String input = "query=un";
	try {
		//set up
		URL naver = new URL("http://kin.naver.com/search/list.nhn");
		HttpURLConnection urlConn = (HttpURLConnection) naver.openConnection();
		urlConn.setDoOutput(true);//Output��밡���ϰ� ����
		//urlConn.setRequestMethod("Post");
		
		//write =>������ Write
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(urlConn.getOutputStream()));
		bw.write(input);
		bw.flush();
		bw.close();
		
		//read - �������� ��� read
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream(),"UTF-8"));
		String inputLine;
		while((inputLine = br.readLine())!=null) {
			System.out.println(inputLine);
		}
		br.close();
	}catch(Exception e) {
		System.out.println("Exception : "+e.toString());
	}
}
}