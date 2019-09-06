package com.softvision.hope.ui.campaign

import com.softvision.hope.base.mvi.State

data class CampaignState  (
    val test: String = "",
    val campaigns: List<Campaign> = emptyList()
): State
