package com.example.invisiblebrowser;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.prof.rssparser.Channel;
import com.prof.rssparser.OnTaskCompleted;
import com.prof.rssparser.Parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Window window;
    Parser par;
    ImageLoader img;
    ArrayList<String> hirek;
    ArrayAdapter adapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=2) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.red));
        }

        par = new Parser();

        // Create global configuration and initialize ImageLoader with this config
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);

        img = ImageLoader.getInstance();

        hirek = new ArrayList<>();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, hirek);

        RecyclerView hirekList = (RecyclerView) findViewById(R.id.hirekLista);

        handleNews(hirekList);
    }

    void handleNews(RecyclerView lista){

        par.onFinish(new OnTaskCompleted() {

            //what to do when the parsing is done
            @Override
            public void onTaskCompleted(Channel channel) {
                // Use the channel info
                for(int i = 0; i < channel.getArticles().size(); i++){

                }
            }

            //what to do in case of error
            @Override
            public void onError(Exception e) {
                // Handle the exception
            }
        });
        par.execute("https://www.gamestar.hu/site/rss/rss.xml");
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
