package ua.lviv.iot;

public class Gem extends Stone {

    private String gemName;

    public Gem(final double price, final double weight, final Clarity clarity, final String type, final Integer id) {
        super(price, weight, clarity, type, id);
        gemName = "none";
    }

    public Gem(){
        super();
    }


    public Gem(final double price, final double weight, final Clarity clarity, final String type, final Integer id, final String gemName) {
        super(price, weight, clarity, type, id);
        if (gemName != null) {
            this.gemName = gemName;
        } else {
            this.gemName = "none";
        }
    }

    /**
     * @return string
     */
    @Override
    public String getType() {
        return "Gem: " + super.getType() + "/n"
                + "Name of this gem(if present): " + gemName;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",gemName";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.gemName;
    }
}
