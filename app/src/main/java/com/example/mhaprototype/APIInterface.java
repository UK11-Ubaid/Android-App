package com.example.mhaprototype;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/api/Bookings")
        Call<List<BookingModel>> getuserBookings();
}
