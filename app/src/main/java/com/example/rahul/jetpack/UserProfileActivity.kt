package com.example.rahul.jetpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rahul.jetpack.ui.userprofile.UserProfileFragment

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance())
                    .commitNow()
        }
    }

}
