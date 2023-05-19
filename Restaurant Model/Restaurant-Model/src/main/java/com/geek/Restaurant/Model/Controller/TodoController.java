package com.geek.Restaurant.Model.Controller;

import Geekster.Restaurant.models.Todo;
import Geekster.Restaurant.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
@Autowired
      TodoService todoService;

//get me all the toDoes in my list;

    @GetMapping(value = "/getAllTodos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @PostMapping(value = "/addTodo")

    public String addTodo(@RequestBody Todo todo){
return todoService.addMyTodo(todo);
    }

    @RequestMapping(value = "/getTodoById/{id}",method = RequestMethod.GET)
    public Todo getTodoById(@PathVariable String id)
    {
return todoService.getTodoBaseOnId(id);
    }

    @DeleteMapping(value = "/deleteTodoById/{id}")

    public String deleteTodoById(@PathVariable String id)
    {
        return todoService.removeTodoById(id);
    }

    @PutMapping(value = "/updateTodoById/{id}/{status}")

    public String updateTodoStatusById(@PathVariable String id,@PathVariable String status)
    {
        return todoService.updateTodoStatusById(id,status);
    }

}
