package com.example.androidanhnhan.cviGroup.adapter

import android.media.Image
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidanhnhan.R
import com.example.androidanhnhan.databinding.ActivityCviMainMenuBinding

data class MenuEntity(val name: String)
class CVIMainMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCviMainMenuBinding
    private val menu = arrayListOf<MenuEntity>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCviMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initMenuEntity()
    }

    private fun initMenuEntity() {
        menu.apply {
            add(MenuEntity("Menu1"))
            add(MenuEntity("Menu2"))
            add(MenuEntity("Menu3"))
            add(MenuEntity("Menu4"))
            add(MenuEntity("Menu5"))
            add(MenuEntity("Menu6"))
            add(MenuEntity("Menu7"))
            add(MenuEntity("Menu8"))
            add(MenuEntity("Menu9"))
        }
    }

    private fun initView {
        binding.apply {
            rvCVI.adapter = CVIAdapter().apply {
                setData
            }
        }
    }
}