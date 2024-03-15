

# Org


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedOn** | **OffsetDateTime** |  |  [optional] |
|**address1** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**addressCity** | **String** |  |  [optional] |
|**addressCountry** | **String** |  |  [optional] |
|**addressState** | **String** |  |  [optional] |
|**addressZip** | **String** |  |  [optional] |
|**billingEmail** | **String** | Billing email |  [optional] |
|**creditBalance** | **Double** | The balance in this Org&#39;s account |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency for this organization |  [optional] |
|**freeBalance** | **Double** | If this is &gt; 0, we will deduct the balance from here instead of the credit_balance. Add credits to this Org by updating this column |  [optional] |
|**hubspotId** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**isActive** | **Boolean** |  |  [optional] |
|**isPersonal** | **Boolean** |  |  [optional] |
|**lastInvoiceDate** | **OffsetDateTime** | We track the expenses with &#x60;pending_expense&#x60;, but when we charge, we add up all the requests between &#x60;last_invoice_date&#x60; and now. |  |
|**lokiEndpoint** | **String** |  |  [optional] |
|**lokiId** | **String** |  |  [optional] |
|**lokiToken** | **String** |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** |  |  [optional] |
|**orgCreator** | **String** |  |  |
|**orgDisplayName** | **String** |  |  [optional] |
|**orgLogo** | **String** |  |  [optional] |
|**orgName** | **String** |  |  |
|**orgStripeId** | **String** | The Stripe&#39;s customer ID. &#x60;cus_xxxxxx&#x60; |  |
|**pendingExpense** | **Double** | A reference value for how much money has a customer spent since the last sync with Stripe. When we charge them, we don&#39;t use this value, and instead add up all the requests&#39; costs. |  [optional] |
|**periodEnd** | **Integer** | The timestamp (in s) when the subscription ended or will end. The user will be billed at this point |  [optional] |
|**periodStart** | **Integer** | The timestamp (in s) when the subscription started or will start. If it&#39;s not the first cycle, the user was billed at this point |  [optional] |
|**promEndpoint** | **String** |  |  [optional] |
|**promId** | **String** |  |  [optional] |
|**promToken** | **String** |  |  [optional] |
|**rateLimit** | **Integer** | The rate limit for this org, per minute |  [optional] |
|**spendingLimitHard** | **Double** |  |  [optional] |
|**spendingLimitSoft** | **Double** |  |  [optional] |
|**subscriptionCycle** | [**SubscriptionCycleEnum**](#SubscriptionCycleEnum) | The length of the Platform subscription cycle. Useful for upgrades and downgrades |  [optional] |
|**subscriptionPauseReason** | [**SubscriptionPaused**](SubscriptionPaused.md) | The reason the subscription was paused. If &#x60;null&#x60;, the subscription is considered active |  [optional] |
|**subscriptionPriceId** | **String** | PRICE ID (on Stripe). The user&#39;s current Subscription ID is created from this Price |  [optional] |
|**subscriptionTier** | [**SubscriptionTierEnum**](#SubscriptionTierEnum) | The subscription tier this user is in. |  [optional] |
|**trialEnd** | **Integer** | The timestamp (in s) when the trial will end and the paid subscription will start. The user will be billed at this point |  [optional] |
|**usage** | [**OrgUsage**](OrgUsage.md) | The Usage stats (view) for this org |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |



## Enum: SubscriptionCycleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



## Enum: SubscriptionTierEnum

| Name | Value |
|---- | -----|
| _NONE_ | &quot;_NONE_&quot; |
| STARTUP | &quot;STARTUP&quot; |
| GROWTH | &quot;GROWTH&quot; |
| SCALE | &quot;SCALE&quot; |
| ENTERPRISE | &quot;ENTERPRISE&quot; |



