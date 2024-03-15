

# SubscriptionSettings

For any given subscription, this represents the set of available features

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerSuccess** | **Boolean** | Support from Marketing team (? TBD) |  |
|**fineTuning** | **Boolean** | Allows to fine-tune models |  |
|**flowz** | **Boolean** | Flowz Feature |  [optional] |
|**llmRouting** | **Boolean** | Dynamic LLM routing using KG |  [optional] |
|**maxApps** | **Integer** | Maximum number of apps that can be created |  |
|**maxAppsReadable** | **String** | A human-readable format of max_apps. Example: &#39;Infinite&#39; or &#39;1000&#39; or &#39;None&#39; |  |
|**maxTokens** | **Integer** | The maximum number of tokens that can be _generated_, for each billing period (month) |  |
|**maxTokensReadable** | **String** | A human-readable format of max_tokens. Example: &#39;50bn&#39; or &#39;+100M&#39; |  |
|**monthlyPriceId** | **String** | The Stripe PriceID for the monthly subscription |  [optional] |
|**monthlyPriceUsd** | **Double** | Price per MONTH -- same as in Stripe, here for display purposes |  [optional] |
|**name** | **String** | The name for this subscription |  |
|**personalizedLlmRouting** | **Boolean** | Custom scoring of LLMs using KG |  |
|**promptModels** | **Boolean** | Allows the user to create and use Prompt-based Models |  |
|**prompts** | **Boolean** | Allows the user to create and use Prompts |  |
|**supportLevel** | [**SupportLevelEnum**](#SupportLevelEnum) | The level of support this user has access to |  |
|**supportLevelReadable** | **String** | A human-readable format for the level of support offered |  |
|**yearlyPriceId** | **String** | The Stripe PriceID for the yearly subscription |  [optional] |
|**yearlyPriceUsd** | **Double** | Price per YEAR -- same as in Stripe, here for display purposes |  [optional] |



## Enum: SupportLevelEnum

| Name | Value |
|---- | -----|
| COMMUNITY | &quot;community&quot; |
| ALL | &quot;all&quot; |



