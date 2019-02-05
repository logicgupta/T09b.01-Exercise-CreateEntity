package com.example.android.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateTypeConvertor {

    @TypeConverter
    public static Date toDate(Long timestamp){
        return timestamp==null? null:new Date(timestamp);
    }
    @TypeConverter
    public static Long toTimestamp(Date date){
        return date==null? null:date.getTime();
    }
}
