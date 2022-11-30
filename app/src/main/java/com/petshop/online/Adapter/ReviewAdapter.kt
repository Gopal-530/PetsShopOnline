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


class ReviewAdapter(
    var context: Context,

    ) : RecyclerView.Adapter<ReviewAdapter.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy_review, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        if (position == 0) {
            holder.tvName.text = "James Andy"
            holder.tvDesignation.text = "Designer"

            Picasso.get()
                .load(R.drawable.james)
                .into(holder.image)

        }

        if (position == 1) {
            holder.tvName.text = "kelly Brown"
            holder.tvDesignation.text = "Manager"

            Picasso.get()
                .load(R.drawable.kelly)
                .into(holder.image)

        }

        if (position == 2) {
            holder.tvName.text = "Sarah Taylor"
            holder.tvDesignation.text = "Developer"

            Picasso.get()
                .load(R.drawable.sarah)
                .into(holder.image)

        }

        if (position == 3) {
            holder.tvName.text = "James Andy"
            holder.tvDesignation.text = "Designer"

            Picasso.get()
                .load(R.drawable.james)
                .into(holder.image)

        }

        if (position == 4) {
            holder.tvName.text = "kelly Brown"
            holder.tvDesignation.text = "Manager"

            Picasso.get()
                .load(R.drawable.kelly)
                .into(holder.image)

        }

        if (position == 5) {
            holder.tvName.text = "Sarah Taylor"
            holder.tvDesignation.text = "Developer"

            Picasso.get()
                .load(R.drawable.sarah)
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
        return 6
    }

    fun setFadeAnimation(view: View) {
        val anim = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 500
        view.startAnimation(anim)
    }

    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var tvName: TextView
        lateinit var tvDesignation: TextView
        lateinit var card: CardView
        lateinit var ll1: RelativeLayout
        lateinit var ll2: LinearLayout


        init {
            image = itemView.findViewById(R.id.image)
            tvName = itemView.findViewById(R.id.tvName)
            tvDesignation = itemView.findViewById(R.id.tvDesignation)

            card = itemView.findViewById(R.id.card)


        }

    }


}
