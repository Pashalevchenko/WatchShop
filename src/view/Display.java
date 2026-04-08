package view;

import model.Watch;

import java.util.List;

public class Display {
    public void print(List<Watch> watches){
        for (Watch watch : watches){
            System.out.println("Model: " + watch.getModel());
            System.out.println("price: " + watch.getPrice());
            System.out.println("color: " + watch.getColor().getDescription());
            System.out.println("dateOfReceipt: " + watch.getDateOfReceipt());
            System.out.println("description: " + watch.getDescription());
            System.out.println("-----------------------------------------------------");
        }
    }
}
