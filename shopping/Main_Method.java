package com.java.shopping;

// ACCOUNT...
class Account 
{
  private String Name;
  private String Branch;
  private double Balance;
  
  public double getBalance() 
  {
	return Balance;
  }
  public void setBalance(double U_Balance) 
  {
	  this.Balance=U_Balance;
  }
  
}

// ONLINE PAYMENT...
class OnlinePayment
{
	double productPrice;
	double productName;
	
	public void addToCart(double productPrice,double productName) 
	{	    
	    System.out.println("Product Name :"+productName);
	    System.out.println("Product price :"+productPrice);
	}
	public void makePayment(double productPrice,Account a) 
	{
		
		if(a.getBalance()>=0 && a.getBalance()-productPrice>=0)
		{
			double Amt = a.getBalance()-productPrice;
			System.out.println("Order is placed");

		}else
		{
			System.out.println("Insufficient Balance "+a.getBalance());
		}
	}
}

// SHOPPING...
class Shopping
{
	String userName;
	String address;
	long   phoneNumber;
	String name;
	double price;
	
	public void buyNow(OnlinePayment op, Account a, double productPrice) 
	{
		op.makePayment(productPrice, a);	 
	}
	
}

class Laptops extends Shopping
{
	Laptops(String name,double price)
	{
		super();
	}
}

class Mobiles extends Shopping
{
	Mobiles(String name,double price)
	{
	}
}


// MAIN METHOD ...
public class Main_Method
{
	public static void main(String[] args) 
	{
		Account account = new Account();
		        account.setBalance(500.0);
		        System.out.println("Account Balance : "+account.getBalance());
		
		OnlinePayment op = new OnlinePayment();
		              op.addToCart(500.0, 1);
		              op.makePayment(500.0, account);
		
		Mobiles mobile = new Mobiles("Vivo", 500.0);
		        mobile.buyNow(op, account,4500.0 );
	}
}