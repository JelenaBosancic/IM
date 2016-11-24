package geometrija;

public class Krug {
	private Tacka centar;
	private int r;
	
	public Krug(){
		
	}
	public Krug(Tacka centar, int r){
		this.centar = centar;
		this.r = r;
	}
	public void pomeriNa(int x, int y){
		centar.pomeriNa(x, y);
	}
	public void pomeriZa(int x, int y){
		centar.pomeriZa(x, y);
	}
	public double povrsina(){
		return r * r * Math.PI;
	}
	public double obim(){
		return 2 * r * Math.PI;
	}
	public Tacka getCentar() {
		return centar;
	}
	public int getR() {
		return r;
	}
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	public void setR(int r) {
		this.r = r;
	}
	
}
