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


class CartAdapeter(
    var context: Context,

    ) : RecyclerView.Adapter<CartAdapeter.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cart_design, parent, false)
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

            holder.prod_name.setText("Pet chair")
            holder.total.setText("$126.00")
            holder.price.setText("$126.00")
            Picasso.get()
                .load(R.drawable.pet_c_1)
                .into(holder.image)

        }


        if (position == 1) {

            holder.prod_name.setText("Pet carrier")
            holder.total.setText("$235.00")
            holder.price.setText("$235.00")
            Picasso.get()
                .load(R.drawable.pet_c_2)
                .into(holder.image)

        }



        if (position == 2) {

            holder.prod_name.setText("Red dog bed")
            holder.total.setText("$189.00")
            holder.price.setText("$189.00")

            Picasso.get()
                .load(R.drawable.pet_c_3)
                .into(holder.image)

        }


        if (position == 3) {

            holder.prod_name.setText("Dog toy collor")
            holder.total.setText("$289.00")
            holder.price.setText("$289.00")




            Picasso.get()
                .load(R.drawable.pet_c_4)
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
        return 4
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var prod_name: TextView
        lateinit var price: TextView
        lateinit var total: TextView
        lateinit var card: LinearLayout


        init {
            image = itemView.findViewById(R.id.image)
            prod_name = itemView.findViewById(R.id.prod_name)
            price = itemView.findViewById(R.id.price)
            total = itemView.findViewById(R.id.total)
            card = itemView.findViewById(R.id.card)


        }

    }


}