package proxy;

/**
 * @author joy
 * @time 2019/09/07 14:04
 */
public class Test {
    public static void main(String[] args) {
        Proxy anjvke = new HouseProxy(new Tanant("小明"));
        anjvke.findHouse();
    }
}
