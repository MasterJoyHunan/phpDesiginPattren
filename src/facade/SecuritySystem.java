package facade;

/**
 * 安全系统
 */
public class SecuritySystem {

    public void checkPwd(String pwd) {
        System.out.println("检查密码是否正确");
        if ("123456".equals(pwd)) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }
}
