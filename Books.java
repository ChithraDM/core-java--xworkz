class Books {
	
  /*public Books() {
		System.out.println("Books Constructor is invoked");
	}*/
	
  String name;
  String type;
  String author;
  int price;
  String publicationName;
  int noOfPages;
  
  public Books(String name , String type , String author , int price , String publicationName , int noOfPages){   
	   this.name = name ;
	   this.type = type;
	   this.author = author;
	   this.price = price;
	   this.publicationName = publicationName;
	   this.noOfPages = noOfPages;
	   System.out.println("Parameterized Books constructor is invoked");
   }
  
  public void gainKnowledge(){
  System.out.println("We read books to gain knowledge");
  }
}