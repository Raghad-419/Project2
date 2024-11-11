import java.sql.Array;
import java.sql.RowId;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
        ArrayList<Passenger> passengers = new ArrayList<>();

        Route route1 =new Route("home","school",30.0);
        Route route2 =new Route("home","Mall",50.0);

        Car car1 =new Car("11",3,route1);
        Car car2 =new Car("22",2,route2);
        Car car3=new Car("33",0,route1);

        Subscribers subscriber =new Subscribers("Rami","111",car1);
        Non_Subscribers nonSubscribers =new Non_Subscribers("Razan","222",car2,true);
        Subscribers subscriber2 =new Subscribers("Fahad","333",car3);
        passengers.add(subscriber);
        passengers.add(nonSubscribers);
        passengers.add(subscriber2);

        for (Passenger p :passengers){
            System.out.println(p.display_information());
        }

        subscriber.reserve_car(car1);
        nonSubscribers.reserve_car(car2);
        subscriber2.reserve_car(car3);


}catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}