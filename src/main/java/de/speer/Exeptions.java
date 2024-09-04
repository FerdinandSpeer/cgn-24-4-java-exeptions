package de.speer;

public class Exeptions {

    public static void main(String[] args) {
        /**Exceptions: Exception bricht Programm ab, damit nicht mit fehlerhaften Werten weitergearbeitet werden
         * 2 Arten von Exceptions: Checked und Unchecked(RuntimeExceptions)
         *
         */
        System.out.println("Kunde: Durst!");
        String beverage = null;
        beverage = orderFromWaiter();
        System.out.println("Kunde: Genießt "+beverage);
    }

    public static String orderFromWaiter() {
        System.out.println("Kellner: Bestellung aufgenommen!");
        String beverage = null;
        try{ //versuchen den Standard
            beverage = getBeverageFromFridge();
        }catch (WarmBeerException ex){ //fangen die Exception die geworfen wird -> starten Plan B
            System.out.println("Kellner rennt zum Kiosk und kauft ein Bier");
            beverage = "Bier vom Kiosk";
        }
        System.out.println("Kellner " + beverage + " geholt.");
        return "ein eiskaltes " + beverage;
    }
    public static String getBeverageFromFridge() throws WarmBeerException { //entweder Exception wie hier oder in nächster Zeile RuntimeException();
        throw new WarmBeerException("The fridge is broken, sh*t!"); //Exception wird immer über "throw" geworfen/initialisiert
    }
}