package com.softvision.hope.ui.campaign

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.softvision.hope.design.campaign.CampaignItem

class CampaignAdapter : ListAdapter<Campaign, CampaignAdapter.ViewHolder>(CampaignDiffCallback()){

   override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemCampaign = CampaignItem(parent.context)
        return ViewHolder(itemCampaign)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(campaign: Campaign) {
            (itemView as CampaignItem).setData(
                campaign.name,
                campaign.owner,
                campaign.type,
                campaign.startDate,
                campaign.endDate,
                campaign.details,
                campaign.target.toString()
            )
        }
    }
}
class CampaignDiffCallback : DiffUtil.ItemCallback<Campaign>() {
    override fun areItemsTheSame(oldItem: Campaign, newItem: Campaign): Boolean {
        return oldItem.name == newItem.name
    }
    override fun areContentsTheSame(oldItem: Campaign, newItem: Campaign): Boolean {
        return oldItem == newItem
    }
}