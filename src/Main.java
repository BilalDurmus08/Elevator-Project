import elevator.*;

public class Main {
    public static void main(String[] args) {
        Elevator e = new Elevator();


        //The elevator was called by a person on the 2nd floor.
        e.floorButtons[7].press();

        //This person wants to go 0'th floor
        e.elevatorButtons[1].press();

        //He wanted to go 4'th floor. But there is no 4 number. He should push the * button.
        e.elevatorButtons[4].press();

        //Yet, due to popular belief in China, the person should press the * floor button again.
        e.elevatorButtons[4].press();

        }

    }
