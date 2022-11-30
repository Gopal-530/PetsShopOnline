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



class BestSellerAdapter(
    var context: Context,
    ) : RecyclerView.Adapter<BestSellerAdapter.ExerciseHodlder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy_best, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {

            holder.tvRate.text = "Aed 15"+position.toString()
            holder.shpName.text = "Shop Name"

            Picasso.get()
                .load(R.drawable.products_ads2)
                .into(holder.image)


        holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )
    }

    override fun getItemCount(): Int {
        return 8
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var tvRate: TextView
        lateinit var shpName: TextView
        lateinit var card: CardView


        init {
            image = itemView.findViewById(R.id.imgrr)
            tvRate = itemView.findViewById(R.id.tvRate)
            shpName = itemView.findViewById(R.id.shpName)
            card = itemView.findViewById(R.id.card)

        }

    }


}
