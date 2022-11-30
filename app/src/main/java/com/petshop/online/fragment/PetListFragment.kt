package com.petshop.online.fragment

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.*
import com.petshop.online.R
import com.petshop.online.`interface`.OnClickInterface
import kotlinx.android.synthetic.main.fragment_category_list.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_my_account.*
import kotlinx.android.synthetic.main.fragment_pet_list.*
import kotlinx.android.synthetic.main.fragment_pet_list.spinner
import kotlinx.android.synthetic.main.fragment_pet_store_pricing.*

import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.collections.HashMap

class PetListFragment : Fragment(),OnClickInterface {



    private lateinit var mContext: Context


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

        return inflater.inflate(R.layout.fragment_pet_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_1.visibility=View.VISIBLE
        view_2.visibility=View.GONE
        view_3.visibility=View.GONE
        view_4.visibility=View.GONE
        view_5.visibility=View.GONE
        view_6.visibility=View.GONE
        view_7.visibility=View.GONE
        view_8.visibility=View.GONE

        onclick()
        val languages = resources.getStringArray(R.array.Languages1)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                requireContext(),
                R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter





        }

    /*    recyclerexplores.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerexplores.setHasFixedSize(true)
        recyclerexplores.adapter = ExploreAdpetr(mContext)
*/

        top_related_seller.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        top_related_seller.setHasFixedSize(true)
        top_related_seller.adapter = RelatedSellerAdapter(
            mContext
        )

        list.layoutManager =GridLayoutManager(mContext, 2)
        list.setHasFixedSize(true)
        list.adapter = PetListVideoAdpetr(mContext,this)

    }

    private fun onclick() {
        rl1.setOnClickListener {
            view_1.visibility=View.VISIBLE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }

        rl2.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.VISIBLE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }


        rl3.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.VISIBLE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }

        rl4.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.VISIBLE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }

        rl5.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.VISIBLE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }


        rl6.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.VISIBLE
            view_7.visibility=View.GONE
            view_8.visibility=View.GONE

        }

        rl7.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.VISIBLE
            view_8.visibility=View.GONE

        }

        rl8.setOnClickListener {
            view_1.visibility=View.GONE
            view_2.visibility=View.GONE
            view_3.visibility=View.GONE
            view_4.visibility=View.GONE
            view_5.visibility=View.GONE
            view_6.visibility=View.GONE
            view_7.visibility=View.GONE
            view_8.visibility=View.VISIBLE

        }


    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onclick(id: String) {
        loadFragment(CategoryListDetailsFragment())
    }



}