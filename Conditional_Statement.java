/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional_statement;
import java.util.*;
public class Conditional_Statement {

 
    public static void main(String[] args) {
        Operational op;
        op = new Operational();
        Scanner sc = new Scanner(System.in);
            conditional co;
            co = new conditional();
            
            int num;
            String choice;
            do{
                System.out.print("Please Enter the first number  \n");
                op.a=sc.nextInt();
                
                
                System.out.print("Please Enter the second number \n");
                op.b=sc.nextInt();
                
                
                
                System.out.print("""
                                            Choose between 1,2,3,4:-
                                            1: add\n 2: sub\n 3: mult\n 4: div\n
                                          """);
                num=sc.nextInt();
                
                switch(num){
                    case 1 -> op.add();
                    case 2 -> op.sub();
                    case 3 -> op.mult();
                    case 4 -> op.div();
                }
                
                System.out.print("\nPlease Enter the number to check if is Even / Odd \n");
                co.c=sc.nextInt();
                co.display();
                
                System.out.print("\nDo you want to continue (Yes/No) \n");
                choice=sc.next();
                
            }while("Yes".equals(choice)|| "yes".equals(choice));
            System.out.print("\nExit the program. Thank you! \n");
        }
    }
    
