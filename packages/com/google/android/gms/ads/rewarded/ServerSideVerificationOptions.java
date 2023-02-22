package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zzdnz;
    private final String zzdoa;

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdnz = builder.zzdnz;
        this.zzdoa = builder.zzdoa;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String zzdnz = "";
        private String zzdoa = "";

        public final Builder setUserId(String str) {
            this.zzdnz = str;
            return this;
        }

        public final Builder setCustomData(String str) {
            this.zzdoa = str;
            return this;
        }

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }
    }

    public String getUserId() {
        return this.zzdnz;
    }

    public String getCustomData() {
        return this.zzdoa;
    }
}
