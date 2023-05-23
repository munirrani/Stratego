import java.util.HashMap;
import java.util.Map;

public class RoomManager { //to manage rooms
    private static RoomManager instance;
    private Map<Integer, Room> rooms;

    private RoomManager() {
        rooms = new HashMap<Integer, Room>(); // to store the created rooms
    }

    public static synchronized RoomManager getInstance() { //ensure that there is only one instance of the RoomManager class
        if (instance == null) {
            instance = new RoomManager(); //creates a new instance of the RoomManager
        }
        return instance; //if roomManager already exist, return the instance
    }

    public Room createRoom(int roomId) {
        if (rooms.containsKey(roomId)) { //if a room with the same ID already exists, throws an exception
            throw new IllegalArgumentException("Room already exists with ID: " + roomId);
        }

        Room room = new Room(roomId);
        rooms.put(roomId, room);
        return room;
    }

    public Room getRoom(int roomId) { //retrieve room by using room ID
        return rooms.get(roomId);
    }

    public void removeRoom(int roomId) { //removes room
        rooms.remove(roomId);
    }
}
