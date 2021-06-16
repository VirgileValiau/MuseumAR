package com.ec.MuseumAR.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/ec/MuseumAR/data/DbDataProvider;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "oeuvresDao", "Lcom/ec/MuseumAR/data/database/OeuvreDao;", "parcoursDao", "Lcom/ec/MuseumAR/data/database/ParcoursDao;", "parcoursWithOeuvresDao", "Lcom/ec/MuseumAR/data/database/ParcoursWithOeuvresDao;", "roomDatabase", "Lcom/ec/MuseumAR/data/database/MuseumRoomDatabase;", "addNewOeuvre", "", "newOeuvre", "Lcom/ec/MuseumAR/data/model/Oeuvre;", "(Lcom/ec/MuseumAR/data/model/Oeuvre;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewParcours", "newParcours", "Lcom/ec/MuseumAR/data/model/Parcours;", "(Lcom/ec/MuseumAR/data/model/Parcours;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOeuvres", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllParcours", "", "getAllParcoursWithOeuvres", "Lcom/ec/MuseumAR/data/model/ParcoursWithOeuvres;", "getOeuvreById", "oeuvreId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParcoursById", "parcoursId", "getParcoursWithOeuvresById", "app_debug"})
public final class DbDataProvider {
    private final com.ec.MuseumAR.data.database.MuseumRoomDatabase roomDatabase = null;
    private final com.ec.MuseumAR.data.database.OeuvreDao oeuvresDao = null;
    private final com.ec.MuseumAR.data.database.ParcoursDao parcoursDao = null;
    private final com.ec.MuseumAR.data.database.ParcoursWithOeuvresDao parcoursWithOeuvresDao = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOeuvres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ec.MuseumAR.data.model.Oeuvre>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOeuvreById(long oeuvreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ec.MuseumAR.data.model.Oeuvre> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addNewOeuvre(@org.jetbrains.annotations.NotNull()
    com.ec.MuseumAR.data.model.Oeuvre newOeuvre, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllParcours(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ec.MuseumAR.data.model.Parcours>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getParcoursById(long parcoursId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ec.MuseumAR.data.model.Parcours> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addNewParcours(@org.jetbrains.annotations.NotNull()
    com.ec.MuseumAR.data.model.Parcours newParcours, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllParcoursWithOeuvres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ec.MuseumAR.data.model.ParcoursWithOeuvres>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getParcoursWithOeuvresById(long parcoursId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ec.MuseumAR.data.model.ParcoursWithOeuvres> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public DbDataProvider(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}