public class Drinks implements Menu{
    @Override
    public String item() {
        String name = "Drinks";
        return name;
    }

    @Override
    public double price() {
        double price = 5.0;
        return price;
    }
}
