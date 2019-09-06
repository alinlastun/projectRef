package com.softvision.hope.ui.campaign

import com.softvision.hope.base.domain.model.Campaign
import com.softvision.hope.ui.campaign.Campaign as ViewCampaign

data class Campaign(
    val name: String,
    val owner: String,
    val type: String,
    val startDate: String,
    val endDate: String,
    val details: String,
    val target: Int

)

object CampaignMapper {
    fun map(domain: Campaign) = ViewCampaign(
        domain.name,
        domain.owner,
        domain.type,
        domain.startDate,
        domain.endDate,
        domain.details,
        domain.target
    )
}