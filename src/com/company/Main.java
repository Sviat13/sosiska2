package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//сочитаем два метода через посредника InputStreamRead
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.print(name1 +" +"+  name2 +"+"+  name3+  " = Чистая любовь, да-да!");

    }
}



