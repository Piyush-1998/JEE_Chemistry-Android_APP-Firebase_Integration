package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzhq {
    private int zzafn;
    protected AudioTrack zzahy;
    private boolean zzajq;
    private long zzajr;
    private long zzajs;
    private long zzajt;
    private long zzaju;
    private long zzajv;
    private long zzajw;

    private zzhq() {
    }

    public boolean zzfk() {
        return false;
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zzahy = audioTrack;
        this.zzajq = z;
        this.zzaju = -9223372036854775807L;
        this.zzajr = 0L;
        this.zzajs = 0L;
        this.zzajt = 0L;
        if (audioTrack != null) {
            this.zzafn = audioTrack.getSampleRate();
        }
    }

    public final void zzds(long j) {
        this.zzajv = zzfi();
        this.zzaju = SystemClock.elapsedRealtime() * 1000;
        this.zzajw = j;
        this.zzahy.stop();
    }

    public final void pause() {
        if (this.zzaju != -9223372036854775807L) {
            return;
        }
        this.zzahy.pause();
    }

    public final long zzfi() {
        if (this.zzaju != -9223372036854775807L) {
            return Math.min(this.zzajw, this.zzajv + ((((SystemClock.elapsedRealtime() * 1000) - this.zzaju) * this.zzafn) / 1000000));
        }
        int playState = this.zzahy.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.zzahy.getPlaybackHeadPosition();
        if (this.zzajq) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzajt = this.zzajr;
            }
            playbackHeadPosition += this.zzajt;
        }
        if (this.zzajr > playbackHeadPosition) {
            this.zzajs++;
        }
        this.zzajr = playbackHeadPosition;
        return playbackHeadPosition + (this.zzajs << 32);
    }

    public final long zzfj() {
        return (zzfi() * 1000000) / this.zzafn;
    }

    public long zzfl() {
        throw new UnsupportedOperationException();
    }

    public long zzfm() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhq(zzhr zzhrVar) {
        this();
    }
}
