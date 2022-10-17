package com.vityq.retrofitlesson.ui.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CurrencyScreen(viewModel: CurrencyViewModel = viewModel()) {
    if (viewModel.loadingState.value) {
        Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
    Column {
        Text(text = "1$ = ${viewModel.usd}")
        Text(text = "1европейский рубль = ...")
        if (viewModel.loadingState.value) {
            CircularProgressIndicator()
        }
    }
}