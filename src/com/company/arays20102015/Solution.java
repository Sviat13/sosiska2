package com.company.arays20102015;

/**
 * Created by Natalia on 20.10.2015.
 */
import java.io.*;

     public class Solution

     {
         public static void main(String[] args) throws Exception
         {
             BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
             String name = reader.readLine();
             String aNumber = reader.readLine();
             String bNumber = reader.readLine();
             int cNumber= Integer.parseInt(aNumber);
             int dNumber= Integer.parseInt(bNumber);
             System. out.println(name+" "+ "получает"+" " +cNumber+" "+"через"+" " + dNumber+" "+"лет."  );
         }
     }