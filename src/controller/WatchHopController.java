package controller;

import service.WatchService;
import view.Display;
import java.util.Scanner;

public class WatchHopController {
    WatchService watchService;
    Display display;

    public WatchHopController(){
        this.watchService = new WatchService();
        this.display = new Display();
    }

    public void sortWatch(Scanner sc){
        int userSort = -1;
        while (userSort != 0){
            display.displaySortManu();
            userSort = sc.nextInt();
            switch (userSort){
                case (1):
                    display.print(watchService.sortByPrice());
                    break;
                case (2) :
                    display.print(watchService.sortByColor());
                    break;
                case (3) :
                    display.print(watchService.sortByDate());
                    break;
            }
        }
    }
    public void displayAllWatches(){
        watchService.displayAllWatches();
    }
    public void getTotalSum(){
        watchService.getSumOfPrice();
    }
    public void addWatch(Scanner sc){
        watchService.addWatch(sc);
    }

}
