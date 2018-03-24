package com.tajawa.abdallah.tajawal_android_task.Activitys.ListingHotels

import com.tajawa.abdallah.tajawal_android_task.Activitys.ListingHotels.Adapters.HotelItemsAdapter.HotelItemViewHolder
import com.tajawa.abdallah.tajawal_android_task.Activitys.ListingHotels.Adapters.HotelItemsAdapter.HotelItemsAdapter
import com.tajawa.abdallah.tajawal_android_task.BasePresenter
import com.tajawa.abdallah.tajawal_android_task.DataLayer.Models.HotelsModel.HotelsModel

/**
 * Created by AbdAllah Abd-El-Fattah on 23-Mar-18.
 */
interface ListingHotelsContract {

    interface View {
        fun setLoading(loading: Boolean)

        fun handleSuccess()

        fun handleError(errMsg: String)

        fun setHotelItemsAdapter(hotelItemsAdapter: HotelItemsAdapter)

        fun startDetailsActivity()
    }

    interface Presenter : BasePresenter {
        fun onGetHotelsSuccess(hotelsMode: HotelsModel)

        fun onGetHotelsFail(err: String)

        fun onBindHotelRowViewAtPosition(holder: HotelItemViewHolder, Position: Int)

        fun getHotelNumbers(): Int
    }
}