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
import com.petshop.online.ResponseApi.StoreGalleriesResponse
import com.petshop.online.ResponseApi.TopratedSeller
import com.squareup.picasso.Picasso


class Adapter1(
    var context: Context,
    var list: ArrayList<TopratedSeller.Data>
) : RecyclerView.Adapter<Adapter1.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy1_layout, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        holder.text.text = list[position].companyname
        Picasso.get()
            .load(list[position].ImagePath)
            .into(holder.image)
        /* if (position == 0) {
             holder.ll1.visibility = View.GONE
             holder.ll2.visibility = View.VISIBLE


         } else {
             holder.ll2.visibility = View.GONE
             holder.ll1.visibility = View.VISIBLE

         }*/


        holder.ll2.visibility = View.GONE
        holder.ll1.visibility = View.VISIBLE


        //---for static data ---//
/*

        if (position == 1) {
            holder.text.text = "Pet Seller 1"

            Picasso.get()
                .load(R.drawable.categories1)
                .into(holder.image)
        }
        if (position == 2) {
            holder.text.text = "Pet Seller 2"

            Picasso.get()
                .load(R.drawable.categories2)
                .into(holder.image)
        }
        if (position == 3) {
            holder.text.text = "Pet Seller 3"

            Picasso.get()
                .load(R.drawable.categories3)
                .into(holder.image)
        }
        if (position == 4) {
            holder.text.text = "Pet Seller 4"

            Picasso.get()
                .load(R.drawable.categories4)

                .into(holder.image)
        }
        if (position == 5) {
            holder.text.text = "Pet Seller 5"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
        if (position == 6) {
            holder.text.text = "Pet Seller 6"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
        if (position == 7) {
            holder.text.text = "Pet Seller 7"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
        if (position == 8) {
            holder.text.text = "Pet Seller 8"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
        if (position == 9) {
            holder.text.text = "Pet Seller 9"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
        if (position == 10) {
            holder.text.text = "Pet Seller 10"

            Picasso.get()
                .load(R.drawable.categories5)
                .into(holder.image)
        }
*/


//---end ---//


        holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )


    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setFadeAnimation(view: View) {
        val anim = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 500
        view.startAnimation(anim)
    }

    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView
        lateinit var tvText: TextView
        lateinit var card: CardView
        lateinit var ll1: RelativeLayout
        lateinit var ll2: LinearLayout


        init {
            image = itemView.findViewById(R.id.image1)
            text = itemView.findViewById(R.id.text1)
            ll1 = itemView.findViewById(R.id.ll1)
            ll2 = itemView.findViewById(R.id.ll2)

            card = itemView.findViewById(R.id.card)


        }

    }


}
