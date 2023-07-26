class Customer1Tester{
   
   public static void main(String cus[]){
    
	  Customer1DTO customer = new Customer1DTO();
      
	  customer.setCustomerId(1);
	  customer.setFirstName("Chithra");
	  customer.setMiddleName("DM");
	  customer.setLastName("Yadav");
	  customer.setEmail("chithradm1008@gmail.com");
	  customer.setPhoneNumber(7019463076L);
	  customer.setDob("10-08-2001");
	  customer.setAddress("Rajajinagar");
	  
	  System.out.println(customer.getCustomerId());
	 
   	  System.out.println(customer.getFirstName() + " " +  customer.getMiddleName() + " " 
	  + customer.getLastName());
	  
	  System.out.println(customer.getEmail());
	  
	  System.out.println(customer.getPhoneNumber());
	  
	  System.out.println(customer.getDob());
	  
	  System.out.println(customer.getAddress());
	  
	  //System.out.println(customer.getCustomerId() + " " + customer.getFirstName() + " " + customer.getMiddleName() + " " 
	  //+ customer.getLastName() + " " + customer.getEmail() + " " + customer.getPhoneNumber() + " "  +  customer.getDob() + " "  +      
	  //customer.getAddress());
	  
	  
   }
}