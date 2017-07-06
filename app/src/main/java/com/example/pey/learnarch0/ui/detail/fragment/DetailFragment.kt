package com.example.pey.learnarch0.ui.detail.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pey.learnarch0.R
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_detail.view.*
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by pey on 06/07/17.
 */
class DetailFragment: Fragment(){

    @Inject @field:[Named("AKU")] lateinit var AKU: String

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater?.inflate(R.layout.fragment_detail, container, false)!!
        view.detailText.text = "OK OK $AKU"
        return view;
    }
}