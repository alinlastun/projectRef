package com.softvision.hope.ui.campaign

import android.os.Bundle
import android.view.View
import com.softvision.hope.R
import com.softvision.hope.base.mvi.ChannelIntentProducer
import com.softvision.hope.base.mvi.IntentProducer
import com.softvision.hope.base.mvi.StateConsumer
import com.softvision.hope.base.mvi.initViewModel
import com.softvision.hope.base.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_campaign.*

class CampaignFragment : BaseFragment(), StateConsumer<CampaignState>,
IntentProducer<CampaignIntent> by ChannelIntentProducer(){

    lateinit var adapter : CampaignAdapter
    override val contentLayoutResource: Int = R.layout.fragment_campaign

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = CampaignAdapter()
        campaignRV.adapter = adapter
        initViewModel(CampaignViewModel::class)

    }

    override fun consume(state: CampaignState) {
        adapter.submitList(state.campaigns)
    }
}