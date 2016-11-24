package geometrija;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Tacka t1 = new Tacka();
		System.out.println("X t1: "+t1.getX());
		System.out.println("Y t1: "+t1.getY());
		//postaviti x t1 na vrednost 10
		t1.setX(10);
		System.out.println("X t1: "+t1.getX());
		t1.pomeriZa(5, 10);
		System.out.println("X t1: "+t1.getX());
		Linija l1 = new Linija();
		l1.settPocetna(t1);
		System.out.println("X pocetne tacke l1: "+l1.gettPocetna().getX());
		l1.gettPocetna().setX(33);
		System.out.println("X pocetne tacke l1: "+l1.gettPocetna().getX());
		Tacka t2 = new Tacka();
		t2.setY(50);
		l1.settKrajnja(t2);
		//postaviti x koordinatu pocetne tacke linije l1 na vrednost
		//y koordinate krajnje tacke linije l1
		l1.gettPocetna().setX(l1.gettKrajnja().getY());
		System.out.println("X pocetne tacke l1: "+l1.gettPocetna().getX());
		System.out.println("Duzina l1: "+l1.duzina());
		Pravougaonik p1 = new Pravougaonik();
		p1.setGoreLevo(t1);
		// x koordinatu tacke gore levo p1
		System.out.println("X gore levo p1: "+p1.getGoreLevo().getX());
		Kvadrat kv1 = new Kvadrat();
		kv1.setGoreLevo(t2);
		kv1.setDuzinaStranice(100);
		//y koordinata tacke gore levo p1 na vrednost 
		//zbira obima i povrsine kv1
		p1.getGoreLevo().setY(kv1.obim()+kv1.povrsina());
		System.out.println("Y gore levo p1: "+p1.getGoreLevo().getY());
		Krug kr1 = new Krug();
		kr1.setCentar(t2);
		kr1.pomeriNa(10, 15);
		kr1.getCentar().setX(10);
		kr1.getCentar().setY(15);
		System.out.println("X centra kr1: "+kr1.getCentar().getX());
		*/
		Tacka t1 = new Tacka(5,10);
		System.out.println("X t1: "+t1.getX()+"\nY t1: "+t1.getY());
		Linija l1 = new Linija(t1, new Tacka(20, 25));
		System.out.println("Duzina l1: "+l1.duzina());
		Pravougaonik p1 = new Pravougaonik(t1, 100, 50);
		System.out.println("X gore levo p1: "+p1.getGoreLevo().getX());
		p1.getGoreLevo().setX(20);
		System.out.println("X t1: "+t1.getX());
		Kvadrat kv1 = new Kvadrat(t1, 50);
		// krug kr1 sa centrom:
		// x centra = x koordinata gore levo p1
		// y centra = y koordinata krajnje tacke l1
		// poluprecnik = obim p1
		Krug kr1 = new Krug(new Tacka(p1.getGoreLevo().getX(), l1.gettKrajnja().getY()), p1.obim());
		System.out.println("Povrsina kr1: "+kr1.povrsina());
		Tacka t2 = new Tacka(10, 20, "crna");
		System.out.println("Boja t2: "+t2.getBoja());
	}

}
