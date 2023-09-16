package factorydesignpattern;

public class Flutter {
    public void setTheme(){
        System.out.println("Setting theme...");
    }


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryByPlatform(platform);
    }
}
