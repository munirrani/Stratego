package Pieces;

import Board.Board;

public class Marshal extends Piece{
    public Marshal(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 10;

    }
    
}
