package com.todo.apptodo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class todoController {
@Autowired
private TodoService todoService;

    
@GetMapping(value="/api/todoItems")
public ResponseEntity<?> fetchALLTodoItems(){
List<TodoItem> todoitems=todoService.fetchALLTodoItems();

return ResponseEntity.ok(todoitems);

    }
@PostMapping("/api/todoItems")

    public ResponseEntity<?> createNewTodoItem(){

        TodoItem todoItem = todoService.createTodoItem();
        

        return ResponseEntity.ok(todoItem);

    }

 @PutMapping("/api/todoItems/{id}")

    public ResponseEntity<?> updateTodoItem(@PathVariable Integer id,@RequestBody TodoItem todoItem)
    {
        TodoItem updatedTodoItem=todoService.updateTodoItem(id, todoItem);
        return ResponseEntity.ok(updatedTodoItem);
    }

}


