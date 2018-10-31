package com.mares.ticketer.com.mares.ticketer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author <a href="mailto:maresjan694@gmail.com">Jan Mares</a>, 31.10.2018
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
}
