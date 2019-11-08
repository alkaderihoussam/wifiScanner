package com.example.wifiscarnner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showWifiInfos(View view) {

        TextView ssidField = (TextView) findViewById(R.id.ssid);
        TextView netidField = (TextView) findViewById(R.id.netid);
        TextView debitField = (TextView) findViewById(R.id.debit);
        TextView freqField = (TextView) findViewById(R.id.freq);
        TextView macField = (TextView) findViewById(R.id.mac);
        TextView rssiField = (TextView) findViewById(R.id.rssi);

        WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        //wifiManager.setWifiEnabled(true);


        if (wifi.isWifiEnabled()){

        WifiInfo currentWifiNetworkInfo = wifiManager.getConnectionInfo();

        ssidField.setText(currentWifiNetworkInfo.getSSID());
        netidField.setText(Integer.toString(currentWifiNetworkInfo.getNetworkId()));
        debitField.setText(Integer.toString(currentWifiNetworkInfo.getLinkSpeed()));
        freqField.setText(Integer.toString(currentWifiNetworkInfo.getFrequency()));
        macField.setText(currentWifiNetworkInfo.getMacAddress());
        rssiField.setText(Integer.toString(currentWifiNetworkInfo.getRssi()));

        }
        else
            Toast.makeText(getApplicationContext(),"enable the WIFI", Toast.LENGTH_LONG).show();

    }
}
