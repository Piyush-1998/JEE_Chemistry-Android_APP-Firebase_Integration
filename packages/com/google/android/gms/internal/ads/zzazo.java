package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazo implements AudioManager.OnAudioFocusChangeListener {
    private float zzcw = 1.0f;
    private boolean zzdyg;
    private final AudioManager zzebf;
    private final zzazn zzebg;
    private boolean zzebh;
    private boolean zzebi;

    public zzazo(Context context, zzazn zzaznVar) {
        this.zzebf = (AudioManager) context.getSystemService("audio");
        this.zzebg = zzaznVar;
    }

    public final void setMuted(boolean z) {
        this.zzebi = z;
        zzxy();
    }

    public final void setVolume(float f) {
        this.zzcw = f;
        zzxy();
    }

    public final float getVolume() {
        float f = this.zzebi ? 0.0f : this.zzcw;
        if (this.zzebh) {
            return f;
        }
        return 0.0f;
    }

    public final void zzxw() {
        this.zzdyg = true;
        zzxy();
    }

    public final void zzxx() {
        this.zzdyg = false;
        zzxy();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.zzebh = i > 0;
        this.zzebg.zzwu();
    }

    private final void zzxy() {
        boolean z;
        boolean z2;
        boolean z3 = this.zzdyg && !this.zzebi && this.zzcw > 0.0f;
        if (z3 && !(z2 = this.zzebh)) {
            AudioManager audioManager = this.zzebf;
            if (audioManager != null && !z2) {
                this.zzebh = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzebg.zzwu();
        } else if (z3 || !(z = this.zzebh)) {
        } else {
            AudioManager audioManager2 = this.zzebf;
            if (audioManager2 != null && z) {
                this.zzebh = audioManager2.abandonAudioFocus(this) == 0;
            }
            this.zzebg.zzwu();
        }
    }
}
