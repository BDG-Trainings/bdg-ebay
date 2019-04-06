package com.bdg.bdgebay.service.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

/**
 * @author William Arustamyan
 */
@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

//    @PersistenceContext
//    private EntityManager entityManager;

    @Override
    public User get(final Long userId) {
        return userRepository.findByIdAndDeletedIsNull(userId);
    }

    @Override
    public User create(final UserCreationRequest creationRequest) {
        final User user = new User();
        user.setCreated(LocalDateTime.now());
        user.setPassword(creationRequest.getPassword());
        user.setUserName(creationRequest.getUserName());
        user.setLastName(creationRequest.getLastName());
        user.setFirstName(creationRequest.getFirstName());
        user.setEmailAddress(creationRequest.getEmailAddress());
        return user;
    }

    @Override
    public User delete(Long userId) {
        //Implement this (use userRepository)

        return null;
    }

    @Override
    public User update(UserUpdateRequest updateRequest) {

        //Implement this (at first need to get user from db after do save)
        return null;
    }

//    @Autowired
//    public void setUserRepository(final UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
}
