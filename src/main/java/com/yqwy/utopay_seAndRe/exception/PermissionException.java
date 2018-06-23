package com.yqwy.utopay_seAndRe.exception;

/**
 * --------------------
 * Create
 * User: lile
 * Date: 2017/5/26
 * --------------------
 * Update
 * Info
 * --------------------
 */
public class PermissionException extends Exception {

    public PermissionException() {
        super();
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Exception e) {
        super(message, e);
    }

}
