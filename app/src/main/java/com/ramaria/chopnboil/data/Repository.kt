package com.ramaria.chopnboil.data

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource
) {
    val remoteDataSource = remoteDataSource
    //val local = localDataSource
}