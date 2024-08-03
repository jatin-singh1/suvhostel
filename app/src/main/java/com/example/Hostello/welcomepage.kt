package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class welcomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomepage)
        val not1 = findViewById<TextView>(R.id.notice)
        val not2=findViewById<LinearLayout>(R.id.notice7)
        not1.setOnClickListener{
            val i= Intent(this,Noticeboard::class.java)
            startActivity(i)
        }
        not2.setOnClickListener{
            val i=Intent(this,Noticeboard::class.java)
            startActivity(i)
        }
        val lv1 = findViewById<TextView>(R.id.leave)
        val lv2=findViewById<LinearLayout>(R.id.applyforleave1)
        lv1.setOnClickListener{
            val i= Intent(this,applyleave_check::class.java)
            startActivity(i)
        }
        lv2.setOnClickListener{
            val i=Intent(this,applyleave_check::class.java)
            startActivity(i)
        }
        val comp1 = findViewById<TextView>(R.id.complaint)
        val comp2=findViewById<LinearLayout>(R.id.complaint2)
        comp1.setOnClickListener{
            val i= Intent(this,raisecomplain_check::class.java)
            startActivity(i)
        }
        comp2.setOnClickListener{
            val i=Intent(this,raisecomplain_check::class.java)
            startActivity(i)
        }
        val foru1 = findViewById<TextView>(R.id.forum)
        val foru2=findViewById<LinearLayout>(R.id.forum3)
        foru1.setOnClickListener{
            val i= Intent(this,forum::class.java)
            startActivity(i)
        }
        foru2.setOnClickListener{
            val i=Intent(this,forum::class.java)
            startActivity(i)
        }
        val lnf1 = findViewById<TextView>(R.id.lostnf)
        val lnf2=findViewById<LinearLayout>(R.id.lostnf4)
        lnf1.setOnClickListener{
            val i= Intent(this,lost_n_found_check::class.java)
            startActivity(i)
        }
        lnf2.setOnClickListener{
            val i=Intent(this,lost_n_found_check::class.java)
            startActivity(i)
        }

        val Rc1 = findViewById<TextView>(R.id.roomchange)
        val Rc2=findViewById<LinearLayout>(R.id.roomchange5)
        Rc1.setOnClickListener{
            val i= Intent(this,applyroomchange_check::class.java)
            startActivity(i)
        }
        Rc2.setOnClickListener{
            val i=Intent(this,applyroomchange_check::class.java)
            startActivity(i)
        }

        val FD1 = findViewById<TextView>(R.id.feesdet)
        val FD2=findViewById<LinearLayout>(R.id.feesdetails6)
        FD1.setOnClickListener{
            val i= Intent(this,Fees_details::class.java)
            startActivity(i)
        }
        FD2.setOnClickListener{
            val i=Intent(this,Fees_details::class.java)
            startActivity(i)
        }

    }
}