package cn.zrf.config;

/**
 * @author ZhangRongFei
 * @date 2019/8/31 15:30
 */
public class AlipayConfigs {
    // 商户appid
    private String APPID = "";
    // 私钥 pkcs8格式的
    private String RSA_PRIVATE_KEY = "";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    private String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    private String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
    // 请求网关地址
    private String URL = "";
    // 编码
    private String CHARSET = "";
    // 返回格式
    private String FORMAT = "";
    // 支付宝公钥
    private String ALIPAY_PUBLIC_KEY = "";
    // 日志记录目录
    private String log_path = "";
    // RSA2
    private String SIGNTYPE = "";
    //支付成功跳转页
    private String paymentSuccessURL="";
    //支付失败跳转页
    private String paymentFailureURL="";

    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getRSA_PRIVATE_KEY() {
        return RSA_PRIVATE_KEY;
    }

    public void setRSA_PRIVATE_KEY(String RSA_PRIVATE_KEY) {
        this.RSA_PRIVATE_KEY = RSA_PRIVATE_KEY;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCHARSET() {
        return CHARSET;
    }

    public void setCHARSET(String CHARSET) {
        this.CHARSET = CHARSET;
    }

    public String getFORMAT() {
        return FORMAT;
    }

    public void setFORMAT(String FORMAT) {
        this.FORMAT = FORMAT;
    }

    public String getALIPAY_PUBLIC_KEY() {
        return ALIPAY_PUBLIC_KEY;
    }

    public void setALIPAY_PUBLIC_KEY(String ALIPAY_PUBLIC_KEY) {
        this.ALIPAY_PUBLIC_KEY = ALIPAY_PUBLIC_KEY;
    }

    public String getLog_path() {
        return log_path;
    }

    public void setLog_path(String log_path) {
        this.log_path = log_path;
    }

    public String getSIGNTYPE() {
        return SIGNTYPE;
    }

    public void setSIGNTYPE(String SIGNTYPE) {
        this.SIGNTYPE = SIGNTYPE;
    }

    public String getPaymentSuccessURL() {
        return paymentSuccessURL;
    }

    public void setPaymentSuccessURL(String paymentSuccessURL) {
        this.paymentSuccessURL = paymentSuccessURL;
    }

    public String getPaymentFailureURL() {
        return paymentFailureURL;
    }

    public void setPaymentFailureURL(String paymentFailureURL) {
        this.paymentFailureURL = paymentFailureURL;
    }
}
