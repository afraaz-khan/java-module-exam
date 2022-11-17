
// Q1 : Write a Java program to create a new array list, add some elements (string) and print out
// the collection by using for-each loop. 

import java.util.*;
public class q1{
    public static void main(String[] args) {
        
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Violet");

        for (String color : arr) {
            System.out.println(color);
        }
     }
}