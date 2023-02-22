package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbi extends zzbax {
    private static final Set<String> zzedr = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzeds = new DecimalFormat("#,###");
    private File zzedt;
    private boolean zzedu;

    public zzbbi(zzazj zzazjVar) {
        super(zzazjVar);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzaug.zzeu("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzedt = file;
        if (!file.isDirectory() && !this.zzedt.mkdirs()) {
            String valueOf = String.valueOf(this.zzedt.getAbsolutePath());
            zzaug.zzeu(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzedt = null;
        } else if (this.zzedt.setReadable(true, false) && this.zzedt.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.zzedt.getAbsolutePath());
            zzaug.zzeu(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzedt = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ee, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f0, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f9, code lost:
        if (r1 < 400) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
        if (r2.length() == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0213, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0218, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0240, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0241, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0243, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0245, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0249, code lost:
        if (r7 >= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024b, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0255, code lost:
        if (r1.length() == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0257, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025c, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0262, code lost:
        com.google.android.gms.internal.ads.zzaug.zzeu(r0);
        zza(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.zzbbi.zzedr.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0273, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0274, code lost:
        r1 = com.google.android.gms.internal.ads.zzbbi.zzeds.format(r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzuv.zzon().zzd(com.google.android.gms.internal.ads.zzza.zzchh)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028b, code lost:
        if (r7 <= r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028d, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.zzaug.zzeu(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02c6, code lost:
        if (r1.length() == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c8, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cd, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d3, code lost:
        zza(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.zzbbi.zzedr.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e1, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e2, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.zzaug.zzdv(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x031d, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzq.zzkq();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x033b, code lost:
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033c, code lost:
        r6 = new com.google.android.gms.internal.ads.zzawo(((java.lang.Long) com.google.android.gms.internal.ads.zzuv.zzon().zzd(com.google.android.gms.internal.ads.zzza.zzchk)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzuv.zzon().zzd(com.google.android.gms.internal.ads.zzza.zzchj)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0355, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0359, code lost:
        if (r20 < 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x035b, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035d, code lost:
        if (r11 <= r3) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035f, code lost:
        r15 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036f, code lost:
        if (r1.length() == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0371, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0377, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0383, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0386, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0387, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x038a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x038d, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x038f, code lost:
        r10 = r4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0392, code lost:
        r1.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0399, code lost:
        if (r2.write(r1) > 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x039b, code lost:
        r1.clear();
        r24 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03aa, code lost:
        if (r24 > 0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03ac, code lost:
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03b0, code lost:
        if (r30.zzedu != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b6, code lost:
        if (r6.tryAcquire() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03be, code lost:
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03c2, code lost:
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03e0, code lost:
        com.google.android.gms.internal.ads.zzawy.zzzb.post(new com.google.android.gms.internal.ads.zzbba(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03e7, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03e9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ea, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03ef, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0401, code lost:
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0424, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0425, code lost:
        r27 = r4;
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x042b, code lost:
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x042d, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0458, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0459, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x045c, code lost:
        r2 = r10;
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0463, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0465, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0467, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x046a, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0471, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0479, code lost:
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0480, code lost:
        if (com.google.android.gms.internal.ads.zzaug.isLoggable(3) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0482, code lost:
        r1 = com.google.android.gms.internal.ads.zzbbi.zzeds.format(r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.zzaug.zzdv(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04b9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04bb, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04bc, code lost:
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04be, code lost:
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04c3, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04ca, code lost:
        if (r0.isFile() == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04cc, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04d4, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ed, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04ee, code lost:
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04f6, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04fc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04fd, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0500, code lost:
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x051f: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:240:0x051f */
    /* JADX WARN: Removed duplicated region for block: B:248:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05a8  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // com.google.android.gms.internal.ads.zzbax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzfd(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbi.zzfd(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void abort() {
        this.zzedu = true;
    }

    private final File zzc(File file) {
        return new File(this.zzedt, String.valueOf(file.getName()).concat(".done"));
    }
}
