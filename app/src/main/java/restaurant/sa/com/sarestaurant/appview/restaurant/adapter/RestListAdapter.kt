package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.app.Dialog
import android.support.v7.widget.RecyclerView
import android.content.Context
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.restaurant_list_view.view.*
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel


class RestListAdapter(var items: ResponseModelClass, var favItems: List<FavoriteRestaurantModel>, var context: Context) : RecyclerView.Adapter<RestListAdapter.CustomViewHolder>(){

    val TAG = "RestaurantListAdapter"
    lateinit var favoriteRestaurantModel: FavoriteRestaurantModel
    lateinit var shareModel: ShareModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.results!!.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        favoriteRestaurantModel = FavoriteRestaurantModel()
        shareModel = ShareModel()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.restaurantImage.clipToOutline = true
        }
        holder.restaurantAddress.text = items.results!![holder.adapterPosition].vicinity
        holder.restaurantName.text = items.results!![holder.adapterPosition].name
        if (items.results!![holder.adapterPosition].photos != null){
            val photoReference = items.results!![holder.adapterPosition].photos!![0].photoReference
            holder.restaurantImgUrl = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=$photoReference&sensor=false&key=${context.resources.getString(R.string.google_maps_key)}"
        }else{
            holder.restaurantImgUrl = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png"
        }
        Picasso.get().load(holder.restaurantImgUrl)
                .into(holder.restaurantImage)

        Log.d(TAG, "onBindViewHolder: ${holder.adapterPosition}")

        for (i in favItems){
            if(items.results!![holder.adapterPosition].name == i.restaurantName
                    && items.results!![holder.adapterPosition].vicinity == i.restaurantAddress){
                if(i.isFavorite!=null){
                    if(i.isFavorite!!) {
                        holder.favoriteButton.setBackgroundResource(R.drawable.ic_favorite_black_24dp)
                    }
//            addItem(favoriteRestaurantModel)
                }else{
                    Log.d("TAG", "${i.isFavorite}")
                }
            }
        }

        holder.sharePost.setOnClickListener {

            shareModel.address = items.results!![holder.adapterPosition].vicinity
            shareModel.name = items.results!![holder.adapterPosition].name
            shareModel.imgUrl = holder.restaurantImgUrl

            val dialogBuilder = AlertDialog.Builder(context)
            val rcvDialog = RecyclerView(context)
            val myImageList = arrayListOf<Int>(R.drawable.ic_facebook, R.drawable.ic_google_plus,
                    R.drawable.ic_add_black_24dp)
            val arrayList = arrayListOf<String>("Facebook", "Google Plus", "Open Chooser")
            rcvDialog.adapter = RecyclerAdapterclass(context, arrayList, myImageList, shareModel) //DialogAdapter create by your self
            rcvDialog.layoutManager = LinearLayoutManager(context)
            dialogBuilder.setView(rcvDialog)

            val dialog: Dialog = dialogBuilder.create()
            dialog.show()

        }

        holder.favoriteButton.setOnClickListener {
            var isFavorite = holder.favoriteButton.isChecked
            favoriteRestaurantModel.adapterPosition = holder.adapterPosition
            favoriteRestaurantModel.restaurantName = items.results!![holder.adapterPosition].name
            favoriteRestaurantModel.restaurantAddress = items.results!![holder.adapterPosition].vicinity
            favoriteRestaurantModel.restaurantImagePath = holder.restaurantImgUrl

            favoriteRestaurantModel.latitude = items.results!![holder.adapterPosition].geometry.location.lat
            favoriteRestaurantModel.longitude = items.results!![holder.adapterPosition].geometry.location.lng
            favoriteRestaurantModel.isFavorite = isFavorite

            if(isFavorite){
                holder.favoriteButton.setBackgroundResource(R.drawable.ic_favorite_black_24dp)
                addItem(favoriteRestaurantModel)
            }else{
                holder.favoriteButton.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp)
                removeItem(holder.adapterPosition)
            }

        }



    }

    private fun removeItem(position: Int) {

        Log.d(TAG, "removeItem: $favoriteRestaurantModel");

        SARestaurantApp.database!!.favoriteRestaurantDao().removeItem(position)
    }

    private fun addItem(favoriteRestaurantModel: FavoriteRestaurantModel) {
        Log.d(TAG, "addItem: $favoriteRestaurantModel")
        SARestaurantApp.database!!.favoriteRestaurantDao().insertItem(favoriteRestaurantModel)
        Log.d(TAG, "addItem: ${SARestaurantApp.database!!.favoriteRestaurantDao().getAll()}")
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class CustomViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var restaurantImgUrl:String = ""
        var restaurantName = view.restTextViewName
        var restaurantAddress = view.restTextViewAddress
        var favoriteButton = view.toggleButton2
        var restaurantImage = view.restImageView
        var sharePost = view.restShareImgView
    }

}



