package com.etyy.service;

import com.etyy.repository.ProblemItemRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
@Service
public class ProblemItemServiceImpl implements ProblemItemService {
    @Resource
    ProblemItemRepository problemItemRepository;
}
