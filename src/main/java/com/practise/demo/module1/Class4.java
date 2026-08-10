package com.practise.demo.module1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Class4 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int input = sc.nextInt();

        problem1();
//        problem2(input);
//        problem3(input);

    }

    public void problem1(){

        int[]  a = {2,3,4,5,6,10,10};

        int length = a.length;
//        System.out.println(a[0]); // one by one
        int max = -1000000000;


        for (int i =0 ; i<= length-1; i++){

            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println( "max : " + max);
        int count = 0;

        for (int i=0; i<length; i++){
            if (a[i]==max){
                count++;
            }
        }
        System.out.println(length - count);

    }

    public void problem2(){

    }
}
