package com.petshop.online.fragment

import android.content.Context
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.petshop.online.Adapter.*
import com.petshop.online.R
import com.petshop.online.SliderData
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_category_list.*
import kotlinx.android.synthetic.main.fragment_category_list_details.*
import kotlinx.android.synthetic.main.fragment_home.*


class CategoryListDetailsFragment : Fragment() {



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

        return inflater.inflate(R.layout.fragment_category_list_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val sliderDataArrayList: ArrayList<SliderData> = ArrayList()

        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

        val adapter = ProductsDetailsAdapter(mContext, sliderDataArrayList)
        sliderview.setSliderAdapter(adapter)
        sliderview.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderview.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderview.startAutoCycle();
//        sliderview.setIndicatorSelectedColor(Color.WHITE);
//        sliderview.setIndicatorUnselectedColor(Color.WHITE);
        sliderview.setScrollTimeInSec(2); //set scroll delay in seconds :
        sliderview.startAutoCycle();
        // access the spinner

       /* category_list.layoutManager = GridLayoutManager(mContext, 2)
        category_list.setHasFixedSize(true)
        category_list.adapter = Categories_detailsAdapetr(mContext)*/

        //visiblity gone and visible
        view_desc.visibility=View.VISIBLE
        view_additional.visibility=View.GONE
        view_review.visibility=View.GONE

        //layout visiblity gone and visible
        desc_layout.visibility=View.VISIBLE
        addit_layout.visibility=View.GONE
        review_layout.visibility=View.GONE

        //text change
        val poppinsemibold = ResourcesCompat.getFont(requireContext(), R.font.poppinsemibold)
        val poppinsregular = ResourcesCompat.getFont(requireContext(), R.font.poppinsregular)
        text_desc.setTypeface(poppinsemibold)
        text_add_info.setTypeface(poppinsregular)
        text_review.setTypeface(poppinsregular)



        desc.setOnClickListener {
            view_desc.visibility=View.VISIBLE
            view_additional.visibility=View.GONE
            view_review.visibility=View.GONE
          //  val typeface = resources.getFont(R.font.myfont)
            //or to support all versions use
            //or to support all versions use
            val poppinsemibold = ResourcesCompat.getFont(requireContext(), R.font.poppinsemibold)
            val poppinsregular = ResourcesCompat.getFont(requireContext(), R.font.poppinsregular)
            text_desc.setTypeface(poppinsemibold)
            text_add_info.setTypeface(poppinsregular)
            text_review.setTypeface(poppinsregular)

            desc_layout.visibility=View.VISIBLE
            addit_layout.visibility=View.GONE
            review_layout.visibility=View.GONE

        }

        addit.setOnClickListener {
            view_desc.visibility=View.GONE
            view_additional.visibility=View.VISIBLE
            view_review.visibility=View.GONE
            val poppinsemibold = ResourcesCompat.getFont(requireContext(), R.font.poppinsemibold)
            val poppinsregular = ResourcesCompat.getFont(requireContext(), R.font.poppinsregular)
            text_desc.setTypeface(poppinsregular)
            text_add_info.setTypeface(poppinsemibold)
            text_review.setTypeface(poppinsregular)

            desc_layout.visibility=View.GONE
            addit_layout.visibility=View.VISIBLE
            review_layout.visibility=View.GONE
        }


        rev.setOnClickListener {
            view_desc.visibility=View.GONE
            view_additional.visibility=View.GONE
            view_review.visibility=View.VISIBLE
            val poppinsemibold = ResourcesCompat.getFont(requireContext(), R.font.poppinsemibold)
            val poppinsregular = ResourcesCompat.getFont(requireContext(), R.font.poppinsregular)
            text_desc.setTypeface(poppinsregular)
            text_add_info.setTypeface(poppinsregular)
            text_review.setTypeface(poppinsemibold)

            desc_layout.visibility=View.GONE
            addit_layout.visibility=View.GONE
            review_layout.visibility=View.VISIBLE
        }

        temp_amount.setPaintFlags(temp_amount.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)


    }

}