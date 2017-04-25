/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *9
 * @author achar
 */
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int []a=new int[5];
        for (int j=0;j<a.length;j++){
            a[j]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    
}
