package com.dongyun.microservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fqye2 on 2018/9/19.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
