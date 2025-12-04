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
    public LargeCookie createLargeCookie() {
        return new LargeCookie();
    }

    @Override
    public Drinks createDrink() {
        return new Drinks();
    }

    @Override
    public StrawberryBananaShake createStrawberryBananaShake() {
        return new StrawberryBananaShake();
    }

    @Override
    public ChocolateShake createChocolateShake() {
        return new ChocolateShake();
    }
}
