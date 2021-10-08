//import des Scanners, dadurch kann man den Datentyp Scanner nutzen, liegt daran, dass er kein elementarer Datentyp ist
import java.util.Scanner;   
   
   
public class Flug {
    //Deklaration des Scanners an sich
    public Scanner _scanner;

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

    //Flug-/Menumethode
    public void startFlug(){
        
    } 
}