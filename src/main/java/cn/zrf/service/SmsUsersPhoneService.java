package cn.zrf.service;

/**
 * @author ZhangRongFei
 * @date 2019/8/30 17:38
 */
public interface SmsUsersPhoneService {
    public void send(String to,String templateId,String []datas) throws Exception;
}
