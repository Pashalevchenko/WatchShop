package service;

import model.Color;
import model.Watch;
import view.Display;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class WatchService {

     private final List<Watch> watches = new ArrayList<>();
     private final Display display = new Display();
     private final InputHandler input = new InputHandler();

    public WatchService() {
        watches.add( new Watch("Batman", new BigDecimal("230.5"), Color.BLACK, LocalDate.of(2026, 4, 11), "Be real Dark knight"));
        watches.add( new Watch("Xiaomi", new BigDecimal("230.5"), Color.WHITE, LocalDate.of(2025, 8, 22), "Top for this price"));
        watches.add( new Watch("s-class", new BigDecimal("10000.4"), Color.BLUE, LocalDate.of(2026, 1, 1), "Do not need description for this watch"));
        watches.add(new Watch("BadB", new BigDecimal("300.4"), Color.AQUA, LocalDate.of(2024, 7, 25), "For real bad boys"));
        watches.add( new Watch("g-shock", new BigDecimal("310.4"), Color.RED, LocalDate.of(2022, 2, 24), "Best solution for active vacation"));
        watches.add(new Watch("rolex", new BigDecimal("999999"), Color.BLACK, LocalDate.of(2023, 7, 26), "For top"));
    }

    public void addWatch(){
        String model = input.readString("select model: ");

        BigDecimal price = input.readBigDecimal("select price separated by . : ");

        String color = input.readString("select Color (Black, White, Red, Blue, Aqua): ");

        String description = input.readString("select description: ");

        watches.add(new Watch(
                model,
                price,
                Color.valueOf(color.trim().toUpperCase()),
                LocalDate.now(),
                description
        ));
    }

    public BigDecimal getSumOfPrice(){
        BigDecimal sum = new BigDecimal(0);
        for (Watch watch : watches){
            sum = sum.add(watch.getPrice());
        }
        return sum;
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
        display.printWatches(watches);
    }
}

