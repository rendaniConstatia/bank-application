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
public class CurrentAccount {
    
 private String accountNumber;
private double balance, overdraftLimit;
private double amount;
private int Choice;
public CurrentAccount(String acctNo,double startingBalance,double overdraftLimit){
    
    balance = startingBalance - overdraftLimit;
    accountNumber = acctNo;
}
public double getBalance()
{
return balance;
}
public String getAccountNumber()
{
    
return accountNumber;
}

public void setAccountNumber(String accountNumber)
{
this.accountNumber = accountNumber;
}
public void overdraftLimit( )
{
  Choice = 2;
    
 if (balance - amount - 5 < 0) {
        System.out.println("Insufficent funds");
        System.out.println("Would you like to apply for an ovedraft?");
        System.out.println("01:Yes");
        System.out.println("2:No, return me back to menus");
        Scanner option = new Scanner(System.in);
        Choice = option.nextInt();
        if (Choice == 01) {
            if (balance - amount - 5 <= -150) {
                System.out.println("You have exceeded your Overdraft Limit, you will now be returned back to the menus");
            } else { //if not exceeding bank balance
                balance -= amount + 5;
                System.out.println("You have withdrawen R" + amount);
                System.err.println("You now have a balance of R" + balance);
            }
        }  
}
}


public void subtractFromAccount(double amount)
{
if (amount >= balance)
{
balance = balance - overdraftLimit - amount ;
}
else
{
System.err.println("Insufficient Funds!!");
}
    
}
}
