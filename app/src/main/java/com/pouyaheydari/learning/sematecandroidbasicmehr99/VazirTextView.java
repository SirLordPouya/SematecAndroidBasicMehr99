package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class VazirTextView extends AppCompatTextView {

    public VazirTextView(Context context) {
        super(context);
    }

    public VazirTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        Typeface vazir = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        this.setTypeface(vazir);
    }
}
