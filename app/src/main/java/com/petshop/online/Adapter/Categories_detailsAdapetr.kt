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


class Categories_detailsAdapetr(
    var context: Context,
    var click:OnClickInterface


    ) : RecyclerView.Adapter<Categories_detailsAdapetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.categories_details_screen, parent, false)
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

            holder.text.setText("Pet Brash")
            holder.price.setText("$35")
            Picasso.get()
                .load(R.drawable.products1)
                .into(holder.image)

        }


        if (position == 1) {

            holder.text.setText("Cat Toilet bowl")
            holder.price.setText("$235")
            Picasso.get()
                .load(R.drawable.products2)
                .into(holder.image)

        }



        if (position == 2) {

            holder.text.setText("Stack pet collars")
            holder.price.setText("$95")
            Picasso.get()
                .load(R.drawable.products5)
                .into(holder.image)

        }


        if (position == 3) {

            holder.text.setText("Dog Toy")
            holder.price.setText("$125")
            Picasso.get()
                .load(R.drawable.products6)
                .into(holder.image)

        }

        if (position == 4) {

            holder.text.setText("Pet Toy")
            holder.price.setText("$25")

            Picasso.get()
                .load(R.drawable.products8)
                .into(holder.image)

        }



        holder.card.setOnClickListener {
            click.onclick("")
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
        lateinit var price: TextView

        lateinit var card: CardView


        init {
            image = itemView.findViewById(R.id.ivImgee)
            text = itemView.findViewById(R.id.tvText)
            price = itemView.findViewById(R.id.price)
            card = itemView.findViewById(R.id.card)


        }

    }


}