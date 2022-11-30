package com.petshop.online.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.R
import com.petshop.online.ResponseApi.ExploreResponse
import com.squareup.picasso.Picasso


class ExploreAdpetr(
    var context: Context,
    var explorelist: ArrayList<ExploreResponse.Data>
    ) : RecyclerView.Adapter<ExploreAdpetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy_explore, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        //  setFadeAnimation(holder.image);
/*
        if (position==0){
            holder.text.visibility=View.INVISIBLE
            holder.image.visibility=View.INVISIBLE
        }*/


        holder.text.setText(explorelist[position].title)
        Picasso.get()
            .load(explorelist[position].ImagePath)
            .into(holder.image)


/*

        if (position == 0) {
            holder.text.setText("Cat Litters")

            Picasso.get()
                .load(R.drawable.explore1)
                .into(holder.image)


        }

        if (position == 1) {
            holder.text.setText("Cat Accessories")

            Picasso.get()
                .load(R.drawable.explore2)
                .into(holder.image)


        }
        if (position == 2) {
            holder.text.setText("Dog Accessories")

            Picasso.get()
                .load(R.drawable.explore3)
                .into(holder.image)


        }

        if (position == 3) {
            holder.text.setText("Birds Accesories")

            Picasso.get()
                .load(R.drawable.explore4)
                .into(holder.image)


        }

        if (position == 4) {
            holder.text.setText("Cat Food")

            Picasso.get()
                .load(R.drawable.explore5)
                .into(holder.image)


        }
        if (position == 5) {
            holder.text.setText("Dog Food")

            Picasso.get()
                .load(R.drawable.explore6)
                .into(holder.image)


        }

*/


        holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )


    }

    override fun getItemCount(): Int {
        return explorelist.size
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView

        lateinit var card: LinearLayout


        init {
            image = itemView.findViewById(R.id.ivCrImage)
            text = itemView.findViewById(R.id.ivText)
            card = itemView.findViewById(R.id.card)


        }

    }


}