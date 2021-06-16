package github.com.vikramezhil.dks.view.animation.bounce;

import java.lang.System;

/**
 * Bounce Animation Driver
 * @author vikramezhil
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lgithub/com/vikramezhil/dks/view/animation/bounce/BounceAnimationDriver;", "Lgithub/com/vikramezhil/dks/view/animation/AnimationEngine;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "animationRunning", "", "getAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "animate", "", "frequency", "", "idle", "start", "stop", "switchToIdle", "dks_debug"})
public final class BounceAnimationDriver extends github.com.vikramezhil.dks.view.animation.AnimationEngine {
    private boolean animationRunning = false;
    private final android.content.Context context = null;
    private final android.view.ViewGroup viewGroup = null;
    
    @java.lang.Override()
    protected boolean getAnimationRunning() {
        return false;
    }
    
    @java.lang.Override()
    protected void setAnimationRunning(boolean p0) {
    }
    
    @java.lang.Override()
    public void start(float frequency) {
    }
    
    @java.lang.Override()
    public void stop(boolean switchToIdle) {
    }
    
    @java.lang.Override()
    protected void animate(float frequency) {
    }
    
    @java.lang.Override()
    protected void idle() {
    }
    
    public BounceAnimationDriver(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup) {
        super();
    }
}