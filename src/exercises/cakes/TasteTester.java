package exercises.cakes;

public class TasteTester {
    public static void main(String[] args) {

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(50);
        weddingCake.setFlavor("mint");
        weddingCake.setTiers(4);

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(45);
        birthdayCake.setFlavor("chocolate");
        birthdayCake.setCandles(10);

        System.out.println("Wedding Cake: $" + weddingCake.getPrice() + " with " + weddingCake.getFlavor() + " and " + weddingCake.getTiers() + " tiers");
        System.out.println("Birthday Cake: $" + birthdayCake.getPrice() + " with " + birthdayCake.getFlavor() + " and " + birthdayCake.getCandles() + " candles");
    }
}
