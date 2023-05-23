package Pieces;

import Board.Board;

public class Sergeant extends Piece{
    public Sergeant(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 4;
    }
}