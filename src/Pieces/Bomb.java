package Pieces;

import Board.Board;

public class Bomb extends Piece{
    public Bomb(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 11;
    }

    
}
