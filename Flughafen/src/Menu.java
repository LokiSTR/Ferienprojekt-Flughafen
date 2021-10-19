//import des Scanners, dadurch kann man den Datentyp Scanner nutzen, liegt daran, dass er kein elementarer Datentyp ist
import java.util.Scanner;

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

        //Für die Übersicht
        System.out.println(" ");

        System.out.println("(A) Erstelle eine neue Airline");
        System.out.println("(B) Erstelle eine neue Bahn");
        System.out.println("(C) Erstelle eine neue Fluglinie");
        System.out.println("(D) Erstelle ein neues Flugzeug");
        System.out.println("(E) Erstelle einen neuen Passagier");
        System.out.println("(F) Erstelle einen neuen Piloten");
        System.out.println("(G) Erstelle ein neues Terminal");
        System.out.println("(I) Erstelle einene neuen Flug");

        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
        //Eingabeaufforderung zum Anzeigen der jeweiligen Komponenten
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
        else if(choice.equals("8")){
            showFlughafen();
        }

        //Eingabeaufforderung zum Erstellen der jeweiligen Komponenten
        else if(choice.equals("a")){
            createAirlineMenu();
        }
        else if(choice.equals("b")){
            createBahnMenu();
        }
        else if(choice.equals("c")){
            createFluglinieMenu();
        }
        else if(choice.equals("d")){
            createFlugzeugMenu();
        }
        else if(choice.equals("e")){
            createPassagierMenu();
        }
        else if(choice.equals("f")){
            createPilotMenu();
        }
        else if(choice.equals("g")){
            createTerminalMenu();
        }
        else if(choice.equals("h")){
            createFlughafen();
        }

        else if(choice.equals("i")){
            createFlug();
        }

        startMenu();
    }

    public void showAirline(){
        //foreach schleife
        for(Airline airline : App.getALLAirline()){
/*            for(Flugzeug flugzeug : App.getALLFlugzeug()){
                if(flugzeug !=null){
                    System.out.println(flugzeug.getNummer());
                }
            }*/
//Würde man noch alle Flugzeuge in Airline anzeigen lassen wollen müsste man eine weiter For-Schleife hier einbauen, genau so sieht es auch mit allen anderen Sachen aus

            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(airline != null){
                System.out.println(airline.getName());
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
                System.out.println(fluglinie.getFlugliniename());
            }
        }
    }
    public void showFlugzeug(){
        //foreach schleife
        for(Flugzeug flugzeug : App.getALLFlugzeug()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(flugzeug != null){
                System.out.println(flugzeug.getNummer() + " " + flugzeug.getHersteller());
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
                System.out.println(terminal.getName());
            }
        }
    }
    public void showFlughafen(){
        //foreach schleife
        for(Flughafen flughafen : App.getALLFlughafen()){
            //wenn diese airline nicht null ist geben wird der hersteller ausgegeben
            if(flughafen!= null){
                System.out.println(flughafen.getName());
            }
        }
    }

    //Eingabeaufforderung zum Erstellen der jeweiligen Komponenten
    public void createAirlineMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen der Airline ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceAirlineName = getScanner().nextLine();
        //Eintragen der neuen Airline in das Array in App
        App.addAirline(new Airline(choiceAirlineName));
        //Bestätigung der Handlung        
        System.out.println("Es wurde eine neue Airline eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat. Da dies in der eigenen Klasse ist kann man einfach so darauf zugreifen, ansonsten wäre es zum beispiel App.showAirline()
        //wären Parameter vorhanden müsste man diese auch in der Klammer übergeben
        showAirline();
        //Zur Übersicht
        System.out.println(" ");
    }

    public void createBahnMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen der Bahn ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceBahnName = getScanner().nextLine();
        //Eintragen der neuen Bahn in das Array in App
        App.addBahn(new Bahn(choiceBahnName));
        //Bestätigung der Handlung        
        System.out.println("Es wurde eine neue Bahn eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showBahn();
        //Zur Übersicht
        System.out.println(" ");
    }

    public void createFluglinieMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen der Fluglinie ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceFluglinieName = getScanner().nextLine();
        System.out.print("Bitte suchen Sie sich eine Airline aus:");
        //Airline aussuchen mit For-Schleife
        int i = 0;
        //damit 0 Lufthansa nicht direkt hinter dem : klebt
        System.out.println(" ");
        for (Airline airline : App.getALLAirline()) {
            
            if (airline != null) {
                System.out.println(i + "  " + airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().nextLine();
        int airline_index = Integer.valueOf(airline_choice);
        //Eintragen der neuen Fluglinie in das Array in App
        App.addFluglinie(new Fluglinie(choiceFluglinieName, App.getALLAirline()[airline_index]));
        //Bestätigung der Handlung        
        System.out.println("Es wurde eine neue Fluglinie eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showFluglinie();
        //Zur Übersicht
        System.out.println(" ");
       
    }

    public void createFlugzeugMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen des Flugzeugherstellers ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceHersteller = getScanner().nextLine();
        
        System.out.println("Geben Sie die Nummer des Flugzeuges ein: ");
        String choiceNummer = getScanner().nextLine();

        //Airline aussuchen mit For-Schleife
        int i = 0;
        //damit 0 Lufthansa nicht direkt hinter dem : klebt
        System.out.println(" ");
        for (Airline airline : App.getALLAirline()) {
            
            if (airline != null) {
                System.out.println(i + "  " + airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().nextLine();
        int airline_index = Integer.valueOf(airline_choice);

        //Eintragen des neuen Flugzeuges in das Array in App
        App.addFlugzeug(new Flugzeug(choiceHersteller, choiceNummer, App.getALLAirline()[airline_index]));
        //Bestätigung der Handlung        
        System.out.println("Es wurde eine neues Flugzeug eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showFlugzeug();
        //Zur Übersicht
        System.out.println(" ");
    }

    public void createPassagierMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Vornamen des Passagiers ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceVorname = getScanner().nextLine();
        System.out.print("Geben Sie den Nachnamen des Passagiers ein:");
        String choiceNachname = getScanner().nextLine();
        //Eintragen des neuen Passagiers in das Array in App
        App.addPassagier(new Passagier(choiceVorname, choiceNachname));
        //Bestätigung der Handlung        
        System.out.println("Es wurde ein neuer Passagier eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showPassagier();
        //Zur Übersicht
        System.out.println(" ");
    }

    boolean anzahlPiloten = true;
    public void createPilotMenu(){
        
        
        if (Pilot._maxPiloten > 10
        ){
            anzahlPiloten = false;
           // System.out.println("Die maximale Anzahl an Piloten ist erreicht");
        }
        if (Pilot._maxPiloten < 10){
            //nur print, da danach eine Handlung volzogen werden muss
            System.out.print("Geben Sie den Vornamen des Piloten ein:");            
            //hier wird der Name, bzw. der Wert von Hand eingetragen
            String choiceVorname = getScanner().nextLine();
            System.out.print("Geben Sie den Nachnamen des Piloten ein:");
            String choiceNachname = getScanner().nextLine();
            //Eintragen des neuen Passagiers in das Array in App
            App.addPilot(new Pilot(choiceVorname, choiceNachname));
            //Bestätigung der Handlung        
            System.out.println("Es wurde ein neuer Pilot eingetragen");
            //So kann überprüft werden, ob es auch wirklich funktioniert hat
            showPilot();
            //Zur Übersicht
            System.out.println(" ");
            
            Pilot._maxPiloten +=1;
        }
        System.out.println("Aktuelle Anzahl an Piloten:" + Pilot._maxPiloten + "  Maximal mögliche Piloten: 10");
        //Zur Übersicht
        System.out.println(" ");
        System.out.println(" ");
    }

    public void createTerminalMenu(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen des Terminals ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceTerminalname = getScanner().nextLine();
        //Eintragen des neuen Passagiers in das Array in App
        App.addTerminal(new Terminal(choiceTerminalname));
        //Bestätigung der Handlung        
        System.out.println("Es wurde ein neues Terminal eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showTerminal();
        //Zur Übersicht
        System.out.println(" ");
    }   

    public void createFlughafen(){
        //nur print, da danach eine Handlung volzogen werden muss
        System.out.print("Geben Sie den Namen des Flughafens ein:");
        //hier wird der Name, bzw. der Wert von Hand eingetragen
        String choiceFlughafenname = getScanner().nextLine();
        //Eintragen des neuen Passagiers in das Array in App
        System.out.println("Geben Sie den Standort des Flughafens ein:");
        String choiceStandort = getScanner().nextLine();
        App.addFlughafen(new Flughafen(choiceFlughafenname, choiceStandort));
        //Bestätigung der Handlung        
        System.out.println("Es wurde ein neuer Flughafen eingetragen");
        //So kann überprüft werden, ob es auch wirklich funktioniert hat
        showFlughafen();
        //Zur Übersicht
        System.out.println(" ");
    }   





    public void createFlug(){       
        //Index für Auswahl des richtigen Flugzeugs
        int i = 0;
        System.out.println("Bitte wähle ein Flugzeug aus: ");
        // Zuerst null, dann um einen erhöht
        for(Flugzeug flugzeug : App.getALLFlugzeug()){
            if(flugzeug != null){
                System.out.println(i + " - " + flugzeug.getHersteller() + " " + flugzeug.getNummer());
                i++;
            }
        }
        // Eingabe des Strings
        String flugzeug_choice = getScanner().next();
        //String in Integer umwandeln
        int flugzeug_index = Integer.valueOf(flugzeug_choice);
        //Ausgabe des Arrays mit den Flugzeugen, eckige Klammern wählen das richtige Element des Arrays
        System.out.println(App.getALLFlugzeug() [flugzeug_index]);
       
        i = 0;
        //Auswahl der Fluglinie
        System.out.println("Bitte wähle eine Fluglinie aus: ");
        for(Fluglinie fluglinie : App.getALLFluglinie()){
            if(fluglinie != null){
                System.out.println(i + " - " + fluglinie.getFlugliniename());
                i++;
            }
        }
        String fluglinie_choice = getScanner().next();
        int fluglinie_index = Integer.valueOf(fluglinie_choice);
        System.out.println(App.getALLFluglinie()[fluglinie_index]);
        
        i=0;
        //Auswahl der Bahn
        System.out.println("Bitte wähle eine Bahn aus: ");
        for(Bahn bahn : App.getALLBahn()){
            if(bahn != null){
                System.out.println(i + " - " + bahn.getName());
                i++;
            }
        }
        String bahn_choice = getScanner().next();
        int bahn_index = Integer.valueOf(bahn_choice);
        System.out.println(App.getALLBahn()[bahn_index]);

        System.out.println("Bitte geben Sie eine Startzeit ein: ");
        String _startzeit = getScanner().nextLine();
        


        //Hinzufügen in Array
        App.addFlug(new Flug(App.getALLFlugzeug()[flugzeug_index], App.getALLFluglinie()[fluglinie_index], App.getALLBahn()[bahn_index], _startzeit));

    }
}