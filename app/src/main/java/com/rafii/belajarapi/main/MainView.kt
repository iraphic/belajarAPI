package com.rafii.belajarapi.main

import com.rafii.belajarapi.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}