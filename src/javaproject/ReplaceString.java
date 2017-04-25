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
public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String value="The quick fox jumped over the laxy dog";
        System.out.println(value.replace("fox", "dog"));
    }
    
}
