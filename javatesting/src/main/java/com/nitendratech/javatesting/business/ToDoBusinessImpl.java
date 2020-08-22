package com.nitendratech.javatesting.business;

import com.nitendratech.javatesting.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author nitendratech on 8/18/20
 */

/**
 * ToDoBusinessImpl is System Under Test
 *
 * TodoService is Dependency
 */
public class ToDoBusinessImpl {

    private TodoService todoService;



    public ToDoBusinessImpl(TodoService todoService){
        this.todoService = todoService;
    }


    public List<String> retrieveTodosRelatedToSpring(String user){

        List<String> filteredTods = new ArrayList<String>();

        List<String> toDosList = todoService.retrieveToDos(user);

        // Add Items to the ToDo List
        for (String todoItems: toDosList){
            if(todoItems.contains("Spring")){
                filteredTods.add(todoItems);
            }
        }
        return filteredTods;
    }
}
