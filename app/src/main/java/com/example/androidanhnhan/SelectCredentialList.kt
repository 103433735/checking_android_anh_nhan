package com.example.androidanhnhan

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidanhnhan.adapter.TableViewCell
import com.example.androidanhnhan.databinding.ActivityMainBinding
import com.example.androidanhnhan.databinding.ActivitySelectCredentialListBinding

class SelectCredentialList : AppCompatActivity() {
    private lateinit var tableViewCell: TableViewCell
    private lateinit var binding: ActivitySelectCredentialListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectCredentialListBinding.inflate(layoutInflater)
        tableViewCell = TableViewCell()
        enableEdgeToEdge()
        setContentView(binding.root)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.tableView.layoutManager = layoutManager
        binding.tableView.adapter = tableViewCell
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}