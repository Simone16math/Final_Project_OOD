public class MenuFactory {
    public static Menu createItem(String type) {
        if (type.equalsIgnoreCase("IceCream")) {
            return new BasicIceCream();
        } else if (type.equalsIgnoreCase("Cookie")) {
            return new Cookie();
        } else if (type.equalsIgnoreCase("Drinks")) {
            return new Drinks();
        } else {
            return null;
        }

    }}
