package com.example.travelingapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var users: MutableList<Catelogy>

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerMain = findViewById<RecyclerView>(R.id.recyclerMain)
        getData()
        recyclerMain.apply {
            layoutManager = LinearLayoutManager(baseContext, LinearLayout.HORIZONTAL, false)
            val dividerItemDecoration = DividerItemDecoration(baseContext, DividerItemDecoration.HORIZONTAL)
            addItemDecoration(dividerItemDecoration)
            adapter = AdapterCatelogy(users){
                startActivity(Intent(baseContext, MainActivity2::class.java).apply {
                    putExtra("key",it)
                })
            }
        }

    }

    fun getData() {

        users = mutableListOf()
        users.add(Catelogy("https://www.tibco.com/blog/wp-content/uploads/2017/12/traveling.png", "Ha Noi"))
        users.add(Catelogy("https://antholagroup.com/sg/wp-content/uploads/2017/05/Beautiful-travel-destinations.png", "Nghe AN"))
        users.add(Catelogy("https://d1pb8aabzv3848.cloudfront.net/wp-content/uploads/2020/08/andy-holmes-XZ8AiqUcbD8-unsplash-1660x1106.jpg", "Ho Chi Minh"))
        users.add(Catelogy("https://25iei81rt9iiazfed2lhosna-wpengine.netdna-ssl.com/wp-content/uploads/2019/11/john-lee-oMneOBYhJxY-unsplash-1160x770.jpg" ,"Da Nang"))
        users.add(Catelogy("https://www.traveller.com.au/content/dam/images/h/1/2/1/l/5/image.gallery.galleryLandscape.620x414.h11zt2.png/1530510232612.jpg", "Quang Nam"))
        users.add(Catelogy("https://www.tibco.com/blog/wp-content/uploads/2017/12/traveling.png", "Can Tho"))
        users.add(Catelogy("https://antholagroup.com/sg/wp-content/uploads/2017/05/Beautiful-travel-destinations.png", "Ca mau"))
        users.add(Catelogy("https://d1pb8aabzv3848.cloudfront.net/wp-content/uploads/2020/08/andy-holmes-XZ8AiqUcbD8-unsplash-1660x1106.jpg", "Lam Dong"))
        users.add(Catelogy("https://25iei81rt9iiazfed2lhosna-wpengine.netdna-ssl.com/wp-content/uploads/2019/11/john-lee-oMneOBYhJxY-unsplash-1160x770.jpg" ,"Hue"))
        users.add(Catelogy("https://www.traveller.com.au/content/dam/images/h/1/2/1/l/5/image.gallery.galleryLandscape.620x414.h11zt2.png/1530510232612.jpg", "1503"))
        users.add(Catelogy("https://www.tibco.com/blog/wp-content/uploads/2017/12/traveling.png", "1503"))
        users.add(Catelogy("https://antholagroup.com/sg/wp-content/uploads/2017/05/Beautiful-travel-destinations.png", "1503"))
        users.add(Catelogy("https://d1pb8aabzv3848.cloudfront.net/wp-content/uploads/2020/08/andy-holmes-XZ8AiqUcbD8-unsplash-1660x1106.jpg", "1503"))
        users.add(Catelogy("https://25iei81rt9iiazfed2lhosna-wpengine.netdna-ssl.com/wp-content/uploads/2019/11/john-lee-oMneOBYhJxY-unsplash-1160x770.jpg" ,"1503"))
        users.add(Catelogy("https://www.traveller.com.au/content/dam/images/h/1/2/1/l/5/image.gallery.galleryLandscape.620x414.h11zt2.png/1530510232612.jpg", "1503"))

    }
}
