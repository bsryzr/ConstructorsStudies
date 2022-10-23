package deneme;


public class Main {

	public static void main(String[] args) {
		
		
		Kurslar kurs1 = new Kurslar(1,"kurs1","java kursu");
		Kurslar kurs2 = new Kurslar(2,"kurs2","c kursu");
		
		Kurslar[] kurslar = {kurs1,kurs2};
		for(Kurslar kurs : kurslar) {
			System.out.println("kurslar.kursId");
			System.out.println("kurslar.kursName");
			System.out.println("kurslar.kursDetail");
			}
		
		
		Egitmenler tümü = new Egitmenler("tümü");
		Egitmenler engind = new Egitmenler("engind");
		
		Egitmenler egitmen1 = new Egitmenler("egitmenName");
		Egitmenler[] egitmenler = {tümü,engind};
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
