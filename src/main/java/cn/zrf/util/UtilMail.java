package cn.zrf.util;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author ZhangRongFei
 * @date 2019/8/31 13:45
 */
public class UtilMail implements Runnable {
    private String mailTo = "1696950618@qq.com";// 收件人邮箱
    private String activationCode;// 激活码

    public UtilMail() {
        this.mailTo = mailTo;
        this.activationCode = activationCode;
    }
    @Override
    public void run() {
        //发件人电子邮箱
        String fromMail = "tingyuxuan169@163.com";
        //指定发送邮件的主机
        String host = "smtp.163.com";

        //获取系统属性
        Properties properties = System.getProperties();
        //设置邮件服务器
        properties.setProperty("mail.smtp.host",host);
        //打开认证
        properties.setProperty("mail.smtp.auth","true");

        try {
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
            //1、发邮件
            // 获取默认session对象;验证账号及密码，密码需要是第三方授权码
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                public PasswordAuthentication getPasswordAuthentication() {
                    //发件人邮件用户名、授权码
                    return new PasswordAuthentication("tingyuxuan169@163.com", "tingyuxuan169");
                }
            });
            //2、创建邮件对象
            Message message = new MimeMessage(session);
            // 2.1设置发件人
            message.setFrom(new InternetAddress(fromMail));
            // 2.2设置接收人
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
            // 2.3设置邮件主题
            message.setSubject("账号激活");
            // 2.4设置邮件内容
            String content = "<html><head></head><body><h1>这是一封激活邮件,激活请点击以下链接</h1><h3><a href='http://localhost:8080/RegisterDemo/ActiveServlet?code="
                    + activationCode + "'>http://localhost:8080/RegisterDemo/ActiveServlet?code=" + activationCode
                    + "</href></h3></body></html>";
            message.setContent(content, "text/html;charset=UTF-8");
            // 3.发送邮件
            Transport.send(message);
            System.out.println("邮件成功发送!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UtilMail utilMail = new UtilMail();
        utilMail.run();
    }
}
