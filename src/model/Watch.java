package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Watch {
    private String model;
    private BigDecimal price;
    private Color color;
    private LocalDate dateOfReceipt;
    private String description;

    public Watch(String model, BigDecimal price, Color color, LocalDate dateOfReceipt, String description) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
