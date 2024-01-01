package elevator;

public class ElevatorButton extends Button{


    ElevatorButton(Floor certainFloor){
        super.certainFloor = certainFloor;

    }

    public void press(){
        if (Elevator.currentFloor == certainFloor.parseInt()){
            System.out.println();
            System.out.println("Elevator is already at this floor.");
            return;
        }
        Elevator.door.close();

        long timeForProcessInMilliSeconds = (long)Math.abs(Elevator.currentFloor - super.certainFloor.parseInt())*1000;
        int timeForProcessInSecond = (int) (timeForProcessInMilliSeconds/1000);

        if (certainFloor.parseInt() == 4){
            if (!(Elevator.currentFloor ==3 || Elevator.currentFloor == 5)){
                System.out.println("Unfortunately, the elevator cannot go directly to the 4th floor. In order to go to the 4th floor, you are directed to the nearest floor.\n");
            }
            Elevator e = new Elevator();
            if (Elevator.currentFloor < 3){
                e.elevatorButtons[3].press();
                return;
            }else if (Elevator.currentFloor > 5){
                e.elevatorButtons[5].press();
                return;
            }
        }
        System.out.println("The elevator has been started to move that floor: " + super.certainFloor.parseInt() + ". The time for the process is: " + timeForProcessInSecond +" second(s).\n");

     /*   switch (super.certainFloor.parseInt()) {
            case 1 -> System.out.println("elevator.Elevator is moving to " + certainFloor.parseInt() + "'st floor.\n");
            case 2 -> System.out.println("elevator.Elevator is moving to " + certainFloor.parseInt() + "'nd floor.\n");
            case 3 -> System.out.println("elevator.Elevator is moving to " + certainFloor.parseInt() + "'rd floor.\n");
            default -> System.out.println("elevator.Elevator is moving to " + certainFloor.parseInt() + "'th floor.\n");
        }*/

        try {
            //Time for move to certain floor
            Thread.sleep(timeForProcessInMilliSeconds);
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
        Elevator.currentFloor = certainFloor.parseInt();
        System.out.println("Now elevator has been arrived to that floor: " + Elevator.currentFloor + ".\n");

        Elevator.door.open();


        try {
            //Time for people to get off the elevator
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }


        Elevator.door.close();


    }
}
