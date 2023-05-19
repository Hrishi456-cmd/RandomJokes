package com.geek.Restaurant.Model.services;

import Geekster.Restaurant.models.Todo;
import Geekster.Restaurant.repository.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoDao todoDao;

    public List<Todo> getAllTodos() {
        return todoDao.getTodosFromDataSources();
    }

    public String addMyTodo(Todo todo) {
        boolean insertionStatus = todoDao.save(todo);
        if (insertionStatus) {
            return " Todo added successfullly";
        } else {

            return "Failed..Not possible";
        }
    }

    public Todo getTodoBaseOnId(String id) {
        List<Todo> todoListRightNow = todoDao.getTodosFromDataSources();
        for (Todo todo : todoListRightNow) {
            if (todo.getId().equals(id)) {
                return todo;
            }
        }
        return null;
    }

    public String removeTodoById(String id) {
        boolean deleteResponse = false;
        String status;
        if (id != null) {
            List<Todo> todoListRightNow = todoDao.getTodosFromDataSources();
            for (Todo todo : todoListRightNow) {
                if (todo.getId().equals(id)) {
                    deleteResponse = todoDao.remove(todo);
                    if (deleteResponse) {
                        status = "Todo with id " + id + " was deleted";
                    } else {
                        status = "Todo with id " + id + " was not deleted";
                    }
                    return status;
                }
            }

            return "Todo with id " + id + " was not exist";

        } else {
            return "Invalid Id cannot accept";
        }
    }

    public String updateTodoStatusById(String id, String status) {
        boolean updateStatus =  todoDao.update(id, Boolean.parseBoolean(status));

        if (updateStatus)
        {
            return "Todo with id " + id + " was updated";
        }else {
            return "Todo with id " + id + " was not updated";
        }
    }
}
