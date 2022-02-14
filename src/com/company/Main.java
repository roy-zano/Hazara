package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       ArrMax();
       print("tamir");

    }

    public static void ArrMax (){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>nambers= new ArrayList<Integer>();
        for (int i = 0; i<5; i++){
            nambers.add(in.nextInt());
        }
        print(Collections.max(nambers).toString());
    }

    public static void print(String a){
        System.out.println(a);
    }


}
