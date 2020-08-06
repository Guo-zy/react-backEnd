package com.thoughtworks.todolist.repository;

import com.thoughtworks.todolist.entity.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoItemRepository extends JpaRepository<ToDoItem, Integer> {

}
