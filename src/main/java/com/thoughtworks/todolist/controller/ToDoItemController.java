package com.thoughtworks.todolist.controller;

import com.thoughtworks.todolist.dto.ToDoItemRequest;
import com.thoughtworks.todolist.dto.ToDoItemResponse;
import com.thoughtworks.todolist.entity.ToDoItem;
import com.thoughtworks.todolist.service.ToDoItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todolist")
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ToDoItemResponse> getAllToDoItem() {
        return toDoItemService.getAllToDoItem();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDoItemResponse addToDoItem(@RequestBody ToDoItemRequest toDoItemRequest){
        return toDoItemService.addToDoItem(toDoItemRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteToDoItem(@PathVariable Integer id){
        toDoItemService.deleteToDoItem(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ToDoItemResponse updateToDoItem(@PathVariable Integer id ,@RequestBody ToDoItemRequest toDoItemRequest){
        return toDoItemService.updateToDoItem(id,toDoItemRequest);
    }
}
