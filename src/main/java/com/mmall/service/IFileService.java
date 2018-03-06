package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 53254 on 2018/2/2 19:26 /mmal
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
