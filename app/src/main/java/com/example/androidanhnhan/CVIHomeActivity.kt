package com.example.androidanhnhan

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidanhnhan.cvi.adapter.CVIAdapter
import com.example.androidanhnhan.cvi.adapter.HomeMenu
import com.example.androidanhnhan.databinding.ActivityCviHomeBinding

class CVIHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCviHomeBinding
    private val menu = arrayListOf<HomeMenu>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCviHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        menu.apply {
            add(HomeMenu("Dich vu so 1"))
            add(HomeMenu("Dich vu so 2"))
            add(HomeMenu("Dich vu so 3"))
            add(HomeMenu("Dich vu so 4"))
            add(HomeMenu("Dich vu so 5"))
            add(HomeMenu("Dich vu so 6"))
            add(HomeMenu("Dich vu so 7"))
            add(HomeMenu("Dich vu so 8"))
            add(HomeMenu("Dich vu so 9"))
        }
        binding.apply {
            rvMenu.adapter = CVIAdapter().apply {
                setData(menu)
            }

            rvMenu.layoutManager = GridLayoutManager(this@CVIHomeActivity, 3)
        }
    }
}