package com.vityq.retrofitlesson.model

import com.google.gson.GsonBuilder
import com.vityq.retrofitlesson.model.data.Currency
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CurrencyRepository {
    val gson = GsonBuilder().apply {
        setLenient()
    }.create()
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.exchangerate.host")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val api = retrofit.create(Api::class.java)

    suspend fun getUsdToRub(from: String) = api.getLatestCurrency(from)

}