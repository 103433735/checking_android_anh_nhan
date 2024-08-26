package com.example.androidanhnhan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidanhnhan.databinding.TableviewcellBinding
import com.example.androidanhnhan.model.CredentialList

public class TableViewCell: RecyclerView.Adapter<TableViewCell.TableViewCellHolder>() {
    val credentialList: ArrayList<CredentialList> = arrayListOf(
        CredentialList("chimtovocung", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
        CredentialList("superIdolNixiaoRong", false),
    )
    class TableViewCellHolder(val binding: TableviewcellBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewCellHolder {
        // inflate để tìm view
        val binding = TableviewcellBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TableViewCellHolder(binding)
    }

    override fun getItemCount(): Int {
        return credentialList.size
    }

    override fun onBindViewHolder(holder: TableViewCellHolder, position: Int) {
        with(holder) {
            with(credentialList[position]) {
                binding.lblCredential.text = this.keyID
            }
        }
    }
}