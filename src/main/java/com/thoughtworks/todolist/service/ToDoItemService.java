package com.thoughtworks.todolist.service;

import com.thoughtworks.todolist.dto.ToDoItemRequest;
import com.thoughtworks.todolist.dto.ToDoItemResponse;
import com.thoughtworks.todolist.entity.ToDoItem;

import java.util.List;

public interface ToDoItemService {

        List<ToDoItemResponse> getAllToDoItem();

        ToDoItemResponse addToDoItem(ToDoItemRequest toDoItemRequest);

        void deleteToDoItem(Integer id);

        ToDoItemResponse updateToDoItem(Integer id , ToDoItemRequest toDoItemRequest);

        ToDoItem getToDoItemById(Integer id);



}
