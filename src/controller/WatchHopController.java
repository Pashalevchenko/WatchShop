package controller;

import service.InputHandler;
import service.WatchService;
import view.Display;

public class WatchHopController {
    WatchService watchService;
    Display display;
    InputHandler inputHandler;

    public WatchHopController(){
        this.watchService = new WatchService();
        this.display = new Display();
        this.inputHandler = new InputHandler();
    }

    public void runApp (){
        int userNum;

        while (true){
            userNum = inputHandler.readInt("Press 1-4 to go ahead" + "\n" +
                    "1 - Print all watches | 2 - sort by... | 3 - sum of all prices | 4 - add new product | 0 - quit" + "\n" +
                    "Press: ");
            switch (userNum){
                case (1) :
                    watchService.displayAllWatches();
                    break;
                case (2) :
                    sortWatch();
                    break;
                case (3) :
                    display.displayMessage("Total sum is: " +  watchService.getSumOfPrice());
                    break;
                case (4) :
                    watchService.addWatch();
                    break;
                case (0):
                    return;
            }
        }
    }

    private void sortWatch(){
        int userSort;
        while (true){
            userSort = inputHandler.readInt("Press 1-3 to go ahead, 0 to return" + "\n" +
                    "1 - sort by price | 2 - sort by color | 3 - sort by Date | 0 - quit" + "\n" +
                    "Press: ");
            switch (userSort){
                case (1):
                    display.printWatches(watchService.sortByPrice());
                    break;
                case (2) :
                    display.printWatches(watchService.sortByColor());
                    break;
                case (3) :
                    display.printWatches(watchService.sortByDate());
                    break;
                case (0) :
                    return;
            }
        }
    }


}
