package com.io.dome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dome01\\src\\hellow1.txt"));
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <=i; j++) {
                bufferedWriter.write(j+"*"+i+"="+(j*i));
                bufferedWriter.write("\t");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }
}
