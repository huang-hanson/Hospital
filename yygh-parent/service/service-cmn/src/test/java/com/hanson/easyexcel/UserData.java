package com.hanson.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author hanson
 * @date 2024/5/23 14:32
 */
@Data
public class UserData {

    @ExcelProperty(value = "用户编号", index = 0)
    private int uid;

    @ExcelProperty(value = "用户名称", index = 1)
    private String username;
}
