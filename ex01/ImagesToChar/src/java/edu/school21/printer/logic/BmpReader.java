package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BmpReader {
    private String path;
    private short[][] array;
    private BufferedImage image;

    public BmpReader(String path){
        this.path = path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public void readBmpTo2DArray() throws IOException {
        image = ImageIO.read(new File(path));
        array = new short[image.getHeight()][image.getWidth()];
        for (int i = 0; i < image.getHeight(); i++){
            for (int j = 0; j <  image.getWidth(); j++){
                if (image.getRGB(j, i) == Color.BLACK.getRGB()){
                    array[i][j] = 0;
                }
                else if (image.getRGB(j, i) == Color.WHITE.getRGB()){
                    array[i][j] = 1;
                }
                else
                    array[i][j] = 2;
            }
        }
    }

    public void drawBmp(){
        drawBmp('O', '.');
    }

    public void drawBmp(char black, char white){
        int height = image.getHeight();
        int width = image.getWidth();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (array[i][j] == 0){
                    System.out.print(black);
                }
                else if (array[i][j] == 1){
                    System.out.print(white);
                }
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
