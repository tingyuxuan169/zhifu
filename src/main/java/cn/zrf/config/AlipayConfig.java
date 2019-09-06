package cn.zrf.config;

/**
 * @author ZhangRongFei
 * @date 2019/8/31 16:09
 */
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016101000654325";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCB9Mge9BLKn6xQSBInZHC3GRP661tyS+ofhlE5BvQE7CDVRQfFoi7+n9z9BC7Ft2sT9IkBhbiEDot6pC7LAgc0MooS+SNs8Yyg0r/3LtL/Zdi/i4CWur+dNznCA3THqsnJrcpdArBMbfBuzxmEerLHTrCHhFsjUX+UCNJgG2JVo8ilwqM1fz8spPvW0y3PpdVgqsioFQF31NrKzut53iNMQL8aQ+XsmC4mBcvYjMfCGXBFMi2DGLM+7Ux/IqksYINXyRCjd5a3c3mrNB+tQl4AAu6IIcszABhN2OMGcpRqr/LMKERHYOqITZ+5ncLHcl08bY46zNPn82iWGKeQU9nPAgMBAAECggEAJfCNoCPHfKpDBykTS7bSBVJn9+BQUT0Ce/OdsNVr1igNqdW+YB9qMuH/BUr8ULKsqyW//dbJOJx6cfKOyqur6Lw8fS+I/RxD3wvICWT9KpzUO4+Bmf+pQz/FN/QEWupsgNmg86h+ScHq6J7Dp16e5Pr/JIEqjlQTt+cfa/lyqud8U78OvkRKdulKHSInvME7B7h2aDGN++vVXMcJIqSGfjHPZ0sHqK1bxcMO+Ue+/onRKTQyX+SCKiBIfuBHbDr/IVQGGxhMXozcpYXVzam2o1eq496G00qs+pMjxZLQnnlK0jH4x/Sn87FaXIioncbHocZIVY/CpXTkY1kHdCqNSQKBgQDBgn2vX8EFe7UdNkKrhZ5fc4FpRdCWQbud0v+eKYeVrpCCiauVaD3M9clihqWWTpKbKBQKXm2UYoZp62+Ps0ZCR8bYokme4xCt2Qkk2aG2yL3l8DpIAq+rgYLBJfN2rGKuvplR5GsNrv5G/wwYB4/WFDgUzGI9fELmx+6eA5wIEwKBgQCr7EyPJVqPp7VDybRXpfNJVNmnF43AmKUYgzzYbiPT5EAoUciJaaxMrNwbA/fcatvksBRBTPUOy+KMXgkMfNR49b3auxpcMfnhemNz16J4BhgPaPYuWTJiGqzG19TyS2ijLaxX0k2YxEJTvVM0/+BQlf49ej43dbDG19GqNuKW1QKBgG81r0W6ohOkpNHE/UvV3s68cwMtPFMeM9TgDke3VlSPnj1nIVUcM2g3WSVmfIOFZHwG7H2JBzDf7p+wzsynGxm8ZmrZ2bWWiV9f/AFRkb6aX4hmJxh7crn+FEcsqF7rc0s5/qMxwtR6XWgv66NjtSYzOIe7bjonz8sR2/Cz4lhBAoGBAJv8jAIc/Cv3GCnnKq+TrEdOqyRF5KFoXfL9sAkW9X7dS7DJc0/qByCSfios0Yi1k8nMULRm5LmGF4kQENm5sPYG0TlSJbqcxYHlD7MdZRXNQatJqoOm/mWwmi7XySgFb20OlZ4g+7Kt7xgXYRVnS9kSHlkdPrIHIFtpmZv8rF35AoGBAK7N9GBj2QJLkyPBOPCXSQmhHuQfM9dh3m/53jzqSlEIywiHKZSkhbwt+h7AA9bm3q1J24O70GEr8l1wycjo8uW9xe5hn1gL4kQ24HkeJO3AYql833KW4Rcl3ob68lh6Kg+106IEC8360JgOFPTWKlwx4xelEuRwIm8jEaRau2+U";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjaDEtxwteiU13q40OMk7LuAYZJQmAqvyeZ7VO29+LBo5QiFkFPZHlzqOk3OnzpeiMBeq1s5Gbp1IQhqXi8ES41miC0xLq1zw5bjwzx2FeqFu6mwgVw3gNll+JD6RrWW9QY9WIF0AzWCdDrqAI9FfitlJN9990bBDyCgid4oOgubQKBPQBRUTIi3G68TkvlXWVUUGWiwOhGvqRK+nUOtt/NExxlV85V3bzpWiW6mrQ5j6huN63XsCYKe3jfFJw/Z9nRpzZ1I6DpkxjZw+Ml9C5SnDEMDc9Ip5XjaIAkU8YerXqE1afMsrBGHgRylMUO9aZqIoMuwoZ4pqHZGQTNEGYwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
