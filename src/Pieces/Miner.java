package Pieces;

import Board.Board;

public class Miner extends Piece {
    public Miner(Board board, String color, int[] coordinates, String icon){
        this.board = board;
        this.color = color;
        this.coordinates = coordinates;
        this.icon = icon;
        this.rank = 3;

    }
}
