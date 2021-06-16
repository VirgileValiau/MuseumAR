package github.com.vikramezhil.dks.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\bH&\u00a8\u0006\t"}, d2 = {"Lgithub/com/vikramezhil/dks/language/DksLanguageListener;", "", "onDksSupportedLanguages", "", "defaultLanguage", "", "supportedLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dks_debug"})
public abstract interface DksLanguageListener {
    
    /**
     * Sends an update on the supported languages
     * @param defaultLanguage String The current default language
     * @param supportedLanguages ArrayList<String> The supported languages list
     */
    public abstract void onDksSupportedLanguages(@org.jetbrains.annotations.Nullable()
    java.lang.String defaultLanguage, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> supportedLanguages);
}