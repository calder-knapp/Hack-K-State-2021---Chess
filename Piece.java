class Piece:
   def __init__(self, type, whose, x0, y0)
      #fill with constructor stuff
   
   def moveKnight(xf,yf):
      checkOutOfBounds(xf,yf)
      if (xf==x0+2 and yf==y0+1) or (xf==x0+1 and yf==y0+2) or (xf==x0-2 and yf==y0+1) or (xf==x0-1 and yf==y0+2)
      or (xf==x0-2 and yf==y0-1) or (xf==x0-1 and yf==y0-2) or (xf==x0+2 and yf==y0-1) or (xf==x0+1 and yf==y0-2):
         x0=xf
         y0=yf
   
   def moveBishop(xf,yf):
      checkOutOfBounds(xf,yf)
      if ((x0-xf)==(y0-yf)) and ((x0-xf)==-(y0-yf)):
          x0=xf
          y0=yf
   
   def moveRook(xf,yf):
      checkOutOfBounds(xf,yf)
      if (xf==x0) or (yf==y0):
         x0=xf
         y0=yf
   
   def checkOutOfBounds(xf,yf):
       if xf > "board.size":
         #thats a no-no
         
      if yf > "board.size":
         #thats a no-no
         
   def checkCollisionBishop(xf,yf):
      posNegx = x0-xf
      posNegy = y0-yf
      if posNegx<0 and posNegy<0:
         while "getType(blah.board[xtemp-1][ytemp-1])" != 
      if posNegx<0 and posNegy>0:
         
      if posNegx>0 and posNegy<0:
         
      if posNegx>0 and posNegy>0:
         
    def getType(piece a):
      return "piece.self.type"
