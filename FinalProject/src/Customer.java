public class Customer implements Observer {

    @Override
    public void update() {
        notification();
    }
    public void notification(){
        System.out.println("You ordered: " );
    }
}
