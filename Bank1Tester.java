class Bank1Tester{
 
  public static void main(String banks[]){
	  Bank1DTO bank = new Bank1DTO();
	  
	  bank.setBankId(606985);
	  bank.setBankName("Bank of Baroda");
	  bank.setBranch("Bangalore Urban");
	  bank.setBranchCode("PBBBAN");
	  bank.setAddress("Bangalore");
	  bank.setHelplineNo(2345678910L);
	  bank.setBranchManager("Bhupendra");
	  bank.setIfscCode("BARB0PBBBAN");
	  bank.setMicrCode(560012015);
	  bank.setNoOfLockers(30);
	  bank.setNoOfEmployees(15);
	  bank.setTimings("10am to 5pm");
	  bank.setWebsiteDetails("www.bankofbaroda.com");
	  
	  System.out.println(bank.getBankId() + "|" + bank.getBankName() + "|" + bank.getBranch() + "|" + bank.getBranchCode() + "|"
	  + bank.getAddress() + "|" + bank.getHelplineNo() + "|" + bank.getBranchManager() + "|" + bank.getIfscCode() + "|" +
	  bank.getMicrCode() + "|" + bank.getNoOfLockers() + "|" + bank.getNoOfEmployees() + "|" + bank.getTimings() + "|" +
	  bank.getWebsiteDetails());
      System.out.println("_________________________________________________________________________________________________________________________________________________________");
	  
	  Bank1DTO bank1 = new Bank1DTO();
	  
	  bank1.setBankId(607095);
	  bank1.setBankName("IDBI Bank");
	  bank1.setBranch("Kengeri");
	  bank1.setBranchCode("BIIDBI");
	  bank1.setAddress("Upanagar");
	  bank1.setHelplineNo(8844667723L);
	  bank1.setBranchManager("Bharath");
	  bank1.setIfscCode("IDBI0BIIDBI");
	  bank1.setMicrCode(560045678);
	  bank1.setNoOfLockers(50);
	  bank1.setNoOfEmployees(25);
	  bank1.setTimings("9am to 4pm");
	  bank1.setWebsiteDetails("www.idbibank.com");
	  
	  System.out.println(bank1.getBankId() + "| " + bank1.getBankName() + " |" + bank1.getBranch() + "| " + bank1.getBranchCode() + "| "
	  + bank1.getAddress() + " |" + bank1.getHelplineNo() + " |" + bank1.getBranchManager() + " |" + bank1.getIfscCode() + "| " +
	  bank1.getMicrCode() + " |" + bank1.getNoOfLockers() + "| " + bank1.getNoOfEmployees() + " |" + bank1.getTimings() + "| " +
	  bank1.getWebsiteDetails());
	  System.out.println("___________________________________________________________________________________________________________________________________________________________");
	  
	  Bank1DTO bank2 = new Bank1DTO();
	  
	  bank2.setBankId(605678);
	  bank2.setBankName("Karnataka Bank");
	  bank2.setBranch("Thagachaguppe");
	  bank2.setBranchCode("KARB09");
	  bank2.setAddress("Devagere cross");
	  bank2.setHelplineNo(2134657809L);
	  bank2.setBranchManager("Bhanumathi");
	  bank2.setIfscCode("KARB0786906");
	  bank2.setMicrCode(56006089);
	  bank2.setNoOfLockers(20);
	  bank2.setNoOfEmployees(5);
	  bank2.setTimings("10am to 5pm");
	  bank2.setWebsiteDetails("www.karnatakabank.com");
	  
	  System.out.println(bank2.getBankId() + " |" + bank2.getBankName() + "| " + bank2.getBranch() + " |" + bank2.getBranchCode() + " |"
	  + bank2.getAddress() + " |" + bank2.getHelplineNo() + " |" + bank2.getBranchManager() + "| " + bank2.getIfscCode() + "| " +
	  bank2.getMicrCode() + "| " + bank2.getNoOfLockers() + "| " + bank2.getNoOfEmployees() + " |" + bank2.getTimings() + "| " +
	  bank2.getWebsiteDetails());
	  System.out.println("______________________________________________________________________________________________________________________________________________________________");

	  Bank1DTO bank3 = new Bank1DTO();
	  
	  bank3.setBankId(606654);
	  bank3.setBankName("State Bank Of India");
	  bank3.setBranch("Kumbalagodu");
	  bank3.setBranchCode("SBIBAN");
	  bank3.setAddress("Thagachaguppe");
	  bank3.setHelplineNo(9765432190L);
	  bank3.setBranchManager("Bhupathi");
	  bank3.setIfscCode("SBIB0SBIBAN");
	  bank3.setMicrCode(560078456);
	  bank3.setNoOfLockers(39);
	  bank3.setNoOfEmployees(19);
	  bank3.setTimings("10:30am to 6pm");
	  bank3.setWebsiteDetails("www.statebankofindia.com");
	  
	  System.out.println(bank3.getBankId() + "| " + bank3.getBankName() + " |" + bank3.getBranch() + " |" + bank3.getBranchCode() + " |"
	  + bank3.getAddress() + " |" + bank3.getHelplineNo() + " |" + bank3.getBranchManager() + " |" + bank3.getIfscCode() + "| " +
	  bank3.getMicrCode() + "| " + bank3.getNoOfLockers() + "| " + bank3.getNoOfEmployees() + "| " + bank3.getTimings() + "| " +
	  bank3.getWebsiteDetails());
	  System.out.println("_____________________________________________________________________________________________________________________________________________________________");
	  
	  Bank1DTO bank4 = new Bank1DTO();
	  
	  bank4.setBankId(606765);
	  bank4.setBankName("HDFC Bank");
	  bank4.setBranch("Upanagar");
	  bank4.setBranchCode("HDFCBAN");
	  bank4.setAddress("Kengeri Upanagar");
	  bank4.setHelplineNo(9880501856L);
	  bank4.setBranchManager("Bhagvan");
	  bank4.setIfscCode("HDFC0HDFBAN");
	  bank4.setMicrCode(560056789);
	  bank4.setNoOfLockers(40);
	  bank4.setNoOfEmployees(14);
	  bank4.setTimings("9am to 5:30pm");
	  bank4.setWebsiteDetails("www.hdfcbank.com");
	  
	  System.out.println(bank4.getBankId() + " |" + bank4.getBankName() + "| " + bank4.getBranch() + " |" + bank4.getBranchCode() + "| "
	  + bank4.getAddress() + "| " + bank4.getHelplineNo() + " |" + bank4.getBranchManager() + "| " + bank4.getIfscCode() + " |" +
	  bank4.getMicrCode() + "| " + bank4.getNoOfLockers() + "| " + bank4.getNoOfEmployees() + "| " + bank4.getTimings() + " |" +
	  bank4.getWebsiteDetails());
  }
}