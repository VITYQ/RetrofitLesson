package com.vityq.retrofitlesson.model.data

data class Currency(
    val date: String,
    val historical: Boolean,
    val info: Info,
    val motd: Motd,
    val query: Query,
    val result: Double,
    val success: Boolean
)