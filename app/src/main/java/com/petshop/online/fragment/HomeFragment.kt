package com.petshop.online.fragment

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.petshop.online.Adapter.*
import com.petshop.online.GopalTetsing.Recycler
import com.petshop.online.R
import com.petshop.online.SliderAdapter
import com.petshop.online.SliderData

import com.petshop.online.viewModel.Navigator.LikedProfileNavigator
import com.petshop.online.base.BaseFragment
import com.petshop.online.databinding.FragmentHomeBinding
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import androidx.lifecycle.Observer
import com.petshop.online.Adapter.HomeAdapter.*
import com.petshop.online.ResponseApi.*
import com.petshop.online.viewModel.ExploreViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, ExploreViewModel>(), LikedProfileNavigator {

    var handler: Handler = Handler()
    var runnable: Runnable? = null
    var delay = 2 * 1000 //Delay for 15 seconds.  One second = 1000 milliseconds.
    var i:Int=0
    var adapterch: ChAdapter1? = null
    private lateinit var explorelist: ArrayList<ExploreResponse.Data>

    var handler1: Handler = Handler()
    var runnable1: Runnable? = null
    var delay1 = 2 * 1000 //Delay for 15 seconds.  One second = 1000 milliseconds.
    var j:Int=0
    private lateinit var mContext: Context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }*/


    override fun getLayoutID(): Int {
        return R.layout.fragment_home
    }

    override fun getViewModel(): Class<ExploreViewModel> {
        return ExploreViewModel::class.java
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.viewModel = viewModel
        viewModel.setNavigator(this)


        im8.setOnClickListener {

            if (i==0){
                Toast.makeText(requireContext(),"pet Taxi clicked",Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(requireContext(),"pet Mating clicked",Toast.LENGTH_SHORT).show()
            }
        }


        val sliderDataArrayList: ArrayList<SliderData> = ArrayList()

        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
        sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

        val adapter = SliderAdapter(mContext, sliderDataArrayList)
       // slider.setSliderAdapter(adapter)
        slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        slider.startAutoCycle();
        slider.setIndicatorSelectedColor(Color.WHITE);
        slider.setIndicatorUnselectedColor(Color.GRAY);
        slider.setScrollTimeInSec(2); //set scroll delay in seconds :
        slider.startAutoCycle();

        /*  slider.autoCycleDirection = SliderView.TEXT_DIRECTION_FIRST_STRONG_LTR
        slider.setSliderAdapter(adapter)
        slider.scrollTimeInSec = 3
        slider.isAutoCycle = true
        slider.startAutoCycle()*/


        //----------second slider-----//


        val sliderDataArrayList2: ArrayList<SliderData> = ArrayList()

        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

        val adapter2 = SliderAdapter(mContext, sliderDataArrayList)
        slider2.setSliderAdapter(adapter)
        slider2.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider2.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        slider2.startAutoCycle();
        slider2.setIndicatorSelectedColor(Color.WHITE);
        slider2.setIndicatorUnselectedColor(Color.GRAY);
        slider2.setScrollTimeInSec(2); //set scroll delay in seconds :
        slider2.startAutoCycle();



        sliderexplore.setSliderAdapter(adapter)
        sliderexplore.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderexplore.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderexplore.startAutoCycle();
        sliderexplore.setIndicatorSelectedColor(Color.WHITE);
        sliderexplore.setIndicatorUnselectedColor(Color.GRAY);
        sliderexplore.setScrollTimeInSec(2); //set scroll delay in seconds :
        sliderexplore.startAutoCycle()


        sliderBest.setSliderAdapter(adapter)
        sliderBest.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderBest.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderBest.startAutoCycle();
        sliderBest.setIndicatorSelectedColor(Color.WHITE);
        sliderBest.setIndicatorUnselectedColor(Color.GRAY);
        sliderBest.setScrollTimeInSec(2); //set scroll delay in seconds :
        sliderBest.startAutoCycle();


//---------slider sponsored---//
        /* val sliderDataArrayList3: ArrayList<SliderData> = ArrayList()

         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

         val adapter3 = SponsoredAdapter(mContext, sliderDataArrayList)
         sliderSponsored.setSliderAdapter(adapter3)
         sliderSponsored.setIndicatorAnimation(IndicatorAnimationType.WORM);
         sliderSponsored.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
         sliderSponsored.startAutoCycle();
         sliderSponsored.setIndicatorSelectedColor(Color.WHITE);
         sliderSponsored.setIndicatorUnselectedColor(Color.GRAY);
         sliderSponsored.setScrollTimeInSec(8); //set scroll delay in seconds :
         sliderSponsored.startAutoCycle();
 */

        //-------------///
        val rotate = RotateAnimation(
            0F, 360F,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )






        rotate.duration = 4900
        rotate.repeatCount = Animation.INFINITE

        iv1.startAnimation(rotate)

        iv2.startAnimation(rotate)
        iv3.startAnimation(rotate)
        iv4.startAnimation(rotate)
        iv5.startAnimation(rotate)
        iv6.startAnimation(rotate)
        iv7.startAnimation(rotate)
        iv8.startAnimation(rotate)


        /* bottomNavigation.setOnNavigationItemReselectedListener { item ->
             when(item.itemId) {
                 R.id.page_1 -> {
                     // Respond to navigation item 1 reselection
                 }
                 R.id.item2 -> {
                     // Respond to navigation item 2 reselection
                 }
             }
         }
 */



    /*
        recycler1.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recycler1.setHasFixedSize(true)
        recycler1.adapter = Adapter1(
            mContext
        )
*/



/*

        recyclerFeatured.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerFeatured.setHasFixedSize(true)
        recyclerFeatured.adapter = FeaturedAdapetr(mContext)*/


      /*  try {
            val duration = 10
            val pixelsToMove = 5
            val mHandler = Handler(Looper.getMainLooper())
            val SCROLLING_RUNNABLE: Runnable = object : Runnable {
                override fun run() {
                    recyclerexplore.smoothScrollBy(pixelsToMove, 0)
                    mHandler.postDelayed(this, duration.toLong())
                }
            }



            recyclerexplore.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    val lastItem: Int = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false).findLastVisibleItemPosition()
                    if (lastItem ==  LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false).getItemCount()) {
                        mHandler.removeCallbacks(SCROLLING_RUNNABLE)
                        val postHandler = Handler()
                        postHandler.postDelayed({
                            recyclerexplore.setAdapter(null)
                            recyclerexplore.setAdapter(ExploreAdpetr(mContext))

                            mHandler.postDelayed(SCROLLING_RUNNABLE, 2000)
                        }, 2000)
                    }
                }
            })
            mHandler.postDelayed(SCROLLING_RUNNABLE, 2000)




        }catch (e: Exception){

        }
*/



        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(com.petshop.online.R.id.frameContainer, Recycler())
        transaction.commit()




        ///recyclerview






        recyclerreview.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerreview.setHasFixedSize(true)
        recyclerreview.adapter = ReviewAdapter(
            mContext
        )

        //---to be



        btn.setOnClickListener {
            loadFragment(PetShoopFragment())
        }

        btn3.setOnClickListener {
            loadFragment(PetSalonFragment(""))
        }
        btn4.setOnClickListener {
            loadFragment(PetSalonFragment(""))
        }

        iv2.setOnClickListener {
            loadFragment(PetSalonFragment("pet_store"))
        }

        iv3.setOnClickListener {
            loadFragment(PetSalonFragment("pet_grooming"))
        }
        iv4.setOnClickListener {
            loadFragment(PetSalonFragment("pet_grooming"))
        }
        iv5.setOnClickListener {
            loadFragment(PetSalonFragment("pet_grooming"))
        }
        iv6.setOnClickListener {
            loadFragment(PetSalonFragment("pet_grooming"))
        }

        iv1.setOnClickListener {
            loadFragment(PetListFragment())
        }





/*

        recyclerStore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recyclerStore.setHasFixedSize(true)
        recyclerStore.adapter = StoreAdapter(mContext)
*/

       // scrollable.post(Runnable { scrollable.fullScroll(scrollable.FOCUS_UP) })
/*
        try {
            scrollable.getViewTreeObserver().addOnGlobalLayoutListener(OnGlobalLayoutListener {
                scrollable.post(
                    Runnable { scrollable.fullScroll(View.FOCUS_UP) })
            })

        }catch (e:Exception){

        }
*/



          //autorotateBestseller(0,7)
        var handler: Handler = Handler()
        var runnable: Runnable? = null
        var delay = 4 * 1000 //Delay for 15 seconds.  One second = 1000 milliseconds.
        var i:Int=0


        //--viewpager---//


        setViewpager()


      //  tabLayout!!.setupWithViewPager(view_pager)
      //  getexplore()
        getHome()
      //  getStoreGallery()
      //  getTopratedSeller()
        getFeaturedPetstore()

    }

    private fun getFeaturedPetstore() {
        showHideProgress(true, mContext)


        try {
            viewModel.getFeaturePetstoremodel().observe(requireActivity(), Observer {
                showHideProgress(false, mContext)

                if (it.data.isNotEmpty()) {

                    var list = ArrayList<FeaturesResponse.Data>()
                    list.addAll(it.data)








                }
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }

    private fun getTopratedSeller() {
        showHideProgress(true, mContext)


        try {
            viewModel.getTopratedSeleermodel().observe(requireActivity(), Observer {
                showHideProgress(false, mContext)

                if (it.data.isNotEmpty()) {

                    var list = ArrayList<TopratedSeller.Data>()
                    list.addAll(it.data)

                    recycler1.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                    recycler1.setHasFixedSize(true)
                    recycler1.adapter = Adapter1(mContext,list)



                }
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }

    private fun getStoreGallery() {
        showHideProgress(true, mContext)


        try {
            viewModel.getStoreGAllerymodel().observe(requireActivity(), Observer {
                showHideProgress(false, mContext)

                if (it.data.isNotEmpty()) {

                    var list = ArrayList<StoreGalleriesResponse.Data>()
                    list.addAll(it.data)

                    recyclerStore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                    recyclerStore.setHasFixedSize(true)
                    recyclerStore.adapter = StoreAdapter(mContext,list)

                }
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }


    private fun getexplore() {
        showHideProgress(true, mContext)


        try {
            viewModel.getExploremodel().observe(requireActivity(), Observer {
                showHideProgress(false, mContext)

                if (it.data.isNotEmpty()) {

                    var list = ArrayList<ExploreResponse.Data>()
                    list.addAll(it.data)

                    recyclerexplore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                    recyclerexplore.setHasFixedSize(true)
                    recyclerexplore.adapter = ExploreAdpetr(mContext,list)

                }
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }


    private fun getHome() {
        showHideProgress(true, mContext)


        try {
            viewModel.getHomemodel().observe(requireActivity(), Observer {
                showHideProgress(false, mContext)

                var explore = ArrayList<HomeResponce.Explore>()
                explore.addAll(it.explore)

                recyclerexplore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerexplore.setHasFixedSize(true)
                recyclerexplore.adapter = ExploreAdapter(mContext,explore)

                var storegallery = ArrayList<HomeResponce.Storegallery>()
                storegallery.addAll(it.storegallery)

                recyclerStore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerStore.setHasFixedSize(true)
                recyclerStore.adapter = StoreGalleryAdapter(mContext,storegallery)


                var topratedseller = ArrayList<HomeResponce.TopratedsellerX>()
                topratedseller.addAll(it.topratedseller)

                recycler1.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recycler1.setHasFixedSize(true)
                recycler1.adapter = TopRelatedSellerAdapter(mContext,topratedseller)


                var featuredpetstores = ArrayList<HomeResponce.Featuredpetstore>()
                featuredpetstores.addAll(it.featuredpetstores)

                recyclerFeatured.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerFeatured.setHasFixedSize(true)
                recyclerFeatured.adapter = FeaturedStoredAdapter(mContext,featuredpetstores)



                var sponsoredads = ArrayList<HomeResponce.Sponsoredads>()
                sponsoredads.addAll(it.sponsoredads)

                recyclersponsored.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclersponsored.setHasFixedSize(true)
                recyclersponsored.adapter = SponsoredAdsAdapter(mContext,sponsoredads)
               // recyclersponsored.smoothScrollToPosition(0)
                val snapHelper = LinearSnapHelper()
                snapHelper.attachToRecyclerView(recyclersponsored)



                var banner = ArrayList<HomeResponce.Banner>()
                banner.addAll(it.banner)
                val adapter = TopBannerAdapter(mContext, banner)
                 slider.setSliderAdapter(adapter)

                slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
                slider.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
                slider.startAutoCycle();
                slider.setIndicatorSelectedColor(Color.WHITE);
                slider.setIndicatorUnselectedColor(Color.GRAY);
                slider.setScrollTimeInSec(2); //set scroll delay in seconds :
                slider.startAutoCycle()


                var featuredgrooming = ArrayList<HomeResponce.Featuredgrooming>()
                featuredgrooming.addAll(it.featuredgrooming)

                recyclerFeaturedGrooming.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerFeaturedGrooming.setHasFixedSize(true)
                recyclerFeaturedGrooming.adapter = FeaturedGroomingAdapetr(mContext,featuredgrooming)


                var featuredpetclinic = ArrayList<HomeResponce.Featuredpetclinic>()
                featuredpetclinic.addAll(it.featuredpetclinic)
                recyclerpetclinic.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerpetclinic.setHasFixedSize(true)
                recyclerpetclinic.adapter = FeaturedClinicAdapeter(mContext,featuredpetclinic)


                var featuredboarding = ArrayList<HomeResponce.FeaturedBoarding>()
                featuredboarding.addAll(it.featuredboarding)
                recyclerFeaturedBoardng.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerFeaturedBoardng.setHasFixedSize(true)
                recyclerFeaturedBoardng.adapter = FeaturedBoardingAdapeter(mContext,featuredboarding)



                var featuredtraining = ArrayList<HomeResponce.Featuredtraning>()
                featuredtraining.addAll(it.featuredtraining)
                recyclerpettraining.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerpettraining.setHasFixedSize(true)
                recyclerpettraining.adapter =FeaturedTrainingAdapeter(mContext,featuredtraining)


                var bestseller = ArrayList<HomeResponce.BestSeller>()
                bestseller.addAll(it.bestseller)
                recyclerBest_seller.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                recyclerBest_seller.setHasFixedSize(true)
                recyclerBest_seller.adapter = BestSellerAdaptr(
                    mContext,bestseller
                )


/*
                if (it.explore.isEmpty()) {

                    var list = ArrayList<HomeResponce.Explore>()
                    list.addAll(it.explore)

                    recyclerexplore.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
                    recyclerexplore.setHasFixedSize(true)
                    recyclerexplore.adapter = ExploreAdapter(mContext,list)

                }
*/
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }






    private fun setViewpager() {


        adapterch = ChAdapter1(requireActivity().supportFragmentManager)
        val sdf = SimpleDateFormat("EE")
        for (i in 0..6) {
            val calendar: Calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, i)
            val day = sdf.format(calendar.time)

            adapterch!!.AddFragment(Pager_fragment(), day)

          //  shrpp.setStringPreference(Week2, week)
        }

        view_pager!!.adapter = adapterch
        val pageMargin = resources.getDimensionPixelOffset(androidx.appcompat.R.dimen.abc_action_bar_content_inset_material).toFloat()
        val pageOffset = resources.getDimensionPixelOffset(androidx.appcompat.R.dimen.abc_action_bar_content_inset_material).toFloat()

        //   tabLayout!!.setupWithViewPager(view_pager)



       /* view_pager.setPageTransformer(true) { page, position ->
            val myOffset: Float = position * -(2 * pageOffset + pageMargin)
            if (position < -1) {
                page.setTranslationX(-myOffset)
            } else if (position <= 1) {
                val scaleFactor =
                    Math.max(0.7f, 1 - Math.abs(position - 0.14285715f))
                page.setTranslationX(myOffset)
                page.setScaleY(scaleFactor)
                page.setAlpha(scaleFactor)
            } else {
                page.setAlpha(0F)
                page.setTranslationX(myOffset)
            }
        }
*/




    }
    private fun autorotateBestseller(firstposition: Int, lastposition: Int) {
        Handler().postDelayed({
            recyclerBest_seller.scrollToPosition(firstposition);
        }, 1000)


        if (firstposition==lastposition){
            autorotateBestseller(0, lastposition)
        }else{
            autorotateBestseller(firstposition+1, lastposition)
        }

    }


    fun isValidPassword(password: String?): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(password)
        return matcher.matches()
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
                it8.setText("Pet Mating")
                i=1
            }else{
                im8.setImageResource(R.drawable.taxi)
                it8.setText("Pet Taxi")
                i=0
            }

            handler.postDelayed(runnable!!, delay.toLong())
        }.also { runnable = it }, delay.toLong())



        handler1.postDelayed(Runnable { //do something


            if (j==5){
                j=0
                recyclerFeatured.scrollToPosition(j)
                recycler1.scrollToPosition(j)
                recyclerFeaturedGrooming.scrollToPosition(j)
                recyclerFeaturedBoardng.scrollToPosition(j)
                recyclerpetclinic.scrollToPosition(j)
                recyclerpettraining.scrollToPosition(j)
                recyclerBest_seller.scrollToPosition(j)
            }else{
                recyclerFeatured.scrollToPosition(j)
                recycler1.scrollToPosition(j)
                recyclerFeaturedGrooming.scrollToPosition(j)
                recyclerFeaturedBoardng.scrollToPosition(j)
                recyclerpetclinic.scrollToPosition(j)
                recyclerpettraining.scrollToPosition(j)
                recyclerBest_seller.scrollToPosition(j)
                j++
            }

            handler1.postDelayed(runnable1!!, delay1.toLong())
        }.also { runnable1 = it }, delay1.toLong())







        super.onStart()
    }

    class ChAdapter1(
        fm: FragmentManager
    ) : FragmentPagerAdapter(fm) {
        var fragmentArrayList = java.util.ArrayList<Fragment>()
        var stringArrayList = java.util.ArrayList<String>()
        fun AddFragment(fragment: Fragment, s: String) {
            fragmentArrayList.add(fragment)
            stringArrayList.add(s)
        }

        override fun getItem(position: Int): Fragment {
            return fragmentArrayList[position]
        }

        override fun getCount(): Int {
            return fragmentArrayList.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return stringArrayList[position]
        }

        override fun getPageWidth(position: Int): Float {
            return 0.80f              //super.getPageWidth(position)
        }


    }

// If onPause() is not included the threads will double up when you
// reload the activity

    // If onPause() is not included the threads will double up when you
    // reload the activity
    override fun onPause() {
        handler.removeCallbacks(runnable!!) //stop handler when activity not visible


        handler1.removeCallbacks(runnable1!!) //stop handler when activity not visible
        super.onPause()
    }

    override fun onError(message: String) {

        //-for showing error-//
    }

    override fun onItemClick(userProfile: ExploreResponse.Data) {

        //---For Clicking--//


    }


}