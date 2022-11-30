package com.petshop.online.fragment

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.BestSellerAdapter
import com.petshop.online.Adapter.ExploreAdpetr
import com.petshop.online.R
import kotlinx.android.synthetic.main.fragment_category_frm_home.*
import kotlinx.android.synthetic.main.fragment_category_frm_home.recyclerBest_seller
import kotlinx.android.synthetic.main.fragment_category_frm_home.recyclerexplore
import kotlinx.android.synthetic.main.fragment_home.im8


class CategoryHomeFragment : Fragment() {



    private lateinit var mContext: Context
    var handler: Handler = Handler()
    var runnable: Runnable? = null
    var delay = 4 * 1000 //Delay for 15 seconds.  One second = 1000 milliseconds.
    var i:Int=0



    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_category_frm_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val rotate = RotateAnimation(
            0F, 360F,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )






        rotate.duration = 4900
        rotate.repeatCount = Animation.INFINITE

        ivv1.startAnimation(rotate)

        ivv2.startAnimation(rotate)
        ivv3.startAnimation(rotate)
        ivv4.startAnimation(rotate)
        ivv5.startAnimation(rotate)
        ivv6.startAnimation(rotate)
        ivv7.startAnimation(rotate)
        ivv8.startAnimation(rotate)





        ivv2.setOnClickListener {
            loadFragment(PetSalonFragment("pet_store"))
        }

        ivv3.setOnClickListener {
            loadFragment(PetSalonFragment("pet_store"))
        }

        ivv1.setOnClickListener {
            loadFragment(PetListFragment())
        }


/*

//----commented for mvvm testing --//

        recyclerexplore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerexplore.setHasFixedSize(true)
        recyclerexplore.adapter = ExploreAdpetr(mContext)*/

        recyclerBest_seller.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerBest_seller.setHasFixedSize(true)
        recyclerBest_seller.adapter = BestSellerAdapter(
            mContext
        )


    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }
    override fun onStart() {
        //start handler as activity become visible
        handler.postDelayed(Runnable { //do something
            if (i==0){
                im8.setImageResource(R.drawable.rt1)
                Tvcategry_8.setText("Pet Mating")
                i=1
            }else{
                im8.setImageResource(R.drawable.taxi)
                Tvcategry_8.setText("Pet Taxi")

                i=0
            }

            handler.postDelayed(runnable!!, delay.toLong())
        }.also { runnable = it }, delay.toLong())


        super.onStart()
    }


    override fun onPause() {
        handler.removeCallbacks(runnable!!) //stop handler when activity not visible


        super.onPause()
    }

}