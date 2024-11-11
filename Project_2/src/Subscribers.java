public class Subscribers extends Passenger{
    public Subscribers() {
    }

    public Subscribers(String name, String ID, Car car) {
        super(name, ID, car);
    }


    @Override
    public void reserve_car(Car car)throws Exception {
        double trip_cost;
        if(car.getCapacity()<=0){
            throw new Exception("Unable to reserve the car. The capacity must be greater than zero.");}
         trip_cost =car.getRoute().getTrip_price()-(car.getRoute().getTrip_price()*(0.5));
        setCar(car);
        car.setCapacity(car.getCapacity()-1);
        System.out.println("Reserve has been completed successfully.");
        System.out.println("Original Price: " + car.getRoute().getTrip_price());
        System.out.println("Price after discount: " + trip_cost);
        System.out.println("New Capacity= "+car.getCapacity());

    }

    public String  display_information(){
     return super.display_information()+ "\nCar Code: "+getCar().getCode()+"\nCar Capacity= "+getCar().getCapacity()+"\nCar Route: "+getCar().getRoute().toString();

    }
}
