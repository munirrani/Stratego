package Pieces;

import Board.Board;

public class Captain extends Piece{
    public Captain(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 6;

    }
}
