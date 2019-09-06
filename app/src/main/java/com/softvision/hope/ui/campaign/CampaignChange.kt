package com.softvision.hope.ui.campaign

import com.softvision.hope.base.domain.model.Campaign
import com.softvision.hope.base.mvi.Change

sealed class CampaignChange : Change{
    object Initialize : CampaignChange()

    data class DbChanged(
        val campaigns: List<Campaign>
    ) : CampaignChange()
}