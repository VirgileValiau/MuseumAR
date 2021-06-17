package com.ec.MuseumAR.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.ec.MuseumAR.data.model.Oeuvre.class, com.ec.MuseumAR.data.model.Parcours.class, com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/ec/MuseumAR/data/database/MuseumRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "oeuvreDao", "Lcom/ec/MuseumAR/data/database/OeuvreDao;", "parcoursDao", "Lcom/ec/MuseumAR/data/database/ParcoursDao;", "parcoursWithOeuvresDao", "Lcom/ec/MuseumAR/data/database/ParcoursWithOeuvresDao;", "app_debug"})
public abstract class MuseumRoomDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ec.MuseumAR.data.database.OeuvreDao oeuvreDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ec.MuseumAR.data.database.ParcoursDao parcoursDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ec.MuseumAR.data.database.ParcoursWithOeuvresDao parcoursWithOeuvresDao();
    
    public MuseumRoomDatabase() {
        super();
    }
}