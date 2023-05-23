package Pieces;

import Board.Board;

public class Scout extends Piece{
    public Scout(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 2;

    }
}
