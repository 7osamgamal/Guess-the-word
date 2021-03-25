package com.hosam.electronicsebha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.hosam.electronicsebha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var drawerlayout:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        drawerlayout=binding.drawerlayout
        val navcontroller:NavController=findNavController(R.id.MyNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navcontroller,drawerlayout)
        NavigationUI.setupWithNavController(binding.navview,navcontroller)
        navcontroller.addOnDestinationChangedListener { nc:NavController,nd:NavDestination,args:Bundle? ->
            if (nd.id==nc.graph.startDestination)
            {
                drawerlayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            }
            else
            {
                drawerlayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navcontroller:NavController=this.findNavController(R.id.MyNavHostFragment)
        return NavigationUI.navigateUp(navcontroller,drawerlayout)
    }
}