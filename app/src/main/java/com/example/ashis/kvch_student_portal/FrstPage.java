package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.Locale;

public class FrstPage extends AppCompatActivity {

    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frst_page);
        {

            (new Handler()).postDelayed(new Runnable() {


                @Override
                public void run() {
                    startActivity(new Intent(FrstPage.this, login.class));
                    finish();

                }
            }, 5000);
            tts = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    int res = tts.setLanguage(Locale.ENGLISH);
                    if (res == TextToSpeech.LANG_AVAILABLE) {
                        speakout();
                    }
                }
                }


            });
        }
    }

    public void speakout() {
        tts.setSpeechRate(1.0f);
        tts.setPitch(0.8f);
        tts.speak("Welcome to the Student Portal of KVCH", TextToSpeech.QUEUE_FLUSH, null);
    }
}
