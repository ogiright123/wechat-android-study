package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.ab.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;

final class nh
  implements cm
{
  nh(String paramString, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str = paramMenuItem.getTitle();
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = str;
    arrayOfObject1[1] = this.dVe;
    z.i("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "connector click[text]: to[%s] text[%s]", arrayOfObject1);
    h localh = new h(str, this.dVe, y.dR(str));
    bg.qX().d(localh);
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Integer.valueOf(1);
    arrayOfObject2[1] = Integer.valueOf(1);
    arrayOfObject2[2] = str;
    localn.d(10424, arrayOfObject2);
    e.aw(this.dLL, this.dLL.getString(com.tencent.mm.n.bue));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nh
 * JD-Core Version:    0.6.2
 */