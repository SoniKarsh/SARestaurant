package restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter

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
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel

class FavoriteListAdapter(var items: List<FavoriteRestaurantModel>, var context: Context) : RecyclerView.Adapter<FavoriteListAdapter.CustomViewHolder>(){

    val TAG = "FavoriteListAdapter"
    lateinit var favoriteRestaurantModel: FavoriteRestaurantModel
    lateinit var photoReference: String
    lateinit var imgUrl: String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteListAdapter.CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        favoriteRestaurantModel = FavoriteRestaurantModel()
        Log.d(TAG, "onBindViewHolder: called/n");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.restaurantImage.clipToOutline = true
        }
        holder.restaurantAddress.text = items[holder.adapterPosition].restaurantAddress
        holder.restaurantName.text = items[holder.adapterPosition].restaurantName
//        holder.favoriteButton.isChecked = items[holder.adapterPosition].isFavorite!!
        imgUrl = items[holder.adapterPosition].restaurantImagePath
        Picasso.get().load(imgUrl)
                .into(holder.restaurantImage)
        if(items[holder.adapterPosition].isFavorite!!){
            holder.favoriteButton.setBackgroundResource(R.drawable.ic_favorite_black_24dp)
//            addItem(favoriteRestaurantModel)
        }

        holder.favoriteButton.setOnClickListener {

            var adapterPos = items[holder.adapterPosition].adapterPosition
            items = removeItem(adapterPos)
            notifyItemRemoved(holder.adapterPosition)

        }

//        holder.restaurantAddress.text = items[]
//
//        holder.restaurantAddress.text = items.results!![holder.adapterPosition].vicinity
//        holder.restaurantName.text = items.results!![holder.adapterPosition].name
//        val photoReference = items.results!![holder.adapterPosition].photos!![0].photoReference
//        Log.d(TAG, "onBindViewHolder: $photoReference")
//        val imgUrl = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=$photoReference&sensor=false&key=${context.resources.getString(R.string.google_maps_key)}"
//        Log.d(TAG, "onBindViewHolder: $imgUrl")
//        Picasso.get().load(imgUrl)
//                .into(holder.restaurantImage)
//
//        Log.d(TAG, "onBindViewHolder: ${holder.adapterPosition}")
//
//        holder.favoriteButton.setOnClickListener {
//
//            var isFavorite = holder.favoriteButton.isChecked
//            favoriteRestaurantModel.adapterPosition = holder.adapterPosition
//            favoriteRestaurantModel.restaurantName = holder.restaurantName.toString()
//            favoriteRestaurantModel.restaurantAddress = holder.restaurantAddress.toString()
//            favoriteRestaurantModel.restaurantImagePath = imgUrl
//
//            if(isFavorite){
//                holder.favoriteButton.setBackgroundResource(R.drawable.ic_heart_on)
//                addItem(favoriteRestaurantModel)
//            }else{
//                holder.favoriteButton.setBackgroundResource(R.drawable.ic_heart_off)
//                removeItem(holder.adapterPosition)
//            }
//
//        }
    }

//    private fun removeItem(position: Int) {
//
//        Log.d(TAG, "removeItem: $favoriteRestaurantModel");
//
//        userDatabase.favoriteRestaurantDao().removeItem(position)
//    }
//
//    private fun addItem(favoriteRestaurantModel: FavoriteRestaurantModel) {
//        Log.d(TAG, "addItem: $favoriteRestaurantModel")
//        userDatabase.favoriteRestaurantDao().insertItem(favoriteRestaurantModel)
//        Log.d(TAG, "addItem: ${userDatabase.favoriteRestaurantDao().getAll()}")
//    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    private fun removeItem(position: Int): ArrayList<FavoriteRestaurantModel> {

        Log.d(TAG, "removeItem: $position");

        SARestaurantApp.database!!.favoriteRestaurantDao().removeItem(position)
        return SARestaurantApp.database!!.favoriteRestaurantDao().getAll() as ArrayList<FavoriteRestaurantModel>
    }

    inner class CustomViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var restaurantName = view.restTextViewName
        var restaurantAddress = view.restTextViewAddress
        var favoriteButton = view.toggleButton2
        var restaurantImage = view.restImageView
        var sharePost = view.restShareImgView
    }

}

