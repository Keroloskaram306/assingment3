package com.example.facebookapp

import android.icu.util.Calendar
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.facebookapp.databinding.ActivityFacebookTimelineBinding
import com.example.facebookapp.model.User
import com.example.facebookapp.model.post
import java.util.Date

class FacebookTimelineActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityFacebookTimelineBinding

    private val posts = arrayListOf<post>()
    private lateinit var postAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFacebookTimelineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun createPostsList(date: Any) {

            val data: Date? = Calendar.getInstance().time
            val dateFormatted=date.toString()
            posts.add(
                post(
                    author = User("Mai", R.drawable.child),
                    date =,
                    content = "This post is great",
                    image = R.drawable.child
                )
            )

        }

        fun postAdapter(posts: ArrayList<post>): PostAdapter {


            fun createPostsList() {
                TODO("Not yet implemented")
            }

            fun initRecycleview() {
                createPostsList()
                postAdapter = postAdapter(posts)
                binding.rvPosts.apply {
                    adapter = postAdapter
                    layoutManager = LinearLayoutManager(this@FacebookTimelineActivity)
                }
                binding.rvPosts.adapter = postAdapter
            }


            return TODO("Provide the return value")
        }
    }

}