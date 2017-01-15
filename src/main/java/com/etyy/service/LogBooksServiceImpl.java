package com.etyy.service;

import com.etyy.repository.LogBooksRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
@Service
public class LogBooksServiceImpl implements LogBooksService {
    @Resource
    LogBooksRepository logBooksRepository;
}
