/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaacount;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BankAAcount {

    /**  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

//set up path to Savings Account class

SavingsAccount myAccount = new SavingsAccount("W119kl", 1000.0);
CurrentAccount cAccount =new  CurrentAccount("WQQ111", 30000,0);

//set some variables
String userName;
double withdraw;
String accountNumber;
double amount;


//Greeting and get customer name
System.out.println();
System.out.println("Welcome to EnviroBank");
System.out.println("Please Enter Name");
userName=input.nextLine();//get customer name
System.out.println("Hello " +userName );

System.out.println();

//get and set account number
System.out.println("Enter your account number");
accountNumber=input.nextLine();//customer input account number
myAccount.setAccountNumber(accountNumber);//set account number in SavingsAccount class

System.out.println();

//make opening deposit and set balance
System.out.println("Customer name: "+userName);
System.out.println("Account number: "+accountNumber);
System.out.println("Enter the amount to begin account with:");

amount = input.nextDouble();//customer input dollar amount

System.out.println();

//process withdraw and update balance
System.out.println("Customer name: "+userName);
System.out.println("Account number: "+accountNumber);
System.out.println("Enter the amount you wish to withdraw:");

amount = input.nextDouble();//withdraw amount
withdraw = amount;//define withdraw amount
myAccount.subtractFromAccount(amount);//apply to balance in SavingsAccount class and balance update via subtractFromAccount
cAccount.overdraftLimit();
System.out.println();

//close customer session and lay out account activity
System.out.println();
System.out.println("Thank You " +userName);
System.out.println("Account number: " +myAccount.getAccountNumber());
System.out.println("You withdrew: R"+withdraw);
System.out.println("Account balance: R"+myAccount.getBalance());//final balance from SavingsAccount class

System.out.println();

System.out.println("Thank you!");

input.close();
}


}
