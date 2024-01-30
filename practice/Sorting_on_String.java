/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;


import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class Sorting_on_String {
    public static void main(String[] args) {
        
//        String[] d={"jalbni","younis","zahid","khan","ali"};
//        String[] d={"mashooqud","mashooqua","mashooquc","mashooque","mashooqub"};
        
String[] names = {
    "Alice", "Bob", "Carol", "David", "Emily",
    "Frank", "Grace", "Henry", "Irene", "Jack",
    "Kelly", "Liam", "Maria", "Nathan", "Olivia",
    "Paul", "Rachel", "Samuel", "Taylor", "Victoria",
    "William", "Alex",  "Chloe",
    "Daniel", "Emma", "George", "Hannah", "Isabella",
    "James", "Katherine", "Lucy", "Michael", "Natalie",
    "Oliver", "Patricia", "Quinn", "Ryan", "Sophia",
    "Thomas", "Ulysses", "Vanessa", "Walter", "Xavier",
    "Yasmine", "Zachary",  "Ethan", "Grace"
};


        int k=0,j=0;
        String store=" ";
        int index=0;
        
        System.out.println(Arrays.toString(names));
        
        while (k<names.length) {
            j=0;
            while (j<names.length-1) 
            {
                
                if(names[j].charAt(index)==names[j+1].charAt(index))
                {
                    index++;
                if(names[j].charAt(index)>names[j+1].charAt(index))
                {
                    store=names[j];
                    names[j]=names[j+1];
                    names[j+1]=store;
                }
                }
                else if(names[j].charAt(index)>names[j+1].charAt(index))
                {
                    store=names[j];
                    names[j]=names[j+1];
                    names[j+1]=store;
                }
                
             j++;   
        }
            k++;
        
        
    }
            System.out.println(Arrays.toString(names));
    
}}
