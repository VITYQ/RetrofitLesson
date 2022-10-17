package com.vityq.retrofitlesson.model


import com.vityq.retrofitlesson.model.data.Currency
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/convert?to=RUB")
    suspend fun getLatestCurrency(@Query("from") from: String): Currency
}