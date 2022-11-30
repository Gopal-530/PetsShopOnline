package com.petshop.online.fragment

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.petshop.online.R
import com.petshop.online.SliderData
import com.smarteist.autoimageslider.SliderViewAdapter


class ProductsDetailsAdapter(private var mContext: Context, sliderDataArrayList: ArrayList<SliderData>) :
    SliderViewAdapter<ProductsDetailsAdapter.SliderAdapterViewHolder>() {
    // list for storing urls of images.
    private val mSliderItems: List<SliderData>

    // We are inflating the slider_layout
    // inside on Create View Holder method.
    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterViewHolder {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.slider_layout, null)
        return SliderAdapterViewHolder(inflate)
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    override fun onBindViewHolder(viewHolder: SliderAdapterViewHolder, position: Int) {
        val sliderItem: SliderData = mSliderItems[position]

        // Glide is use to load image
        // from url in your imageview.


        if (position==0){
            Glide.with(mContext)
                .load(R.drawable.one)
                .fitCenter()
                .into(viewHolder.imageViewBackground)
        }else if (position==1){
            Glide.with(mContext)
                .load(R.drawable.two)
                .fitCenter()
                .into(viewHolder.imageViewBackground)
        }else if (position==2){
            Glide.with(mContext)
                .load(R.drawable.three)
                .fitCenter()
                .into(viewHolder.imageViewBackground)
        }



    }

    // this method will return
    // the count of our list.
    override fun getCount(): Int {
        return mSliderItems.size
    }

    class SliderAdapterViewHolder(itemView: View) :
        ViewHolder(itemView) {
        // Adapter class for initializing
        // the views of our slider view.
        lateinit var itemView: View
        var imageViewBackground: ImageView

        init {
            imageViewBackground = itemView.findViewById(R.id.myimage)

        }
    }

    // Constructor
    init {
        mSliderItems = sliderDataArrayList
    }
}
