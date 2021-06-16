package github.com.vikramezhil.dks.view.alert;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lgithub/com/vikramezhil/dks/view/alert/DksFullScreenDialogListener;", "", "onClose", "", "onMicrophonePermissionStatus", "statusGiven", "", "restartSpeechOps", "onPause", "onResume", "onRetry", "onSuccess", "result", "", "dks_debug"})
public abstract interface DksFullScreenDialogListener {
    
    /**
     * Sends an update when positive button is clicked
     * @param result String The result
     */
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String result);
    
    /**
     * Sends an update when neutral button is clicked
     */
    public abstract void onRetry();
    
    /**
     * Sends an update when negative button is clicked
     */
    public abstract void onClose();
    
    /**
     * Sends an update when the progress view is paused
     */
    public abstract void onPause();
    
    /**
     * Sends an update when the progress view is resumed
     */
    public abstract void onResume();
    
    /**
     * Sends an update on the microphone permission status
     * @param statusGiven Boolean The microphone permission given status
     * @param restartSpeechOps Boolean The restart speech operations status
     */
    public abstract void onMicrophonePermissionStatus(boolean statusGiven, boolean restartSpeechOps);
}