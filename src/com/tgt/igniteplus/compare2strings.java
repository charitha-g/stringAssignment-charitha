package com.tgt.igniteplus;

public class compare2strings
{
    public static void main(String args[]){
        String a = "TARGET";
        String b = "target";
        if(a.equals(b))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
    }
}

