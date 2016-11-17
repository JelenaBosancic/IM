package geometrija;

public class Pravougaonik {
	private Tacka goreLevo;
	private int sirina;
	private int visina;
	
	public void pomeriNa(int x, int y){
		goreLevo.setX(x);
		goreLevo.setY(y);
	}
	public void pomeriZa(int x, int y){
		//goreLevo.setX(goreLevo.getX()+x);
		//goreLevo.setY(goreLevo.getY()+y);
		goreLevo.pomeriZa(x, y);
	}
	public int povrsina(){
		return sirina * visina;
	}
	public int obim(){
		return 2 * (sirina + visina);
	}
	public Tacka getGoreLevo(){
		return goreLevo;
	}
	public int getSirina(){
		return sirina;
	}
	public int getVisina(){
		return visina;
	}
	public void setGoreLevo(Tacka novaGoreLevo){
		goreLevo = novaGoreLevo;
	}
	public void setVisina(int visina){
		this.visina = visina;
	}
	public void setSirina(int sirina){
		this.sirina = sirina;
	}
	
	
}
