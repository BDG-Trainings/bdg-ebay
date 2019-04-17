package com.bdg.bdgebay.controller.user;

import com.bdg.bdgebay.common.ApiResponse;
import com.bdg.bdgebay.common.UserTransferObject;
import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.service.user.UserNameExistException;
import com.bdg.bdgebay.service.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;

/**
 * @author William Arustamyan
 */


@RestController
public class UserController {

    private ModelMapper modelMapper;

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/user/create", method = RequestMethod.POST)
    public ApiResponse<UserTransferObject> createUser(@RequestBody UserCreationRequest creationRequest) {

        try {
            return new ApiResponse<>(modelMapper.map(userService.create(creationRequest), UserTransferObject.class), "Success", HttpStatus.CREATED);
        } catch (UserNameExistException ex) {
            return new ApiResponse<>(null, ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
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
