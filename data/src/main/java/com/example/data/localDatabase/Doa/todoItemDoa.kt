package com.example.data.localDatabase.Doa

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.domain.models.TodoItem
import com.sun.xml.internal.bind.v2.TODO

@Dao
interface TodoItemDoa {

    @Query("SELECT * FROM item")
    fun getAll(): List<TodoItem>

    @Query("SELECT * FROM item where id IN (:todoIds)")
    fun getItem(id: String): TODO

    @Insert
    fun addItem(item: TodoItem)

    @Delete
    fun deleteItem(item: TodoItem)

}