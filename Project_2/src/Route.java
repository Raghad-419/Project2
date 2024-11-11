public class Route {
    private String start ;
    private String destination ;
    private double trip_price;

    public Route() {
    }

    public Route(String start, String destination, double trip_price) {
        this.start = start;
        this.destination = destination;
        this.trip_price = trip_price;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

    @Override
    public String toString() {
        return "Route{" +
                "start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", trip_price=" + trip_price +
                '}';
    }
}
