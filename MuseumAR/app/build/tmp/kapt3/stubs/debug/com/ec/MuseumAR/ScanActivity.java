package com.ec.MuseumAR;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/ec/MuseumAR/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "mCameraView", "Landroid/widget/FrameLayout;", "getMCameraView", "()Landroid/widget/FrameLayout;", "setMCameraView", "(Landroid/widget/FrameLayout;)V", "mScannerView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "getMScannerView", "()Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "setMScannerView", "(Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V", "message", "Landroid/widget/TextView;", "getMessage", "()Landroid/widget/TextView;", "setMessage", "(Landroid/widget/TextView;)V", "handleResult", "", "result", "Lcom/google/zxing/Result;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "toInfos", "idOeuvre", "", "app_debug"})
public final class ScanActivity extends androidx.appcompat.app.AppCompatActivity implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    @org.jetbrains.annotations.NotNull()
    public me.dm7.barcodescanner.zxing.ZXingScannerView mScannerView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.FrameLayout mCameraView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView message;
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