package github.com.vikramezhil.dks.speech;

import java.lang.System;

/**
 * Droid Kotlin Speech Engine abstract
 * @author vikramezhil
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010w\u001a\u00020xH$J\b\u0010y\u001a\u00020xH&J\b\u0010\u001c\u001a\u00020xH&J\u0010\u0010z\u001a\u00020x2\u0006\u0010{\u001a\u00020:H&J\u0010\u0010|\u001a\u00020x2\u0006\u0010|\u001a\u00020\u000eH$J\u0010\u0010}\u001a\u00020x2\u0006\u0010~\u001a\u00020\u000eH$J\b\u0010\u007f\u001a\u00020xH&J\u0011\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010{\u001a\u00020:H$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u0018\u0010$\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u001a\u0010\'\u001a\u0004\u0018\u00010(X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020.X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00103\u001a\u00020\u0004X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020:X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u0018\u0010@\u001a\u00020\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012R\u0014\u0010C\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u0018\u0010E\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\u0010\"\u0004\bG\u0010\u0012R\u0018\u0010H\u001a\u00020IX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010N\u001a\u00020\u0004X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u00106R\u0018\u0010Q\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010\u0010\"\u0004\bS\u0010\u0012R\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010!R\u0018\u0010W\u001a\u00020IX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010K\"\u0004\bY\u0010MR\u0018\u0010Z\u001a\u00020\u000eX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\u0010\"\u0004\b\\\u0010\u0012R\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u001dX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010\u001f\"\u0004\b`\u0010!R\u0018\u0010a\u001a\u00020.X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bb\u00100\"\u0004\bc\u00102R\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\be\u0010\u001f\"\u0004\bf\u0010!R\u001a\u0010g\u001a\u0004\u0018\u00010hX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001e\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00170\u001dX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010\u001f\"\u0004\bo\u0010!R,\u0010p\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010qj\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`rX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v\u00a8\u0006\u0081\u0001"}, d2 = {"Lgithub/com/vikramezhil/dks/speech/DksEngine;", "", "()V", "audioBeepDisabledTimeout", "", "getAudioBeepDisabledTimeout", "()J", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "closedByUser", "", "getClosedByUser", "()Z", "setClosedByUser", "(Z)V", "continuousSpeechRecognition", "getContinuousSpeechRecognition", "setContinuousSpeechRecognition", "currentSpeechLanguage", "", "getCurrentSpeechLanguage", "()Ljava/lang/String;", "setCurrentSpeechLanguage", "(Ljava/lang/String;)V", "ejectProgressView", "Landroidx/lifecycle/MutableLiveData;", "getEjectProgressView", "()Landroidx/lifecycle/MutableLiveData;", "setEjectProgressView", "(Landroidx/lifecycle/MutableLiveData;)V", "errorTimeout", "getErrorTimeout", "finalSpeechResultFound", "getFinalSpeechResultFound", "setFinalSpeechResultFound", "injectedProgressView", "Ljava/lang/Runnable;", "getInjectedProgressView", "()Ljava/lang/Runnable;", "setInjectedProgressView", "(Ljava/lang/Runnable;)V", "languageDetailsIntent", "Landroid/content/Intent;", "getLanguageDetailsIntent", "()Landroid/content/Intent;", "setLanguageDetailsIntent", "(Landroid/content/Intent;)V", "listeningTime", "getListeningTime", "setListeningTime", "(J)V", "maxPauseTime", "getMaxPauseTime", "maxVoiceResults", "", "getMaxVoiceResults", "()I", "onReadyForSpeech", "getOnReadyForSpeech", "setOnReadyForSpeech", "oneStepResultVerify", "getOneStepResultVerify", "setOneStepResultVerify", "partialDelayTime", "getPartialDelayTime", "partialRestartActive", "getPartialRestartActive", "setPartialRestartActive", "partialResultSpeechHandler", "Landroid/os/Handler;", "getPartialResultSpeechHandler", "()Landroid/os/Handler;", "setPartialResultSpeechHandler", "(Landroid/os/Handler;)V", "pauseAndSpeakTime", "getPauseAndSpeakTime", "setPauseAndSpeakTime", "progressViewInactive", "getProgressViewInactive", "setProgressViewInactive", "resetActionButtons", "getResetActionButtons", "setResetActionButtons", "restartSpeechHandler", "getRestartSpeechHandler", "setRestartSpeechHandler", "showProgressView", "getShowProgressView", "setShowProgressView", "speechFrequency", "", "getSpeechFrequency", "setSpeechFrequency", "speechIntent", "getSpeechIntent", "setSpeechIntent", "speechOneStepVerify", "getSpeechOneStepVerify", "setSpeechOneStepVerify", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "getSpeechRecognizer", "()Landroid/speech/SpeechRecognizer;", "setSpeechRecognizer", "(Landroid/speech/SpeechRecognizer;)V", "speechResult", "getSpeechResult", "setSpeechResult", "supportedSpeechLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSupportedSpeechLanguages", "()Ljava/util/ArrayList;", "setSupportedSpeechLanguages", "(Ljava/util/ArrayList;)V", "cancelSpeechOperations", "", "closeSpeechOperations", "injectProgressView", "progressViewLayout", "mute", "restartSpeechRecognition", "partialRestart", "startSpeechRecognition", "triggerProgressView", "dks_debug"})
public abstract class DksEngine {
    private final int maxVoiceResults = 5;
    private final long maxPauseTime = 1000L;
    private final long partialDelayTime = 500L;
    private final long errorTimeout = 5000L;
    private final long audioBeepDisabledTimeout = 30000L;
    
    protected final int getMaxVoiceResults() {
        return 0;
    }
    
    protected final long getMaxPauseTime() {
        return 0L;
    }
    
    protected final long getPartialDelayTime() {
        return 0L;
    }
    
    protected final long getErrorTimeout() {
        return 0L;
    }
    
    protected final long getAudioBeepDisabledTimeout() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract android.speech.SpeechRecognizer getSpeechRecognizer();
    
    protected abstract void setSpeechRecognizer(@org.jetbrains.annotations.Nullable()
    android.speech.SpeechRecognizer p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.content.Intent getSpeechIntent();
    
    protected abstract void setSpeechIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.content.Intent getLanguageDetailsIntent();
    
    protected abstract void setLanguageDetailsIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.media.AudioManager getAudioManager();
    
    protected abstract void setAudioManager(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.os.Handler getRestartSpeechHandler();
    
    protected abstract void setRestartSpeechHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.os.Handler getPartialResultSpeechHandler();
    
    protected abstract void setPartialResultSpeechHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Runnable getInjectedProgressView();
    
    protected abstract void setInjectedProgressView(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0);
    
    protected abstract long getListeningTime();
    
    protected abstract void setListeningTime(long p0);
    
    protected abstract long getPauseAndSpeakTime();
    
    protected abstract void setPauseAndSpeakTime(long p0);
    
    protected abstract boolean getFinalSpeechResultFound();
    
    protected abstract void setFinalSpeechResultFound(boolean p0);
    
    protected abstract boolean getOnReadyForSpeech();
    
    protected abstract void setOnReadyForSpeech(boolean p0);
    
    protected abstract boolean getPartialRestartActive();
    
    protected abstract void setPartialRestartActive(boolean p0);
    
    protected abstract boolean getClosedByUser();
    
    protected abstract void setClosedByUser(boolean p0);
    
    protected abstract boolean getShowProgressView();
    
    protected abstract void setShowProgressView(boolean p0);
    
    protected abstract boolean getProgressViewInactive();
    
    protected abstract void setProgressViewInactive(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.MutableLiveData<java.lang.String> getSpeechResult();
    
    protected abstract void setSpeechResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.MutableLiveData<java.lang.Float> getSpeechFrequency();
    
    protected abstract void setSpeechFrequency(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Float> p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSpeechOneStepVerify();
    
    protected abstract void setSpeechOneStepVerify(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEjectProgressView();
    
    protected abstract void setEjectProgressView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getResetActionButtons();
    
    protected abstract void setResetActionButtons(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.util.ArrayList<java.lang.String> getSupportedSpeechLanguages();
    
    protected abstract void setSupportedSpeechLanguages(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCurrentSpeechLanguage();
    
    public abstract void setCurrentSpeechLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean getContinuousSpeechRecognition();
    
    public abstract void setContinuousSpeechRecognition(boolean p0);
    
    public abstract boolean getOneStepResultVerify();
    
    public abstract void setOneStepResultVerify(boolean p0);
    
    /**
     * Starts the speech recognition
     */
    public abstract void startSpeechRecognition();
    
    /**
     * Restarts the speech recognition
     * @param partialRestart The partial restart status
     */
    protected abstract void restartSpeechRecognition(boolean partialRestart);
    
    /**
     * Cancels the speech operations
     */
    protected abstract void cancelSpeechOperations();
    
    /**
     * Closes the speech operations
     */
    public abstract void closeSpeechOperations();
    
    /**
     * Mutes the audio
     * @param mute Boolean The mute audio status
     */
    protected abstract void mute(boolean mute);
    
    /**
     * Injects the progress view
     * @param progressViewLayout The progress view layout
     */
    public abstract void injectProgressView(int progressViewLayout);
    
    /**
     * Triggers the progress view
     * @param progressViewLayout The progress view layout
     */
    protected abstract void triggerProgressView(int progressViewLayout);
    
    /**
     * Ejects the progress view
     */
    public abstract void ejectProgressView();
    
    public DksEngine() {
        super();
    }
}