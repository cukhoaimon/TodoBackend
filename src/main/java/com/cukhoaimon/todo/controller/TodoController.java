package com.cukhoaimon.todo.controller;

import com.cukhoaimon.todo.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class TodoController {
    // Demo profile. We should use DB instead
    List<Task> taskList = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String index() {
        return "index"; // return file "index.html"
    }

    @GetMapping("/taskList")
    public String index(
            Model model,
            @RequestParam(value="limit", required = false) Integer limit
    ) {
      model.addAttribute("taskList", limit != null ? taskList.subList(0, limit) : taskList);

      return "taskList";
    }

    @GetMapping("/addTask")
    public String addTask(Model model) {
        model.addAttribute("task", new Task());

        return "addTask";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute Task task) {
        taskList.add(task);

        return "index";
    }

}
