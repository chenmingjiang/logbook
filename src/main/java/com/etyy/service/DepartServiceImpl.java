package com.etyy.service;

import com.etyy.repository.DepartRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
@Service
public class DepartServiceImpl implements DepartService {
    @Resource
    DepartRepository departRepository;
}
