package com.example.data.localDatabase.Database

import androidx.room.Database
import com.example.data.localDatabase.Doa.TodoItemDoa
import com.example.domain.models.TodoItem

@Database(entities = [TodoItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoItemDoa(): TodoItemDoa
}