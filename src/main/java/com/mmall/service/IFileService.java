package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by liu_changshi on 2019/3/17.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
