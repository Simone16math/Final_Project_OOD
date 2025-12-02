public class Drinks implements Menu{
    @Override
    public String item() {
        return "Drinks";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
