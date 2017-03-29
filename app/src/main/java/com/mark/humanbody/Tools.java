package com.mark.humanbody;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Mark on 2/18/2017.
 */

public class Tools {
    public  static  void setFullScreen(Activity activity){
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public int getDrawableId(ImageView iv) {
        return (Integer) iv.getTag();
    }
}
