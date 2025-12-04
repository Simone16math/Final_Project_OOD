public class BasicMenuFactory implements MenuAbstractFactory{
    // adding all the product variations to the basic menu factory
    @Override
    public IceCream createIceCream() {
        return new BasicIceCream();
    }

    @Override
    public VanillaIceCream createVanillaIceCream() {
        return new VanillaIceCream();
    }

    @Override
    public ChocolateIceCream createChocolateIceCream() {
        return new ChocolateIceCream();
    }

    @Override
    public CookiesNCreamIceCream createCookiesNCreamIceCream() {
        return new CookiesNCreamIceCream();
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

    @Override
    public RedVelvetCake createRedVelvetCake() {
        return new RedVelvetCake();
    }

    @Override
    public LavaCake createLavaCake() {
        return new LavaCake();
    }

    @Override
    public VanillaIceCreamPint createVanillaIceCreamPint() {
        return new VanillaIceCreamPint();
    }

    @Override
    public ChocolateIceCreamPint createChocolateIceCreamPInt() {
        return new ChocolateIceCreamPint();
    }

    @Override
    public CookiesNCreamIceCreamPint createCookiesNCreamIceCreamPint() {
        return new CookiesNCreamIceCreamPint();
    }
}
