package com.example.jeffreyjin.powermanageractivity1;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.unity3d.player.UnityPlayerNativeActivityPico;

import static android.content.Context.BATTERY_SERVICE;
public class PowerManagerActivity extends UnityPlayerNativeActivityPico {
    public static Activity unityActivity = null;
        private TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        unityActivity = this;
        //setContentView( R.layout.activity_power_manager );
        //BatteryManager batteryManager = (BatteryManager)getSystemService(BATTERY_SERVICE);
        //int battery = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        //textView=(TextView)findViewById( R.id.setText );
        //text = (TextView) findViewById( R.id.text );
       // textView.setText( battery+ "" );
        //Log.e( "battery","battery=" +battery);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String getCurrentBattery(){
        BatteryManager batteryManager = (BatteryManager)getSystemService(BATTERY_SERVICE);
        int battery = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        return battery+"";
    }
}

