package com.codemul.githubuser.model

import com.google.gson.annotations.SerializedName

data class SearchResponse(

	@field:SerializedName("total_count")
	val totalCount: Int,

	@field:SerializedName("incomplete_results")
	val incompleteResults: Boolean,

	@field:SerializedName("items")
	val items: List<ItemsItem>,
)

data class ItemsItem(

    @field:SerializedName("avatar_url")
    val avatarUrl: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("type")
    val type: String,

    @field:SerializedName("login")
    val login: String,
)

