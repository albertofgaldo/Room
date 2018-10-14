package com.example.android.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.provider.ContactsContract;

import com.example.android.data.model.DataItem;

import java.util.List;

@Dao
public abstract interface DataItemDao {

    //inserta todos los elementos de una lista
    @Insert
    void insertAll(List<DataItem> items);

    //inserta uno o más elementos
    @Insert
    void insertItems(DataItem... items);

    @Query("SELECT COUNT(*) from dataitem")
    int countItems();
}
