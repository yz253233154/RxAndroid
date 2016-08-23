package com.oom.rxandroid.view.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oom.rxandroid.BR;
import com.oom.rxandroid.R;
import com.oom.rxandroid.viewModel.IncludeViewModel;
import com.oom.rxandroid.viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        // Crash code
        ViewDataBinding binding = DataBindingUtil.setContentView( this, R.layout.activity_main );
        binding.setVariable( BR.viewModel, new MainViewModel( this ) );

        // Not Crash code
//        ViewDataBinding binding = DataBindingUtil.setContentView( this, R.layout.layout_include );
//        binding.setVariable( BR.includeViewModel, new IncludeViewModel( this ) );

        // here if i use this, work ok.
        // but it will crash when i use  activity_main.xml <include /> layout_include.xml
        //
    }
}
