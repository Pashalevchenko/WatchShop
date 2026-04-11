package service;

import model.Colors;
import model.Watch;
import view.Display;

import java.util.*;

public class WatchService {

     private final List<Watch> watches = new ArrayList<>();
     private final Display display = new Display();

    public WatchService() {
        watches.add( new Watch("Batman", 230.5, Colors.BLACK, new Date(), "Be real Dark knight"));
        watches.add( new Watch("Xiaomi", 200, Colors.WHITE, new Date(), "Top for this price"));
        watches.add( new Watch("s-class", 10000.4, Colors.BLUE, new Date(), "Do not need description for this watch"));
        watches.add(new Watch("BadB", 300.4, Colors.AQUA, new Date(), "For real bad boys"));
        watches.add( new Watch("g-shock", 310.4, Colors.RED, new Date(), "Best solution for active vacation"));
        watches.add(new Watch("rolex", 999999, Colors.BLACK, new Date(), "For top"));
    }


    public void addWatch(Scanner sc){
        sc.nextLine();
        System.out.println("select model: ");
        String model = sc.nextLine();

        System.out.println("select price separated by , : ");
        double price = sc.nextDouble();

        System.out.println("select Color (Black, White, Red, Blue, Aqua): ");
        String color = sc.next();

        sc.nextLine();
        System.out.println("select description: ");
        String description = sc.nextLine();

        watches.add(new Watch(
                model,
                price,
                Colors.valueOf(color.trim().toUpperCase()),
                new Date(),
                description
        ));
    }

    public void getSumOfPrice(){
        double sum = 0;
        for (Watch watch : watches){
            sum += watch.getPrice();
        }
        display.displayTotalSum(sum);
    }

    public List<Watch> sortByPrice(){
        return watches.stream().sorted(Comparator.comparing(Watch::getPrice)).toList();
    }

    public List<Watch> sortByColor(){
        return watches.stream().sorted(Comparator.comparing(watch ->
                watch.getColor().getDescription())).toList();
    }

    public List<Watch> sortByDate(){
        return watches.stream().sorted(Comparator.comparing(Watch::getDateOfReceipt)).toList();
    }

    public void displayAllWatches(){
        display.print(watches);
    }

}

