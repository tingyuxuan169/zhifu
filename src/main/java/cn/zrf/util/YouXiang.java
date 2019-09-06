package cn.zrf.util;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author ZhangRongFei
 * @date 2019/8/31 13:07
 */
public class YouXiang {

    private SimpleMailMessage mailMessage;
    private MailSender mailSender;
    public void sendActivationMail(String mailTo,String activationCode){
        //1、邮件发送给谁（收件人）
        mailMessage.setTo(mailTo);
        //2、邮件内容
        mailMessage.setText("您的激活码是："+activationCode);
        //3、发送邮件
        mailSender.send(mailMessage);
    }
}
