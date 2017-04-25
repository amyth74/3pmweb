/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author achar
 */

public class LargeNSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int []a=new int[5];
        for (int j=0;j<a.length;j++){
            a[j]=sc.nextInt();
        }
        int large=a.length;
        Arrays.sort(a);
        System.out.println("The Smallest no is " +a[0]);
        System.out.println("the largest no is " +a[large-1]);
    }
    
}
