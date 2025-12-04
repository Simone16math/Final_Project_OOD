public interface MenuAbstractFactory {
    IceCream createIceCream();
    VanillaIceCream createVanillaIceCream();
    ChocolateIceCream createChocolateIceCream();
    CookiesNCreamIceCream createCookiesNCreamIceCream();
    Cookie createCookie();
    LargeCookie createLargeCookie();
    Drinks createDrink();
    StrawberryBananaShake createStrawberryBananaShake();
    ChocolateShake createChocolateShake();
    RedVelvetCake createRedVelvetCake();
    LavaCake createLavaCake();
    VanillaIceCreamPint createVanillaIceCreamPint();
    ChocolateIceCreamPint createChocolateIceCreamPInt();
    CookiesNCreamIceCreamPint createCookiesNCreamIceCreamPint();
}
