package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.k;
import com.tencent.mm.storage.ar;

final class ff extends fd
{
  public ff()
  {
    super(24);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcF);
      paramView.setTag(new ph(this.fjl).aB(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    ph.a((ph)paramck, paramar, true, paramInt, paramhd);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ff
 * JD-Core Version:    0.6.2
 */