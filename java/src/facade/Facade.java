package facade;

/**
 * @author joy
 * @time 2019/09/16 20:27
 */
public class Facade {

    private MonitorSystem  monitor = new MonitorSystem();
    private SecuritySystem security = new SecuritySystem();
    private PrintSystem    print = new PrintSystem();

    /**
     * ATM机取钱的例子
     */
    public void getMoney(String pwd) {
        monitor.monitor();
        security.checkPwd(pwd);
        print.print();
    }
}
