package com.example.android.todolist.database;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    AppDatabase appDatabase;
    private int mTaskId;

    public AddTaskViewModelFactory(AppDatabase appDatabase, int mTaskId) {
        this.appDatabase = appDatabase;
        this.mTaskId = mTaskId;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return  (T) new AddTaskViewModel(appDatabase,mTaskId);
    }
}
