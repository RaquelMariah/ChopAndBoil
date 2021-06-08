package com.ramaria.chopnboil.data

import com.ramaria.chopnboil.FoodRecipesApi
import com.ramaria.chopnboil.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

//it will request the data from API
class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>{
        return  foodRecipesApi.getRecipes(queries)
    }

}