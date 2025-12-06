/*Annika Maringer
 *
 * a set of methods that the product classes need to implement
 * */


package AbstractFactory;

public interface Menu {
    // basic needs in every product class
    String getItemName();
    double getPrice();
    String getDescription();
}
