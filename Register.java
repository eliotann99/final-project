/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;

public class Register {
    public String item;
    public double price;
    public double cash;
    public double giftCardBalance;
    public double creditCardBalance;
    Scanner num= new Scanner(System.in);
    

    public void calculateTotal () {
    double tax = price *.07;
    double total= price + tax;
    paymentMethod(total);
    }// close method
    
    public void paymentMethod (double total) {
        System.out.println("your total is: "+ total + "\n"); 
        System.out.println("how do you want to pay?");
        System.out.println("1-credit card");
        System.out.println("2-gift card");
        System.out.println("3-cash");
        System.out.println("enter the number of the method of which you would like to choose");
        int choice= num.nextInt();
        
        switch (choice) {
            case 1:
                creditPay(total);
                break;
            case 2:
                giftPay(total);
                break;
            case 3:
                cashPay(total);
                break;
        }//close switch statement
    }// close method
    
    private void creditPay (double total) {
        System.out.println("please insert your credit card balance");
        double balance=num.nextDouble();
        creditCardBalance=balance;
        System.out.println("authorizing");
        if (creditCardBalance > total) {
           System.out.println("the transaction was successful");
        } else {
            System.out.println("your card was declined please try again or choose a different method.");
            paymentMethod(total);
            
        }// close if statement
    }// close creditPay method
    
    private void giftPay (double total) {
        System.out.println("please insert your gift card balance");
        double balance=num.nextDouble();
        giftCardBalance= balance;
        if (giftCardBalance > total) {
        giftCardBalance= giftCardBalance - total;   
        System.out.println("your gift card balance is: " + giftCardBalance);
        } else {
            total= total - giftCardBalance;
            paymentMethod( total);
        }// close if else statement
            
    }// close giftPay method
    
    private void cashPay (double total) {
        System.out.println("please inseret how much cash you want to pay");
        double amountOfCash= num.nextDouble();
        cash=amountOfCash;
        if (cash > total && cash<=2500) {
            double change = cash- total;
            System.out.println("your change is: " + change );
        } else if (cash<total) {
            total= total -cash;
            paymentMethod(total);
        } else {
            System.out.println("sorry the bill is too large");
        }// close if else statement
            
    }// close cashPay method
}// close class
