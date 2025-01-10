package com.day13;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {
    public static void main(String[] args) {


        try {
            // 创建一个代表本地文件的URL
            URL url = new URL("http","www.baidu.com",80,"/index.html");
            InputStream inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = reader.readLine()) != null ) {
                System.out.println(str);
            }
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            String str;
//            while ((str= reader.readLine()) != null) {
//                System.out.println(str);
//            }

            // 关闭读取器
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
