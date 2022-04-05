package com.aut.mybatis.mappers;

import com.aut.mybatis.pojo.user;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    //根据id查询用户信息
    user getUserById(@Param("id") Integer id);

    //根据id查询多条用户信息
    List<user> getUserListById();

    //查询用户信息的总记录数
    Integer getCount();

    //查询根据id为map集合
    Map<String , Object> getUseridTOMap(Integer id);

    //查询所有用户信息为map集合方法一
    List<Map<String,Object>> getAllUser();

    //查询所有用户信息为map集合方法二
    @MapKey("id")
    Map<String,Object> getAllUserMap();

    //根据用户名模糊查询用户信息
    List<user> getUserByList(@Param("name") String name);

    //批量删除
    int deleteMore(@Param("ids") String ids);

    //查询指定表中数据

    List<user> getUserByTableName(@Param("TableName") String TableName);

}
