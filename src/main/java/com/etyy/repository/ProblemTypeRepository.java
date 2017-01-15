package com.etyy.repository;

import com.etyy.entity.ProblemType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
public interface ProblemTypeRepository extends JpaRepository<ProblemType,Long> {
}
