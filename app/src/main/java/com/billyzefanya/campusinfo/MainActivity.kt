package com.billyzefanya.campusinfo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.billyzefanya.campusinfo.databinding.ActivityMainBinding
import com.billyzefanya.campusinfo.R

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager
            .findFragmentById(R.id.nav_host) as NavHostFragment

        val navController = navHost.navController

        binding.bottomNav.setupWithNavController(navController)
    }
}