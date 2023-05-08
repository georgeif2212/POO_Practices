import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted; //1.- String = marca. 2.- Arraylist(Modelo,Año)
    ArrayList<String> seatsMaterial;

    public UberBlack(String license,Driver driver,
    Map<String, Map<String,Integer>>typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }
}