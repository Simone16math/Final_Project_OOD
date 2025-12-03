public class BasicMenuFactory implements MenuAbstractFactory{
    @Override
    public IceCream createIceCream() {
        return new BasicIceCream();
    }

    @Override
    public Cookie createCookie() {
        return new Cookie();
    }

    @Override
    public Drinks createDrink() {
        return new Drinks();
    }
}
