package com.onuryahsi.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.onuryahsi.databindingexample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val sViewModel = ViewModelProviders.of(this).get(SViewModel::class.java)

        DataBindingUtil.setContentView<ActivitySecondBinding>(this, R.layout.activity_second)
                .apply {
                    this.setLifecycleOwner(this@SecondActivity)
                    this.viewModel = sViewModel
                }
    }
}
