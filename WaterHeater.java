class WaterHeater{
	
	/*public WaterHeater() {
	   System.out.println("WaterHeater constructor is invoked");
   }*/

  String brand;
  String warranty;
  int itemWeightInKg;
  
   public WaterHeater(String brand , String warranty , int itemWeightInKg){   
	   this.brand = brand ;
	   this.warranty = warranty;
	   this.itemWeightInKg = itemWeightInKg;
	   System.out.println("Parameterized WaterHeater constructor is invoked");
   }
  
  public void toHeatWater(){
  System.out.println("Hot water is obtained using water heater");
  }
}