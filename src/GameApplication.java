import java.util.List;
import java.util.Random;

public class GameApplication {
    public static void main(String[] args) {
        // Create the RoomManager instance
        RoomManager roomManager = RoomManager.getInstance();

        // Create players
        Player player1 = new Player("player1", "Alice");
        Player player2 = new Player("player2", "Bob");

        // Create a new room
        Random rand= new Random();
        int roomID = rand.nextInt(1000);
        Room room = roomManager.createRoom(roomID);
        System.out.println("Room created with ID: " + room.getRoomId());

        // Add players to the room
        room.addPlayer(player1);
        room.addPlayer(player2);

        // Get the players in the room
        List<Player> playersInRoom = room.getPlayers();
        System.out.println("Players in the room: ");
        for (Player player : playersInRoom) {
            System.out.println("Player ID: " + player.getPlayerId() + ", Player Name: " + player.getPlayerName());
        }

        // Remove a player from the room
        room.removePlayer(player1);
        System.out.println("Player removed from the room");

        // Check if the game has started in the room
        if (room.isGameStarted()) {
            System.out.println("The game has started in the room");
        } else {
            System.out.println("The game has not started in the room");
        }

        // Set the game as started in the room
        room.setGameStarted(true);
        System.out.println("Game started in the room");

        // Remove the room
        roomManager.removeRoom(room.getRoomId());
        System.out.println("Room removed with ID: " + room.getRoomId());
    }
}
