package com.petshop.online.Adapter

import android.content.Context
import android.graphics.Paint
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
import kotlinx.android.synthetic.main.fragment_category_list_details.*


class PetShopPricingAdapetr(
    var context: Context,

    ) : RecyclerView.Adapter<PetShopPricingAdapetr.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.pet_shop_pricing_design, parent, false)
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

            holder.mrp_one.setPaintFlags(holder.mrp_one.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_two.setPaintFlags(holder.mrp_two.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_three.setPaintFlags(holder.mrp_three.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_four.setPaintFlags(holder.mrp_four.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)


        }


        if (position == 1) {
            holder.mrp_one.setPaintFlags(holder.mrp_one.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_two.setPaintFlags(holder.mrp_two.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_three.setPaintFlags(holder.mrp_three.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_four.setPaintFlags(holder.mrp_four.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        }



        if (position == 2) {

            holder.mrp_one.setPaintFlags(holder.mrp_one.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_two.setPaintFlags(holder.mrp_two.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_three.setPaintFlags(holder.mrp_three.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_four.setPaintFlags(holder.mrp_four.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        }


        if (position == 3) {
            holder.mrp_one.setPaintFlags(holder.mrp_one.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_two.setPaintFlags(holder.mrp_two.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_three.setPaintFlags(holder.mrp_three.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_four.setPaintFlags(holder.mrp_four.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)


        }

        if (position == 4) {

            holder.mrp_one.setPaintFlags(holder.mrp_one.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_two.setPaintFlags(holder.mrp_two.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_three.setPaintFlags(holder.mrp_three.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            holder.mrp_four.setPaintFlags(holder.mrp_four.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

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

        lateinit var card: CardView
        lateinit var mrp_one: TextView
        lateinit var mrp_two: TextView
        lateinit var mrp_three: TextView
        lateinit var mrp_four: TextView


        init {
            card = itemView.findViewById(R.id.card)

            mrp_one = itemView.findViewById(R.id.mrp_one)
            mrp_two = itemView.findViewById(R.id.mrp_two)
            mrp_three = itemView.findViewById(R.id.mrp_three)
            mrp_four = itemView.findViewById(R.id.mrp_four)


        }

    }


}