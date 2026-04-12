package view;

import model.Watch;

import java.util.List;

public class Display {
    public void print(List<Watch> watches){
        for (Watch watch : watches){
            System.out.println("Model: " + watch.getModel());
            System.out.println("price: " + watch.getPrice());
            System.out.println("color: " + watch.getColor().getDescription());
            System.out.println("dateOfReceipt: " +
                    "Year - " + watch.getDateOfReceipt().getYear() +
                    ", Month - " + watch.getDateOfReceipt().getMonthValue() +
                    ", Day - " + watch.getDateOfReceipt().getDayOfMonth());
            System.out.println("description: " + watch.getDescription());
            System.out.println("-----------------------------------------------------");
        }
    }

    public void displayManu (){
        System.out.println("Press 1-4 to go ahead, 0 to quit");
        System.out.println("1 - Print all watches | 2 - sort by... | 3 - sum of all prices | 4 - add new product");
        System.out.print("Press: ");
    }

    public void displaySortManu(){
        System.out.println("Press 1-3 to go ahead, 0 to return");
        System.out.println("1 - sort by price | 2 - sort by color | 3 - sort by Date");
        System.out.print("Press: ");
    }

    public void displayTotalSum(double totalSum){
        System.out.println("Total sum is: " + totalSum);
    }


}
