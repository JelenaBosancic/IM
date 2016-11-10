package geometrija;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tacka t1 = new Tacka();
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
	}

}
