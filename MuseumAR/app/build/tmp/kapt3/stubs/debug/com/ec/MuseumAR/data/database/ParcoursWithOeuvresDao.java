package com.ec.MuseumAR.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/ec/MuseumAR/data/database/ParcoursWithOeuvresDao;", "", "getAllParcoursWithOeuvres", "", "Lcom/ec/MuseumAR/data/model/ParcoursWithOeuvres;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParcoursWithOeuvresById", "parcoursId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ParcoursWithOeuvresDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM parcours")
    @androidx.room.Transaction()
    public abstract java.lang.Object getAllParcoursWithOeuvres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ec.MuseumAR.data.model.ParcoursWithOeuvres>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM parcours WHERE parcoursId = :parcoursId")
    @androidx.room.Transaction()
    public abstract java.lang.Object getParcoursWithOeuvresById(long parcoursId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ec.MuseumAR.data.model.ParcoursWithOeuvres> p1);
}