import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomId;
    private List<Player> players;
    private boolean gameStarted;

    public Room(int roomId) {
        this.roomId = roomId;
        this.players = new ArrayList<>();
        this.gameStarted = false; // game not started yet
    }

    public int getRoomId() {
        return roomId;
    }

    public List<Player> getPlayers() { //return list of players in the room
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }
}
