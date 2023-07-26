class Customer1DTO{
 //Encapsulation
    
	private int customerId;
    private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String dob;
	private String address;
	
	//no method
	//getter using get and setter using set
	//setter using get //setter for customerId
	public void setCustomerId(int customerId){
		this.customerId = customerId;
    }
	//getter using get //getter for customerId
	public int getCustomerId(){
		return customerId;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		//System.out.println(firstName);
		return firstName;
	}
	
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	
	public String getMiddleName(){
		return middleName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setDob(String dob){
		this.dob = dob;
	}
	
	public String getDob(){
		return dob;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
}