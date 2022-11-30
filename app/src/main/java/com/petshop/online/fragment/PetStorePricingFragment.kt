package com.petshop.online.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.*
import com.petshop.online.R
import com.petshop.online.`interface`.OnClickInterface
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_pet_store_pricing.*


class PetStorePricingFragment : Fragment() {



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

        return inflater.inflate(R.layout.fragment_pet_store_pricing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        pet_store_pricing_list.layoutManager = LinearLayoutManager(mContext, RecyclerView.VERTICAL, false)
        pet_store_pricing_list.setHasFixedSize(true)
        pet_store_pricing_list.adapter = PetShopPricingAdapetr(mContext)





/*
        click.setOnClickListener {
            loadFragment(CategoryListFragment())
        }
*/


    }




}