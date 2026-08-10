package com.practise.demo.module1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Class1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int input = sc.nextInt();

//        problem1(input);15
//        problem2(input);
//        problem3(input);

    }

    public void problem1( int input) {
        System.out.println("count of factores");
//        int input = 24;
        int factors= 0;

        for (int i =1; i*i<= input; i++){

            if(input%i==0){
               if (i== input/i){
                   factors++;
               }else {
                   factors+=2;
               }
            }
        }
        System.out.println(factors);

    }

    public void problem2(int input) {
        System.out.println("Number :: 55");

//        int input = 24;
        int factors= 0;

        for (int i =1; i*i<= input; i++){

            if(input%i==0){
                if (i== input/i){
                    factors++;
                }else {
                    factors+=2;
                }
            }
        }
        if (factors==2){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number");
        }
    }

//Given Integer how many time we need to divide by 2 untill it reaches 1

    public void problem3(int n) {

        int count=0;
        while(n>1){
            n=n/2;
            count++;
        }
        System.out.println("Count = " + count);
    }



}
