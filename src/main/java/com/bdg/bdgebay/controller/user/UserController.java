package com.bdg.bdgebay.controller.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.service.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


    @Autowired
    public void setModelMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
