public class Drinks implements Menu{
    @Override
    public String item() {
        return "Drinks";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
