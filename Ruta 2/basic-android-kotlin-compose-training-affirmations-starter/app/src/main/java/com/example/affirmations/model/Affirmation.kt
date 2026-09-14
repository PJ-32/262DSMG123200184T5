package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int, // Id de recurso de cadenas
    @DrawableRes val imageResourceId: Int // Id de recurso de elementos de diseño
)
