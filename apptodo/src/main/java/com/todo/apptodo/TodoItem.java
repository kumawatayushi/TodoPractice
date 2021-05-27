package com.todo.apptodo;

public class TodoItem {
    private Integer id;
     private String task;
    private Boolean isdone;
     public Integer getId() {

        return this.id;

    }
    public void setId(Integer id) {

        this.id = id;

    }
      public String getTask() {

        return this.task;

    }
     public void setTask(String task) {

        this.task = task;

    }
     public Boolean isIsdone() {

        return this.isdone;

    }
    public Boolean getIsdone() {

        return this.isdone;

    }
    public void setIsdone(Boolean isdone) {

        this.isdone = isdone;

    }
    public void add(TodoItem todoItem) {
    }


}
