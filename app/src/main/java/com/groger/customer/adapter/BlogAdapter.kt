package com.groger.customer.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.groger.customer.R
import com.groger.customer.activity.MainActivity
import com.groger.customer.fragment.BlogFragment
import com.groger.customer.model.Blog

class BlogAdapter(val activity: Activity, private val blogs: ArrayList<Blog?>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // for load more
    val viewTypeItem = 0
    val viewTypeLoading = 1
    var visible = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemHolder(
            LayoutInflater.from(activity).inflate(R.layout.lyt_category_blog_list, parent, false)
        )

    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holderParent: RecyclerView.ViewHolder, position: Int) {
        if (holderParent is ItemHolder) {
            val blog = blogs[position]!!
            holderParent.tvTitle.text = blog.title
            Glide.with(activity).load(blog.image)
                
                .centerInside()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holderParent.imgBlogCategory)
            holderParent.lytMain.setOnClickListener {
                val fragment: Fragment = BlogFragment()
                val bundle = Bundle()
                bundle.putSerializable("model", blog)
                fragment.arguments = bundle
                MainActivity.fm.beginTransaction().add(R.id.container, fragment)
                    .addToBackStack(null).commit()
            }
        } else if (holderParent is ViewHolderLoading) {
            holderParent.progressBar.isIndeterminate = true
        }
    }

    override fun getItemCount(): Int {
        return blogs.size
    }

    override fun getItemViewType(position: Int): Int {
        return viewTypeItem
    }

    override fun getItemId(position: Int): Long {
        return blogs[position]?.id.toString().toLong()
    }

    internal class ViewHolderLoading(view: View) : RecyclerView.ViewHolder(view) {
        val progressBar: ProgressBar = view.findViewById(R.id.itemProgressbar)

    }

    internal class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBlogCategory: ImageView = itemView.findViewById(R.id.imgBlogCategory)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val lytMain: LinearLayout = itemView.findViewById(R.id.lytMain)

    }
}