package com.bdg.bdgebay.service.user;

/**
 * @author William Arustamyan
 */

public class UserNameExistException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Username %s already exist...";
    final private String userName;

    public UserNameExistException(final String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return String.format(DEFAULT_MESSAGE, this.userName);
    }
}
