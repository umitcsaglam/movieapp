package com.can.movieapp.presentation.movies.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController


@Composable
fun MovieScreen(
    navController: NavController,
    viewModel: MoviesViewModel= hiltViewModel()
) {

    val state = viewModel.state.value




}