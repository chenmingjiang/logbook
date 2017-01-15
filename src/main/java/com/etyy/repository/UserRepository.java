package com.etyy.repository;

import com.etyy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
