package com.io.dome;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("dome01\\src\\hellow.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dome01\\src\\hellow1.txt"));
//        String read = bufferedReader.readLine();
//        System.out.println(read);
//        String read1 = bufferedReader.readLine();
//        System.out.println(read1);
//        String read2 = bufferedReader.readLine();
//        System.out.println(read2);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str);
            bufferedWriter.write("\n");
            System.out.println(str);
        }
        bufferedWriter.write("\n");
        bufferedWriter.write("这是我赋值的一个文件");
//        while (read != null) {
//            System.out.println(read);
//        }
//        System.out.println(read);
//        System.out.println(read);
        bufferedReader.close();
        bufferedWriter.close();
    }
}
