package com.greatlearning.lab2;

import java.util.Scanner;

class  Transaction{
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the size of transaction array");
            int size = s.nextInt();
            int arr[]= new int[size];

            System.out.println("Enter the values of array" );
            for(int i=0; i<size; i++){
                arr[i]= s.nextInt();
            }
            System.out.println("Enter the total no. of targets that needs to be acheived");
            int targetno= s.nextInt();

            while(targetno!=0){
                int flag=0;
                long target;

                System.out.println("Enter the value of target" );
                target=s.nextInt();
                long sum=0;
                for(int i=0; i<size; i++){
                    sum=sum+arr[i];
                    if(sum >= target){
                        System.out.println("target is acheived after "+ (i+1) +" transaction");
                        flag=1;
                        break;
                    }
                }
                if (flag==0){
                    System.out.println("target is not achieved");
                }
            }
        }
    }
}
