
package studentinfo;

import java.util.Scanner;

public class main {
     public static void main(String args[]){
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your Name");
         String Name=input.nextLine();
         student s1=new student(Name,"CE",1234);
         student s2=new student(Name,"CE");
     

s1.display();    }}
