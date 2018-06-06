package ua.lviv.iot;

import javax.validation.constraints.NotNull;

public class GoodForMovie {
    private int cost;
    private int weight;
    private BrandType brandType;
    private String name;
    private String month;
    @NotNull
    private Integer id;

    public GoodForMovie(final String name, final String month,
                        final int cost, final int weight, final BrandType brandType, final Integer id) {
        setMonth(month);
        setName(name);
        setBrandType(brandType);
        setCost(cost);
        setWeight(weight);
        this.id = id;
    }


    public GoodForMovie() {

    }


    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setMonth(final String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }


    public BrandType getBrandType() {
        return brandType;
    }

    public void setBrandType(final BrandType brandType) {
        this.brandType = brandType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }


    public String getHeaders() {
        return "cost, weight, brandType, name, month";
    }

    private static final String COMMA_DELIMITER = ",";


    public String toCSV() {
        StringBuilder string = new StringBuilder();
        string.append(String.valueOf(this.getCost()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getWeight()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getBrandType()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getName()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getMonth()));
        return string.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

