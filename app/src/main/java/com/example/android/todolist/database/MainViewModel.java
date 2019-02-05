package com.example.android.todolist.database;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    LiveData<List<TaskEntry>> tasks;
    public MainViewModel(Application application) {
        super(application);

        tasks=AppDatabase.getsInstance(application).taskDao().loadAllTasks();

    }

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }
}
