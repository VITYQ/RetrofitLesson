package com.vityq.retrofitlesson.ui.presentation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.vityq.retrofitlesson.model.CurrencyRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CurrencyViewModel(): ViewModel() {
    var usd by mutableStateOf(0f)
    var eur by mutableStateOf(0f)
    val repository = CurrencyRepository()
    var loadingState = mutableStateOf(false)
    init {
        fetchRates()
    }
    fun fetchRates() {
        CoroutineScope(Dispatchers.Main).launch {
            loadingState.value = true
            delay(1000L)
            usd = repository.getUsdToRub("BTC").result.toFloat()
            loadingState.value  = false
        }
    }
}