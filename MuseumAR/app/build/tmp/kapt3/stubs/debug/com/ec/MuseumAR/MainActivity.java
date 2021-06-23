package com.ec.MuseumAR;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\u000bH\u0002J\u0012\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0010H\u0016J-\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00052\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0.2\u0006\u0010/\u001a\u000200H\u0016\u00a2\u0006\u0002\u00101J\u0015\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020 H\u0014J\b\u00106\u001a\u00020 H\u0014J\b\u00107\u001a\u00020 H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020#H\u0002J\u000e\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006="}, d2 = {"Lcom/ec/MuseumAR/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ec/MuseumAR/data/adapters/ParcoursAdapter$ActionListener;", "()V", "RecordAudioRequestCode", "", "getRecordAudioRequestCode", "()I", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "adapter", "Lcom/ec/MuseumAR/data/adapters/ParcoursAdapter;", "getAdapter", "()Lcom/ec/MuseumAR/data/adapters/ParcoursAdapter;", "dataSet", "", "Lcom/ec/MuseumAR/data/model/Parcours;", "getDataSet", "()Ljava/util/List;", "setDataSet", "(Ljava/util/List;)V", "db", "Lcom/ec/MuseumAR/data/DbDataProvider;", "dks", "Lgithub/com/vikramezhil/dks/speech/Dks;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "DKSCreation", "", "alerter", "s", "", "checkPermission", "newAdapter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "parcours", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResult", "STATE", "(Ljava/lang/Integer;)V", "onResume", "onStop", "refresh", "toScan", "idParcours", "traitementResult", "speechResult", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.ec.MuseumAR.data.adapters.ParcoursAdapter.ActionListener {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.ec.MuseumAR.data.model.Parcours> dataSet;
    @org.jetbrains.annotations.NotNull()
    private final com.ec.MuseumAR.data.adapters.ParcoursAdapter adapter = null;
    private com.ec.MuseumAR.data.DbDataProvider db;
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private github.com.vikramezhil.dks.speech.Dks dks;
    private final int RecordAudioRequestCode = 1;
    private static final int CHOIX_PARCOURS_1 = 1;
    private static final int CHOIX_PARCOURS_2 = 2;
    private static final int CHOIX_PARCOURS_3 = 3;
    private static final int CHOIX_PARCOURS_4 = 4;
    private static final int CHOIX_PARCOURS_5 = 5;
    private static final int CHOIX_PARCOURS_6 = 6;
    private static final int GO_NEXT_OEUVRE = 100;
    private static final int PRECISION_OEUVRE = 101;
    private static final int NO_CORREESPONDANCE = 404;
    public static final com.ec.MuseumAR.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ec.MuseumAR.data.model.Parcours> getDataSet() {
        return null;
    }
    
    public final void setDataSet(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ec.MuseumAR.data.model.Parcours> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ec.MuseumAR.data.adapters.ParcoursAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    public final int getRecordAudioRequestCode() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void DKSCreation() {
    }
    
    private final void toScan(java.lang.String idParcours) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void alerter(java.lang.String s) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void refresh() {
    }
    
    public final void traitementResult(@org.jetbrains.annotations.NotNull()
    java.lang.String speechResult) {
    }
    
    private final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void onResult(@org.jetbrains.annotations.Nullable()
    java.lang.Integer STATE) {
    }
    
    private final com.ec.MuseumAR.data.adapters.ParcoursAdapter newAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.ec.MuseumAR.data.model.Parcours parcours) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/ec/MuseumAR/MainActivity$Companion;", "", "()V", "CHOIX_PARCOURS_1", "", "getCHOIX_PARCOURS_1", "()I", "CHOIX_PARCOURS_2", "getCHOIX_PARCOURS_2", "CHOIX_PARCOURS_3", "getCHOIX_PARCOURS_3", "CHOIX_PARCOURS_4", "getCHOIX_PARCOURS_4", "CHOIX_PARCOURS_5", "getCHOIX_PARCOURS_5", "CHOIX_PARCOURS_6", "getCHOIX_PARCOURS_6", "GO_NEXT_OEUVRE", "getGO_NEXT_OEUVRE", "NO_CORREESPONDANCE", "getNO_CORREESPONDANCE", "PRECISION_OEUVRE", "getPRECISION_OEUVRE", "app_debug"})
    public static final class Companion {
        
        public final int getCHOIX_PARCOURS_1() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_2() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_3() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_4() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_5() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_6() {
            return 0;
        }
        
        public final int getGO_NEXT_OEUVRE() {
            return 0;
        }
        
        public final int getPRECISION_OEUVRE() {
            return 0;
        }
        
        public final int getNO_CORREESPONDANCE() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}