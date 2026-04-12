package model;

import java.time.LocalDate;

public class Watch {
    private String model;
    private double price;
    private Colors color;
    private LocalDate dateOfReceipt;
    private String description;

    public Watch(String model, double price, Colors color, LocalDate dateOfReceipt, String description) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.dateOfReceipt = dateOfReceipt;
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public LocalDate getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(LocalDate dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color=" + color +
                ", dateOfReceipt=" + dateOfReceipt +
                ", description='" + description + '\'' +
                '}';
    }
}
