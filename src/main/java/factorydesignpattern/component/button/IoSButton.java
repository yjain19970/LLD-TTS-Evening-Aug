package factorydesignpattern.component.button;

import factorydesignpattern.component.button.Button;

public class IoSButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Ios Button");
    }
}
