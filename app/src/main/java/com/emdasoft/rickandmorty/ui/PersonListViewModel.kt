package com.emdasoft.rickandmorty.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emdasoft.rickandmorty.data.RepositoryImpl
import com.emdasoft.rickandmorty.domain.GetPersonListUseCase
import com.emdasoft.rickandmorty.domain.models.Items
import kotlinx.coroutines.launch
import retrofit2.Response

class PersonListViewModel:ViewModel() {

    val repository = RepositoryImpl

    val getPersonListUseCase = GetPersonListUseCase(repository)

    val personList: MutableLiveData<Response<Items>> = MutableLiveData()

    fun getPersonList() {
        viewModelScope.launch {
            personList.postValue(getPersonListUseCase.getPersonList(10))
        }
    }
}