import org.omg.CORBA.OMGVMCID;

class Hayvan{
	private String isim;
	public Hayvan(String isim) {
	
		this.setIsim(isim);
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String konus() {
		return "Hayvan Konusuyor";
	}
	
}

class Kedi extends Hayvan {
	public Kedi(String isim) {
		super(isim);
		
	}

	@Override
	public String konus() {
		return this.getIsim() + " miyavliyor";
	}
	
}

class Kopek extends Hayvan{

	public Kopek(String isim) {
		super(isim);
		
	}

	@Override
	public String konus() {

		return this.getIsim() + " havliyor";
	}
	
}

class At extends Hayvan{

	public At(String isim) {
		super(isim);
		
	}

	@Override
	public String konus() {
		
		return this.getIsim() + " kisniyor";
	}
	
}
public class Main {
	public static void Konustur(Object object) {
		if(object instanceof Kopek) {
			Kopek kopek = (Kopek) object;
			System.out.println(kopek.konus());
		}
		else if(object instanceof Kedi){
			Kedi kedi = (Kedi) object;
			System.out.println(kedi.konus());
		}
		else if(object instanceof At) {
			At at = (At) object;
			System.out.println(at.konus());
		}
		else if (object instanceof Hayvan) {
			Hayvan hayvan = (Hayvan) object;
			System.out.println(hayvan.konus());
		}
		//System.out.println(object.konus());
	}
public static void main (String args[]) {
	//Hayvan hayvan = new Hayvan("Timotiii");  //POLYMORPHIZM
//	Hayvan hayvan1 = new Kedi("Timotiii");
//	System.out.println(hayvan1.konus());
//	Hayvan hayvan2 = new Kopek("Karabas");
//	System.out.println(hayvan2.konus());
//	Hayvan hayvan3 = new At("Sahbatur");
//	System.out.println(hayvan3.konus());
//	Konustur(new Kedi("Timoti"));
//	Konustur(new Kopek("Karabas"));
//	Konustur(new At("Sahbatur"));
	
//	Kopek kopek = new Kopek("Karabas");
//	if(kopek instanceof Kopek) {
//		System.out.println("Bu Nesne Kopek Sinifindan");
//	}
	
	Kopek kopek = new Kopek("Karabas");
	Kedi kedi= new Kedi("Timoti");
	At at = new At("Sahbatur");
	Hayvan hayvan = new Hayvan("Rambo");
	Konustur(kopek);
	Konustur(kedi);
	Konustur(at);
	Konustur(hayvan);
}
}
