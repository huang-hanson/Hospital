package com.hanson.demomptest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hanson.demomptest.entity.User;
import com.hanson.demomptest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemomptestApplicationTests {

    @Autowired
    private UserMapper userMapper;

    // mp复杂操作
    @Test
    public void testSelect(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //ge、gt、le、lt
//        queryWrapper.ge("age",21);

        //eq、ne
//        queryWrapper.eq("name","Tom");

        // between、notbetween
//        queryWrapper.between("age",24,28);

        // like、notLike、likeLeft、likeRight
//        queryWrapper.like("name","张");

        //  orderBy、orderByDesc、orderByAsc
        queryWrapper.orderByDesc("id");

        List<User> users = userMapper.selectList(queryWrapper);



        System.out.println(users);
    }

    //测试逻辑删除后的查询
    @Test
    public void testLogicDeleteSelect() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }


    //     简单条件删除
    @Test
    public void testDeleteByMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Helen");
        map.put("age", 18);
        int result = userMapper.deleteByMap(map);
        System.out.println(result);
    }


    // 批量删除
    @Test
    public void testDeleteBatchIds() {
        int result = userMapper.deleteBatchIds(Arrays.asList(8, 9, 10));
        System.out.println(result);
    }


    // 根据id删除记录
    @Test
    public void testDeleteById(){
        int result = userMapper.deleteById(1793115309331189761L);
        System.out.println(result);
    }


    // 分页查询
    @Test
    public void testSelectPage(){
        Page<User> page = new Page(1, 3);
        Page<User> userPage = userMapper.selectPage(page, null);
        // 返回对象得到分页中的数据
        long pages = userPage.getPages();//总页数
        long current = userPage.getCurrent();//当前页
        List<User> records = userPage.getRecords();//查询数据集合
        long total = userPage.getTotal();//总记录数
        boolean hasNext = userPage.hasNext();//下一页
        boolean hasPrevious = userPage.hasPrevious();//上一页

        System.out.println(pages);
        System.out.println(current);
        System.out.println(records);
        System.out.println(total);
        System.out.println(hasNext);
        System.out.println(hasPrevious);
    }

    // 简单的条件查询
    @Test
    public void testSelect2(){
        Map<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name","Jack");
        hashMap.put("age",20);
        List<User> users = userMapper.selectByMap(hashMap);
        System.out.println(users);
    }

    // 通过id批量查询
    @Test
    public void testSelect1(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }


    // 测试乐观锁
    @Test
    public void testOptimisticLocker(){
        // 根据id查询version
        User user = userMapper.selectById(1792945496067710978L);
        // 修改
        user.setName("张三");
        userMapper.updateById(user);
    }

    // 修改
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1792940389045469186L);
        user.setName("wuhu");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    public void testAdd(){
        // mp自带雪花算法生成id
        User user = new User();
        user.setName("wangwu");
        user.setAge(22);
        user.setEmail("12321312456@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
