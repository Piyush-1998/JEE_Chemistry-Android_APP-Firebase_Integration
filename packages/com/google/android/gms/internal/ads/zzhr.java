package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhr extends Thread {
    private final /* synthetic */ AudioTrack zzajx;
    private final /* synthetic */ zzho zzajy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzho zzhoVar, AudioTrack audioTrack) {
        this.zzajy = zzhoVar;
        this.zzajx = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zzajx.flush();
            this.zzajx.release();
        } finally {
            conditionVariable = this.zzajy.zzahu;
            conditionVariable.open();
        }
    }
}
