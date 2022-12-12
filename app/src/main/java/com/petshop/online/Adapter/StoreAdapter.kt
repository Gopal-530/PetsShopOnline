package com.petshop.online.Adapter

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.VideoView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.R
import com.petshop.online.ResponseApi.ExploreResponse
import com.petshop.online.ResponseApi.StoreGalleriesResponse
import com.squareup.picasso.Picasso


class StoreAdapter(
    var context: Context,
    var list: ArrayList<StoreGalleriesResponse.Data>
) : RecyclerView.Adapter<StoreAdapter.ExerciseHodlder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHodlder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recy_store, parent, false)
        return ExerciseHodlder(view)
    }


    override fun onBindViewHolder(holder: ExerciseHodlder, position: Int) {


        holder.text.setText(list[position].type)
        holder.companyName.setText(list[position].companyname)

        var path = list[position].ImagePath
        holder.vediovt.setVideoURI(Uri.parse(path))
        holder.vediovt.start()
        holder.vediovt.setOnCompletionListener(MediaPlayer.OnCompletionListener {

            holder.vediovt.start()
        })




       // videoView.setVideoURI(Uri.parse("https://archive.org/download/Popeye_forPresident/Popeye_forPresident_512kb.mp4"));

        //----for start static data --//

        /*
           var path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video1

           if (position == 0) {
               path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video1
               holder.vediovt.setVideoURI(Uri.parse(path))
               holder.vediovt.start()
               holder.vediovt.setOnCompletionListener(MediaPlayer.OnCompletionListener {

                   holder.vediovt.start()
               })




           }
           if (position == 1) {
               path = "android.resource://" + context.getPackageName().toString() + "/" + R.raw.video3
               holder.vediovt.setVideoURI(Uri.parse(path))
               holder.vediovt.start()
               holder.vediovt.setOnCompletionListener(MediaPlayer.OnCompletionListener {

                   holder.vediovt.start()
               })
           }

           holder.setIsRecyclable(false);

           holder.text.setText("Pet Choice")*/

        //---end--//

        /* Picasso.get()
             .load(R.drawable.categories5)
             .into(holder.image)


 */

        /*holder.card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                R.anim.translate
            )
        )
*/

    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class ExerciseHodlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var text: TextView
        lateinit var companyName: TextView
        lateinit var vediovt: VideoView

        lateinit var card: LinearLayout


        init {
            //    image = itemView.findViewById(R.id.ivImgee)
            text = itemView.findViewById(R.id.tvTexxxt)
            companyName = itemView.findViewById(R.id.companyName)
            card = itemView.findViewById(R.id.card)
            vediovt = itemView.findViewById(R.id.vediovt)


        }

    }


}