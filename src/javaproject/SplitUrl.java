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
public class SplitUrl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url="www.facebook.com/weare/practicing/spliting/in/java/";
        for(String b:url.split("/")){
            System.out.println(b);
        }
    }
}
