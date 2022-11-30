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
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.petshop.online.R
import kotlinx.android.synthetic.main.fragment_my_account.*

import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.collections.HashMap

class MyAccountFragment : Fragment() {



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

        return inflater.inflate(R.layout.fragment_my_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        dashboard.setOnClickListener {

            dash_layout.visibility=View.VISIBLE
            track_layout.visibility=View.GONE
            my_add_layout.visibility=View.GONE
            account_layout.visibility=View.GONE


        }

        track_order.setOnClickListener {
            dash_layout.visibility=View.GONE
            track_layout.visibility=View.VISIBLE
            my_add_layout.visibility=View.GONE
            account_layout.visibility=View.GONE

        }

        my_address.setOnClickListener {
            dash_layout.visibility=View.GONE
            track_layout.visibility=View.GONE
            my_add_layout.visibility=View.VISIBLE
            account_layout.visibility=View.GONE

        }

        account_details.setOnClickListener {

            dash_layout.visibility=View.GONE
            track_layout.visibility=View.GONE
            my_add_layout.visibility=View.GONE
            account_layout.visibility=View.VISIBLE
        }

        logout.setOnClickListener {
            dash_layout.visibility=View.GONE
            track_layout.visibility=View.GONE
            my_add_layout.visibility=View.GONE
            account_layout.visibility=View.GONE

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




}