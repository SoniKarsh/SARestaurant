package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.CallbackManager
import com.facebook.share.model.ShareLinkContent
import com.facebook.share.widget.ShareDialog
import com.google.android.gms.plus.PlusShare
import kotlinx.android.synthetic.main.restaurant_list_view.view.*
import kotlinx.android.synthetic.main.share_list_view.view.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel
import java.util.*

class RecyclerAdapterclass(var context: Context, var items: ArrayList<String>, var imageItems: ArrayList<Int>, var shareModel: ShareModel) : RecyclerView.Adapter<RecyclerAdapterclass.CustomViewHolder>(){

    lateinit var callbackManager: CallbackManager
    val TAG = "RecyclerAdapterclass"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterclass.CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.share_list_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterclass.CustomViewHolder, position: Int) {
        val shareDialog = ShareDialog(context as HomeActivity)
        holder.textView.text = items[holder.adapterPosition]
        holder.imageView.setImageResource(imageItems[holder.adapterPosition])

        holder.cardView.setOnClickListener {
            if(it.dialogChooserName.text == "Facebook"){

                val content = ShareLinkContent.Builder()
                    .setQuote("Name: ${shareModel.name}\n " +
                            "Address: ${shareModel.address} \n")
                    .setContentUrl(Uri.parse(shareModel.imgUrl))
                    .build()

            shareDialog.show(content, ShareDialog.Mode.AUTOMATIC)

            }else if(it.dialogChooserName.text == "Google Plus"){

                val shareIntent = PlusShare.Builder(context as HomeActivity)
                        .setType("text/plain")
                        .setText("Name: ${shareModel.name}\n " +
                                "Address: ${shareModel.address} \n")
                        .setContentUrl(Uri.parse(shareModel.imgUrl))
                        .getIntent()

                ActivityCompat.startActivityForResult(context as HomeActivity, shareIntent, 1, null)

            }else{
                val intent = Intent()
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_TEXT, "Name: ${shareModel.name}\n " +
                        "Address: ${shareModel.address} \n " +
                        "Img Url: ${shareModel.imgUrl} \n")
                intent.action = Intent.ACTION_SEND
                ActivityCompat.startActivityForResult(context as HomeActivity, Intent.createChooser(intent, "Share With"), 1, null)
            }
        }

    }

    inner class CustomViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var cardView = view.shareItem
        var textView = view.dialogChooserName
        var imageView = view.dialogImageView
    }

}