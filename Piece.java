import java.util.*;
import java.io.*;

public class Piece{

	private int _x;
	private int _y;
	public Profession Profession;
	public int color;

	enum Profession {
		BISHOP,
		KNIGHT,
		ROOK,
		QUEEN,
		KING
	}
	
	public Piece (Profession p, int c, int x0, int y0)
	{
		_x = x0;
		_y = y0;
		Profession = p;
		color = c;		
	}

	public boolean outOfBounds(int xf, int yf) {
		if(xf > 8) //set this later
		{
			return false;
		}
		if(yf > 8) // set this later
		{
			return false;
		}
		return true;
	}
   
	public void moveKnight(int xf,int yf) {
		if(!outOfBounds(xf,yf))
		{
			if((xf==_x+2 && yf==_y+1) || (xf==_x+1 && yf==_y+2) || (xf==_x-2 && yf==_y+1) || (xf==_x-1 && yf==_y+2)
			|| (xf==_x-2 && yf==_y-1) || (xf==_x-1 && yf==_y-2) || (xf==_x+2 && yf==_y-1) || (xf==_x+1 && yf==_y-2))
			{
				_x=xf;
				_y=yf;
			}
		}
	}
   
	public void moveBishop(int xf, int yf) {
		if(outOfBounds(xf,yf))
		{
			return;
		}
		if ((_x-xf)==(_y-yf) && (_x-xf)==-(_y-yf))
		{
			_x=xf;
			_y=yf;
		}
	}
   
	public void moveRook(int xf, int yf){
		if(outOfBounds(xf,yf)) {
			return;
		}
		if ((xf==_x) || (yf==_y)) {
			_x=xf;
			_y=yf;
		}
	}   
	
	public boolean checkCollisionBishop(int xf,int yf) {
		int posNegx = _x-xf;
		int posNegy = _y-yf;
		int xtemp = xf;
		int ytemp = yf;
		if(posNegx<0 && posNegy<0) {
			while (/*getType(blah.board[xtemp-1][ytemp-1])*/ == e) {
				xtemp = xtempt-1;
				ytempt = ytemp-1;
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

	public Profession getSpecies(Piece a) {
		return Profession;
	}
}
