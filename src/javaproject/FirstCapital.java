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
import java.util.Scanner;
public class FirstCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1= sc.nextLine();
        String name2=name1.substring(0,1).toUpperCase()+name1.substring(1);
        System.out.println(name2);
    }
}
