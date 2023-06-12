package com.cukhoaimon.webbackend.controller;

import com.cukhoaimon.webbackend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cukhoaimon.webbackend.data.ToDo;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public  List<ToDo> getAllTask() {
        return toDoService.getAllTask();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id) {
        return toDoService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody ToDo toDo) {
        toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody ToDo toDo){
        toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        toDoService.deleteById(id);
    }
}
