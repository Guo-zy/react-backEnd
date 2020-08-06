package com.thoughtworks.todolist.service;


import com.thoughtworks.todolist.dto.ToDoItemRequest;
import com.thoughtworks.todolist.dto.ToDoItemResponse;
import com.thoughtworks.todolist.entity.ToDoItem;
import com.thoughtworks.todolist.excetion.NotFoundException;
import com.thoughtworks.todolist.repository.ToDoItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    private final ToDoItemRepository toDoItemRepository;

    public ToDoItemServiceImpl(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    @Override
    public List<ToDoItemResponse> getAllToDoItem() {
        List<ToDoItem> toDoItems = toDoItemRepository.findAll();
        List<ToDoItemResponse> toDoItemResponses = new ArrayList<>();
        toDoItems.stream().forEach(todoItem -> {
            toDoItemResponses.add(new ToDoItemResponse(todoItem.getId(), todoItem.getContent(), Boolean.valueOf(todoItem.getStatus())));
        });
        return toDoItemResponses;
    }

    @Override
    public ToDoItemResponse addToDoItem(ToDoItemRequest toDoItemRequest) {

        ToDoItem toDoItem =ToDoItemRequest.to(toDoItemRequest) ;
        return  ToDoItemResponse.to(toDoItemRepository.save(toDoItem));

    }

    @Override
    public void deleteToDoItem(Integer id) {
        getToDoItemById(id);
        toDoItemRepository.deleteById(id);
    }

    @Override
    public ToDoItemResponse updateToDoItem(Integer id, ToDoItemRequest toDoItemRequest) {
        getToDoItemById(id);
        ToDoItem toDoItem = ToDoItemRequest.to(toDoItemRequest);
        toDoItem.setId(id);
        return ToDoItemResponse.to(toDoItemRepository.save(toDoItem));
    }

    @Override
    public ToDoItem getToDoItemById(Integer id) {
        return toDoItemRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
