package Lesson21;

import java.util.ArrayList;

public class Marka {
    private String brand;
    private  ArrayList<Model> modelList;


    public Marka(String brand,
                 ArrayList<Model> modelList){
        this.brand = brand;
        this.modelList = modelList;
    }

    @Override
    public String toString() {
        return "Brand: '" + brand + "  "+
                "Models: " + modelList;
    }
}
