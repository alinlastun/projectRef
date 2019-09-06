package com.softvision.hope.design.campaign

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.content.res.use
import androidx.core.view.marginStart
import com.softvision.hope.design.R
import com.softvision.hope.design.extensions.dipsToPixels
import kotlinx.android.synthetic.main.item_campaign.view.*

class CampaignItem @JvmOverloads constructor(
    context: Context, attributes: AttributeSet? = null, defStyleAttr: Int = 0
) : CardView(context, attributes, defStyleAttr) {
    init {
        inflate(context, R.layout.item_campaign, this)

        val cardMargin = context.dipsToPixels(8)

        layoutParams = ViewGroup.MarginLayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(cardMargin, cardMargin / 2, cardMargin, cardMargin / 2)
        }
        cardElevation = context.dipsToPixels(4).toFloat()
        radius = context.dipsToPixels(4).toFloat()

        context.obtainStyledAttributes(attributes, R.styleable.CampaignItem).use {
            if (it.hasValue(R.styleable.CampaignItem_campaign_name)) {
                campaignNameId.text = it.getText(R.styleable.CampaignItem_campaign_name)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_owner)) {
                campaignOwnerId.text = it.getText(R.styleable.CampaignItem_campaign_owner)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_type)) {
                campaignTypeId.text = it.getText(R.styleable.CampaignItem_campaign_type)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_start_date)) {
                campaignStartDateId.text = it.getText(R.styleable.CampaignItem_campaign_start_date)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_end_date)) {
                campaignEndDateId.text = it.getText(R.styleable.CampaignItem_campaign_end_date)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_details)) {
                campaignDetailsId.text = it.getText(R.styleable.CampaignItem_campaign_details)
            }
            if (it.hasValue(R.styleable.CampaignItem_campaign_target)) {
                campaignTargetId.text = it.getText(R.styleable.CampaignItem_campaign_target)
            }

        }

    }

    fun setData(
        name: String,
        owner: String,
        type: String,
        startDate: String,
        endDate: String,
        details: String,
        target: String
        ){
        campaignNameId.text = name
        campaignOwnerId.text = owner
        campaignTypeId.text = type
        campaignStartDateId.text = startDate
        campaignEndDateId.text = endDate
        campaignDetailsId.text = details
        campaignTargetId.text = target
    }
}