import controller.WatchHopController;
import view.Display;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Display display = new Display();

        WatchHopController watchHopController = new WatchHopController();

        Scanner sc = new Scanner(System.in);

        int userNum = -1;

        while (userNum != 0){
            display.displayManu();
            userNum = sc.nextInt();
            switch (userNum){
                case (1) :
                    watchHopController.displayAllWatches();
                    break;
                case (2) :
                    watchHopController.sortWatch(sc);
                    break;
                case (3) :
                    watchHopController.getTotalSum();
                    break;
                case (4) :
                    watchHopController.addWatch(sc);
            }
        }
    }
}