package com.thoughtworks.todolist.excetion;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super("not found");
    }

}
