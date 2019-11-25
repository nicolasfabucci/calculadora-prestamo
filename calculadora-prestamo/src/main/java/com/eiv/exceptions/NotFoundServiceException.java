package com.eiv.exceptions;

public class NotFoundServiceException extends ServiceException {

    private static final long serialVersionUID = -762417533833596020L;
    
    public NotFoundServiceException(String message, Object[] args) {
        super(message, args);
        // TODO Auto-generated constructor stub
    }


    public int getCode() {
        return ServiceException.SERVICE_EXEPTION_NOT_FOUND;
    }

}
