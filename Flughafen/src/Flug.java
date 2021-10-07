//import, dadurch können wir den Datentyp Scanner nutzen --> kein elementarer Datentyp
import java.util.Scanner;

//Eigene Klassse, Prämisse 1) static loswerden, 2) Ändern leichter
public class Flug {
    
    static Flugzeug[] _flugzeug;
    static Fluglinie[] _fluglinie;
    static Pilot[] _piloten;
    static Passagier[] _passagiere;
    static Bahn[] _bahn; 
    String _startzeit;

    public Scanner _scanner;

    //was für methoden im Menü sein sollen
    public Flug(){
        set_Scanner(new Scanner(System.in));

        
    }
    
    //setter und getter für den scanner
    public void set_Scanner(Scanner _Scanner) {
        this._scanner = _Scanner;
    }
    public Scanner get_Scanner() {
        return _scanner;
    }

    //Ermöglicht das Array
    public static Flugzeug[] getAllFlugzeuge(){
        return _flugzeug;
    }
    public static Fluglinie[] getAllFluglinien(){
        return _fluglinie;
    }
    public static Pilot[] getAllPiloten(){
        return _piloten;
    }
    public static Passagier[] getAllPassagiere(){
        return _passagiere;
    }
    public static Bahn[] getAllBahnen(){
        return _bahn;
    }
    
    //Setter
    public void setStartzeit(String startzeit){
        this._startzeit = startzeit;
    }
    //Getter
    public String getStartzeit() {
        return _startzeit;
    }
    
}
