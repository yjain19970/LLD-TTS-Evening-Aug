package factorydesignpattern;

import factorydesignpattern.component.button.Button;
import factorydesignpattern.component.menu.Menu;

/**
 * this is your abstract factory.
 */
public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
