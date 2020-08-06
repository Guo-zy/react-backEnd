package com.thoughtworks.todolist.dto;

import com.thoughtworks.todolist.entity.ToDoItem;

public class ToDoItemResponse {

    private Integer id;
    private String content;
    private Boolean status;


    public static ToDoItemResponse to(ToDoItem toDoItem) {
        return new ToDoItemResponse(toDoItem.getId(), toDoItem.getContent(), Boolean.valueOf(toDoItem.getStatus()));
    }

    public ToDoItemResponse() {
    }

    public ToDoItemResponse(Integer id, String content, Boolean status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
