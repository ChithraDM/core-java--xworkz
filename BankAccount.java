class BankAccount {
//balance in double //boolean credit //boolean debit methods
 //credit- amount must be greater than zero
 
 static double balance;
 //static int amount;
 
  public static boolean credit(int amount){            //int amount is inside the method
	  System.out.println("Invoking credit");
	 boolean isCredited = false;
	 if(amount >= 0){
	 balance = balance + amount;
	 isCredited = true;
	 }
	 return isCredited;
 }	 
	 
	 public static boolean debit(int amount){
		 System.out.println("Invoking debit");
		boolean isDebited = false;
        if(amount <= balance){
			balance = balance - amount;
			isDebited = true;
			
		}
        return isDebited;
		
	} 
	
	public static double getBalance(){
		System.out.println("The Current balance is ");
		return balance;
	}
		
 
 }

