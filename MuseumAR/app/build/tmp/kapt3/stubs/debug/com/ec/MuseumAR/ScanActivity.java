package com.ec.MuseumAR;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00063"}, d2 = {"Lcom/ec/MuseumAR/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "fleche", "Landroid/widget/ImageView;", "getFleche", "()Landroid/widget/ImageView;", "setFleche", "(Landroid/widget/ImageView;)V", "idNextOeuvre", "getIdNextOeuvre", "setIdNextOeuvre", "idParcours", "getIdParcours", "setIdParcours", "mCameraView", "Landroid/widget/FrameLayout;", "getMCameraView", "()Landroid/widget/FrameLayout;", "setMCameraView", "(Landroid/widget/FrameLayout;)V", "mScannerView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "getMScannerView", "()Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "setMScannerView", "(Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V", "message", "Landroid/widget/TextView;", "getMessage", "()Landroid/widget/TextView;", "setMessage", "(Landroid/widget/TextView;)V", "alerter", "", "s", "handleResult", "result", "Lcom/google/zxing/Result;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toInfos", "idOeuvre", "app_debug"})
public final class ScanActivity extends androidx.appcompat.app.AppCompatActivity implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    @org.jetbrains.annotations.NotNull()
    public me.dm7.barcodescanner.zxing.ZXingScannerView mScannerView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.FrameLayout mCameraView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView message;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView fleche;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String idParcours;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String idNextOeuvre;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String direction;
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
    public final android.widget.ImageView getFleche() {
        return null;
    }
    
    public final void setFleche(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    com.google.zxing.Result result) {
    }
    
    private final void alerter(java.lang.String s) {
    }
    
    private final void toInfos(java.lang.String idOeuvre) {
    }
    
    public ScanActivity() {
        super();
    }
}