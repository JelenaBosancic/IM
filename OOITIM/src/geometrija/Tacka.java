package geometrija;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
	public Tacka(){
		
	}
	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Tacka(int x, int y, String boja){
		this(x,y);
		this.boja = boja;
		
	}
	
	public void pomeriNa(int novoX, int novoY){
		x = novoX;
		y = novoY;
	}
	public void pomeriZa(int poX, int poY){
		x = x + poX;
		y = y + poY;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int novoX){
		x = novoX;
	}
	public void setY(int novoY){
		y = novoY;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
