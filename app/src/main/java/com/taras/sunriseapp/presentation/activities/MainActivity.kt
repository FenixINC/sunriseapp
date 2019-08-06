package com.taras.sunriseapp.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.taras.sunriseapp.R
import com.taras.sunriseapp.presentation.fragments.SunriseSunsetFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = getString(R.string.app_name)

        supportFragmentManager.beginTransaction()
                .replace(R.id.content, SunriseSunsetFragment.newInstance())
                .addToBackStack(null)
                .commit()
    }
}
