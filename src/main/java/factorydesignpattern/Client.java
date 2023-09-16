package factorydesignpattern;

import factorydesignpattern.component.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory androidUIFactory =  flutter.createUIFactory("ios");
        Button button = androidUIFactory.createButton();
        button.changeSize();

        System.out.println(button);
    }
}
