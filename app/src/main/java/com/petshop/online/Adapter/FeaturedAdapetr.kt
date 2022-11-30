package com.petshop.online.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.R
import com.squareup.picasso.Picasso


class FeaturedAdapetr(
    var context: Context,

    ) : RecyclerView.Adapter<FeaturedAdapetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy_feature, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        //  setFadeAnimation(holder.image);
/*
        if (position==0){
            holder.text.visibility=View.INVISIBLE
            holder.image.visibility=View.INVISIBLE
        }*/



        if (position == 0) {

            holder.text.setText("Pet Store 1")

            Picasso.get()
                .load(R.drawable.shop3)
                .into(holder.image)

        }


        if (position == 1) {

            holder.text.setText("Pet Store 2")

            Picasso.get()
                .load(R.drawable.shop4)
                .into(holder.image)

        }



        if (position == 2) {

            holder.text.setText("Pet Store 3")

            Picasso.get()
                .load(R.drawable.shop5)
                .into(holder.image)

        }


        if (position == 3) {

            holder.text.setText("Pet Store 4")

            Picasso.get()
                .load(R.drawable.shop6)
                .into(holder.image)

        }

        if (position == 4) {

            holder.text.setText("Pet Store 5")

            Picasso.get()
                .load(R.drawable.shop7)
                .into(holder.image)

        }




        holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )


    }

    override fun getItemCount(): Int {
        return 5
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView

        lateinit var card: CardView


        init {
            image = itemView.findViewById(R.id.ivImgee)
            text = itemView.findViewById(R.id.tvText)
            card = itemView.findViewById(R.id.card)


        }

    }


}