/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaacount;

/**
 *
 * @author user
 */
public class SavingsAccount {

private String accountNumber;
private double balance;


public SavingsAccount(String acctNo, double startingBalance)
{
balance = startingBalance;
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

public void subtractFromAccount(double amount)
{
if (amount <= balance)
{
balance = balance - amount;
}
else
{
System.err.println("Insufficient Funds!!");
}
}


}


