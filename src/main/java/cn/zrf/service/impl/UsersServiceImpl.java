package cn.zrf.service.impl;

import cn.zrf.dao.UsersDao;
import cn.zrf.pojo.Users;
import cn.zrf.service.SmsUsersPhoneService;
import cn.zrf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author ZhangRongFei
 * @date 2019/8/30 16:17
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersDao usersDao;
    @Autowired
    SmsUsersPhoneService smsUsersPhoneService;

    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    @Override
    public void save(Users users) {
        usersDao.save(users);
    }

    //手机号注册用户
    @Override
    public void saveByPhone(Users user) throws Exception {
        //1、创建用户
        usersDao.save(user);
        //2、生成验证码
        int code = (int) (Math.random() * 9000 + 1000);
        //3、发送验证码
        smsUsersPhoneService.send(user.getPhone(),"1",new String[]{String.valueOf(code),"1"});
    }

    //短信验证码验证
    @Override
    public Boolean validatePhone(String phone, String code) throws Exception {
        //比对验证码
        return null;
    }






    public static void main(String[] args) throws Exception {

        //2、生成验证码
        int code = (int) (Math.random() * 9000 + 1000);
        //3、发送验证码
        SmsUsersPhoneServiceImpl service = new SmsUsersPhoneServiceImpl();
        service.send("17395752685","1",new String[]{String.valueOf(code),"1"});
    }
}
