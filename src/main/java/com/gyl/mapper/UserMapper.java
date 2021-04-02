package com.gyl.mapper;

import com.gyl.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author 高云雷
 * @date 2021-04-2021/4/1 16:00:32
 */
@Mapper
@Component(value="userMapper")
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Insert("INSERT INTO user VALUES (NULL, #{name},#{sex});")
    int insert(@Param("name") String name, @Param("sex") String sex);

}
