package com.muddzdev.styleabletoastlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes.dex */
public class StyleableToast extends RelativeLayout implements OnToastFinishedListener {
    private int backgroundColor;
    private Context context;
    private int cornerRadius;
    private int fontId;
    private boolean hasAnimation;
    private ImageView iconLeft;
    private int iconResLeft;
    private int iconResRight;
    private ImageView iconRight;
    private boolean isTextSizeFromStyle;
    private int length;
    private LinearLayout rootLayout;
    private boolean solidBackground;
    private int strokeColor;
    private int strokeWidth;
    private int style;
    private Toast styleableToast;
    private String text;
    private boolean textBold;
    private int textColor;
    private float textSize;
    private TextView textView;
    private TypedArray typedArray;
    private Typeface typeface;

    public static StyleableToast makeText(Context context, String str, int i, int i2) {
        return new StyleableToast(context, str, i, i2);
    }

    public static StyleableToast makeText(Context context, String str, int i) {
        return new StyleableToast(context, str, 0, i);
    }

    private StyleableToast(Context context, String str, int i, int i2) {
        super(context);
        this.cornerRadius = -1;
        this.isTextSizeFromStyle = false;
        this.context = context;
        this.text = str;
        this.length = i;
        this.style = i2;
    }

    private StyleableToast(Builder builder) {
        super(builder.context);
        this.cornerRadius = -1;
        this.isTextSizeFromStyle = false;
        this.context = builder.context.getApplicationContext();
        this.backgroundColor = builder.backgroundColor;
        this.cornerRadius = builder.cornerRadius;
        this.iconResRight = builder.iconResRight;
        this.iconResLeft = builder.iconResLeft;
        this.strokeColor = builder.strokeColor;
        this.strokeWidth = builder.strokeWidth;
        this.hasAnimation = builder.hasAnimation;
        this.solidBackground = builder.solidBackground;
        this.textColor = builder.textColor;
        this.textSize = builder.textSize;
        this.textBold = builder.textBold;
        this.typeface = builder.typeface;
        this.fontId = builder.fontId;
        this.text = builder.text;
        this.length = builder.length;
    }

    private void initStyleableToast() {
        View inflate = inflate(getContext(), R.layout.styleable_layout, null);
        this.rootLayout = (LinearLayout) inflate.findViewById(R.id.root);
        this.textView = (TextView) inflate.findViewById(R.id.textview);
        this.iconLeft = (ImageView) inflate.findViewById(R.id.icon_left);
        this.iconRight = (ImageView) inflate.findViewById(R.id.icon_right);
        if (this.style > 0) {
            this.typedArray = getContext().obtainStyledAttributes(this.style, R.styleable.StyleableToast);
        }
        makeShape();
        makeIcon();
        makeTextView();
        TypedArray typedArray = this.typedArray;
        if (typedArray != null) {
            typedArray.recycle();
        }
        if (this.hasAnimation) {
            this.iconLeft.setAnimation(getAnimation());
            new ToastLengthTracker(this.length, this);
        }
    }

    public void show() {
        initStyleableToast();
        Toast toast = new Toast(this.context);
        this.styleableToast = toast;
        toast.setDuration(this.length != 1 ? 0 : 1);
        this.styleableToast.setView(this.rootLayout);
        this.styleableToast.show();
    }

    public void cancel() {
        Toast toast = this.styleableToast;
        if (toast != null) {
            toast.cancel();
        }
    }

    @Deprecated
    public Toast getStyleableToast() {
        return this.styleableToast;
    }

    private void makeShape() {
        loadShapeAttributes();
        GradientDrawable gradientDrawable = (GradientDrawable) this.rootLayout.getBackground();
        int i = this.cornerRadius;
        if (i == -1) {
            i = R.dimen.default_corner_radius;
        }
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(this.strokeWidth, this.strokeColor);
        int i2 = this.backgroundColor;
        if (i2 == 0) {
            gradientDrawable.setColor(ContextCompat.getColor(this.context, R.color.defaultBackgroundColor));
        } else {
            gradientDrawable.setColor(i2);
        }
        if (this.solidBackground) {
            gradientDrawable.setAlpha(getResources().getInteger(R.integer.fullBackgroundAlpha));
        } else {
            gradientDrawable.setAlpha(getResources().getInteger(R.integer.defaultBackgroundAlpha));
        }
        this.rootLayout.setBackground(gradientDrawable);
    }

    private void makeTextView() {
        loadTextViewStyleAttributes();
        this.textView.setText(this.text);
        int i = this.textColor;
        if (i != 0) {
            this.textView.setTextColor(i);
        }
        if (this.textSize > 0.0f) {
            this.textView.setTextSize(this.isTextSizeFromStyle ? 0 : 2, this.textSize);
        }
        if (this.textBold && this.typeface == null) {
            this.textView.setTypeface(Typeface.create(this.context.getString(R.string.default_font), 1));
        } else if (this.textBold) {
            this.textView.setTypeface(Typeface.create(this.typeface, 1));
        } else {
            Typeface typeface = this.typeface;
            if (typeface != null) {
                this.textView.setTypeface(typeface);
                return;
            }
            int i2 = this.fontId;
            if (i2 > 0) {
                this.textView.setTypeface(ResourcesCompat.getFont(this.context, i2));
            }
        }
    }

    private void makeIcon() {
        loadIconAttributes();
        if (this.iconResLeft > 0 || this.iconResRight > 0) {
            int dimension = (int) getResources().getDimension(R.dimen.toast_horizontal_padding_with_icon);
            int dimension2 = (int) getResources().getDimension(R.dimen.toast_vertical_padding);
            this.rootLayout.setPadding(dimension, dimension2, dimension, dimension2);
        }
        int i = this.iconResLeft;
        if (i > 0) {
            this.iconLeft.setBackgroundResource(i);
            this.iconLeft.setVisibility(0);
        }
        int i2 = this.iconResRight;
        if (i2 > 0) {
            this.iconRight.setBackgroundResource(i2);
            this.iconRight.setVisibility(0);
        }
    }

    private void loadShapeAttributes() {
        if (this.style == 0) {
            return;
        }
        this.solidBackground = this.typedArray.getBoolean(R.styleable.StyleableToast_solidBackground, false);
        this.backgroundColor = this.typedArray.getColor(R.styleable.StyleableToast_colorBackground, ContextCompat.getColor(this.context, R.color.defaultBackgroundColor));
        this.cornerRadius = (int) this.typedArray.getDimension(R.styleable.StyleableToast_cornerRadius, R.dimen.default_corner_radius);
        if (this.typedArray.hasValue(R.styleable.StyleableToast_length)) {
            this.length = this.typedArray.getInt(R.styleable.StyleableToast_length, 0);
        }
        if (Build.VERSION.SDK_INT >= 21 && this.typedArray.hasValue(R.styleable.StyleableToast_strokeColor) && this.typedArray.hasValue(R.styleable.StyleableToast_strokeWidth)) {
            this.strokeWidth = (int) this.typedArray.getDimension(R.styleable.StyleableToast_strokeWidth, 0.0f);
            this.strokeColor = this.typedArray.getColor(R.styleable.StyleableToast_strokeColor, 0);
        }
    }

    private void loadTextViewStyleAttributes() {
        if (this.style == 0) {
            return;
        }
        this.textColor = this.typedArray.getColor(R.styleable.StyleableToast_textColor, -1);
        this.textBold = this.typedArray.getBoolean(R.styleable.StyleableToast_textBold, false);
        float dimension = this.typedArray.getDimension(R.styleable.StyleableToast_textSize, 0.0f);
        this.textSize = dimension;
        this.isTextSizeFromStyle = dimension > 0.0f;
        this.fontId = this.typedArray.getResourceId(R.styleable.StyleableToast_textFont, 0);
        String string = this.typedArray.getString(R.styleable.StyleableToast_textFont);
        if (string == null || !string.contains("fonts/")) {
            return;
        }
        if (string.contains(".otf") || string.contains(".ttf")) {
            this.typeface = Typeface.createFromAsset(this.context.getAssets(), string);
        }
    }

    private void loadIconAttributes() {
        if (this.style == 0) {
            return;
        }
        this.iconResLeft = this.typedArray.getResourceId(R.styleable.StyleableToast_iconLeft, 0);
        this.iconResRight = this.typedArray.getResourceId(R.styleable.StyleableToast_iconRight, 0);
    }

    @Override // android.view.View
    public Animation getAnimation() {
        if (this.hasAnimation) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000L);
            return rotateAnimation;
        }
        return null;
    }

    @Override // com.muddzdev.styleabletoastlibrary.OnToastFinishedListener
    public void onToastFinished() {
        if (getAnimation() != null) {
            getAnimation().cancel();
            getAnimation().reset();
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private int backgroundColor;
        private final Context context;
        private int cornerRadius = -1;
        private int fontId;
        private boolean hasAnimation;
        private int iconResLeft;
        private int iconResRight;
        private int length;
        private boolean solidBackground;
        private int strokeColor;
        private int strokeWidth;
        private String text;
        private boolean textBold;
        private int textColor;
        private float textSize;
        private Typeface typeface;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder text(String str) {
            this.text = str;
            return this;
        }

        public Builder textColor(int i) {
            this.textColor = i;
            return this;
        }

        public Builder textBold() {
            this.textBold = true;
            return this;
        }

        public Builder textSize(float f) {
            this.textSize = f;
            return this;
        }

        @Deprecated
        public Builder typeface(Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        public Builder font(int i) {
            this.fontId = i;
            return this;
        }

        public Builder backgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public Builder solidBackground() {
            this.solidBackground = true;
            return this;
        }

        public Builder stroke(int i, int i2) {
            this.strokeWidth = i;
            this.strokeColor = i2;
            return this;
        }

        public Builder cornerRadius(int i) {
            this.cornerRadius = i;
            return this;
        }

        public Builder iconResLeft(int i) {
            this.iconResLeft = i;
            return this;
        }

        public Builder iconResRight(int i) {
            this.iconResRight = i;
            return this;
        }

        @Deprecated
        public Builder spinIcon() {
            this.hasAnimation = true;
            return this;
        }

        public Builder length(int i) {
            this.length = i;
            return this;
        }

        public void show() {
            new StyleableToast(this).show();
        }
    }
}
