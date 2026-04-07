package com.max_grank.git_training.presentation

import androidx.lifecycle.ViewModel
import com.max_grank.git_training.data.AppDataBase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
val appDataBase: AppDataBase
): ViewModel() {


}