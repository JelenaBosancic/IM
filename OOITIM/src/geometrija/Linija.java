package geometrija;

public class Linija {
	private Tacka tPocetna;
	private Tacka tKrajnja;
	
	public void pomeriZa(int poX, int poY){
		tPocetna.setX(tPocetna.getX()+poX);
		tPocetna.setY(tPocetna.getY()+poY);
		tKrajnja.setX(tKrajnja.getX()+poX);
		tKrajnja.setY(tKrajnja.getY()+poY);
	}
	public double duzina(){
		int dx = tPocetna.getX() - tKrajnja.getX();
		int dy = tPocetna.getY() - tKrajnja.getY();
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	public Tacka gettPocetna(){
		return tPocetna;
	}
	public Tacka gettKrajnja(){
		return tKrajnja;
	}
	public void settPocetna(Tacka novatPocetna){
		tPocetna = novatPocetna;
	}
	public void settKrajnja(Tacka novatKrajnja){
		tKrajnja = novatKrajnja;
	}
}
