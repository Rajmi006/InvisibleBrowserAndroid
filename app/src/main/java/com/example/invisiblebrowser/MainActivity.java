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
    public void openInstagram(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epicgames.com/fortnite/en-US/news/category/patch%20notes"));
        startActivity(launchIntent);

    }

    public void openXbox(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xbox.com/hu-HU/"));
        startActivity(launchIntent);

    }

    public void openTeams(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&rver=7.3.6963.0&wp=MBI_SSL&wreply=https%3a%2f%2fproducts.office.com%2fen-US%2fmicrosoft-teams%2fgroup-chat-software&lc=1033&id=290950&aadredir=1"));
        startActivity(launchIntent);

    }

    public void openPlayStation(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.playstation.com/hu-hu/"));
        startActivity(launchIntent);

    }

    public void openSkype(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skype.com/hu/"));
        startActivity(launchIntent);

    }

    public void openDiscord(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://discordapp.com/download"));
        startActivity(launchIntent);

    }

    public void openTwitch(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/"));
        startActivity(launchIntent);

    }

    public void openYoutube(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
        startActivity(launchIntent);

    }

    public void openTell(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tell.hu/hu"));
        startActivity(launchIntent);

    }

    public void openClassroom(View view){
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com"));
        startActivity(launchIntent);

    }

}
