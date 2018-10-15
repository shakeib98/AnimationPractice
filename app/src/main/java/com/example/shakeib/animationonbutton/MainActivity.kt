package com.example.shakeib.animationonbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation = AnimationUtils.loadAnimation(this,R.anim.btn_anim)
        val image = findViewById<ImageView>(R.id.img)

        image.setOnClickListener {
            image.startAnimation(animation)
        }

        animation.setAnimationListener(object:Animation.AnimationListener{
            override fun onAnimationRepeat(animation: Animation?) {


            }

            override fun onAnimationEnd(animation: Animation?) {
                image.setImageResource(R.drawable.call_end)
                Toast.makeText(this@MainActivity,"AnimationCompleted",Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationStart(animation: Animation?) {
                image.setImageResource(R.drawable.call_one)
            }
        })
    }
}
