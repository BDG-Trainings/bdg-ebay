package com.bdg.bdgebay.repository.user;

import com.bdg.bdgebay.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author William Arustamyan
 */


public interface UserRepository extends CrudRepository<User, Long> {

    User findByIdAndDeletedIsNull(Long userId);
}































