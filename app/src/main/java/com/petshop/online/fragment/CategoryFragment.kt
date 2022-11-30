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


class CategoryFragment : Fragment(),OnClickInterface {



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

        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        dog.layoutManager = GridLayoutManager(mContext, 2)
        dog.setHasFixedSize(true)
        dog.adapter = DogSuppliesAdapetr(mContext,this)

        cat.layoutManager = GridLayoutManager(mContext, 2)
        cat.setHasFixedSize(true)
        cat.adapter = CatSuppliesAdapetr(mContext,this)

        bird.layoutManager = GridLayoutManager(mContext, 2)
        bird.setHasFixedSize(true)
        bird.adapter = BirdSuppliesAdapetr(mContext,this)

        small_pet.layoutManager = GridLayoutManager(mContext, 2)
        small_pet.setHasFixedSize(true)
        small_pet.adapter = SmallPetSuppliesAdapetr(mContext,this)



/*
        click.setOnClickListener {
            loadFragment(CategoryListFragment())
        }
*/


    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onclick(id: String) {
        loadFragment(CategoryListFragment())
    }


}