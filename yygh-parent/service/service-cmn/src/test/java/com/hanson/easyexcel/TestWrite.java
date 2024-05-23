package com.hanson.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanson
 * @date 2024/5/23 14:33
 */
public class TestWrite {

    public static void main(String[] args) {
        //构建数据的list集合
        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData data = new UserData();
            data.setUid(i);
            data.setUsername("lucy" + i);
            list.add(data);
        }

        // 设置excel文件的路径和名称
        String fileName = "C:\\code\\project\\Hospital\\excel\\01.xlsx";

        // 调用方法实现写操作
        EasyExcel.write(fileName, UserData.class).sheet("用户信息").doWrite(list);
    }
}
