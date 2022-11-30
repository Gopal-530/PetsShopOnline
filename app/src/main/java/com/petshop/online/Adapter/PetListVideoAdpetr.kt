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
import com.petshop.online.`interface`.OnClickInterface
import com.squareup.picasso.Picasso


class PetListVideoAdpetr(
    var context: Context,
    var click:OnClickInterface

    ) : RecyclerView.Adapter<PetListVideoAdpetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.pet_list_view, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        //  setFadeAnimation(holder.image);
/*
        if (position==0){
            holder.text.visibility=View.INVISIBLE
            holder.image.visibility=View.INVISIBLE
        }*/




        holder.llLayout.setOnClickListener {

            click.onclick("")




        }


        if (position == 0) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore1)
                .into(holder.image)
*/


        }

        if (position == 1) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore2)
                .into(holder.image)
*/


        }
        if (position == 2) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore3)
                .into(holder.image)
*/


        }

        if (position == 3) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore4)
                .into(holder.image)
*/


        }

        if (position == 4) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore5)
                .into(holder.image)
*/


        }
        if (position == 5) {
            holder.text.setText("PET BRASH")

/*
            Picasso.get()
                .load(R.drawable.explore6)
                .into(holder.image)
*/


        }



     /*   holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )*/


    }

    override fun getItemCount(): Int {
        return 6
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView
        lateinit var llLayout: LinearLayout

        lateinit var card: CardView


        init {
            image = itemView.findViewById(R.id.ivImgee)
            text = itemView.findViewById(R.id.tvText)
            card = itemView.findViewById(R.id.card)
            llLayout = itemView.findViewById(R.id.llLayout)


        }

    }


}