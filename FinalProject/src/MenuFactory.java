public class MenuFactory {
    public Menu createItem(String type) {
        if(type.equalsIgnoreCase("IceCream")){
            return new IceCream();
        }else if(type.equalsIgnoreCase("Cookie")){
            return new Cookie();
        }else if(type.equalsIgnoreCase("Drinks")){
            return new Drinks();
        }
    }

}
