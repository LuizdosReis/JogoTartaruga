package br.com.poo2.model;

public class Board {
	
	private int [][]board;
	
	public Board(int size) {
		board = new int[size][size];	
	}
	
	public void write(int x, int y){
		board[x][y] = 1;
	}
	
	public void print(){
		for(int i = 0;i<board.length;i++){
			for(int j = 0; j<board[i].length;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public int getPoint(int x,int y){
		return board[x][y];
	}
	

}
