import java.util.*;
import java.io.*;

public class Piece{
    
	enum Profession {
		BISHOP,
		KNIGHT,
		ROOK,
		QUEEN,
		KING
	}
	
	public piece(Profession p,int color,int x0,int y0) {
		private int _x0=x0;
		private int _y0=y0;
		public Profession _p = p;
		public int _color = color;
		
	}
   
	public void moveKnight(int xf,int yf) {
		if(checkOutOfBounds(xf,yf)) {
			return;
		}
		if((xf==x0+2 && yf==y0+1) || (xf==x0+1 && yf==y0+2) || (xf==x0-2 && yf==y0+1) || (xf==x0-1 && yf==y0+2)
		|| (xf==x0-2 && yf==y0-1) || (xf==x0-1 && yf==y0-2) || (xf==x0+2 && yf==y0-1) || (xf==x0+1 && yf==y0-2)){
			_x0=xf;
			_y0=yf;
		}
	}
   
	public void moveBishop(xf,yf) {
		if(checkOutOfBounds(xf,yf)) {
			return;
		}
		if((x0-xf)==(y0-yf)) && ((x0-xf)==-(y0-yf)) {
			_x0=xf;
			_y0=yf;
		}
	}
   
	public void moveRook(xf,yf){
		if(checkOutOfBounds(xf,yf)) {
			return;
		}
		if (xf==x0) || (yf==y0) {
			_x0=xf;
			_y0=yf;
		}
	}
   
	public boolean checkOutOfBounds(xf,yf) {
		if(xf > /*board.size*/) {
			return false;
		}
		if yf > /*board.size*/ {
			return false;
		}
		return true;
	}
	
	public boolean checkCollisionBishop(int xf,int yf) {
		int posNegx = x0-xf;
		int posNegy = y0-yf;
		int xtemp = xf;
		int ytemp = yf;
		Profession e = new Profession(0);
		if(posNegx<0 && posNegy<0) {
			while (/*getType(blah.board[xtemp-1][ytemp-1])*/ == e) {
				xtemp=xtempt-1;
				ytempt=ytemp-1;
			}
			yf=ytemp;
			xf=xtemp;
		}
		if(posNegx<0 && posNegy>0) {

		}
		if(posNegx>0 && posNegy<0) {
			
		}
		if(posNegx>0 && posNegy>0) {
			
		}
	}

	public Species getSpecies(Piece a) {
		return a._s;
	}
}
