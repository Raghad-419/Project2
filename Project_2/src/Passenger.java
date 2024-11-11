public abstract class Passenger {
    private String name ;
    private String ID ;
    private Car car ;

    public Passenger() {
    }

    public Passenger(String name, String ID, Car car) {
        this.name = name;
        this.ID = ID;
        this.car = car;
    }

    public abstract void reserve_car(Car car)throws Exception;

    public String display_information(){
        return "Passenger{ name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", trip_cost=" + car.getRoute().getTrip_price() +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
