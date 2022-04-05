package User_mybatis;

import com.aut.mybatis.mappers.SelectMapper;
import com.aut.mybatis.pojo.user;
import com.aut.mybatis.utils.mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SelectMapperTest {
    //测试查询功能
    @Test
    public void test01(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);
        System.out.println(mapper1.getUserById(4));
    }

    //测试多条查询功能
    @Test
    public void test02(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);

        System.out.println(mapper1.getUserListById());

    }

    //查询用户信息的总记录数
    @Test
    public void test03(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);

        System.out.println(mapper1.getCount());
    }

    //查询根据id结果为map集合
    @Test
    public void test04(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);

        System.out.println(mapper1.getUseridTOMap(4));
    }

    //查询所有用户信息为map集合
    @Test
    public void test05(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);

        System.out.println(mapper1.getAllUser());
    }

    //根据用户名模糊查询用户信息
    @Test
    public void test06(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);
        List<user> i = mapper1.getUserByList("i");

        System.out.println(i);
    }

    //根据用户名模糊查询用户信息
    @Test
    public void test07(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);


        System.out.println(mapper1.deleteMore("5,6"));
    }
    //查询指定表中数据
    @Test
    public void test08(){
        SqlSession mapper = com.aut.mybatis.utils.mapper.getMapper();
        SelectMapper mapper1 = mapper.getMapper(SelectMapper.class);


        System.out.println(mapper1.getUserByTableName("test"));
    }


}
