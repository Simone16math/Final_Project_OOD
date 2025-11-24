public class TestingWithoutUI {

    public static void main(String[] args){
        IceCream1 icecream1 = new BasicIceCream1();

        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

        icecream1 = new Sprinkles(icecream1);
        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

        icecream1 = new ChocolateChips(icecream1);
        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

    }
}
