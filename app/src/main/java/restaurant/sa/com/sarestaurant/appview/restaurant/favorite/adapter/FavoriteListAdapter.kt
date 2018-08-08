package restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter

import android.app.Dialog
import android.support.v7.widget.RecyclerView
import android.content.Context
import android.os.Build
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_restaurant.*
import kotlinx.android.synthetic.main.fragment_restaurant_detail.*
import kotlinx.android.synthetic.main.restaurant_list_view.view.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RecyclerAdapterclass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel.ResponsePhotoModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient.GooglePlacesPhotoClient
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FavoriteListAdapter(var items: List<FavoriteRestaurantModel>?, var context: Context) : RecyclerView.Adapter<FavoriteListAdapter.CustomViewHolder>(){

    val TAG = "FavoriteListAdapter"
    lateinit var favoriteRestaurantModel: FavoriteRestaurantModel
    lateinit var photoReference: String
    lateinit var imgUrl: String
    lateinit var shareModel: ShareModel
    val dialog = Dialog(this.context)
    lateinit var restaurantDetailModel: RestaurantDetailModel
    private lateinit var homeActivity: HomeActivity
    val BASE_URL = "https://maps.googleapis.com"
    val noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteListAdapter.CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items!!.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        favoriteRestaurantModel = FavoriteRestaurantModel()
        restaurantDetailModel = RestaurantDetailModel()

        if(items != null){
            Log.d(TAG, "onBindViewHolder: called/n");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.restaurantImage.clipToOutline = true
            }
            shareModel = ShareModel()
            holder.restaurantAddress.text = items!![holder.adapterPosition].restaurantAddress
            holder.restaurantName.text = items!![holder.adapterPosition].restaurantName
            holder.placeId = items!![holder.adapterPosition].placeId!!
//        holder.favoriteButton.isChecked = items[holder.adapterPosition].isFavorite!!
            imgUrl = items!![holder.adapterPosition].restaurantImagePath
            Picasso.get().load(imgUrl)
                    .into(holder.restaurantImage)
            holder.restaurantImgUrl = imgUrl
            if (items!![holder.adapterPosition].isFavorite!!) {
                holder.favoriteButton.setBackgroundResource(R.drawable.ic_favorite_black_24dp)
//            addItem(favoriteRestaurantModel)
            }
        }else{
            Snackbar.make(homeActivity.constraintLayoutRest, "Data not Found :(", Snackbar.LENGTH_LONG)
                    .setAction("OK", null).show()
        }

        holder.favoriteButton.setOnClickListener {
            var adapterPos = items!![holder.adapterPosition].adapterPosition
            items = removeItem(adapterPos)
            notifyItemRemoved(holder.adapterPosition)
            notifyItemRangeChanged(holder.adapterPosition, items!!.size)
        }

        holder.sharePost.setOnClickListener {
            shareModel.address = items!![holder.adapterPosition].restaurantAddress
            shareModel.name = items!![holder.adapterPosition].restaurantName
            shareModel.imgUrl = holder.restaurantImgUrl

            val dialogBuilder = AlertDialog.Builder(context)
            val rcvDialog = RecyclerView(context)
            val myImageList = arrayListOf<Int>(R.drawable.ic_facebook, R.drawable.ic_google_plus,
                    R.drawable.ic_add_black_24dp)
            val arrayList = arrayListOf<String>("Facebook", "Google Plus", "Open Chooser")
            rcvDialog.adapter = RecyclerAdapterclass(context, arrayList, myImageList, shareModel) //DialogAdapter create by your self
            rcvDialog.layoutManager = LinearLayoutManager(context)
            dialogBuilder.setView(rcvDialog)

            val shareDialog: Dialog = dialogBuilder.create()
            shareDialog.show()
        }

        dialog.setContentView(R.layout.fragment_restaurant_detail)
        holder.holderView.setOnClickListener {
            restaurantDetailModel.rest_name = items!![holder.adapterPosition].restaurantName
            restaurantDetailModel.rest_address = items!![holder.adapterPosition].restaurantAddress
            restaurantDetailModel.imgUrl = holder.restaurantImgUrl
            if (items!![holder.adapterPosition].rating != null) {
                restaurantDetailModel.rating = items!![holder.adapterPosition].rating!!
            } else {
                restaurantDetailModel.rating = 0.0
            }
            if (items!![holder.adapterPosition].rest_isClosed != null) {
                restaurantDetailModel.rest_isClosed = items!![holder.adapterPosition].rest_isClosed!!
            } else {
                restaurantDetailModel.rest_isClosed = "No Data Available"
            }
            Log.d(TAG, "onBindViewHolder: Clicked")
            retrofitCall(holder.placeId)

        }
    }

    fun retrofitCall(placeId: String){
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
        val retrofit: Retrofit = builder.build()

        val client: GooglePlacesPhotoClient = retrofit.create(GooglePlacesPhotoClient::class.java)
        homeActivity = context as HomeActivity
        val call = client.sendRequestForPlacesPhotos(placeId, homeActivity.resources.getString(R.string.google_maps_key))
        call.enqueue(object : Callback<ResponsePhotoModelClass> {
            override fun onFailure(call: Call<ResponsePhotoModelClass>?, t: Throwable?) {
                Log.e(TAG, "onFailure: $t");
            }

            override fun onResponse(call: Call<ResponsePhotoModelClass>?, responseModelClass: Response<ResponsePhotoModelClass>?) {
                Log.d(TAG, "onResponse: ${responseModelClass!!.body()!!}")

                if(responseModelClass.body()!!.result != null){
                    if(responseModelClass.body()!!.result!!.photos != null){
                        for(i in responseModelClass.body()!!.result!!.photos!!){
                            restaurantDetailModel.imageUrlList!!.add(i.photoReference!!)
                        }
                    }else{
                        restaurantDetailModel.imageUrlList!!.add("")
                    }

                    dialog.restDetailAddress.text = restaurantDetailModel.rest_address
                    dialog.ratingBar.rating = restaurantDetailModel.rating.toFloat()
                    if(dialog.ratingBar.rating == 0.0.toFloat()){
                        dialog.ratingBar.visibility = View.GONE
                        dialog.noRatingTV.visibility = View.VISIBLE
                        dialog.noRatingTV.text = context.getString(R.string.no_rate_available)
                    }
                    if(restaurantDetailModel.rest_isClosed == "true"){
                        dialog.openingHours.text = context.getString(R.string.yes)
                    }else if(restaurantDetailModel.rest_isClosed == "false"){
                        dialog.openingHours.text = context.getString(R.string.no)
                    }else{
                        dialog.openingHours.text = context.getString(R.string.not_available)
                    }
                    dialog.restDetailName.text = restaurantDetailModel.rest_name
                    dialog.show()
                }else{
                    Snackbar.make(homeActivity.constraintLayoutRest, "Data not Found :(", Snackbar.LENGTH_LONG)
                            .setAction("OK", null).show()
                }
            }
        })
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    private fun removeItem(position: Int): ArrayList<FavoriteRestaurantModel> {

        Log.d(TAG, "removeItem: $position");

        SARestaurantApp.database!!.favoriteRestaurantDao().removeItem(position)
        return SARestaurantApp.database!!.favoriteRestaurantDao().getAll() as ArrayList<FavoriteRestaurantModel>
    }

    inner class CustomViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var holderView = view.cardView
        var restaurantName = view.restTextViewName
        var restaurantAddress = view.restTextViewAddress
        var favoriteButton = view.toggleButton2
        var restaurantImage = view.restImageView
        var sharePost = view.restShareImgView
        var restaurantImgUrl:String = ""
        var placeId: String = ""
    }

}

