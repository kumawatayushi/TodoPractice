package com.todo.apptodo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class todoRepository {
    private Integer idcouInteger = 0;
private List<TodoItem> todoitems = new ArrayList<>();
public List<TodoItem> fetchALLTodoItems(){
if(todoitems.size() == 0){
       TodoItem item1 = new TodoItem();

            item1.setIsdone(false);
            item1.setId(idcouInteger++);
            item1.setTask("TASK #1");
            todoitems.add(item1);

        }
 return todoitems;
 }
 public TodoItem save(TodoItem todoItem) {

    return todoItem;

}

}
