package com.bdg.bdgebay.controller.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.service.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author William Arustamyan
 */


@RestController
public class UserController {

    private ModelMapper modelMapper;

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/user/create", method = RequestMethod.POST)
    public User createUser(@RequestBody UserCreationRequest creationRequest) {
        return userService.create(creationRequest);
    }

    @RequestMapping(path = "/user/delete/{userId}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable("userId") Long userId) {
        return userService.delete(userId);
    }

    @RequestMapping(path = "/user/update", method = RequestMethod.POST)
    public User updateUser(@RequestBody UserUpdateRequest updateRequest) {
        return userService.update(updateRequest);
    }

    @Autowired
    public void setModelMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
