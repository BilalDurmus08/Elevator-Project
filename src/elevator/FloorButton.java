package elevator;

public class FloorButton extends Button {

    FloorButton(Floor certainFloor){
        super.certainFloor = certainFloor;
    }

        public void press(){
            if (Elevator.currentFloor != certainFloor.parseInt()){

                long timeForProcessInMilliSeconds = (long)Math.abs(Elevator.currentFloor - super.certainFloor.parseInt())*1000;
                int timeForProcessInSecond = (int) (timeForProcessInMilliSeconds/1000);


               /* switch (super.certainFloor.parseInt()){
                    case 1:
                        System.out.println("elevator.Elevator coming to " + certainFloor.parseInt() + "'st floor. The time for the process is: " + timeForProcessInSecond  + " second(s).\n" );
                    break;
                        case 2:
                            System.out.println("elevator.Elevator coming to " + certainFloor.parseInt() + "'nd floor. The time for the process is: " + timeForProcessInSecond  + " second(s).\n" );

                            break;

                    case 3:
                        System.out.println("elevator.Elevator coming to " + certainFloor.parseInt() + "'rd floor. The time for the process is: " + timeForProcessInSecond  + " second(s).\n" );

                        break;

                    default:
                        System.out.println("elevator.Elevator coming to " + certainFloor.parseInt() + "'th floor. The time for the process is: " + timeForProcessInSecond  + " second(s).\n" );

                        break;
                }*/
                System.out.println("The elevator called from that floor: " + super.certainFloor.parseInt() + ". The time for the process is: " + timeForProcessInSecond +" second(s).\n");
                try {
                    //Time for the elevator goes to called floor
                    Thread.sleep(timeForProcessInMilliSeconds);
                } catch (InterruptedException e) {
                    System.out.println("Error!");
                }
                Elevator.currentFloor = certainFloor.parseInt();

                Elevator.door.open();
                try {
                    //Time for people to get in the elevator
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Error!");
                }
                return;
            }

            System.out.println("Elevator is already at this floor. ("+ Elevator.currentFloor + ")\n");
            try {
                //Time for people to get in the elevator
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            Elevator.door.open();



        }
}
