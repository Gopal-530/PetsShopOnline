package com.petshop.online.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.petshop.online.MainActivity
import com.petshop.online.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        Handler().postDelayed(Runnable {


            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            //code t go new activity

        },3000L)
    }


}
