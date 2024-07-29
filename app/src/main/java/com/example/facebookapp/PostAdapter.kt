package com.example.facebookapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.facebookapp.model.post

class PostAdapter(var postsList:List<post>):RecyclerView.Adapter<PostAdapter.MyviewHolder>(){

    class MyviewHolder(val postview: View):RecyclerView.ViewHolder(postview){
    private val profileIv:ImageView = postview.findViewById(R.id.imv_profile_pic)
    private val profileNameTv:TextView= postview.findViewById(R.id.tv_profile_name)
    private val postDateTv:TextView= postview.findViewById(R.id.tv_post_time)
    private val postContent: TextView= postview.findViewById(R.id.tv_post_content)
    private val postImageView: ImageView = postview.findViewById(R.id.imv_post_image)

    fun bind (post:post){

        profileIv.setImageResource(post.author.profilepic)
        profileNameTv.text=post.author.name
        postContent.text=post.date
        postContent.text=post.content
        postImageView.setImageResource(post.image)
}
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
   val postview=LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return MyviewHolder(postview)
    }

    override fun getItemCount(): Int= postsList.size


    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
  val post= postsList[position]
        holder.bind(post)
    }
}