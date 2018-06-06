package ua.lviv.iot;

import javax.validation.constraints.NotNull;

public abstract class Stone {
    private double price;
    private double weight; // in carats
    private Clarity clarity;
    private String type;
    @NotNull
    private Integer id;

    public Stone(final double price, final double weight, final Clarity clarity, final String type, final Integer id) {
        this.price = price;
        this.weight = weight;
        this.clarity = clarity;
        this.type = type;
        this.id = id;
    }

    public Stone() {
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public Clarity getClarity() {
        return clarity;
    }

    public String getHeaders() {
        return "price,weight,clarity,type";
    }

    public String toCSV() {
        return this.price + "," + this.weight + "," + this.clarity.toString() + "," + this.type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setClarity(Clarity clarity) {
        this.clarity = clarity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
