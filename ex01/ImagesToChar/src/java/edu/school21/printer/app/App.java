package edu.school21.printer.app;

import edu.school21.printer.logic.BmpReader;

public class App {
    public static void main(String[] args){
        try {
            BmpReader bmpReader = new BmpReader("./resources/it.bmp");
            bmpReader.readBmpTo2DArray();
            bmpReader.drawBmp('O', '.');
        }
        catch (Exception e){
            System.err.println("Something went wrong\nCaught exception: " + e);
            System.exit(-1);
        }
    }
}
