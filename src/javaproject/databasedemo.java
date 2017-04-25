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
public class databasedemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int id=0,del=0,update=0;
        char input;
        String title,price,duration;
        System.out.println("What do you want to do");
        System.out.println("r to read, u to update and d to delete");
        char a=sc.next().toUpperCase().charAt(0);
        do{
        switch(a){
            case 'R':
                id=sc.nextInt();
                title=sc.next();
                price=sc.next();
                duration=sc.next();
                System.out.println("insert into course (c_id,title,price,durationd) values("+id+",\""+title+"\",\""+price+"\",\""+duration+"\");");
                break;
            case'D':
                System.out.println("enter the id of row you want to delete");
                del=sc.nextInt();
                System.out.println("delete from course where c_id="+del+";");  
            case 'U':
                
                System.out.println("enter id to update");
                update=sc.nextInt();
                System.out.println("enter the value you want to change");
                char b=sc.next().toUpperCase().charAt(0);
                switch(b){
                case 'T':
                String title1=sc.next();
                System.out.println("update course set title='"+title1+"'where c_id="+update+";");
                case 'D':
                String duration1=sc.next();
                System.out.println("update course set duration='"+duration1+"'where c_id="+update+";");
                case 'P':
                String price1=sc.next();
                System.out.println("update course set price='"+price1+"'where c_id="+update+";");
                
                }
            default:
                System.out.println("wrong input");
                
        }
        System.out.print("To continue press Y or y else press any key and press enter \t ");
        input=sc.next().toUpperCase().charAt(0);
        }while (input=='Y');
        }
    }
