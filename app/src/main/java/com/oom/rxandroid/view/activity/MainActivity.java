package com.oom.rxandroid.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oom.rxandroid.BR;
import com.oom.rxandroid.R;
import com.oom.rxandroid.databinding.ActivityMainBinding;
import com.oom.rxandroid.viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        ActivityMainBinding binding = DataBindingUtil.setContentView( this, R.layout.activity_main );
        binding.setVariable( BR.viewModel, new MainViewModel( this ) );
    }
}
