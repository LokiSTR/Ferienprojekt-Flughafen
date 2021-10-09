//import des Scanners, dadurch kann man den Datentyp Scanner nutzen, liegt daran, dass er kein elementarer Datentyp ist
import java.util.Scanner;
import java.util.Arrays;

public class Menu {
 
    //Deklaration des Scanners an sich
    public Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));   
    }

    //setter und getter für den scanner
    public void setScanner(Scanner _Scanner) {
        this._scanner = _Scanner;
    }
    public Scanner getScanner() {
        return _scanner;
    }

    //Flug-/Menumethode
    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Zeige alle Airlines");
        System.out.println("(2) Zeige alle Bahnen");
        System.out.println("(3) Zeige alle Fluglinien");
        System.out.println("(4) Zeige alle Flugzeuge");
        System.out.println("(5) Zeige alle Passagiere");
        System.out.println("(6) Zeige alle Piloten");
        System.out.println("(7) Zeige alle Terminals");
        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
        //auswahl zum anzeigen der jeweiligen Komponenten
        if(choice.equals("1")){
            showAirline();
        }
        else if(choice.equals("2")){
            showBahn();
        }
        else if(choice.equals("3")){
            showFluglinie();
        }
        else if(choice.equals("4")){
            showFlugzeug();
        }
        else if(choice.equals("5")){
            showPassagier();
        }
        else if(choice.equals("6")){
            showPilot();
        }
        else if(choice.equals("7")){
            showTerminal();
        }

        //TODO eingabe zum erstellen jedes einzelnen muss noch gemacht werden

        startMenu();
    }

    public void showAirline(){
        //foreach schleife
        for(Airline airline : App.getALLAirline()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(airline != null){
                System.out.println(airline.getName() + " " + airline.getFlugzeug());
                System.out.println(Arrays.toString(airline.getFlugzeug()));

            }
        }
    }
    public void showBahn(){
        //foreach schleife
        for(Bahn bahn : App.getALLBahn()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(bahn!= null){
                System.out.println(bahn.getName());
            }
        }
    }
    public void showFluglinie(){
        //foreach schleife
        for(Fluglinie fluglinie : App.getALLFluglinie()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(fluglinie != null){
                System.out.println(fluglinie.getFlugliniename() + " " + fluglinie.getName());
            }
        }
    }
    public void showFlugzeug(){
        //foreach schleife
        for(Flugzeug flugzeug : App.getALLFlugzeug()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(flugzeug != null){
                System.out.println(flugzeug.getNummer() + " " + flugzeug.getHersteller()+ " " + flugzeug.getName());
            }
        }
    }
    public void showPassagier(){
        //foreach schleife
        for(Passagier passagier : App.getALLPassagier()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(passagier != null){
                System.out.println(passagier.getVorname() + " " + passagier.getNachname());
            }
        }
    }
    public void showPilot(){
        //foreach schleife
        for(Pilot pilot : App.getALLPilot()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(pilot != null){
                System.out.println(pilot.getVorname() + " " + pilot.getNachname());
            }
        }
    }
    public void showTerminal(){
        //foreach schleife
        for(Terminal terminal : App.getALLTerminal()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(terminal != null){
                System.out.println(terminal.getName() + " " + terminal.getAirline());
            }
        }
    }

}