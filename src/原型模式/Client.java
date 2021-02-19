package 原型模式;

import java.util.Random;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/31
 */
public class Client {
    /**
     * 发送账单的数量
     */
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模板
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有");

        for (int i = 0; i < MAX_COUNT; i++) {
            //以下是每封邮件不同的地方, 克隆
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + (i % 2 == 0 ? " 先生" : "女士"));
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(3) + ".com");
            sendMail(mail);
        }
    }

    /**
     * 发送邮件
     *
     * @param mail
     */
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功");
    }

    /**
     * 获得指定长度的随机字符串
     *
     * @param maxLength
     * @return
     */
    public static String getRandString(int maxLength) {
        String src = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQ123";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < maxLength; i++) {
            sb.append(src.charAt(random.nextInt(src.length())));
        }

        return sb.toString();
    }
}
