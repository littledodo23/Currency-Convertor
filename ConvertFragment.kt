package com.example.user.currenctconveraburayya


import android.app.AlertDialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.NotificationCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.custom_dialog.view.*
import kotlinx.android.synthetic.main.fragment_convert.view.*

//Currency Converter:** Converts ILS to USD and notifies the user if the amount equals 2000 USD.
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ConvertFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_convert, container, false)
        val viewDialog= LayoutInflater.from(context).inflate(R.layout.custom_dialog,null)
        val id = 1234
        val id_channle = "Channle"
        val builder = AlertDialog.Builder(context)
        builder.setView(viewDialog)
        val dialog= builder.create()



        view.button5.setOnClickListener {_->

            dialog.show()

            viewDialog.button4.setOnClickListener {
            val num = viewDialog.editText.text.toString().toDouble()
            val res =num *3.75
            viewDialog.textView3.text= res.toString()
        }
            viewDialog.button3.setOnClickListener {
                dialog.cancel()
            }
        }
        view.button6.setOnClickListener{_->

            dialog.show()

            viewDialog.button4.setOnClickListener {
                val num = viewDialog.editText.text.toString().toDouble()
                val res =num/3.75
                viewDialog.textView3.text= res.toString()
               if (res== 2000.0){
                    val importance = NotificationManager.IMPORTANCE_HIGH
                    val channle = NotificationChannel( id_channle,"اسم القناة", importance)
                    val notification= NotificationCompat.Builder(this!!.context!!,id_channle)
                            .setContentText("هذا المبلغ المحول يساوي 2000$")
                            .setSmallIcon(R.drawable.notification_icon_background)
                            .setContentTitle("معلومة")
                            .build()
                   val intent = Intent(context,Main2Activity::class.java)
                   val pendingIntent= PendingIntent.getActivity(context,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)
                   notification.contentIntent=pendingIntent
                    val g =context!!.getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager

                    g.createNotificationChannel(channle)
                    g.notify(id,notification)



                }
            }
            viewDialog.button3.setOnClickListener {
                dialog.cancel()
            }
        }

        // Inflate the layout for this fragment
        return view
    }


}
