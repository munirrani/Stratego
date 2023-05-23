package Pieces;

import Board.Board;

public class Colonel extends Piece{
    public Colonel(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 8;
    }
}
