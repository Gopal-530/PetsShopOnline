package com.petshop.online

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.petshop.online.Adapter.*
import com.petshop.online.fragment.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // scrollable.post(Runnable { scrollable.fullScroll(scrollable.F) })
        loadFragment(HomeFragment())
        become_a_seller.setOnClickListener {
            loadFragment(BecomeSellerFragment())
        }

        home.setOnClickListener {
            loadFragment(HomeFragment())
            view_home.visibility=View.VISIBLE
            view_category.visibility=View.GONE
            view_post_add.visibility=View.GONE
            view_my_acc.visibility=View.GONE
            view_cart.visibility=View.GONE
        }


        btn2.setOnClickListener {
            loadFragment(PostFreeAddFragment())
        }

        post_add.setOnClickListener {
            loadFragment(PostFreeAddFragment())
            view_home.visibility=View.GONE
            view_category.visibility=View.GONE
            view_post_add.visibility=View.VISIBLE
            view_my_acc.visibility=View.GONE
            view_cart.visibility=View.GONE
        }

        login.setOnClickListener {
            loadFragment(LoginFragment())
        }

        my_acc.setOnClickListener {
            loadFragment(MyAccountFragment())
            view_home.visibility=View.GONE
            view_category.visibility=View.GONE
            view_post_add.visibility=View.GONE
            view_my_acc.visibility=View.VISIBLE
            view_cart.visibility=View.GONE
        }

        category.setOnClickListener {
            loadFragment(CategoryHomeFragment())
            view_home.visibility=View.GONE
            view_category.visibility=View.VISIBLE
            view_post_add.visibility=View.GONE
            view_my_acc.visibility=View.GONE
            view_cart.visibility=View.GONE
        }

        bt1.setOnClickListener {
            loadFragment(CategoryFragment())
        }

        cart_data.setOnClickListener {
            loadFragment(CartFragment())
            view_home.visibility=View.GONE
            view_category.visibility=View.GONE
            view_post_add.visibility=View.GONE
            view_my_acc.visibility=View.GONE
            view_cart.visibility=View.VISIBLE
        }


        whatsapp.setOnClickListener {
            val whatsappIntent = Intent(Intent.ACTION_SEND)
            whatsappIntent.type = "text/plain"
            whatsappIntent.setPackage("com.whatsapp")
            whatsappIntent.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share")
            try {
                startActivity(whatsappIntent)
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(this,"Whatsapp have not been installed.",Toast.LENGTH_SHORT).show()
            }
        }

        view_home.visibility=View.VISIBLE
        view_category.visibility=View.GONE
        view_post_add.visibility=View.GONE
        view_my_acc.visibility=View.GONE
        view_cart.visibility=View.GONE




        /*  val sliderDataArrayList: ArrayList<SliderData> = ArrayList()

          sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
          sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
          sliderDataArrayList.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

          val adapter = SliderAdapter(this, sliderDataArrayList)
          slider.setSliderAdapter(adapter)
          slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
          slider.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
          slider.startAutoCycle();
          slider.setIndicatorSelectedColor(Color.WHITE);
          slider.setIndicatorUnselectedColor(Color.GRAY);
          slider.setScrollTimeInSec(2); //set scroll delay in seconds :
          slider.startAutoCycle();

          *//*  slider.autoCycleDirection = SliderView.TEXT_DIRECTION_FIRST_STRONG_LTR
        slider.setSliderAdapter(adapter)
        slider.scrollTimeInSec = 3
        slider.isAutoCycle = true
        slider.startAutoCycle()*//*


        //----------second slider-----//


        val sliderDataArrayList2: ArrayList<SliderData> = ArrayList()

        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
        sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

        val adapter2 = SliderAdapter(this, sliderDataArrayList)
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
        sliderexplore.startAutoCycle();


        sliderBest.setSliderAdapter(adapter)
        sliderBest.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderBest.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderBest.startAutoCycle();
        sliderBest.setIndicatorSelectedColor(Color.WHITE);
        sliderBest.setIndicatorUnselectedColor(Color.GRAY);
        sliderBest.setScrollTimeInSec(2); //set scroll delay in seconds :
        sliderBest.startAutoCycle();


//---------slider sponsored---//
        *//* val sliderDataArrayList3: ArrayList<SliderData> = ArrayList()

         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-01.jpg?alt=media&token=60e33bac-4909-44e8-956e-b2056a538afc"))
         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-02.jpg?alt=media&token=48a63231-f904-4718-8609-072ed3d9a265"))
         sliderDataArrayList2.add(SliderData("https://firebasestorage.googleapis.com/v0/b/cl-publication.appspot.com/o/banner-03.jpg?alt=media&token=b80d060f-01d8-4616-99e2-3aee2a8e14d8"))

         val adapter3 = SponsoredAdapter(this, sliderDataArrayList)
         sliderSponsored.setSliderAdapter(adapter3)
         sliderSponsored.setIndicatorAnimation(IndicatorAnimationType.WORM);
         sliderSponsored.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
         sliderSponsored.startAutoCycle();
         sliderSponsored.setIndicatorSelectedColor(Color.WHITE);
         sliderSponsored.setIndicatorUnselectedColor(Color.GRAY);
         sliderSponsored.setScrollTimeInSec(8); //set scroll delay in seconds :
         sliderSponsored.startAutoCycle();
 *//*

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


        *//* bottomNavigation.setOnNavigationItemReselectedListener { item ->
             when(item.itemId) {
                 R.id.page_1 -> {
                     // Respond to navigation item 1 reselection
                 }
                 R.id.item2 -> {
                     // Respond to navigation item 2 reselection
                 }
             }
         }
 *//*
        recycler1.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recycler1.setHasFixedSize(true)
        recycler1.adapter = Adapter1(
            this
        )




        recyclersponsored.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclersponsored.setHasFixedSize(true)
        recyclersponsored.adapter = SponsoredAdapter(this)


        recyclerFeatured.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerFeatured.setHasFixedSize(true)
        recyclerFeatured.adapter = FeaturedAdapetr(this)

        recyclerStore.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerStore.setHasFixedSize(true)
        recyclerStore.adapter = StoreAdapter(this)

        recyclerexplore.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerexplore.setHasFixedSize(true)
        recyclerexplore.adapter = ExploreAdpetr(this)


        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(com.petshop.online.R.id.frameContainer, Recycler())
        transaction.commit()




        ///recyclerview


        recyclerBest_seller.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerBest_seller.setHasFixedSize(true)
        recyclerBest_seller.adapter = BestSellerAdapter(
            this
        )
        recyclerreview.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerreview.setHasFixedSize(true)
        recyclerreview.adapter = ReviewAdapter(
            this
        )

        //---to be


        recyclerFeaturedGrooming.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerFeaturedGrooming.setHasFixedSize(true)
        recyclerFeaturedGrooming.adapter = FeaturedAdapetr(this)

        recyclerFeaturedBoardng.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerFeaturedBoardng.setHasFixedSize(true)
        recyclerFeaturedBoardng.adapter = FeaturedAdapetr(this)


        recyclerpetclinic.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerpetclinic.setHasFixedSize(true)
        recyclerpetclinic.adapter = Adapter1(
            this
        )

        recyclerpettraining.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerpettraining.setHasFixedSize(true)
        recyclerpettraining.adapter = Adapter1(
            this
        )*/

    }


//    override fun onStart() {
//        super.onStart()
//
//       /* recyclersponsored.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
//        recyclersponsored.setHasFixedSize(true)
//        recyclersponsored.adapter = SponsoredAdapter(this)
//
//
//
//        recyclerStore.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
//        recyclerStore.setHasFixedSize(true)
//        recyclerStore.adapter = StoreAdapter(this)
//*/
//
//    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onBackPressed() {

    }

}




