public class BasicMenuFactory implements MenuAbstractFactory{
    @Override
    public Menu createIceCream() {
        return new BasicIceCream();
    }

    @Override
    public Menu createCookie() {
        return new Cookie();
    }

    @Override
    public Menu createDrink() {
        return new Drinks();
    }
}
