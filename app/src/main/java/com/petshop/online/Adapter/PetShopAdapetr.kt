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
import com.petshop.online.`interface`.OnClickInterface
import com.squareup.picasso.Picasso


class PetShopAdapetr(
    var context: Context,
    val click:OnClickInterface


    ) : RecyclerView.Adapter<PetShopAdapetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.pet_shop_screen, parent, false)
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

            holder.text.setText("Free Delivery")
            holder.price.setText("Schedule:Same Day/Next day")
            Picasso.get()
                .load(R.drawable.brands1)
                .into(holder.image)

        }


        if (position == 1) {

            holder.text.setText("Free Delivery")
            holder.price.setText("Schedule:Same Day/Next day")
            Picasso.get()
                .load(R.drawable.brands2)
                .into(holder.image)

        }



        if (position == 2) {

            holder.text.setText("Free Delivery")
            holder.price.setText("Schedule:Same Day/Next day")
            Picasso.get()
                .load(R.drawable.brands3)
                .into(holder.image)

        }


        if (position == 3) {

            holder.text.setText("Free Delivery")
            holder.price.setText("Schedule:Same Day/Next day")
            Picasso.get()
                .load(R.drawable.brands4)
                .into(holder.image)

        }

        if (position == 4) {

            holder.text.setText("Free Delivery")
            holder.price.setText("Schedule:Same Day/Next day")

            Picasso.get()
                .load(R.drawable.brands5)
                .into(holder.image)

        }



        holder.card.setOnClickListener {
            click.onclick("")
        }

      /*  holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )*/


    }

    override fun getItemCount(): Int {
        return 5
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView
        lateinit var price: TextView

        lateinit var card: LinearLayout


        init {
            image = itemView.findViewById(R.id.ivImgee)
            text = itemView.findViewById(R.id.tvText)
            price = itemView.findViewById(R.id.price)
            card = itemView.findViewById(R.id.card)


        }

    }


}