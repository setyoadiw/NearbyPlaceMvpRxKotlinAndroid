package com.luminary.setyo.nearbyplacerxkotlinandroid.Model


import com.google.gson.annotations.SerializedName


data class ResponseServer(

	@field:SerializedName("next_page_token")
	val nextPageToken: String? = null,

	@field:SerializedName("html_attributions")
	val htmlAttributions: List<String?>? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)