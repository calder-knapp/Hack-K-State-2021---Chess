import numpy as np

class Board:

    def CreateBoard(size):
        board = np.array(size,size)
        print (board)
        return board

    #constructor
    def __init__(self, size):
        self.size = size
        CreateBoard(size)



if __name__ == "__main__":
    Board(10)

