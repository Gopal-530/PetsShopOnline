package com.petshop.online.fragment

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.petshop.online.R
import kotlinx.android.synthetic.main.fragment_pager_fragment.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pager_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pager_fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var path = "android.resource://" + requireContext()!!.getPackageName().toString() + "/" + R.raw.video1
        vdeovw.setVideoURI(Uri.parse(path))
        vdeovw.start()
        vdeovw.setOnCompletionListener(MediaPlayer.OnCompletionListener {
            vdeovw.start()
        })
    }
}