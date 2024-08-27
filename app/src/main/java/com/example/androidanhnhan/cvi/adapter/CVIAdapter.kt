package com.example.androidanhnhan.cvi.adapter

import android.view.LayoutInflater
import android.view.Menu
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidanhnhan.databinding.CviItemViewBinding

data class  HomeMenu(val title: String)
class CVIAdapter:RecyclerView.Adapter<CVIAdapter.CVIHolder>() {
    private var menuList = arrayListOf<HomeMenu>()
    class CVIHolder(val binding: CviItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(menu: HomeMenu) {
            binding.apply {
                tvTitle.text = menu.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CVIHolder {
        // Tao holder hien thi
        val binding = CviItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CVIHolder(binding)
    }

    override fun getItemCount(): Int {
        //lay ra so luong item can hien thi
        return menuList.size
    }

    override fun onBindViewHolder(holder: CVIHolder, position: Int) {
        // Gan du lieu cho holder
        holder.bindData(menuList[position])
    }

    fun setData(menu: ArrayList<HomeMenu>) {
        //goi func tu activity de khoi tao list gia tri
        this.menuList = menu
        notifyDataSetChanged() //thong bao cho adapter de reload du lieu
    }
}