package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaas extends RelativeLayout {
    private static final float[] zzcvl = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzcvm;

    public zzaas(Context context, zzaat zzaatVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzaatVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzcvl, null, null));
        shapeDrawable.getPaint().setColor(zzaatVar.getBackgroundColor());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.zzq.zzkl();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzaatVar.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzaatVar.getText());
            textView.setTextColor(zzaatVar.getTextColor());
            textView.setTextSize(zzaatVar.getTextSize());
            zzuv.zzoj();
            int zza = zzawy.zza(context, 4);
            zzuv.zzoj();
            textView.setPadding(zza, 0, zzawy.zza(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzaau> zzqf = zzaatVar.zzqf();
        if (zzqf != null && zzqf.size() > 1) {
            this.zzcvm = new AnimationDrawable();
            for (zzaau zzaauVar : zzqf) {
                try {
                    this.zzcvm.addFrame((Drawable) ObjectWrapper.unwrap(zzaauVar.zzqi()), zzaatVar.zzqg());
                } catch (Exception e) {
                    zzaug.zzc("Error while getting drawable.", e);
                }
            }
            com.google.android.gms.ads.internal.zzq.zzkl();
            imageView.setBackground(this.zzcvm);
        } else if (zzqf.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzqf.get(0).zzqi()));
            } catch (Exception e2) {
                zzaug.zzc("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzcvm;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
