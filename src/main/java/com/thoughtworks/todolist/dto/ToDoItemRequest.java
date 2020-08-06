package com.thoughtworks.todolist.dto;

import com.thoughtworks.todolist.entity.ToDoItem;

public class ToDoItemRequest {

    private String content;
    private Boolean status;


    public static ToDoItem to(ToDoItemRequest toDoItemRequest) {
        return new ToDoItem(toDoItemRequest.getContent(), String.valueOf(toDoItemRequest.getStatus()));
    }

    public ToDoItemRequest() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
