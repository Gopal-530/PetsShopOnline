package com.petshop.online.Adapter

import android.content.Context
import android.media.MediaPlayer.OnCompletionListener
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.R


class SponsoredAdapter(
    var context: Context,

    ) : RecyclerView.Adapter<SponsoredAdapter.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.sponsoredlayout, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {
        var path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video1

        if (position == 0) {
            path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video1
            holder.vdeovw.setVideoURI(Uri.parse(path))
            holder.vdeovw.start()
            holder.vdeovw.setOnCompletionListener(OnCompletionListener {

                holder.vdeovw.start()
            })
        }

        if (position == 1) {
            path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video2
            holder.vdeovw.setVideoURI(Uri.parse(path))
            holder.vdeovw.start()
            holder.vdeovw.setOnCompletionListener(OnCompletionListener {

                holder.vdeovw.start()

            })


        }
        if (position == 2) {
            path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video3
            holder.vdeovw.setVideoURI(Uri.parse(path))
            holder.vdeovw.start()
            holder.vdeovw.setOnCompletionListener(OnCompletionListener {

                holder.vdeovw.start()
            })
        }
        if (position == 3) {
            path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video4
            holder.vdeovw.setVideoURI(Uri.parse(path))
            holder.vdeovw.start()
            holder.vdeovw.setOnCompletionListener(OnCompletionListener {

                holder.vdeovw.start()
            })
        }

        holder.setIsRecyclable(false);

    }

    override fun getItemCount(): Int {
        return 3
    }

    fun setFadeAnimation(view: View) {
        val anim = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 500
        view.startAnimation(anim)
    }

    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var vdeovw: VideoView


        init {
            vdeovw = itemView.findViewById(R.id.vdeovw)


        }

    }


}


/*

class (private var mContext: Context) :
    SliderViewAdapter<SponsoredAdapter.SponsoredAdapterViewHolder>() {
    // list for storing urls of images.


    // We are inflating the slider_layout
    // inside on Create View Holder method.
    override fun onCreateViewHolder(parent: ViewGroup): SponsoredAdapterViewHolder {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.sponsoredlayout, null)
        return SponsoredAdapterViewHolder(inflate)
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    override fun onBindViewHolder(viewHolder: SponsoredAdapterViewHolder, position: Int) {
     //   val sliderItem: SliderData = mSliderItems[position]

        // Glide is use to load image
        // from url in your imageview.






        */
/*val uri: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/video2.mp4?alt=media&token=744832b1-81c8-4054-8023-81f80de9996f")
        viewHolder.vdeovw.setVideoURI(uri)
        viewHolder.vdeovw.requestFocus()
        viewHolder.vdeovw.start()*//*



        val path = "android.resource://" + mContext.getPackageName().toString() + "/" + R.raw.video1
        viewHolder.vdeovw.setVideoURI(Uri.parse(path))
        viewHolder.vdeovw.start()
    }

    // this method will return
    // the count of our list.
    override fun getCount(): Int {
        return 4
    }

    class SponsoredAdapterViewHolder(itemView: View) :
        ViewHolder(itemView) {
        // Adapter class for initializing
        // the views of our slider view.
        lateinit var itemView: View
        var vdeovw: VideoView

        init {
            vdeovw = itemView.findViewById(R.id.vdeovw)

        }
    }

    // Constructor

}
*/
