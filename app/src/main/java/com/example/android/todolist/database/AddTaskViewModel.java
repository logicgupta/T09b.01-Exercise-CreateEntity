package com.example.android.todolist.database;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> tasks;


    public AddTaskViewModel(AppDatabase appDatabase,int taskId) {

        appDatabase.taskDao().loadTaskByID(taskId);
    }

    public LiveData<TaskEntry> getTasks(){
        return tasks;
    }

}
