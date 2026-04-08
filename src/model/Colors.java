package model;

public enum Colors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");

    private final String description;

    Colors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
