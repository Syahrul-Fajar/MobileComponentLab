package com.informatika.mobilecomponentfajar.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.informatika.mobilecomponentfajar.util.NotificationHelper;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String title = intent.getStringExtra("title");

        NotificationHelper.showNotification(context, title, "Waktunya menyelesaikan tugas!");
    }
}
