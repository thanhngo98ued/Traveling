package com.example.travelingapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.core.graphics.toColor
import com.squareup.picasso.Picasso

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, intent.getIntExtra("key", 1).toString(), Toast.LENGTH_SHORT).show()


        Picasso.get()
            .load("https://danangaz.com/wp-content/uploads/2018/07/du-thuy%E1%BB%81n-s%C3%B4ng-h%C3%A0n-%C4%91%C3%A0-n%E1%BA%B5ng-4.png")
            .into(findViewById<ImageView>(R.id.imageViewMain2))
        findViewById<TextView>(R.id.txtOverview).setOnClickListener(setOnclickFragment)
        findViewById<TextView>(R.id.txtGallary).setOnClickListener(setOnclickFragment)
        findViewById<TextView>(R.id.txtReview).setOnClickListener(setOnclickFragment)
        findViewById<TextView>(R.id.txtMore).setOnClickListener(setOnclickFragment)


    }

    private var setOnclickFragment = View.OnClickListener { v: View ->
        when (v.id) {

            R.id.txtOverview -> {
                replaceFragment(R.id.frame, FragmentOverview())
                bgTextFragment()
                val textView = findViewById<TextView>(R.id.txtOverview)
                textView.background =
                    resources.getDrawable(R.drawable.bgfragment)
                textView.setTextColor(Color.BLACK)
            }
            R.id.txtGallary -> {
                replaceFragment(R.id.frame, GalleryFragment())
                bgTextFragment()
                val textView = findViewById<TextView>(R.id.txtGallary)
                textView.background =
                    resources.getDrawable(R.drawable.bgfragment)
                textView.setTextColor(Color.BLACK)
            }
            R.id.txtReview -> {
                bgTextFragment()
                val textView = findViewById<TextView>(R.id.txtReview)
                textView.background =
                    resources.getDrawable(R.drawable.bgfragment)
                textView.setTextColor(Color.BLACK)
            }
            R.id.txtMore -> {
                bgTextFragment()
                val textView = findViewById<TextView>(R.id.txtMore)
                textView.background =
                    resources.getDrawable(R.drawable.bgfragment)
                textView.setTextColor(Color.BLACK)
            }
        }
    }

    private fun bgTextFragment() {
        findViewById<TextView>(R.id.txtOverview).background = Color.WHITE.toDrawable()
        findViewById<TextView>(R.id.txtGallary).background = Color.WHITE.toDrawable()
        findViewById<TextView>(R.id.txtReview).background = Color.WHITE.toDrawable()
        findViewById<TextView>(R.id.txtMore).background = Color.WHITE.toDrawable()
    }


}
