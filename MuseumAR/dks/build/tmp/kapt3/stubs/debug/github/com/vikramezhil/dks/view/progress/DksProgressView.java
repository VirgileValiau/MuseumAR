package github.com.vikramezhil.dks.view.progress;

import java.lang.System;

/**
 * Dks Progress View
 * @author vikramezhil
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J.\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J.\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0007J\u0016\u0010\'\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J.\u0010(\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0007J\u001e\u0010,\u001a\u00020\u000e2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00070.j\b\u0012\u0004\u0012\u00020\u0007`/J\u000e\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u0012J\u000e\u00102\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u00106\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lgithub/com/vikramezhil/dks/view/progress/DksProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationDriver", "Lgithub/com/vikramezhil/dks/view/animation/bounce/BounceAnimationDriver;", "dksProgressViewListener", "Lgithub/com/vikramezhil/dks/view/progress/DksProgressViewListener;", "init", "", "setBackground", "bgColor", "alpha", "", "setNegativeButtonDimensions", "width", "height", "setNegativeButtonProperties", "txtColor", "cornerRadius", "isAllCaps", "", "setNegativeButtonText", "visibility", "", "setNegativeButtonTextSize", "size", "setNegativeButtonVisibility", "setNeutralButtonDimensions", "setNeutralButtonProperties", "setNeutralButtonText", "text", "setNeutralButtonTextSize", "setNeutralButtonVisibility", "setPositiveButtonDimensions", "setPositiveButtonProperties", "setPositiveButtonText", "setPositiveButtonTextSize", "setPositiveButtonVisibility", "setProgressBallColors", "progressBallColors", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setProgressBallFrequency", "rmsdB", "setProgressMessage", "setProgressMessageColor", "messageColor", "setProgressMessageTextSize", "setProgressViewListener", "dks_debug"})
public final class DksProgressView extends android.widget.FrameLayout {
    private github.com.vikramezhil.dks.view.progress.DksProgressViewListener dksProgressViewListener;
    private github.com.vikramezhil.dks.view.animation.bounce.BounceAnimationDriver animationDriver;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Initializes the view attributes
     * @param context Context The view context
     * @param attrs AttributeSet The view attributes
     */
    private final void init(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Sets the progress view listener instance
     * @param dksProgressViewListener ProgressViewListener The class instance which implements the listener
     * @override onClickedPositive, onClickedNeutral, onClickedNegative
     */
    public final void setProgressViewListener(@org.jetbrains.annotations.NotNull()
    github.com.vikramezhil.dks.view.progress.DksProgressViewListener dksProgressViewListener) {
    }
    
    /**
     * Sets the progress view background
     * @param bgColor Int The background color
     * @param alpha Float The alpha value
     */
    public final void setBackground(int bgColor, float alpha) {
    }
    
    /**
     * Sets the progress message in the text view
     * @param text String The progress message to be set in the text view
     */
    public final void setProgressMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * Sets the progress message color
     * @param messageColor Int The progress message color
     */
    public final void setProgressMessageColor(int messageColor) {
    }
    
    /**
     * Sets the progress message text size
     * @param size Float The progress message text size
     */
    public final void setProgressMessageTextSize(float size) {
    }
    
    /**
     * Sets the positive button text
     * @param text String The positive text to be shown in the button
     */
    public final void setPositiveButtonText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * Sets the positive button text size
     * @param size Float The positive button text size
     */
    public final void setPositiveButtonTextSize(float size) {
    }
    
    /**
     * Sets the positive button properties
     * @param bgColor Int The background color
     * @param txtColor Int The text color
     * @param cornerRadius Int The corner radius
     * @param alpha Float The alpha value
     * @param isAllCaps Boolean The all caps status
     */
    public final void setPositiveButtonProperties(int bgColor, int txtColor, int cornerRadius, float alpha, boolean isAllCaps) {
    }
    
    /**
     * Sets the positive button dimensions (width and height)
     * @param width Int The button width
     * @param height Int The button height
     */
    public final void setPositiveButtonDimensions(int width, int height) {
    }
    
    /**
     * Sets the positive button visibility
     * @param visibility One of {@link #VISIBLE}, {@link #INVISIBLE}, or {@link #GONE}.
     */
    public final void setPositiveButtonVisibility(int visibility) {
    }
    
    /**
     * Sets the neutral button text
     * @param text String The neutral text to be shown in the button
     */
    public final void setNeutralButtonText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * Sets the neutral button text size
     * @param size Float The neutral button text size
     */
    public final void setNeutralButtonTextSize(float size) {
    }
    
    /**
     * Sets the neutral button properties
     * @param bgColor Int The background color
     * @param txtColor Int The text color
     * @param cornerRadius Int The corner radius
     * @param alpha Float The alpha value
     * @param isAllCaps Boolean The all caps status
     */
    public final void setNeutralButtonProperties(int bgColor, int txtColor, int cornerRadius, float alpha, boolean isAllCaps) {
    }
    
    /**
     * Sets the neutral button dimensions (width and height)
     * @param width Int The button width
     * @param height Int The button height
     */
    public final void setNeutralButtonDimensions(int width, int height) {
    }
    
    /**
     * Sets the neutral button visibility
     * @param visibility One of {@link #VISIBLE}, {@link #INVISIBLE}, or {@link #GONE}.
     */
    public final void setNeutralButtonVisibility(int visibility) {
    }
    
    /**
     * Sets the negative button text
     * @param visibility String The negative text to be shown in the button
     */
    public final void setNegativeButtonText(@org.jetbrains.annotations.NotNull()
    java.lang.String visibility) {
    }
    
    /**
     * Sets the negative button text size
     * @param size Float The negative button text size
     */
    public final void setNegativeButtonTextSize(float size) {
    }
    
    /**
     * Sets the negative button properties
     * @param bgColor Int The background color
     * @param txtColor Int The text color
     * @param cornerRadius Int The corner radius
     * @param alpha Float The alpha value
     * @param isAllCaps Boolean The all caps status
     */
    public final void setNegativeButtonProperties(int bgColor, int txtColor, int cornerRadius, float alpha, boolean isAllCaps) {
    }
    
    /**
     * Sets the negative button dimensions (width and height)
     * @param width Int The button width
     * @param height Int The button height
     */
    public final void setNegativeButtonDimensions(int width, int height) {
    }
    
    /**
     * Sets the negative button visibility
     * @param visibility One of {@link #VISIBLE}, {@link #INVISIBLE}, or {@link #GONE}.
     */
    public final void setNegativeButtonVisibility(int visibility) {
    }
    
    /**
     * Sets the progress ball colors
     * @param progressBallColors ArrayList<Int> The progress bar color list
     */
    public final void setProgressBallColors(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> progressBallColors) {
    }
    
    /**
     * Sets the progress ball frequency
     * @param rmsdB The frequency value
     */
    public final void setProgressBallFrequency(float rmsdB) {
    }
    
    public DksProgressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public DksProgressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public DksProgressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}