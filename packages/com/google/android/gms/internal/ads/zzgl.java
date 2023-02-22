package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzgl implements Handler.Callback, zzlr, zzlt, zzmx {
    private final Handler handler;
    private int repeatMode = 0;
    private int state = 1;
    private final zzgx[] zzacp;
    private final zzmy zzacq;
    private final Handler zzacs;
    private final zzhd zzacv;
    private final zzha zzacw;
    private boolean zzacy;
    private boolean zzadc;
    private zzgy zzadd;
    private zzgu zzadh;
    private zzgn zzadi;
    private final zzgw[] zzady;
    private final zzgs zzadz;
    private zzlu zzaea;
    private final zzod zzaec;
    private final HandlerThread zzaed;
    private final zzgc zzaee;
    private zzgx zzaef;
    private zznv zzaeg;
    private zzgx[] zzaeh;
    private boolean zzaei;
    private boolean zzaej;
    private int zzaek;
    private int zzael;
    private long zzaem;
    private int zzaen;
    private zzgm zzaeo;
    private long zzaep;
    private zzgk zzaeq;
    private zzgk zzaer;
    private zzgk zzaes;

    public zzgl(zzgx[] zzgxVarArr, zzmy zzmyVar, zzgs zzgsVar, boolean z, int i, Handler handler, zzgn zzgnVar, zzgc zzgcVar) {
        this.zzacp = zzgxVarArr;
        this.zzacq = zzmyVar;
        this.zzadz = zzgsVar;
        this.zzacy = z;
        this.zzacs = handler;
        this.zzadi = zzgnVar;
        this.zzaee = zzgcVar;
        this.zzady = new zzgw[zzgxVarArr.length];
        for (int i2 = 0; i2 < zzgxVarArr.length; i2++) {
            zzgxVarArr[i2].setIndex(i2);
            this.zzady[i2] = zzgxVarArr[i2].zzdj();
        }
        this.zzaec = new zzod();
        this.zzaeh = new zzgx[0];
        this.zzacv = new zzhd();
        this.zzacw = new zzha();
        zzmyVar.zza(this);
        this.zzadh = zzgu.zzafz;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzaed = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.zzaed.getLooper(), this);
    }

    public final void zza(zzlu zzluVar, boolean z) {
        this.handler.obtainMessage(0, 1, 0, zzluVar).sendToTarget();
    }

    public final void zze(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzgy zzgyVar, int i, long j) {
        this.handler.obtainMessage(3, new zzgm(zzgyVar, i, j)).sendToTarget();
    }

    public final void stop() {
        this.handler.sendEmptyMessage(5);
    }

    public final void zza(zzgh... zzghVarArr) {
        if (this.zzaei) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzaek++;
        this.handler.obtainMessage(11, zzghVarArr).sendToTarget();
    }

    public final synchronized void zzb(zzgh... zzghVarArr) {
        if (this.zzaei) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzaek;
        this.zzaek = i + 1;
        this.handler.obtainMessage(11, zzghVarArr).sendToTarget();
        while (this.zzael <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void release() {
        if (this.zzaei) {
            return;
        }
        this.handler.sendEmptyMessage(6);
        while (!this.zzaei) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzaed.quit();
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzb(zzgy zzgyVar, Object obj) {
        this.handler.obtainMessage(7, Pair.create(zzgyVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zza(zzls zzlsVar) {
        this.handler.obtainMessage(8, zzlsVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzec() {
        this.handler.sendEmptyMessage(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0287 A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028a A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028e A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x052c A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0533 A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0550 A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058b A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x059d A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05b9 A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, LOOP:9: B:318:0x05b9->B:322:0x05cb, LOOP_START, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0718 A[Catch: IOException -> 0x089e, zzgd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07d1  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.handleMessage(android.os.Message):boolean");
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzacs.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzg(boolean z) {
        if (this.zzadc != z) {
            this.zzadc = z;
            this.zzacs.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzed() throws zzgd {
        this.zzaej = false;
        this.zzaec.start();
        for (zzgx zzgxVar : this.zzaeh) {
            zzgxVar.start();
        }
    }

    private final void zzee() throws zzgd {
        this.zzaec.stop();
        for (zzgx zzgxVar : this.zzaeh) {
            zza(zzgxVar);
        }
    }

    private final void zzef() throws zzgd {
        zzgk zzgkVar = this.zzaes;
        if (zzgkVar == null) {
            return;
        }
        long zzhc = zzgkVar.zzadm.zzhc();
        if (zzhc != -9223372036854775807L) {
            zzdk(zzhc);
        } else {
            zzgx zzgxVar = this.zzaef;
            if (zzgxVar != null && !zzgxVar.zzeo()) {
                long zzfj = this.zzaeg.zzfj();
                this.zzaep = zzfj;
                this.zzaec.zzef(zzfj);
            } else {
                this.zzaep = this.zzaec.zzfj();
            }
            zzhc = this.zzaep - this.zzaes.zzdz();
        }
        this.zzadi.zzaev = zzhc;
        this.zzaem = SystemClock.elapsedRealtime() * 1000;
        long zzhd = this.zzaeh.length == 0 ? Long.MIN_VALUE : this.zzaes.zzadm.zzhd();
        zzgn zzgnVar = this.zzadi;
        if (zzhd == Long.MIN_VALUE) {
            zzhd = this.zzadd.zza(this.zzaes.zzadr, this.zzacw, false).zzagh;
        }
        zzgnVar.zzaew = zzhd;
    }

    private final void zza(long j, long j2) {
        this.handler.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.handler.sendEmptyMessage(2);
        } else {
            this.handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zza(int i, long j) throws zzgd {
        zzgk zzgkVar;
        zzee();
        this.zzaej = false;
        setState(2);
        zzgk zzgkVar2 = this.zzaes;
        if (zzgkVar2 == null) {
            zzgk zzgkVar3 = this.zzaeq;
            if (zzgkVar3 != null) {
                zzgkVar3.release();
            }
            zzgkVar = null;
        } else {
            zzgkVar = null;
            while (zzgkVar2 != null) {
                if (zzgkVar2.zzadr == i && zzgkVar2.zzadu) {
                    zzgkVar = zzgkVar2;
                } else {
                    zzgkVar2.release();
                }
                zzgkVar2 = zzgkVar2.zzadw;
            }
        }
        zzgk zzgkVar4 = this.zzaes;
        if (zzgkVar4 != zzgkVar || zzgkVar4 != this.zzaer) {
            for (zzgx zzgxVar : this.zzaeh) {
                zzgxVar.disable();
            }
            this.zzaeh = new zzgx[0];
            this.zzaeg = null;
            this.zzaef = null;
            this.zzaes = null;
        }
        if (zzgkVar != null) {
            zzgkVar.zzadw = null;
            this.zzaeq = zzgkVar;
            this.zzaer = zzgkVar;
            zzb(zzgkVar);
            if (this.zzaes.zzadv) {
                j = this.zzaes.zzadm.zzea(j);
            }
            zzdk(j);
            zzei();
        } else {
            this.zzaeq = null;
            this.zzaer = null;
            this.zzaes = null;
            zzdk(j);
        }
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private final void zzdk(long j) throws zzgd {
        zzgk zzgkVar = this.zzaes;
        long zzdz = j + (zzgkVar == null ? 60000000L : zzgkVar.zzdz());
        this.zzaep = zzdz;
        this.zzaec.zzef(zzdz);
        for (zzgx zzgxVar : this.zzaeh) {
            zzgxVar.zzdi(this.zzaep);
        }
    }

    private final void zzeg() {
        zzh(true);
        this.zzadz.onStopped();
        setState(1);
    }

    private final void zzh(boolean z) {
        zzgx[] zzgxVarArr;
        this.handler.removeMessages(2);
        this.zzaej = false;
        this.zzaec.stop();
        this.zzaeg = null;
        this.zzaef = null;
        this.zzaep = 60000000L;
        for (zzgx zzgxVar : this.zzaeh) {
            try {
                zza(zzgxVar);
                zzgxVar.disable();
            } catch (zzgd | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzaeh = new zzgx[0];
        zzgk zzgkVar = this.zzaes;
        if (zzgkVar == null) {
            zzgkVar = this.zzaeq;
        }
        zza(zzgkVar);
        this.zzaeq = null;
        this.zzaer = null;
        this.zzaes = null;
        zzg(false);
        if (z) {
            zzlu zzluVar = this.zzaea;
            if (zzluVar != null) {
                zzluVar.zzhm();
                this.zzaea = null;
            }
            this.zzadd = null;
        }
    }

    private static void zza(zzgx zzgxVar) throws zzgd {
        if (zzgxVar.getState() == 2) {
            zzgxVar.stop();
        }
    }

    private final boolean zzdl(long j) {
        if (j == -9223372036854775807L || this.zzadi.zzaev < j) {
            return true;
        }
        return this.zzaes.zzadw != null && this.zzaes.zzadw.zzadu;
    }

    private final void zzeh() throws IOException {
        zzgk zzgkVar = this.zzaeq;
        if (zzgkVar == null || zzgkVar.zzadu) {
            return;
        }
        zzgk zzgkVar2 = this.zzaer;
        if (zzgkVar2 == null || zzgkVar2.zzadw == this.zzaeq) {
            for (zzgx zzgxVar : this.zzaeh) {
                if (!zzgxVar.zzdm()) {
                    return;
                }
            }
            this.zzaeq.zzadm.zzha();
        }
    }

    private final void zza(Object obj, int i) {
        this.zzadi = new zzgn(0, 0L);
        zzb(obj, i);
        this.zzadi = new zzgn(0, -9223372036854775807L);
        setState(4);
        zzh(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzacs.obtainMessage(6, new zzgp(this.zzadd, obj, this.zzadi, i)).sendToTarget();
    }

    private final int zza(int i, zzgy zzgyVar, zzgy zzgyVar2) {
        int zzeq = zzgyVar.zzeq();
        int i2 = -1;
        for (int i3 = 0; i3 < zzeq && i2 == -1; i3++) {
            i = zzgyVar.zza(i, this.zzacw, this.zzacv, this.repeatMode);
            i2 = zzgyVar2.zzc(zzgyVar.zza(i, this.zzacw, true).zzadn);
        }
        return i2;
    }

    private final boolean zzn(int i) {
        this.zzadd.zza(i, this.zzacw, false);
        return !this.zzadd.zza(0, this.zzacv, false).zzagt && this.zzadd.zza(i, this.zzacw, this.zzacv, this.repeatMode) == -1;
    }

    private final Pair<Integer, Long> zza(zzgm zzgmVar) {
        zzgy zzgyVar = zzgmVar.zzadd;
        if (zzgyVar.isEmpty()) {
            zzgyVar = this.zzadd;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzgyVar, zzgmVar.zzaet, zzgmVar.zzaeu);
            zzgy zzgyVar2 = this.zzadd;
            if (zzgyVar2 == zzgyVar) {
                return zzb;
            }
            int zzc = zzgyVar2.zzc(zzgyVar.zza(((Integer) zzb.first).intValue(), this.zzacw, true).zzadn);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzgyVar, this.zzadd);
            if (zza != -1) {
                this.zzadd.zza(zza, this.zzacw, false);
                return zzb(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgt(this.zzadd, zzgmVar.zzaet, zzgmVar.zzaeu);
        }
    }

    private final Pair<Integer, Long> zzb(int i, long j) {
        return zzb(this.zzadd, i, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzgy zzgyVar, int i, long j) {
        return zza(zzgyVar, i, j, 0L);
    }

    private final Pair<Integer, Long> zza(zzgy zzgyVar, int i, long j, long j2) {
        zznr.zzc(i, 0, zzgyVar.zzep());
        zzgyVar.zza(i, this.zzacv, false, j2);
        if (j == -9223372036854775807L) {
            j = this.zzacv.zzagw;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.zzacv.zzagx + j;
        long j4 = zzgyVar.zza(0, this.zzacw, false).zzagh;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzei() {
        long zzgz = !this.zzaeq.zzadu ? 0L : this.zzaeq.zzadm.zzgz();
        if (zzgz == Long.MIN_VALUE) {
            zzg(false);
            return;
        }
        long zzdz = this.zzaep - this.zzaeq.zzdz();
        boolean zzdn = this.zzadz.zzdn(zzgz - zzdz);
        zzg(zzdn);
        if (zzdn) {
            this.zzaeq.zzadm.zzdy(zzdz);
        }
    }

    private static void zza(zzgk zzgkVar) {
        while (zzgkVar != null) {
            zzgkVar.release();
            zzgkVar = zzgkVar.zzadw;
        }
    }

    private final void zzb(zzgk zzgkVar) throws zzgd {
        if (this.zzaes == zzgkVar) {
            return;
        }
        boolean[] zArr = new boolean[this.zzacp.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            zzgx[] zzgxVarArr = this.zzacp;
            if (i < zzgxVarArr.length) {
                zzgx zzgxVar = zzgxVarArr[i];
                zArr[i] = zzgxVar.getState() != 0;
                zzmt zzax = zzgkVar.zzadx.zzbef.zzax(i);
                if (zzax != null) {
                    i2++;
                }
                if (zArr[i] && (zzax == null || (zzgxVar.zzdo() && zzgxVar.zzdl() == this.zzaes.zzado[i]))) {
                    if (zzgxVar == this.zzaef) {
                        this.zzaec.zza(this.zzaeg);
                        this.zzaeg = null;
                        this.zzaef = null;
                    }
                    zza(zzgxVar);
                    zzgxVar.disable();
                }
                i++;
            } else {
                this.zzaes = zzgkVar;
                this.zzacs.obtainMessage(3, zzgkVar.zzadx).sendToTarget();
                zza(zArr, i2);
                return;
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzgd {
        this.zzaeh = new zzgx[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzgx[] zzgxVarArr = this.zzacp;
            if (i2 >= zzgxVarArr.length) {
                return;
            }
            zzgx zzgxVar = zzgxVarArr[i2];
            zzmt zzax = this.zzaes.zzadx.zzbef.zzax(i2);
            if (zzax != null) {
                int i4 = i3 + 1;
                this.zzaeh[i3] = zzgxVar;
                if (zzgxVar.getState() == 0) {
                    zzgz zzgzVar = this.zzaes.zzadx.zzbeh[i2];
                    boolean z = this.zzacy && this.state == 3;
                    boolean z2 = !zArr[i2] && z;
                    int length = zzax.length();
                    zzgo[] zzgoVarArr = new zzgo[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        zzgoVarArr[i5] = zzax.zzau(i5);
                    }
                    zzgxVar.zza(zzgzVar, zzgoVarArr, this.zzaes.zzado[i2], this.zzaep, z2, this.zzaes.zzdz());
                    zznv zzdk = zzgxVar.zzdk();
                    if (zzdk != null) {
                        if (this.zzaeg != null) {
                            throw zzgd.zza(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzaeg = zzdk;
                        this.zzaef = zzgxVar;
                        zzdk.zzb(this.zzadh);
                    }
                    if (z) {
                        zzgxVar.start();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final /* synthetic */ void zza(zzls zzlsVar) {
        this.handler.obtainMessage(9, zzlsVar).sendToTarget();
    }
}
