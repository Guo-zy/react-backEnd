package com.thoughtworks.todolist.advice;

import com.thoughtworks.todolist.excetion.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class HandleGlobalException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public @ResponseBody
    String notFoundException(NotFoundException notFoundException) {
            return notFoundException.getMessage();
    }
}
