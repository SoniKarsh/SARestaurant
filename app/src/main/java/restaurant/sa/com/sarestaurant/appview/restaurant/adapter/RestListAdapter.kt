package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.app.Dialog
import android.support.v7.widget.RecyclerView
import android.content.Context
//import restaurant.sa.com.sarestaurant.model.models.Result
import android.location.Location
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
import kotlinx.android.synthetic.main.fragment_restaurant.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment
import restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel.ResponsePhotoModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient.GooglePlacesClient
import restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient.GooglePlacesPhotoClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RestListAdapter(var items: ArrayList<Result>, var favItems: List<FavoriteRestaurantModel>, var context: Context) : RecyclerView.Adapter<RestListAdapter.CustomViewHolder>(){

    val TAG = "RestaurantListAdapter"
    lateinit var favoriteRestaurantModel: FavoriteRestaurantModel
    lateinit var shareModel: ShareModel
    var detailFragment : RestaurantDetailFragment? = null
    var homeActivity: HomeActivity? = null
    var FRAGMENT_DETAIL_REST = "RestaurantDetailFragment"
    var detailPresenter: DetailPresenter? = null
    lateinit var restaurantDetailModel: RestaurantDetailModel
    val BASE_URL = "https://maps.googleapis.com"
    val noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        favoriteRestaurantModel = FavoriteRestaurantModel()
        restaurantDetailModel = RestaurantDetailModel()
        shareModel = ShareModel()
        detailFragment = RestaurantDetailFragment()
        detailPresenter = detailFragment
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.restaurantImage.clipToOutline = true
        }
        holder.restaurantAddress.text = items[holder.adapterPosition].vicinity
        holder.restaurantName.text = items[holder.adapterPosition].name
        if (items[holder.adapterPosition].photos != null){
            val photoReference = items[holder.adapterPosition].photos!![0].photoReference
            holder.restaurantImgUrl = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=$photoReference&sensor=false&key=${context.resources.getString(R.string.google_maps_key)}"
        }else{
            holder.restaurantImgUrl = noImage
        }
        Picasso.get().load(holder.restaurantImgUrl)
                .into(holder.restaurantImage)
        holder.placeId = items[holder.adapterPosition].placeId!!
//        https://maps.googleapis.com/maps/api/place/details/json?placeid=${placeId}&key=${resources.getString(R.string.google_maps_key)}
        Log.d(TAG, "onBindViewHolder: ${holder.adapterPosition}")

        for (i in favItems){
            if(items[holder.adapterPosition].name == i.restaurantName
                    && items[holder.adapterPosition].vicinity == i.restaurantAddress){
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

        holder.holderView.setOnClickListener {

            restaurantDetailModel.rest_name = items[holder.adapterPosition].name
            restaurantDetailModel.rest_address = items[holder.adapterPosition].vicinity!!
            restaurantDetailModel.imgUrl = holder.restaurantImgUrl
            if(items [holder.adapterPosition].rating != null){
                restaurantDetailModel.rating = items[holder.adapterPosition].rating!!
            }else{
                restaurantDetailModel.rating = 0.0
            }
//            holder.placeId = items.results!![holder.adapterPosition].placeId
            if(items[holder.adapterPosition].openingHours != null){
                restaurantDetailModel.rest_isClosed = items[holder.adapterPosition].openingHours!!.openNow.toString()
            }else{
                restaurantDetailModel.rest_isClosed = "No Data Available"
            }
            Log.d(TAG, "onBindViewHolder: Clicked");
            retrofitCall(holder.placeId)
//            detailPresenter?.getRestaurantData(restaurantDetailModel)
//            homeActivity = context as HomeActivity
//            homeActivity!!.supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.fragmentHolder, detailFragment, FRAGMENT_DETAIL_REST)
//                    .addToBackStack(null)
//                    .commit()
        }

        holder.sharePost.setOnClickListener {

            shareModel.address = items[holder.adapterPosition].vicinity!!
            shareModel.name = items[holder.adapterPosition].name
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
            favoriteRestaurantModel.restaurantName = items[holder.adapterPosition].name
            favoriteRestaurantModel.restaurantAddress = items[holder.adapterPosition].vicinity!!
            favoriteRestaurantModel.restaurantImagePath = holder.restaurantImgUrl

            favoriteRestaurantModel.latitude = items[holder.adapterPosition].geometry!!.location!!.lat
            favoriteRestaurantModel.longitude = items[holder.adapterPosition].geometry!!.location!!.lng
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

    fun retrofitCall(placeId: String){
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
        val retrofit: Retrofit = builder.build()

        val client: GooglePlacesPhotoClient = retrofit.create(GooglePlacesPhotoClient::class.java)
        homeActivity = context as HomeActivity
        val call = client.sendRequestForPlacesPhotos(placeId, homeActivity!!.resources.getString(R.string.google_maps_key))
        call.enqueue(object : Callback<ResponsePhotoModelClass> {
            override fun onFailure(call: Call<ResponsePhotoModelClass>?, t: Throwable?) {
                Log.e(TAG, "onFailure: $t");
            }

            override fun onResponse(call: Call<ResponsePhotoModelClass>?, responseModelClass: Response<ResponsePhotoModelClass>?) {
                Log.d(TAG, "onResponse: ${responseModelClass!!.body()!!}")

                if(responseModelClass.body()!!.result.photos != null){
                    for(i in responseModelClass.body()!!.result.photos){
                        restaurantDetailModel.imageUrlList!!.add(i.photoReference)
                    }
                }else{
                    restaurantDetailModel.imageUrlList!!.add("")
                }
                detailPresenter?.getRestaurantData(restaurantDetailModel)
                homeActivity!!.supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentHolder, detailFragment, FRAGMENT_DETAIL_REST)
                        .addToBackStack(null)
                        .commit()
            }
        })
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
        var holderView = view.cardView
        var restaurantImgUrl:String = ""
        var restaurantName = view.restTextViewName
        var restaurantAddress = view.restTextViewAddress
        var favoriteButton = view.toggleButton2
        var restaurantImage = view.restImageView
        var sharePost = view.restShareImgView
        var placeId: String = ""
    }

}



