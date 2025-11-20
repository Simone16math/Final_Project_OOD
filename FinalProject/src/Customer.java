public class Customer implements Observer {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        notification();
    }
    public void notification(){
        System.out.println("You ordered: " );
    }
}
