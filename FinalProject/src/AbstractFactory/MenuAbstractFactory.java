/*Annika Maringer
 *
 * methods to create each Item
 * */



package AbstractFactory;

public interface MenuAbstractFactory {
    // creating methods all the product variations to the factory
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
