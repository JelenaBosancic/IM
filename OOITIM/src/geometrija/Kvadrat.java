package geometrija;

public class Kvadrat {
	private Tacka goreLevo;
	private int duzinaStranice;
	
	public void pomeriNa(int x, int y){
		goreLevo.pomeriNa(x, y);
	}
	public void pomeriZa(int x, int y){
		goreLevo.pomeriZa(x, y);
	}
	public int povrsina(){
		return duzinaStranice * duzinaStranice;
	}
	public int obim(){
		return 4 * duzinaStranice;
	}
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public int getDuzinaStranice() {
		return duzinaStranice;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	
}
