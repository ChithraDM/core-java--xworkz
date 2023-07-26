class PatientATester{
   
   public static void main(String hospital[]){
   PatientADTO patient = new PatientADTO();
	   
	   patient.setPatientId(208);
	   patient.setPatientName("Armugam");
	   patient.setAge(30);
	   patient.setBloodGroup("AB+ve");
	   patient.setGender("male");
	   patient.setAddress("Kathriguppe");
	   patient.setContactNo(4567892341L);
	   patient.setWardNo(408);
	   patient.setAttenderName("Aryan");
	   patient.setDiseaseName("Dengue");
	   patient.setConsultant("Eshwarappa");
	   patient.setHospitalName("HAL");
	   patient.setFees(48000.00);
	   
	   System.out.println(patient.getPatientId());
	   System.out.println(patient.getPatientName());
	   System.out.println(patient.getAge());
	   System.out.println(patient.getBloodGroup());
	   System.out.println(patient.getGender());
	   System.out.println(patient.getAddress());
	   System.out.println(patient.getContactNo());
	   System.out.println(patient.getWardNo());
	   System.out.println(patient.getAttenderName());
	   System.out.println(patient.getDiseaseName());
	   System.out.println(patient.getConsultant());
	   System.out.println(patient.getHospitalName());
	   System.out.println(patient.getFees());
	   System.out.println("++++++++++++++");
	   
	   PatientADTO patient1 = new PatientADTO();
	   
	   patient1.setPatientId(209);
	   patient1.setPatientName("Anusuya");
	   patient1.setAge(46);
	   patient1.setBloodGroup("O+ve");
	   patient1.setGender("female");
	   patient1.setAddress("Pantharapalya");
	   patient1.setContactNo(3456789012L);
	   patient1.setWardNo(409);
	   patient1.setAttenderName("Zeb");
	   patient1.setDiseaseName("Malaria");
	   patient1.setConsultant("Karyappa");
	   patient1.setHospitalName("Bharath Hospital");
	   patient1.setFees(56000.00);
	   
	   System.out.println(patient1.getPatientId());
	   System.out.println(patient1.getPatientName());
	   System.out.println(patient1.getAge());
	   System.out.println(patient1.getBloodGroup());
	   System.out.println(patient1.getGender());
	   System.out.println(patient1.getAddress());
	   System.out.println(patient1.getContactNo());
	   System.out.println(patient1.getWardNo());
	   System.out.println(patient1.getAttenderName());
	   System.out.println(patient1.getDiseaseName());
	   System.out.println(patient1.getConsultant());
	   System.out.println(patient1.getHospitalName());
	   System.out.println(patient1.getFees());
	   System.out.println("++++++++++++++");
	   
	   PatientADTO patient2 = new PatientADTO();
	   
	   patient2.setPatientId(210);
	   patient2.setPatientName("Annapoorna");
	   patient2.setAge(45);
	   patient2.setBloodGroup("O-ve");
	   patient2.setGender("female");
	   patient2.setAddress("Attiguppe");
	   patient2.setContactNo(5674563451L);
	   patient2.setWardNo(410);
	   patient2.setAttenderName("Dinesh");
	   patient2.setDiseaseName("Fever");
	   patient2.setConsultant("Anjinappa");
	   patient2.setHospitalName("Anji Clinic");
	   patient2.setFees(3000.00);
	   
	   System.out.println(patient2.getPatientId());
	   System.out.println(patient2.getPatientName());
	   System.out.println(patient2.getAge());
	   System.out.println(patient2.getBloodGroup());
	   System.out.println(patient2.getGender());
	   System.out.println(patient2.getAddress());
	   System.out.println(patient2.getContactNo());
	   System.out.println(patient2.getWardNo());
	   System.out.println(patient2.getAttenderName());
	   System.out.println(patient2.getDiseaseName());
	   System.out.println(patient2.getConsultant());
	   System.out.println(patient2.getHospitalName());
	   System.out.println(patient2.getFees());
	   
   }
}