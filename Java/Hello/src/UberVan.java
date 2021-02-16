import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car
{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String model;

    public UberVan(String license, Account driver)
    {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passengers) 
    {
        if(passengers == 6)
        {
            this.passengers = passengers;
        }
        else
        {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
