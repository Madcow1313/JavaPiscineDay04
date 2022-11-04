package edu.school21.printer.app;

import edu.school21.printer.logic.BmpReader;

public class App {
    public static void main(String[] args){
        if (args.length != 2){
            System.err.println("Need 3 arguments");
            System.exit(-1);
        }
        try {
            BmpReader bmpReader = new BmpReader("./resources/it.bmp");
            bmpReader.readBmpTo2DArray();
            bmpReader.drawBmp(args[1].charAt(0), args[0].charAt(0));
        }
        catch (Exception e){
            System.err.println("Something went wrong\nCaught exception: " + e);
            System.exit(-1);
        }
    }
}
