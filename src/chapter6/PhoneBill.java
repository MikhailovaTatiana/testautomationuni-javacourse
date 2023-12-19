package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill() {
        id = 1233;
        baseCost = 85.55;
        allottedMinutes = 90;
        usedMinutes = 94;
    }

    public PhoneBill(int id) {
        setId(id);
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }
}
