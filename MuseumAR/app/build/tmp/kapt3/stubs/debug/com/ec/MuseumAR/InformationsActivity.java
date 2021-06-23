package com.ec.MuseumAR;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J-\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0#2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&J\u0015\u0010\'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006."}, d2 = {"Lcom/ec/MuseumAR/InformationsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "RecordAudioRequestCode", "", "getRecordAudioRequestCode", "()I", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "db", "Lcom/ec/MuseumAR/data/DbDataProvider;", "dks", "Lgithub/com/vikramezhil/dks/speech/Dks;", "idOeuvre", "", "idParcours", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "AfficherContenuOeuvre", "", "id", "DKSCreation", "alerter", "s", "checkPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResult", "STATE", "(Ljava/lang/Integer;)V", "toScan", "traitementResultInfo", "speechResult", "Companion", "app_debug"})
public final class InformationsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ec.MuseumAR.data.DbDataProvider db;
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    private github.com.vikramezhil.dks.speech.Dks dks;
    private final int RecordAudioRequestCode = 1;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private java.lang.String idParcours;
    private java.lang.String idOeuvre;
    private static final int CHOIX_PARCOURS_1 = 1;
    private static final int CHOIX_PARCOURS_2 = 2;
    private static final int GO_NEXT_OEUVRE = 100;
    private static final int PRECISION_OEUVRE = 101;
    private static final int NO_CORREESPONDANCE = 404;
    public static final com.ec.MuseumAR.InformationsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getRecordAudioRequestCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void AfficherContenuOeuvre(java.lang.String id) {
    }
    
    private final void alerter(java.lang.String s) {
    }
    
    private final void toScan(java.lang.String idParcours) {
    }
    
    private final void DKSCreation() {
    }
    
    public final void traitementResultInfo(@org.jetbrains.annotations.NotNull()
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
    
    public InformationsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/ec/MuseumAR/InformationsActivity$Companion;", "", "()V", "CHOIX_PARCOURS_1", "", "getCHOIX_PARCOURS_1", "()I", "CHOIX_PARCOURS_2", "getCHOIX_PARCOURS_2", "GO_NEXT_OEUVRE", "getGO_NEXT_OEUVRE", "NO_CORREESPONDANCE", "getNO_CORREESPONDANCE", "PRECISION_OEUVRE", "getPRECISION_OEUVRE", "app_debug"})
    public static final class Companion {
        
        public final int getCHOIX_PARCOURS_1() {
            return 0;
        }
        
        public final int getCHOIX_PARCOURS_2() {
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