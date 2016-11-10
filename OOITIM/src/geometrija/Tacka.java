package geometrija;

public class Tacka {
	private int x;
	private int y;
	
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
}
