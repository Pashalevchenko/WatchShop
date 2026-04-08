import model.Watch;
import service.WatchService;
import view.Display;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WatchService watchService = new WatchService();
        Display display = new Display();


        List<Watch> watches = watchService.getWatches();

        display.print(watches);


    }
}