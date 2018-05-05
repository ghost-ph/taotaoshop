package com.taotao.service;


import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by luxiaoxiao on 2018/4/19
 */
public interface PictureService {
    Map uploadPicture(MultipartFile uploadFile);
}
