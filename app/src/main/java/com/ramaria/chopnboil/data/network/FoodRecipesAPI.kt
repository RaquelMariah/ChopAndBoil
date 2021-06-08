package com.ramaria.chopnboil

import com.ramaria.chopnboil.model.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    fun getRecipes(
        @QueryMap queries: Map<String, String> //@QueryMap seems like a hashMap
    ): Response<FoodRecipe> //model class that contains the results


}