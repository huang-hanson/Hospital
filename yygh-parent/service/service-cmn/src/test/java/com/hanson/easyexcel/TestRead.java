package com.hanson.easyexcel;

import com.alibaba.excel.EasyExcel;

/**
 * @author hanson
 * @date 2024/5/23 14:41
 */
public class TestRead {

    public static void main(String[] args) {
        // 读取文件路径
        String fileName = "C:\\code\\project\\Hospital\\excel\\01.xlsx";

        // 调用方法实现读取操作
        EasyExcel.read(fileName, UserData.class,new ExcelListener()).sheet().doRead();
    }
}
