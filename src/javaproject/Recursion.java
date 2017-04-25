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
public class Recursion {
    public static void recursion(int n){
        if (n<=10){
            System.out.println(n);
            recursion(n+1);
        }
    }
    public static void main(String[] args) {
        int n=0;
        recursion(n);
    }
    
}
