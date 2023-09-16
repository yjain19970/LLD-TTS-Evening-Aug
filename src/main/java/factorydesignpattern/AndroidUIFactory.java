package factorydesignpattern;

import factorydesignpattern.component.button.AndroidButton;
import factorydesignpattern.component.button.Button;
import factorydesignpattern.component.menu.AndroidMenu;
import factorydesignpattern.component.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
