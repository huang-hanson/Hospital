package com.hanson.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @author hanson
 * @date 2024/5/23 14:38
 */
public class ExcelListener extends AnalysisEventListener<UserData> {

    // 一行一行读取excel表内容，从第二行开始读取
    @Override
    public void invoke(UserData userData, AnalysisContext analysisContext) {
        System.out.println(userData);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息：" + headMap);
    }

    // 读取之后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
