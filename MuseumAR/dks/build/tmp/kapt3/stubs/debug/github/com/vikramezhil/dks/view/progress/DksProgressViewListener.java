package github.com.vikramezhil.dks.view.progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lgithub/com/vikramezhil/dks/view/progress/DksProgressViewListener;", "", "onClickedNegative", "", "onClickedNeutral", "onClickedPositive", "dks_debug"})
public abstract interface DksProgressViewListener {
    
    /**
     * Sends an update when the positive button is clicked
     */
    public abstract void onClickedPositive();
    
    /**
     * Sends an update when the neutral button is clicked
     */
    public abstract void onClickedNeutral();
    
    /**
     * Sends an update when the negative button is clicked
     */
    public abstract void onClickedNegative();
}