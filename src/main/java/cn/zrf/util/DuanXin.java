package cn.zrf.util;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

import java.util.HashMap;

/**
 * @author ZhangRongFei
 * @date 2019/8/31 12:45
 */
public class DuanXin {
    public void send(String to, String templateId, String[] datas) throws Exception {
        CCPRestSmsSDK sdk = new CCPRestSmsSDK();
        // 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
        sdk.init("app.cloopen.com","8883");
        // 初始化主帐号和主帐号TOKEN
        sdk.setAccount("8aaf07086cdb49dc016ce1082522041b","780da71be4344a338e8337e105c068d1");
        // 初始化应用ID
        sdk.setAppId("8aaf07086cdb49dc016ce10825790422");

        HashMap<String, Object> result = sdk.sendTemplateSMS(to, templateId, datas);
        //判断是否发送成功；发送成功是：000000
        if("000000".equals(result.get("statusCode")))
            System.out.println("短信发送成功");
        else
            throw new Exception(result.get("statusCode").toString()+result.get("statusMsg").toString());
    }

    public static void main(String[] args) throws Exception {

        //1、生成验证码
        int code = (int) (Math.random() * 9000 + 1000);
        //2、发送验证码
        DuanXin duanXin = new DuanXin();
        duanXin.send("17395752685","1",new String[]{String.valueOf(code),"1"});
    }
}
