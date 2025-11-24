public class TestingWithoutUI {

    public static void main(String[] args){
        IceCream1 icecream1 = new BasicIceCream1();

        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

        icecream1 = new SprinklesDecorator(icecream1);
        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

        icecream1 = new ChocolateSauceDecorator(icecream1);
        System.out.println(icecream1.getDescription() + " $" + icecream1.getPrice());

    }
}
