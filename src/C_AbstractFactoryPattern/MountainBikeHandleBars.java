package C_AbstractFactoryPattern;

public class MountainBikeHandleBars implements HandleBars {

    @Override
    public String getType() {
        return "FLAT";
    }

}
