package elevator;

public class Elevator {

    static int currentFloor = 0;
    static Door door = new Door();

    public ElevatorButton[] elevatorButtons = new ElevatorButton[Floor.values().length];
    public FloorButton[] floorButtons = new FloorButton[Floor.values().length];

    public Elevator(){

        for (int i = 0; i < Floor.values().length; i++){
            floorButtons[i] =  new FloorButton(Floor.values()[i]);
            elevatorButtons[i] =  new ElevatorButton(Floor.values()[i]);
        }

    }

}
