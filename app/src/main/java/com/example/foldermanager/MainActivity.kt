package com.example.foldermanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapters.DataModels
import com.example.adapters.ItemAdapters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        actionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        actionBar!!.setCustomView(R.layout.edit_app_name)

        reViewFolderList.layoutManager =LinearLayoutManager(this)
        val adapters = ItemAdapters(this,getItemList())
        reViewFolderList.adapter = adapters
    }

    private fun getItemList():ArrayList<DataModels>
    {
        val list =ArrayList<DataModels>()
        list.add(DataModels("Videos"))
        list.add(DataModels("Android"))
        list.add(DataModels("Applock"))
        list.add(DataModels("Books"))
        list.add(DataModels("map"))
        list.add(DataModels("Authenticate Using Google.."))
        list.add(DataModels("New Folder"))
        list.add(DataModels("New Folder 1"))
        return list
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}