class PrinterTester{

    public static void main(String printer[]){
   
	  System.out.println("Creating first copy of printer");
	  Printer printer1 = new Printer();
	  printer1.brand = "hp";
	  printer1.warranty = "11 years";
	  printer1.itemWeightInKg = 6;
	  printer1.operatingSystem = "windows 10";
	  printer1.toPrintPages();
	  System.out.println(printer1.brand + " " + printer1.warranty + " " + printer1.itemWeightInKg + " " + printer1.operatingSystem);
	  
	  System.out.println("Creating second copy of printer");
	  Printer printer2 = new Printer();
	  printer2.brand = "dell";
	  printer2.warranty = "10 years";
	  printer2.itemWeightInKg = 9;
	  printer2.operatingSystem = "android 1.2";
	  printer2.toPrintPages();
	  System.out.println(printer2.brand + " " + printer2.warranty + " " + printer2.itemWeightInKg + " " + printer2.operatingSystem);
	  
	  System.out.println("Creating third copy of printer");
	  Printer printer3 = new Printer();
	  printer3.brand = "asus";
	  printer3.warranty = "12 years";
	  printer3.itemWeightInKg = 8;
	  printer3.operatingSystem = "windows 11";
	  printer3.toPrintPages();
	  System.out.println(printer3.brand + " " + printer3.warranty + " " + printer3.itemWeightInKg + " " + printer3.operatingSystem);
	  
	  System.out.println("Creating fourth copy of printer");
	  Printer printer4 = new Printer();
	  printer4.brand = "asus vivobook";
	  printer4.warranty = "9 years";
	  printer4.itemWeightInKg = 5;
	  printer4.operatingSystem = "android 1.8";
	  printer4.toPrintPages();
	  System.out.println(printer4.brand + " " + printer4.warranty + " " + printer4.itemWeightInKg + " " + printer4.operatingSystem);
	  
	  System.out.println("Creating fifth copy of printer");
	  Printer printer5 = new Printer();
	  printer5.brand = "hp deskjet";
	  printer5.warranty = "18 years";
	  printer5.itemWeightInKg = 10;
	  printer5.operatingSystem = "windows 9";
	  printer5.toPrintPages();
	  System.out.println(printer5.brand + " " + printer5.warranty + " " + printer5.itemWeightInKg + " " + printer5.operatingSystem);
	  
	  System.out.println("Creating sixth copy of printer");
	  Printer printer6 = new Printer();
	  printer6.brand = "epson eco tank";
	  printer6.warranty = "15 years";
	  printer6.itemWeightInKg = 9;
	  printer6.operatingSystem = "android lollipop";
	  printer6.toPrintPages();
	  System.out.println(printer6.brand + " " + printer6.warranty + " " + printer6.itemWeightInKg + " " + printer6.operatingSystem);
	  
	  System.out.println("Creating seventh copy of printer");
	  Printer printer7 = new Printer();
	  printer7.brand = "canon";
	  printer7.warranty = "6 years";
	  printer7.itemWeightInKg = 9;
	  printer7.operatingSystem = "android jellybean";
	  printer7.toPrintPages();
	  System.out.println(printer7.brand + " " + printer7.warranty + " " + printer7.itemWeightInKg + " " + printer7.operatingSystem);
	  
	  System.out.println("Creating eighth copy of printer");
	  Printer printer8 = new Printer();
	  printer8.brand = "brother HL";
	  printer8.warranty = "7 years";
	  printer8.itemWeightInKg = 19;
	  printer8.operatingSystem = "windows 8";
	  printer8.toPrintPages();
	  System.out.println(printer8.brand + " " + printer8.warranty + " " + printer8.itemWeightInKg + " " + printer8.operatingSystem);
	  
	  System.out.println("Creating ninth copy of printer");
	  Printer printer9 = new Printer();
	  printer9.brand = "canon pixma";
	  printer9.warranty = "9 years";
	  printer9.itemWeightInKg = 9;
	  printer9.operatingSystem = "android donut";
	  printer9.toPrintPages();
	  System.out.println(printer9.brand + " " + printer9.warranty + " " + printer9.itemWeightInKg + " " + printer9.operatingSystem);
	  
	  System.out.println("Creating tenth copy of printer");
	  Printer printer10 = new Printer();
	  printer10.brand = "hp laser jet";
	  printer10.warranty = "10 years";
	  printer10.itemWeightInKg = 10;
	  printer10.operatingSystem = "android vanilla";
	  printer10.toPrintPages();
	  System.out.println(printer10.brand + " " + printer10.warranty + " " + printer10.itemWeightInKg + " " + printer10.operatingSystem);
	  
}

}