class Person{
	
//Constructor
/*public Person() {
	   System.out.println("Person constructor is invoked");
   }*/
  
  String name;
  String height;
  int weightInKg;
  int ageInYears;
  
  public Person(String nm , String ht , int wIK , int aIY) {
	  name = nm;
	  height = ht;
	  weightInKg = wIK;
	  ageInYears = aIY;
	  System.out.println("Person constructor is invoked");
   }
  
  public void toKnowHimOrHer(){
  System.out.println("We get to know about the person by his name");
  }
  
}