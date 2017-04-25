/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author achar
 */
import java.util.Arrays;
import java.util.Scanner;
public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] name=new String[10];
        for (int i=0;i<name.length;i++){
            name[i]=sc.nextLine();
        }
        Arrays.sort(name);
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
            
        }
        
    }
}
