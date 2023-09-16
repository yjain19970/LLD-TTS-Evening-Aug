package factorydesignpattern.component.button;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Android Button");
    }
}
