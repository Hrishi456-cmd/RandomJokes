package com.geek.Restaurant.Model.repository;

import Geekster.Restaurant.models.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {
    
    private final List<Todo> todoList;
    
    public TodoDao()
    {
        todoList =  new ArrayList<>() ;
        todoList.add(new Todo("0","Dummy ToDo for Testing",true)) ;

    }

    public List<Todo> getTodosFromDataSources()
    {
        return todoList;
    }

    public boolean save (Todo todo){
todoList.add(todo);
return true;
    }

    public boolean remove(Todo todo)
    {
        todoList.remove(todo);
        return true;
    }

    public boolean update (String id,boolean status)
    {
       boolean updateStatus = false;
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {

               remove(todo);

               todo.setTodoStatus(status);

              save(todo);

              return true;
            }
        }
        return false;
    }
}
