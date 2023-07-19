class AgroIndustry{
	
	/*public AgroIndustry() {
	   System.out.println("AgroIndustry constructor is invoked");
   }  */

  String name;
  String type;
  int quantityProducedInKg;
  
  public AgroIndustry(String name , String type , int quantityProducedInKg){   
	   this.name = name ;
	   this.type = type;
	   this.quantityProducedInKg = quantityProducedInKg;
	   System.out.println("Parameterized AgroIndustry constructor is invoked");
   }
  
  public void toProduceRawMaterials(){
  System.out.println("Agro industries have agricultural produce as raw material");
  }
}