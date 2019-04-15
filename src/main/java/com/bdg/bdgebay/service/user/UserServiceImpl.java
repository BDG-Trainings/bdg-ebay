package com.bdg.bdgebay.service.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.Optional;


/**
 * @author William Arustamyan
 */
@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public User get(final Long userId) {
        return userRepository.findByIdAndDeletedIsNull(userId);
    }

    @Transactional
    @Override
    public User create(final UserCreationRequest creationRequest) {
        final User found = userRepository.findByUserName(creationRequest.getUserName());

        if (found != null) {
            throw new UserNameExistException(creationRequest.getUserName());
        }

        final User user = new User();
        user.setPassword(creationRequest.getPassword());
        user.setUserName(creationRequest.getUserName());
        user.setLastName(creationRequest.getLastName());
        user.setFirstName(creationRequest.getFirstName());
        user.setEmailAddress(creationRequest.getEmailAddress());
        User savedInstance = userRepository.save(user);
        entityManager.flush();
        return savedInstance;
    }

    @Transactional
    @Override
    public User delete(Long userId) {
        User found = userRepository.findByIdAndDeletedIsNull(userId);
        if (found != null) {
            found.setDeleted(LocalDateTime.now());
            return userRepository.save(found);
        }
        return null;
    }

    @Transactional
    @Override
    public User update(UserUpdateRequest updateRequest) {
        Optional<User> byId = userRepository.findById(updateRequest.getUserId());
        if (byId.isPresent()) {
            User user = byId.get();
            user.setUserName(updateRequest.getUserName());
            user.setPassword(updateRequest.getPassword());
            return userRepository.save(user);
        }

        return null;
    }

    @Autowired
    public void setUserRepository(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
