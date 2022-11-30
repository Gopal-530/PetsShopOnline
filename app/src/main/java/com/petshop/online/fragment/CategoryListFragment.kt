package com.petshop.online.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.petshop.online.Adapter.*
import com.petshop.online.R
import com.petshop.online.`interface`.OnClickInterface
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_category_list.*


class CategoryListFragment : Fragment(), OnClickInterface {



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

        return inflater.inflate(R.layout.fragment_category_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val languages = resources.getStringArray(R.array.Languages)

        // access the spinner

        if (spinner != null) {
            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter

            category_list.layoutManager = GridLayoutManager(mContext, 2)
            category_list.setHasFixedSize(true)
            category_list.adapter = Categories_detailsAdapetr(mContext,this)



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