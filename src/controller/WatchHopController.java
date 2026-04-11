package controller;

import service.WatchService;
import view.Display;

import java.util.Scanner;

public class WatchHopController {
    WatchService watchService;
    Display display;

    public WatchHopController(Display display){
        this.watchService = new WatchService();
        this.display = display;
    }

    public void sortWatch(int userSort, Scanner sc){
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
