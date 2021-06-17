package com.ec.MuseumAR.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ec/MuseumAR/data/database/ParcoursDao;", "", "addNewParcours", "", "newParcours", "Lcom/ec/MuseumAR/data/model/Parcours;", "(Lcom/ec/MuseumAR/data/model/Parcours;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllParcours", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParcoursById", "parcoursId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ParcoursDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM parcours")
    public abstract java.lang.Object getAllParcours(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ec.MuseumAR.data.model.Parcours>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM parcours WHERE parcoursId = :parcoursId")
    public abstract java.lang.Object getParcoursById(long parcoursId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ec.MuseumAR.data.model.Parcours> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addNewParcours(@org.jetbrains.annotations.NotNull()
    com.ec.MuseumAR.data.model.Parcours newParcours, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}