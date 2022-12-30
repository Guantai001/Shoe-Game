package com.example.shoegame

data class TrendingProduct (
    val name: String,
    val price: String,
    val image: Int
) {
    companion object {
        val list = listOf(
            TrendingProduct("Under Armour Phantom", "ksh 4,500", R.drawable.armour_phantom),
            TrendingProduct("Under Armour 109", "Ksh 5,000", R.drawable.under_1031),
            TrendingProduct("Nike Air Max 270", "Ksh 3,000", R.drawable.adidas_1032),
            TrendingProduct("Adidas Neo", "Ksh 7,000", R.drawable.shoe_101),
            TrendingProduct("Roadster", "Ksh 6,000", R.drawable.roaster_100),
        )
    }
}
data class CartDataModel(
    val id: Int,
    val name: String,
    val price: Int,
    val image: Int,
    var quantity: Int = 1,

    ){
    companion object {
        val list = listOf(
            CartDataModel(id = 101, "Nike Air Max 270", 3000, R.drawable.adidas_1032),
            CartDataModel(id = 102, "Under Armour 109", 5000, R.drawable.under_1031),
            CartDataModel(id = 103, "Under Armour Phantom", 4500, R.drawable.armour_phantom),
            CartDataModel(id = 104, "Adidas Neo", 7000, R.drawable.shoe_101),
            CartDataModel(id = 105, "Roadster Sneaker", 6000, R.drawable.roaster_100),
        )
    }
}
