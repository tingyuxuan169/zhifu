package cn.zrf.dao;

import cn.zrf.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ZhangRongFei
 * @date 2019/8/30 16:11
 */
public interface UsersDao {
    //查询用户
    @Select("select * from users")
    public List<Users> findAll();
    //注册用户
    @Insert("insert into users values (null,#{name},#{email},#{phone},#{password})")
    public void save(Users users);
}
