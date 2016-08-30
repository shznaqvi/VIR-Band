package com.example.hassannaqvi.virband;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by hassan.naqvi on 8/25/2016.
 */
public class Msg {
    public static void m(String msg) {
        Log.d("SHZN", msg);
    }

    public static void t(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}
