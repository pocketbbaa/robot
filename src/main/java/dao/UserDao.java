package dao;

import model.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Created by admin on 2016/6/27.
 */
public interface UserDao {

    /**
     * 邮箱是否存在
     * @param email
     * @return
     */
    int emailExist(String email);

    /**
     * 用户名是否存在
     * @param username
     * @return
     */
    int usernameExist(String username);

    /**
     * 添加用户
     * @param email
     * @param phone
     * @param password
     * @param createTime
     * @return
     */
    int addUser(@Param("email") String email, @Param("phone") String phone,
                    @Param("password") String password, @Param("createTime") Date createTime);

    /**
     * 校验用户信息正确性
     * @param phone
     * @param email
     * @param password
     * @return
     */
    int checkLogin(@Param("phone") String phone,@Param("email") String email,@Param("password") String password);

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 电话是否存在
     * @param phone
     * @return
     */
    int phoneExits(String phone);

    /**
     * 根据邮箱获取用户信息
     * @param email
     * @return
     */
    User getUserByEmail(String email);
}
