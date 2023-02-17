public class Remote {
    private DogDoor door;

    public Remote(DogDoor dogDoor) {
        this.door = dogDoor;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.close();
        }
    }
}