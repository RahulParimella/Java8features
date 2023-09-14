package examples;


//Java program to Reverse a String using ListIterator

import java.lang.*;


import java.io.*;

import java.util.*; 

//Class of ReverseString

class ReverseString {

 public static void main(String[] args)

 {

     String input = "My name is sampath";

//     char[] str = input.toCharArray();
//
//     List<Character> revString = new ArrayList<>();
//
//     for (char c : str)
//
//         revString.add(c);
//
//     Collections.reverse(revString);
//
//     ListIterator li = revString.listIterator();
//
//     while (li.hasNext())
//
//         System.out.print(li.next());
     
     StringBuffer sb  =new StringBuffer(input);
     sb.reverse();
     System.out.println(sb);
     
     StringBuilder sb1 =new StringBuilder(input);
     sb1.reverse();
     System.out.println(sb1);
 }

}

