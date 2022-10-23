package deneme;

public class Kurslar {

	
	  
	  public Kurslar() {
		  System.out.println("ilk cons calıstı");
	  }
	  public Kurslar (int kursId,String kursName, double kursDetail) {
	  System.out.println("kurs constructorı calisti");
	  this.kursId = kursId;
	  this.kursName = kursName;
	  this.kursDetail = kursDetail;
	  
	  }

	  int kursId;
	  String kursName;
	  double kursDetail;
		
		
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

