package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzamz extends zzanj {
    private static final Set<String> zzdfp = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private int height;
    private final Object lock;
    private int width;
    private zzani zzcxz;
    private final zzbbw zzczi;
    private final Activity zzdff;
    private String zzdfq;
    private boolean zzdfr;
    private int zzdfs;
    private int zzdft;
    private int zzdfu;
    private int zzdfv;
    private zzbdj zzdfw;
    private ImageView zzdfx;
    private LinearLayout zzdfy;
    private PopupWindow zzdfz;
    private RelativeLayout zzdga;
    private ViewGroup zzdgb;

    public zzamz(zzbbw zzbbwVar, zzani zzaniVar) {
        super(zzbbwVar, "resize");
        this.zzdfq = "top-right";
        this.zzdfr = true;
        this.zzdfs = 0;
        this.zzdft = 0;
        this.height = -1;
        this.zzdfu = 0;
        this.zzdfv = 0;
        this.width = -1;
        this.lock = new Object();
        this.zzczi = zzbbwVar;
        this.zzdff = zzbbwVar.zzxn();
        this.zzcxz = zzaniVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x021e A[Catch: all -> 0x04bb, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:71:0x014c, B:142:0x029b, B:143:0x02a0, B:145:0x02a2, B:147:0x02c4, B:149:0x02c8, B:151:0x02d8, B:153:0x030a, B:157:0x033c, B:158:0x0370, B:188:0x03c6, B:195:0x03f5, B:196:0x040d, B:197:0x042c, B:199:0x0434, B:200:0x043d, B:201:0x0463, B:204:0x0466, B:206:0x0476, B:208:0x0480, B:210:0x0492, B:211:0x04ab, B:207:0x047b, B:189:0x03cd, B:190:0x03d4, B:191:0x03db, B:192:0x03e2, B:193:0x03e8, B:194:0x03ef, B:160:0x0374, B:163:0x037e, B:166:0x0388, B:169:0x0392, B:172:0x039c, B:175:0x03a6, B:152:0x0305, B:213:0x04ad, B:214:0x04b2, B:125:0x023d, B:127:0x0241, B:128:0x0252, B:134:0x027f, B:136:0x0283, B:140:0x0293, B:137:0x0286, B:139:0x028d, B:131:0x0276, B:133:0x027b, B:72:0x0153, B:74:0x0157, B:75:0x015d, B:102:0x01aa, B:110:0x021b, B:112:0x021e, B:114:0x0221, B:116:0x0225, B:103:0x01b8, B:106:0x01e8, B:104:0x01c9, B:105:0x01dc, B:107:0x01eb, B:108:0x0202, B:109:0x0212, B:77:0x0161, B:80:0x016b, B:83:0x0175, B:86:0x017f, B:89:0x0189, B:92:0x0193, B:120:0x022d, B:121:0x0233, B:216:0x04b4, B:217:0x04b9), top: B:224:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023d A[Catch: all -> 0x04bb, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:71:0x014c, B:142:0x029b, B:143:0x02a0, B:145:0x02a2, B:147:0x02c4, B:149:0x02c8, B:151:0x02d8, B:153:0x030a, B:157:0x033c, B:158:0x0370, B:188:0x03c6, B:195:0x03f5, B:196:0x040d, B:197:0x042c, B:199:0x0434, B:200:0x043d, B:201:0x0463, B:204:0x0466, B:206:0x0476, B:208:0x0480, B:210:0x0492, B:211:0x04ab, B:207:0x047b, B:189:0x03cd, B:190:0x03d4, B:191:0x03db, B:192:0x03e2, B:193:0x03e8, B:194:0x03ef, B:160:0x0374, B:163:0x037e, B:166:0x0388, B:169:0x0392, B:172:0x039c, B:175:0x03a6, B:152:0x0305, B:213:0x04ad, B:214:0x04b2, B:125:0x023d, B:127:0x0241, B:128:0x0252, B:134:0x027f, B:136:0x0283, B:140:0x0293, B:137:0x0286, B:139:0x028d, B:131:0x0276, B:133:0x027b, B:72:0x0153, B:74:0x0157, B:75:0x015d, B:102:0x01aa, B:110:0x021b, B:112:0x021e, B:114:0x0221, B:116:0x0225, B:103:0x01b8, B:106:0x01e8, B:104:0x01c9, B:105:0x01dc, B:107:0x01eb, B:108:0x0202, B:109:0x0212, B:77:0x0161, B:80:0x016b, B:83:0x0175, B:86:0x017f, B:89:0x0189, B:92:0x0193, B:120:0x022d, B:121:0x0233, B:216:0x04b4, B:217:0x04b9), top: B:224:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029b A[Catch: all -> 0x04bb, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:71:0x014c, B:142:0x029b, B:143:0x02a0, B:145:0x02a2, B:147:0x02c4, B:149:0x02c8, B:151:0x02d8, B:153:0x030a, B:157:0x033c, B:158:0x0370, B:188:0x03c6, B:195:0x03f5, B:196:0x040d, B:197:0x042c, B:199:0x0434, B:200:0x043d, B:201:0x0463, B:204:0x0466, B:206:0x0476, B:208:0x0480, B:210:0x0492, B:211:0x04ab, B:207:0x047b, B:189:0x03cd, B:190:0x03d4, B:191:0x03db, B:192:0x03e2, B:193:0x03e8, B:194:0x03ef, B:160:0x0374, B:163:0x037e, B:166:0x0388, B:169:0x0392, B:172:0x039c, B:175:0x03a6, B:152:0x0305, B:213:0x04ad, B:214:0x04b2, B:125:0x023d, B:127:0x0241, B:128:0x0252, B:134:0x027f, B:136:0x0283, B:140:0x0293, B:137:0x0286, B:139:0x028d, B:131:0x0276, B:133:0x027b, B:72:0x0153, B:74:0x0157, B:75:0x015d, B:102:0x01aa, B:110:0x021b, B:112:0x021e, B:114:0x0221, B:116:0x0225, B:103:0x01b8, B:106:0x01e8, B:104:0x01c9, B:105:0x01dc, B:107:0x01eb, B:108:0x0202, B:109:0x0212, B:77:0x0161, B:80:0x016b, B:83:0x0175, B:86:0x017f, B:89:0x0189, B:92:0x0193, B:120:0x022d, B:121:0x0233, B:216:0x04b4, B:217:0x04b9), top: B:224:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a2 A[Catch: all -> 0x04bb, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0134, B:62:0x013a, B:64:0x013e, B:67:0x0144, B:69:0x0148, B:71:0x014c, B:142:0x029b, B:143:0x02a0, B:145:0x02a2, B:147:0x02c4, B:149:0x02c8, B:151:0x02d8, B:153:0x030a, B:157:0x033c, B:158:0x0370, B:188:0x03c6, B:195:0x03f5, B:196:0x040d, B:197:0x042c, B:199:0x0434, B:200:0x043d, B:201:0x0463, B:204:0x0466, B:206:0x0476, B:208:0x0480, B:210:0x0492, B:211:0x04ab, B:207:0x047b, B:189:0x03cd, B:190:0x03d4, B:191:0x03db, B:192:0x03e2, B:193:0x03e8, B:194:0x03ef, B:160:0x0374, B:163:0x037e, B:166:0x0388, B:169:0x0392, B:172:0x039c, B:175:0x03a6, B:152:0x0305, B:213:0x04ad, B:214:0x04b2, B:125:0x023d, B:127:0x0241, B:128:0x0252, B:134:0x027f, B:136:0x0283, B:140:0x0293, B:137:0x0286, B:139:0x028d, B:131:0x0276, B:133:0x027b, B:72:0x0153, B:74:0x0157, B:75:0x015d, B:102:0x01aa, B:110:0x021b, B:112:0x021e, B:114:0x0221, B:116:0x0225, B:103:0x01b8, B:106:0x01e8, B:104:0x01c9, B:105:0x01dc, B:107:0x01eb, B:108:0x0202, B:109:0x0212, B:77:0x0161, B:80:0x016b, B:83:0x0175, B:86:0x017f, B:89:0x0189, B:92:0x0193, B:120:0x022d, B:121:0x0233, B:216:0x04b4, B:217:0x04b9), top: B:224:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamz.zzg(java.util.Map):void");
    }

    public final void zzv(boolean z) {
        synchronized (this.lock) {
            if (this.zzdfz != null) {
                this.zzdfz.dismiss();
                this.zzdga.removeView(this.zzczi.getView());
                if (this.zzdgb != null) {
                    this.zzdgb.removeView(this.zzdfx);
                    this.zzdgb.addView(this.zzczi.getView());
                    this.zzczi.zza(this.zzdfw);
                }
                if (z) {
                    zzdp("default");
                    if (this.zzcxz != null) {
                        this.zzcxz.zzsl();
                    }
                }
                this.zzdfz = null;
                this.zzdga = null;
                this.zzdgb = null;
                this.zzdfy = null;
            }
        }
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.lock) {
            this.zzdfs = i;
            this.zzdft = i2;
            PopupWindow popupWindow = this.zzdfz;
        }
    }

    public final boolean zzsk() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdfz != null;
        }
        return z;
    }

    public final void zzh(int i, int i2) {
        this.zzdfs = i;
        this.zzdft = i2;
    }
}
