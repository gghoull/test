package com.gyl.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gyl.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author 高云雷
 * @date 2021-04-2021/4/1 16:00:32
 */
@Mapper
@Component(value="userMapper")
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Insert("INSERT INTO user VALUES (NULL, #{name},#{sex});")
    int insert(@Param("name") String name, @Param("sex") String sex);

    @Update("UPDATE user SET name = #{name} WHERE id = #{id};")
    int update(@Param("name") String name,@Param("id") String id);

    @Delete("DELETE FROM user WHERE id = #{id};")
    int delete(@Param("id") String id);
}
