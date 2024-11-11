public class Non_Subscribers extends Passenger{
    private boolean discount_coupon ;

    public Non_Subscribers() {
    }

    public Non_Subscribers(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public Non_Subscribers(String name, String ID, Car car, boolean discount_coupon) {
        super(name, ID, car);
        this.discount_coupon = discount_coupon;
    }



    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public void reserve_car(Car car)throws Exception {
        double trip_cost;
        if(car.getCapacity()<=0){
            throw new Exception("Capacity should be more than zero");}
        setCar(car);
        car.setCapacity(car.getCapacity()-1);
        if(isDiscount_coupon())
        {trip_cost=car.getRoute().getTrip_price()-(car.getRoute().getTrip_price()*0.1);
        System.out.println("Reserve has been completed successfully.");
        System.out.println("Original Price: " + car.getRoute().getTrip_price());
        System.out.println("Price after discount: " + trip_cost);
        System.out.println("New Capacity= "+car.getCapacity());
        }
        else {trip_cost=car.getRoute().getTrip_price();
        System.out.println("Reserve has been completed successfully.");
        System.out.println("New Capacity= "+car.getCapacity());
        }
    }

    @Override
    public String display_information() {
        return super.display_information()+ "\nCar Code: "+getCar().getCode()+"\nCar Capacity= "+getCar().getCapacity()+"\nCar Route: "+getCar().getRoute().toString();

    }
}
