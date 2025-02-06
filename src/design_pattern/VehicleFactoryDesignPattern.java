package src.design_pattern;

interface  Vehicle{
    void drive();
    default void driveRunning(){
        System.out.println("default interface");
    }
}


class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("I drive Car ");
    }
}

class Bus implements Vehicle{

    @Override
    public void drive() {
        System.out.println("I drive Bus");
    }
}

class VehicleFactory {
    public  static  Vehicle getVehicle(String type){

        if(type.equalsIgnoreCase("car")) {
            return  new Car();
        }
        else if(type.equalsIgnoreCase("bus")){
        return  new Bus();
        }
        else {
             return null;
        }

    }

}


public class VehicleFactoryDesignPattern {

    public static void main(String[] args){


        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        assert vehicle1 != null;
        vehicle1.drive();

    }
}
