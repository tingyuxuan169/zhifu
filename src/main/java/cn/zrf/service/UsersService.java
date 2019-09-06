package cn.zrf.service;

import cn.zrf.pojo.Users;

import java.util.List;

/**
 * @author ZhangRongFei
 * @date 2019/8/30 16:17
 */
public interface UsersService {
    public List<Users> findAll();
    public void save(Users users);
    //手机注册
    public void saveByPhone(Users user) throws Exception;
    //短信验证
    public Boolean validatePhone(String phone,String code)  throws Exception;
}
