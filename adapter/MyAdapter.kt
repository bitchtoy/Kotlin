package com.example.zoneker.mydemo.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.zoneker.mydemo.R
import com.example.zoneker.mydemo.item.Foot
import com.example.zoneker.mydemo.item.Tngou
import org.jetbrains.anko.image

/**
 * Created by Zoneker on 2017/6/5.
 */
class MyAdapter(var ctx:Context,var list: List<Tngou>) : Adapter<MyAdapter.MyViewHolder>() {
    var inflater : LayoutInflater


    init {
        inflater = LayoutInflater.from(ctx)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textTitle!!.text = list.get(position).description
        holder.textContent!!.text = list.get(position).keywords
        Glide.with(ctx).load("http://img1.imgtn.bdimg.com/it/u=489743113,36423855&fm=214&gp=0.jpg").into(holder.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view : View = inflater.inflate(R.layout.item_view,null)
        var holder : MyViewHolder = MyViewHolder(view)
        return holder

    }

    override fun getItemCount(): Int {
        return  list.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var textContent : TextView? = null
        var textTitle : TextView? = null
        var image : ImageView? =null
        init {
            textContent = itemView.findViewById(R.id.text_content) as TextView
            image = itemView.findViewById(R.id.iv) as ImageView
            textTitle = itemView.findViewById(R.id.description) as TextView
        }


    }

}