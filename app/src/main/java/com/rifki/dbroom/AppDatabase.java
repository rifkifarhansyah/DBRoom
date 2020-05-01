package com.rifki.dbroom;


import androidx.room.Database;
import androidx.room.RoomDatabase;
/*

30/04/2020
membuat keseluruhan program dan tampilan

nim   : 10117193
nama  : Rifki Farhansyah
kelas : if-5

 */
@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}