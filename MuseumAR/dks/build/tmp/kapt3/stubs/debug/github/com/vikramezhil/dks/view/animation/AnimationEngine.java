package github.com.vikramezhil.dks.view.animation;

import java.lang.System;

/**
 * Animation Engine abstract
 * @author vikramezhil
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH$J\b\u0010\u001b\u001a\u00020\u0019H$J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\bH&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000eX\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lgithub/com/vikramezhil/dks/view/animation/AnimationEngine;", "", "()V", "animDurationInMilliSecs", "", "getAnimDurationInMilliSecs", "()J", "animationRunning", "", "getAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "idleFrequency", "", "getIdleFrequency", "()F", "minFrequencies", "", "getMinFrequencies", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "outOfBoundsMinFrequency", "getOutOfBoundsMinFrequency", "animate", "", "frequency", "idle", "start", "stop", "switchToIdle", "dks_debug"})
public abstract class AnimationEngine {
    private final float idleFrequency = 3.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Float[] minFrequencies = {8.0F, 16.0F, 24.0F, 16.0F, 8.0F};
    private final float outOfBoundsMinFrequency = 0.0F;
    private final long animDurationInMilliSecs = 500L;
    
    protected final float getIdleFrequency() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Float[] getMinFrequencies() {
        return null;
    }
    
    protected final float getOutOfBoundsMinFrequency() {
        return 0.0F;
    }
    
    protected final long getAnimDurationInMilliSecs() {
        return 0L;
    }
    
    protected abstract boolean getAnimationRunning();
    
    protected abstract void setAnimationRunning(boolean p0);
    
    /**
     * Starts the animation
     * @param frequency Float The animation frequency
     */
    public abstract void start(float frequency);
    
    /**
     * Stops the animation
     * @param switchToIdle Boolean The switch to idle mode status
     */
    public abstract void stop(boolean switchToIdle);
    
    /**
     * Starts animating the view
     * @param frequency Float The animation frequency
     */
    protected abstract void animate(float frequency);
    
    /**
     * Starts idle mode for the view
     */
    protected abstract void idle();
    
    public AnimationEngine() {
        super();
    }
}