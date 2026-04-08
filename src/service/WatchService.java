package service;

import model.Colors;
import model.Watch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class WatchService {

     private final List<Watch> watches = new ArrayList<>();

    public WatchService() {
        watches.add(new Watch("BadB", 300.4, Colors.BLACK, new Date(), "For real bad boys"));
        watches.add( new Watch("Batman", 230.5, Colors.BLACK, new Date(), "Be real Dark knight"));
        watches.add( new Watch("Xiaomi", 200, Colors.WHITE, new Date(), "Top for this price"));
        watches.add( new Watch("s-class", 10000.4, Colors.BLUE, new Date(), "Do not need description for this watch"));
        watches.add( new Watch("g-shock", 310.4, Colors.RED, new Date(), "Best solution for active vacation"));
        watches.add(new Watch("rolex", 999999, Colors.BLACK, new Date(), "For top"));
    }


    public void addWatch(Watch watch){
        watches.add(watch);
    }

    public  List<Watch> getWatches() {
        return watches;
    }

    public double getSumOfPrice(){
        double sum = 0;
        for (Watch watch : watches){
            sum += watch.getPrice();
        }
        return sum;
    }

    public List<Watch> sortByPrice(){
        return watches.stream().sorted(Comparator.comparing(Watch::getPrice)).toList();
    }

    public List<Watch> sortByColor(){
        return watches.stream().sorted(Comparator.comparing(Watch::getColor)).toList();
    }
}

