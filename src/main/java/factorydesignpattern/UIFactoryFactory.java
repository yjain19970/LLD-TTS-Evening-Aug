package factorydesignpattern;

/**
 * Practical factory. Generally it is called just factory,
 */
public class UIFactoryFactory {

    /**
     * 99.9% of the code bases, you will use this.
     * @param platform
     * @return
     */
    public static UIFactory getUIFactoryByPlatform(String platform){
        if(platform.equals("android")){
            return new AndroidUIFactory();
        }else if(platform.equals("ios")){
            return new IoSUIFactory();
        }
        return null;
    }
}
