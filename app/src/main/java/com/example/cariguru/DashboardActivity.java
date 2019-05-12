package com.example.cariguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView nameuser, status, profile, carisekolah, setting, mainmenus,
            pagetitle, pagesubtitle;

    Button btnfaq;
    ImageButton btnsetting, btncarisekolah, btnprofile;
    Animation atg, atgtwo, atgthree;
    ImageView avatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);
        atgthree = AnimationUtils.loadAnimation(this, R.anim.atgthree);

        nameuser = findViewById(R.id.nameuser);
        status = findViewById(R.id.status);
        avatar = findViewById(R.id.icfaq);

        profile = findViewById(R.id.profile);
        carisekolah = findViewById(R.id.carisekolah);
        setting = findViewById(R.id.setting);
        mainmenus = findViewById(R.id.mainmenus);


        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);

        btnfaq = findViewById(R.id.btnfaq);

        btnfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faq = new Intent(DashboardActivity.this,FAQActivity.class);
                startActivity(faq);
            }
        });

//        btncarisekolah = findViewById(R.id.btncarisekolah);
//
//        btncarisekolah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent cs = new Intent(DashboardActivity.this,CariSekolahActivity.class);
//                startActivity(cs);
//            }
//        });

        btnprofile =  findViewById(R.id.btnprofile);
        btnsetting = findViewById(R.id.btnsetting);


        // pass an animation
        avatar.startAnimation(atg);

        pagetitle.startAnimation(atgtwo);
        pagesubtitle.startAnimation(atgtwo);

        btnfaq.startAnimation(atgthree);
    }

}
