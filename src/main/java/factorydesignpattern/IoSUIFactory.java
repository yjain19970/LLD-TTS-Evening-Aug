package factorydesignpattern;

import factorydesignpattern.component.button.Button;
import factorydesignpattern.component.button.IoSButton;
import factorydesignpattern.component.menu.IoSMenu;
import factorydesignpattern.component.menu.Menu;

public class IoSUIFactory implements UIFactory{
    @Override
    public IoSButton createButton() {
        return new IoSButton();
    }

    @Override
    public IoSMenu createMenu() {
        return new IoSMenu();
    }
}
