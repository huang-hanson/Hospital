package com.hanson.yygh.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author hanson
 * @date 2024/5/29 1:18
 */
public interface FileService {
    //上传文件到阿里云oss
    String upload(MultipartFile file);
}
