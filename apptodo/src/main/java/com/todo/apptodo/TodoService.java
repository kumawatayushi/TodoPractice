package com.todo.apptodo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
@Autowired
private todoRepository todoRepository;
public List<TodoItem> fetchALLTodoItems(){
 return todoRepository.fetchALLTodoItems();
    }
public  TodoItem updateTodoItem(Integer id, TodoItem todoItem) {
Optional<TodoItem> todoOpt = todoRepository.fetchALLTodoItems()
  
.stream()
  
.filter(item -> item.getId().equals(id))
.findAny();
if(todoOpt.isPresent()){
TodoItem item=todoOpt.get();
item.setIsdone(todoItem.getIsdone());
  
item.setTask(todoItem.getTask());
  
return item;
   }                               
  return null;
  
      }
  
  
public TodoItem createTodoItem() {
  TodoItem todoItem =new TodoItem();
  
todoItem.setIsdone(false);
  
    todoItem=todoRepository.save(todoItem);
  
         todoItem.setTask("Task #" +todoItem.getId());
  
         return todoItem;
  
      }
   public TodoItem save (TodoItem todoItem, int idcouInteger){
   todoItem.setId(idcouInteger++); 
   todoItem.add(todoItem);
  
          return todoItem;
  
      }
  
  }


