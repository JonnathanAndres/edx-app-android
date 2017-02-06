package org.edx.mobile.view.custom;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.RatingBar;

import org.edx.mobile.R;

public class EdxRatingBar extends RatingBar {
    private final int UNSELECTED_STAR_COLOR = getResources().getColor(R.color.edx_brand_gray_back);
    private final int SELECTED_STAR_COLOR = getResources().getColor(R.color.edx_brand_primary_base);
    private final int SELECTED_STAR_COLOR_DARK = getResources().getColor(R.color.edx_brand_primary_dark);

    public EdxRatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public EdxRatingBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public EdxRatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EdxRatingBar(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        customizeTheme();
    }

    public void customizeTheme() {
        LayerDrawable stars = (LayerDrawable) this.getProgressDrawable();
        stars.getDrawable(0).setColorFilter(UNSELECTED_STAR_COLOR, PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(1).setColorFilter(SELECTED_STAR_COLOR_DARK, PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(2).setColorFilter(SELECTED_STAR_COLOR, PorterDuff.Mode.SRC_ATOP);
    }
}