class MobileShop {

 public static void main(String mobile[]){
 String mobileBrands[] = {"Oppo", "Redmi", "Samsung", "Lenovo", "MottoG"};
 System.out.println("Main started");
 for(int i=0;i<=mobileBrands.length-1;){
	 System.out.println(mobileBrands[i]);
	 i++;
 }
 for(String mobileBrand: mobileBrands) {
		  System.out.println(mobileBrand);
	  }
		
 System.out.println("Main ended");
 }

}