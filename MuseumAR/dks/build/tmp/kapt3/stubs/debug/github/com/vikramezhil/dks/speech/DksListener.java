package github.com.vikramezhil.dks.speech;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&\u00a8\u0006\u0012"}, d2 = {"Lgithub/com/vikramezhil/dks/speech/DksListener;", "", "onDksFinalSpeechResult", "", "speechResult", "", "onDksLanguagesAvailable", "defaultLanguage", "supportedLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onDksLiveSpeechFrequency", "frequency", "", "onDksLiveSpeechResult", "liveSpeechResult", "onDksSpeechError", "errMsg", "dks_debug"})
public abstract interface DksListener {
    
    /**
     * Sends an update on the live speech result
     * @param liveSpeechResult String The live speech result
     */
    public abstract void onDksLiveSpeechResult(@org.jetbrains.annotations.NotNull()
    java.lang.String liveSpeechResult);
    
    /**
     * Sends an update on the final speech result
     * @param speechResult String The final speech result
     */
    public abstract void onDksFinalSpeechResult(@org.jetbrains.annotations.NotNull()
    java.lang.String speechResult);
    
    /**
     * Sends an update on the speech frequency
     * @param frequency String The speech frequency
     */
    public abstract void onDksLiveSpeechFrequency(float frequency);
    
    /**
     * Sends an update when the languages are available
     * @param defaultLanguage String? The default language
     * @param supportedLanguages ArrayList<String>? The supported languages
     */
    public abstract void onDksLanguagesAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.String defaultLanguage, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> supportedLanguages);
    
    /**
     * Sends an update if there is an error
     * @param errMsg String The error message
     */
    public abstract void onDksSpeechError(@org.jetbrains.annotations.NotNull()
    java.lang.String errMsg);
}