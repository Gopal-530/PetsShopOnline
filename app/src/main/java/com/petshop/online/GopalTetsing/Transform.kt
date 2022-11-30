package com.petshop.online.GopalTetsing


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.util.Pair
import com.petshop.online.GopalTetsing.Fragment.One
import com.petshop.online.R
import kotlinx.android.synthetic.main.activity_transformation.*


class Transform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformation)


      /*  imge.setOnClickListener {

            *//* val intent = Intent(this, Two::class.java)
             startActivity(intent)*//*
            *//* val p1 = Pair.create<View, String>(imge, "imageTrans")

             val intent = Intent(this, Two::class.java)
             startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this,p1)

 *//*



            val intent = Intent(this, Two::class.java)
            val pair1 = Pair.create<View, String>(imge, "imageTrans")
            val pair2 = Pair.create<View, String>(imge, "imageTrans")
           *//* val options = ActivityOptions.makeSceneTransitionAnimation(activity, pair1, pair2)
            ActivityOptions.startActivity(activity, intent, options.toBundle())*//*
            val options =
                ActivityOptionsCompat.makeSceneTransitionAnimation(this,pair1)
            startActivity(this, intent, options.toBundle())
        }*/



        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameContainer, One())
        transaction.commit()

    }
}