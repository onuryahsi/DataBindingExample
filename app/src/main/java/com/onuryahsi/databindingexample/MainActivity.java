package com.onuryahsi.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.onuryahsi.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    View.OnClickListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        Static Binding
//        // viewBinding
        activityMainBinding.setUsername("Click Me!");
//
//        // dataBinding
        Product p = new Product(1, "A1", "B2");
        activityMainBinding.setFoobar(p);

        mListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("likeCount", (activityMainBinding.productId).toString());
                startActivity(i);
                finishAffinity();
            }
        };

        activityMainBinding.txtUsername.setOnClickListener(mListener);


        activityMainBinding.setUserIP(555111);
        activityMainBinding.txtUserIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "" + activityMainBinding.getUserIP(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
