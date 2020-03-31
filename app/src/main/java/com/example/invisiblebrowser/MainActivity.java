package com.example.invisiblebrowser;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
Window window;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=2) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.red));
        }



    }
    public void openTwitter(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.facebook.com"));
        startActivity(launchIntent);

    }

}
