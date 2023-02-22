package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzyj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zzabp;
    private final boolean zzabq;
    private final boolean zzabr;

    public VideoOptions(zzyj zzyjVar) {
        this.zzabp = zzyjVar.zzabp;
        this.zzabq = zzyjVar.zzabq;
        this.zzabr = zzyjVar.zzabr;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzabp = true;
        private boolean zzabq = false;
        private boolean zzabr = false;

        public final Builder setStartMuted(boolean z) {
            this.zzabp = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzabq = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzabr = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzabp = builder.zzabp;
        this.zzabq = builder.zzabq;
        this.zzabr = builder.zzabr;
    }

    public final boolean getStartMuted() {
        return this.zzabp;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzabq;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzabr;
    }
}
