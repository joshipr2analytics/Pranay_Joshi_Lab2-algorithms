package com.greatlearning.labsession2.driver;


import com.greatlearning.labsession2.service.MergeSortImp;
import com.greatlearning.labsession2.service.NoteCount;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        MergeSortImp mergeSortImp = new MergeSortImp();
        NoteCount nc = new NoteCount();
        
        System.out.println("Enter the size of currency denominations" );
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("Enter the currency denominations value" );
        for (int i=0; i<size; i++){
            notes[i]= sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay" );
        int amount =sc.nextInt();
        mergeSortImp.sort(notes,0,notes.length-1);
        nc.notesCountImp(notes, amount);
    }
}