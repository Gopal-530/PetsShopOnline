package com.petshop.online.GopalTetsing.Fragment

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.Adapter1
import com.petshop.online.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.recycler1


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [One.newInstance] factory method to
 * create an instance of this fragment.
 */
class One : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


/*

        recycler1.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recycler1.setHasFixedSize(true)
        recycler1.adapter = Adapter1(
            requireContext()
        )

*/

        imge.setOnClickListener {

            //val intent = Intent(requireContext(), Two::class.java)


            val newFragment: Fragment = Twwoo()
            // consider using Java coding conventions (upper first char class names!!!)
            // consider using Java coding conventions (upper first char class names!!!)
          /*  val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.frameContainer, newFragment)
            transaction.addToBackStack(null)*/



            // Commit the transaction

           /* // Commit the transaction


            *//* val options = ActivityOptions.makeSceneTransitionAnimation(activity, pair1, pair2)
             ActivityOptions.startActivity(activity, intent, options.toBundle())*//*


            transaction.commit()*/


         /*   val ft = fragmentManager!!.beginTransaction()
                .replace(R.id.frameContainer, newFragment)
                .addToBackStack(null)
                .addSharedElement(imge, "imageTrans")

            ft.commit()*/
        }





    }
}