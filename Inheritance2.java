
package inheritance2;

import java.util.*;

 public class Inheritance2 {

   
    public static void main(String[] args) {
        System.out.println("Hello World ...\n");
        Scanner sn= new Scanner(System.in);
        ComputerStudies cs= new ComputerStudies();
        
        int choise;
        choise=1;
       System.out.println("Menu : \n"
                 +" 1: About us \n"
                 +" 2: Location \n"
                 +" 3: Module \n"
                 +" 4: Leadership \n"
                 +" 5: Module \n"
                 );
       while(choise<6){
            System.out.println("Enter choise : \n");
           choise = sn.nextInt();
           
        switch(choise){
            case 1 -> cs.DisplayInfo();
            case 2 -> cs.location();
            case 3 -> cs.colours();
            case 4 -> cs.leadership();
            case 5 -> cs.module();
            default -> System.out.println("Invalid choise.");
        }
        choise ++;
       }
    }
    
}
