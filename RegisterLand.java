/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;
public class RegisterLand {
    public static void main(String[] args) {
        Scanner properties= new Scanner(System.in);
        System.out.println("please enter the product.");
        String a= properties.nextLine();
        System.out.println("now please enter the price");
        double b = properties.nextDouble();
        Register input= new Register();
        input.item=a;
        input.price=b;
        displayStatus(input);
        input.calculateTotal();
    }//close main method
    
    
    public static void displayStatus(Register object) {
        System.out.println("item scanned: "+ object.item);
        System.out.println("its price: " + object.price);
    }// close displayStatus method
}// close class

