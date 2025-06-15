package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class PersistentShapeManager {

    private static final Logger logger = Logger.getLogger(PersistentShapeManager.class.getName());

    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {

       try( BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
        for (Shape shape : shapes) {
            writer.write(shape.toString());
            writer.newLine();
            }
        }catch (IOException e){
           e.printStackTrace();
       }
    }

    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            int lineNumber = 0;
        while ((line = reader.readLine()) != null) {
            lineNumber++;
            try{
            shapes.add(ShapeFactory.fromString(line));}
            catch (IllegalArgumentException e){
                logger.warning(e.getMessage() + " at line " + lineNumber);
            }
            }
        }catch (IOException e){
            logger.severe("File not found: " + e.getMessage());

        }
        return shapes;
    }

    static void clearFile(String filename) {
       try( BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))){
        //Opening file without append will empty it
       } catch (IOException e){
           logger.severe("File not found: " + e.getMessage());

       }
    }
}
