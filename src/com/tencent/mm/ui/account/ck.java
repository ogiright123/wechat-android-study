package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class ck
  implements TextView.OnEditorActionListener
{
  ck(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 6) || (paramInt == 5))
    {
      LoginHistoryUI.c(this.iPx);
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ck
 * JD-Core Version:    0.6.2
 */