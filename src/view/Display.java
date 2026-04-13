package view;

import model.Watch;

import java.util.List;

public class Display {

    public void printWatches(List<Watch> watches){
        for (Watch watch : watches){
            System.out.println("Model: " + watch.getModel() + "\n" +
            "price: " + watch.getPrice() + "\n" +
            "color: " + watch.getColor().getDescription() + "\n" +
            "dateOfReceipt: " +
                    "Year - " + watch.getDateOfReceipt().getYear() +
                    ", Month - " + watch.getDateOfReceipt().getMonthValue() +
                    ", Day - " + watch.getDateOfReceipt().getDayOfMonth() + "\n" +
                    "description: " + watch.getDescription() + "\n" +
                    "-----------------------------------------------------");
        }
    }

    public void displayMessage(String message){
        System.out.println(message);
    }
}
