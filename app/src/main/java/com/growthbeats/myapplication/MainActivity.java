package com.growthbeats.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:9632443283;7829158666"));
        smsIntent.putExtra("sms_body", "sms message goes here");
        startActivity(smsIntent);
    }
}
