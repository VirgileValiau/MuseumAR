package github.com.vikramezhil.dks.speech;

import java.lang.System;

/**
 * Droid Kotlin Speech
 * @author vikramezhil
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010q\u001a\u00020rH\u0014J\b\u0010s\u001a\u00020rH\u0016J\b\u0010\u001e\u001a\u00020rH\u0016J\u0010\u0010t\u001a\u00020r2\u0006\u0010u\u001a\u00020vH\u0016J\u0010\u0010w\u001a\u00020r2\u0006\u0010w\u001a\u00020\u0010H\u0014J\u0010\u0010x\u001a\u00020r2\u0006\u0010y\u001a\u00020\u0010H\u0014J\b\u0010z\u001a\u00020rH\u0016J\u0010\u0010{\u001a\u00020r2\u0006\u0010u\u001a\u00020vH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000204X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R\u001a\u0010B\u001a\u00020CX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u000204X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\u001a\u0010K\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010!\"\u0004\bP\u0010#R\u001a\u0010Q\u001a\u00020CX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR\u001a\u0010T\u001a\u00020\u0010X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0012\"\u0004\bV\u0010\u0014R \u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u001fX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010!\"\u0004\bZ\u0010#R\u001a\u0010[\u001a\u00020.X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00100\"\u0004\b]\u00102R \u0010^\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010!\"\u0004\b`\u0010#R\u001c\u0010a\u001a\u0004\u0018\u00010bX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR \u0010g\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010!\"\u0004\bi\u0010#R.\u0010j\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010kj\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`lX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p\u00a8\u0006|"}, d2 = {"Lgithub/com/vikramezhil/dks/speech/Dks;", "Lgithub/com/vikramezhil/dks/speech/DksEngine;", "app", "Landroid/app/Application;", "manager", "Landroidx/fragment/app/FragmentManager;", "listener", "Lgithub/com/vikramezhil/dks/speech/DksListener;", "(Landroid/app/Application;Landroidx/fragment/app/FragmentManager;Lgithub/com/vikramezhil/dks/speech/DksListener;)V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "closedByUser", "", "getClosedByUser", "()Z", "setClosedByUser", "(Z)V", "continuousSpeechRecognition", "getContinuousSpeechRecognition", "setContinuousSpeechRecognition", "currentSpeechLanguage", "", "getCurrentSpeechLanguage", "()Ljava/lang/String;", "setCurrentSpeechLanguage", "(Ljava/lang/String;)V", "ejectProgressView", "Landroidx/lifecycle/MutableLiveData;", "getEjectProgressView", "()Landroidx/lifecycle/MutableLiveData;", "setEjectProgressView", "(Landroidx/lifecycle/MutableLiveData;)V", "finalSpeechResultFound", "getFinalSpeechResultFound", "setFinalSpeechResultFound", "injectedProgressView", "Ljava/lang/Runnable;", "getInjectedProgressView", "()Ljava/lang/Runnable;", "setInjectedProgressView", "(Ljava/lang/Runnable;)V", "languageDetailsIntent", "Landroid/content/Intent;", "getLanguageDetailsIntent", "()Landroid/content/Intent;", "setLanguageDetailsIntent", "(Landroid/content/Intent;)V", "listeningTime", "", "getListeningTime", "()J", "setListeningTime", "(J)V", "onReadyForSpeech", "getOnReadyForSpeech", "setOnReadyForSpeech", "oneStepResultVerify", "getOneStepResultVerify", "setOneStepResultVerify", "partialRestartActive", "getPartialRestartActive", "setPartialRestartActive", "partialResultSpeechHandler", "Landroid/os/Handler;", "getPartialResultSpeechHandler", "()Landroid/os/Handler;", "setPartialResultSpeechHandler", "(Landroid/os/Handler;)V", "pauseAndSpeakTime", "getPauseAndSpeakTime", "setPauseAndSpeakTime", "progressViewInactive", "getProgressViewInactive", "setProgressViewInactive", "resetActionButtons", "getResetActionButtons", "setResetActionButtons", "restartSpeechHandler", "getRestartSpeechHandler", "setRestartSpeechHandler", "showProgressView", "getShowProgressView", "setShowProgressView", "speechFrequency", "", "getSpeechFrequency", "setSpeechFrequency", "speechIntent", "getSpeechIntent", "setSpeechIntent", "speechOneStepVerify", "getSpeechOneStepVerify", "setSpeechOneStepVerify", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "getSpeechRecognizer", "()Landroid/speech/SpeechRecognizer;", "setSpeechRecognizer", "(Landroid/speech/SpeechRecognizer;)V", "speechResult", "getSpeechResult", "setSpeechResult", "supportedSpeechLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSupportedSpeechLanguages", "()Ljava/util/ArrayList;", "setSupportedSpeechLanguages", "(Ljava/util/ArrayList;)V", "cancelSpeechOperations", "", "closeSpeechOperations", "injectProgressView", "progressViewLayout", "", "mute", "restartSpeechRecognition", "partialRestart", "startSpeechRecognition", "triggerProgressView", "dks_debug"})
public final class Dks extends github.com.vikramezhil.dks.speech.DksEngine {
    @org.jetbrains.annotations.Nullable()
    private android.speech.SpeechRecognizer speechRecognizer;
    @org.jetbrains.annotations.NotNull()
    private android.content.Intent speechIntent;
    @org.jetbrains.annotations.NotNull()
    private android.content.Intent languageDetailsIntent;
    @org.jetbrains.annotations.NotNull()
    private android.media.AudioManager audioManager;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler restartSpeechHandler;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler partialResultSpeechHandler;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable injectedProgressView;
    private long listeningTime = 0L;
    private long pauseAndSpeakTime = 0L;
    private boolean finalSpeechResultFound = false;
    private boolean onReadyForSpeech = false;
    private boolean partialRestartActive = false;
    private boolean closedByUser = false;
    private boolean showProgressView = false;
    private boolean progressViewInactive = true;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> speechResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Float> speechFrequency;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> speechOneStepVerify;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> ejectProgressView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> resetActionButtons;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSpeechLanguage;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> supportedSpeechLanguages;
    private boolean continuousSpeechRecognition = true;
    private boolean oneStepResultVerify = false;
    private final android.app.Application app = null;
    private final androidx.fragment.app.FragmentManager manager = null;
    private final github.com.vikramezhil.dks.speech.DksListener listener = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.speech.SpeechRecognizer getSpeechRecognizer() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSpeechRecognizer(@org.jetbrains.annotations.Nullable()
    android.speech.SpeechRecognizer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Intent getSpeechIntent() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSpeechIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Intent getLanguageDetailsIntent() {
        return null;
    }
    
    @java.lang.Override()
    protected void setLanguageDetailsIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.media.AudioManager getAudioManager() {
        return null;
    }
    
    @java.lang.Override()
    protected void setAudioManager(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Handler getRestartSpeechHandler() {
        return null;
    }
    
    @java.lang.Override()
    protected void setRestartSpeechHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Handler getPartialResultSpeechHandler() {
        return null;
    }
    
    @java.lang.Override()
    protected void setPartialResultSpeechHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Runnable getInjectedProgressView() {
        return null;
    }
    
    @java.lang.Override()
    protected void setInjectedProgressView(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    @java.lang.Override()
    protected long getListeningTime() {
        return 0L;
    }
    
    @java.lang.Override()
    protected void setListeningTime(long p0) {
    }
    
    @java.lang.Override()
    protected long getPauseAndSpeakTime() {
        return 0L;
    }
    
    @java.lang.Override()
    protected void setPauseAndSpeakTime(long p0) {
    }
    
    @java.lang.Override()
    protected boolean getFinalSpeechResultFound() {
        return false;
    }
    
    @java.lang.Override()
    protected void setFinalSpeechResultFound(boolean p0) {
    }
    
    @java.lang.Override()
    protected boolean getOnReadyForSpeech() {
        return false;
    }
    
    @java.lang.Override()
    protected void setOnReadyForSpeech(boolean p0) {
    }
    
    @java.lang.Override()
    protected boolean getPartialRestartActive() {
        return false;
    }
    
    @java.lang.Override()
    protected void setPartialRestartActive(boolean p0) {
    }
    
    @java.lang.Override()
    protected boolean getClosedByUser() {
        return false;
    }
    
    @java.lang.Override()
    protected void setClosedByUser(boolean p0) {
    }
    
    @java.lang.Override()
    protected boolean getShowProgressView() {
        return false;
    }
    
    @java.lang.Override()
    protected void setShowProgressView(boolean p0) {
    }
    
    @java.lang.Override()
    protected boolean getProgressViewInactive() {
        return false;
    }
    
    @java.lang.Override()
    protected void setProgressViewInactive(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.lifecycle.MutableLiveData<java.lang.String> getSpeechResult() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSpeechResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.lifecycle.MutableLiveData<java.lang.Float> getSpeechFrequency() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSpeechFrequency(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Float> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSpeechOneStepVerify() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSpeechOneStepVerify(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEjectProgressView() {
        return null;
    }
    
    @java.lang.Override()
    protected void setEjectProgressView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.lifecycle.MutableLiveData<java.lang.Boolean> getResetActionButtons() {
        return null;
    }
    
    @java.lang.Override()
    protected void setResetActionButtons(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getCurrentSpeechLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentSpeechLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.util.ArrayList<java.lang.String> getSupportedSpeechLanguages() {
        return null;
    }
    
    @java.lang.Override()
    protected void setSupportedSpeechLanguages(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public boolean getContinuousSpeechRecognition() {
        return false;
    }
    
    @java.lang.Override()
    public void setContinuousSpeechRecognition(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getOneStepResultVerify() {
        return false;
    }
    
    @java.lang.Override()
    public void setOneStepResultVerify(boolean p0) {
    }
    
    @java.lang.Override()
    public void startSpeechRecognition() {
    }
    
    @java.lang.Override()
    protected void restartSpeechRecognition(boolean partialRestart) {
    }
    
    @java.lang.Override()
    protected void cancelSpeechOperations() {
    }
    
    @java.lang.Override()
    public void closeSpeechOperations() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    protected void mute(boolean mute) {
    }
    
    @java.lang.Override()
    public void injectProgressView(int progressViewLayout) {
    }
    
    @java.lang.Override()
    protected void triggerProgressView(int progressViewLayout) {
    }
    
    @java.lang.Override()
    public void ejectProgressView() {
    }
    
    public Dks(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    github.com.vikramezhil.dks.speech.DksListener listener) {
        super();
    }
}