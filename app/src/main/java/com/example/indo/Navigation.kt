package com.example.indo
import DiyFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.indo.databinding.BottomNavigatorBinding

class Navigation: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = BottomNavigatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                }
                R.id.diy -> {
                    replaceFragment(DiyFragment())
                }
                R.id.stores -> {
                    replaceFragment(StoresFragment())
                }
                R.id.save -> {
                    replaceFragment(SavedFragment())
                }
                R.id.settings -> {
                    replaceFragment(SettingsFragment())
                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

}