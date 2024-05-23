package com.hanson.example.demomogo;

import com.hanson.example.demomogo.entity.User;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.regex.Pattern;

@SpringBootTest
class DemomogoApplicationTests {

    // 注入MongoTemplate
    @Autowired
    private MongoTemplate mongoTemplate;

    // 添加操作
    @Test
    public void create() {
        User user = new User();
        user.setAge(20);
        user.setName("test");
        user.setEmail("123@qq.com");
        User user1 = mongoTemplate.insert(user);
        System.out.println(user1);
    }

    // 查询所有数据
    @Test
    public void findAll() {
        List<User> all = mongoTemplate.findAll(User.class);
        System.out.println(all);
    }

    // 根据id查询
    @Test
    public void findId() {
        User byId = mongoTemplate.findById("664efd93efb042961116e4ba", User.class);
        System.out.println(byId);
    }

    // 根据条件进行查询
    @Test
    public void findUserList() {
        // name = test and age = 20
        Query query = new Query(Criteria.where("name").is("test").and("age").is(20));
        List<User> users = mongoTemplate.find(query, User.class);
        System.out.println(users);
    }

    // 模糊查询
    @Test
    public void findLikeUserList() {
        // name like test
        String name = "est";

        // 正则匹配
        String regex = String.format("%s%s%s", "^.*", name, ".*$");

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Query query = new Query(Criteria.where("name").regex(pattern));
        List<User> users = mongoTemplate.find(query, User.class);
        System.out.println(users);
    }

    // 分页查询
    @Test
    public void findPageUserList() {
        String name = "est";
        int pageNo = 1;
        int pageSize = 3;

        // 条件构建
        String regex = String.format("%s%s%s", "^.*", name, ".*$");

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Query query = new Query(Criteria.where("name").regex(pattern));

        // 分页构建
        // 查询记录
        long count = mongoTemplate.count(query, User.class);
        // 分页
        List<User> users = mongoTemplate.find(query.skip((pageNo - 1) * pageSize).limit(pageSize), User.class);
        System.out.println(count);
        System.out.println(users);

    }

    // 修改操作
    @Test
    public void updateUser(){
        // 根据id查询数据
        User user = mongoTemplate.findById("664f0986fb25c00a61133585", User.class);

        // 设置修改值
        user.setName("test_1");
        user.setEmail("321@qq.com");
        user.setAge(31);

        // 调用方法实现修改
        Query query = new Query(Criteria.where("_id").is(user.getId()));
        Update update = new Update();
        update.set("name",user.getName());
        update.set("age",user.getAge());
        update.set("email",user.getEmail());
        UpdateResult upsert = mongoTemplate.upsert(query, update, User.class);
        long modifiedCount = upsert.getModifiedCount();
        System.out.println(modifiedCount);

    }

    // 删除
    @Test
    public void deleteUser(){
        Query query = new Query(Criteria.where("_id").is("664f097dd59f9e4d9792c5fb"));
        DeleteResult remove = mongoTemplate.remove(query, User.class);
        long deletedCount = remove.getDeletedCount();
        System.out.println(deletedCount);
    }
}
