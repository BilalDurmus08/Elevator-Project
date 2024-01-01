import elevator.*;

public class Main {
    public static void main(String[] args) {
        Elevator e = new Elevator();


        //The elevator was called by a person on the 2nd floor.
        e.floorButtons[2].press();

        //This person wants to go 0'th floor
        e.elevatorButtons[0].press();

        //Another person from 0'th floor wants to go 6'th floor
        e.floorButtons[0].press();

        //Pushes the 6'th elevator floor button to go 6'th floor.
        e.elevatorButtons[6].press();

        //Another person from 9'th floor wants to elevator to go 4'th floor
        e.floorButtons[9].press();

        //He wanted to go 4'th floor. But there is no 4 number. He should push the * button.
        e.elevatorButtons[4].press();

        //Yet, due to popular belief in China, the person should press the * floor button again.
        e.elevatorButtons[4].press();

        //At this time, another person calls the elevator to 3'rd floor.
        e.floorButtons[3].press();

        //And he/she wants to go 4'th floor.
        e.elevatorButtons[4].press();

        }

    }
