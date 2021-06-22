package com.ec.MuseumAR;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020-H\u0014J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u00066"}, d2 = {"Lcom/ec/MuseumAR/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "db", "Lcom/ec/MuseumAR/data/DbDataProvider;", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "idNextOeuvre", "getIdNextOeuvre", "setIdNextOeuvre", "idParcours", "getIdParcours", "setIdParcours", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "mCameraView", "Landroid/widget/FrameLayout;", "getMCameraView", "()Landroid/widget/FrameLayout;", "setMCameraView", "(Landroid/widget/FrameLayout;)V", "mScannerView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "getMScannerView", "()Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "setMScannerView", "(Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V", "message", "Landroid/widget/TextView;", "getMessage", "()Landroid/widget/TextView;", "setMessage", "(Landroid/widget/TextView;)V", "handleResult", "", "result", "Lcom/google/zxing/Result;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "toInfos", "idOeuvre", "app_debug"})
public final class ScanActivity extends androidx.appcompat.app.AppCompatActivity implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    @org.jetbrains.annotations.NotNull()
    public me.dm7.barcodescanner.zxing.ZXingScannerView mScannerView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.FrameLayout mCameraView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView message;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String idParcours;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String idNextOeuvre;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String direction;
    private com.ec.MuseumAR.data.DbDataProvider db;
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final me.dm7.barcodescanner.zxing.ZXingScannerView getMScannerView() {
        return null;
    }
    
    public final void setMScannerView(@org.jetbrains.annotations.NotNull()
    me.dm7.barcodescanner.zxing.ZXingScannerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getMCameraView() {
        return null;
    }
    
    public final void setMCameraView(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdParcours() {
        return null;
    }
    
    public final void setIdParcours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdNextOeuvre() {
        return null;
    }
    
    public final void setIdNextOeuvre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDirection() {
        return null;
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    com.google.zxing.Result result) {
    }
    
    private final void toInfos(java.lang.String idOeuvre) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public ScanActivity() {
        super();
    }
}