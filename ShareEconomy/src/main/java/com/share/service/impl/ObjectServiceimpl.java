package com.share.service.impl;

import com.share.mapper.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weixin on 17-8-6.
 */
@Service
public class ObjectServiceimpl implements ObjectMapper {
    @Autowired
    private ObjectMapper objectMapper;
}
