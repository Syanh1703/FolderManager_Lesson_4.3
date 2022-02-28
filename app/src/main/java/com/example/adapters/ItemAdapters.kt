package com.example.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foldermanager.R
import kotlinx.android.synthetic.main.folder_item.view.*

class ItemAdapters(val context: Context, val items :ArrayList<DataModels>)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class ViewHolder(view :View):RecyclerView.ViewHolder(view)
    {
        val folderName :TextView = view.txtViewFolderName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.folder_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        if(holder is ViewHolder)
        {
            holder.folderName.text = item.folderName
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

