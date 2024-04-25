/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;
/**
 * 
 * @author cleop
 */
public class DIT {
    String name = "Dar es salaam Institute of technology";
    String ID = "DIT/2203434";
    String leader = "Sospeter";
    
    void DisplayInfo(){
        System.out.println("DIT- About us:-");
        System.out.println("Name > "+name);
        System.out.println("ID > "+ID);
    }
    void location(){
        System.out.println("Bibi titi and Morogoro road.");
    }
    void colours(){
        System.out.println("Blue and white.");
    }
    String leadership(){
        System.out.println("leader >"+leader);
        return leader;
    }
}
