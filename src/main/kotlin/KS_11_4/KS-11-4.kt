package org.Evgeniy.KS_11_4

class RecipeCategory(
    val id: Int,
    val name: String,
    val description: String,
    val categoryURL: String
)

class Recipe(
    val name: String,
    val id: Int,
    val recipeURL: String,
    var portions: Int,
    var inFavourites: Boolean = false,
    val ingredients: List<Ingredient>
)

class Ingredient(
    val name: String,
    val id: Int
)
