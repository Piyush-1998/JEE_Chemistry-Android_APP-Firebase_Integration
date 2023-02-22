package com.muddzdev.styleabletoastlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class Utils {
    public static float getTypedValueInDP(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float getTypedValueInSP(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static TypedArray getStyleValuesColor(Context context, int i, int i2) {
        if (i2 > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i});
            obtainStyledAttributes.getColor(0, -3355444);
            return obtainStyledAttributes;
        }
        return null;
    }

    public static int getStyleValuesInt(Context context, int i, int i2) {
        TypedArray typedArray;
        if (i2 > 0) {
            typedArray = context.obtainStyledAttributes(i2, new int[]{i});
            typedArray.recycle();
        } else {
            typedArray = null;
        }
        return typedArray.getInt(0, 0);
    }

    public static String getStyleValuesString(Context context, int i, int i2) {
        TypedArray typedArray;
        if (i2 > 0) {
            typedArray = context.obtainStyledAttributes(i2, new int[]{i});
            typedArray.recycle();
        } else {
            typedArray = null;
        }
        return typedArray.getString(0);
    }

    public static boolean getStyleValuesBoolean(Context context, int i, int i2) {
        TypedArray typedArray;
        if (i2 > 0) {
            typedArray = context.obtainStyledAttributes(i2, new int[]{i});
            typedArray.recycle();
        } else {
            typedArray = null;
        }
        return typedArray.getBoolean(0, false);
    }
}
