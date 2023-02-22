package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzuv;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzq extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdig;
    private final zzy zzdih;

    public zzq(Context context, zzp zzpVar, zzy zzyVar) {
        super(context);
        this.zzdih = zzyVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdig = imageButton;
        imageButton.setImageResource(17301527);
        this.zzdig.setBackgroundColor(0);
        this.zzdig.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdig;
        zzuv.zzoj();
        int zza = zzawy.zza(context, zzpVar.paddingLeft);
        zzuv.zzoj();
        int zza2 = zzawy.zza(context, 0);
        zzuv.zzoj();
        int zza3 = zzawy.zza(context, zzpVar.paddingRight);
        zzuv.zzoj();
        imageButton2.setPadding(zza, zza2, zza3, zzawy.zza(context, zzpVar.paddingBottom));
        this.zzdig.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdig;
        zzuv.zzoj();
        int zza4 = zzawy.zza(context, zzpVar.size + zzpVar.paddingLeft + zzpVar.paddingRight);
        zzuv.zzoj();
        addView(imageButton3, new FrameLayout.LayoutParams(zza4, zzawy.zza(context, zzpVar.size + zzpVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzy zzyVar = this.zzdih;
        if (zzyVar != null) {
            zzyVar.zzso();
        }
    }

    public final void zzae(boolean z) {
        if (z) {
            this.zzdig.setVisibility(8);
        } else {
            this.zzdig.setVisibility(0);
        }
    }
}
