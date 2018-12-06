
package parrot;

import java.util.Scanner;

public class Parrot {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Write something, I will repeat");
        String vstup = sc.nextLine();
        String vystup = vstup + " + " + vstup;
        System.out.println(vystup);
    }
    
}
