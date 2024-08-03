package com.example.Hostello
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class lost_n_found_status_check : AppCompatActivity() {

    private lateinit var textitem : TextView
    private lateinit var textinfo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_nfound_status_check)

            textitem = findViewById(R.id.itemNameTextView)
            textinfo = findViewById(R.id.descriptionTextView)

            val userName = intent.getStringExtra("itemname")
            val password = intent.getStringExtra("description")

            textitem.text = "itemname : "+userName
            textinfo.text = "description : "+password

        }
    }
