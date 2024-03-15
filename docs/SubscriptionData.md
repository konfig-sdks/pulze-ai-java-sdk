

# SubscriptionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cycle** | [**CycleEnum**](#CycleEnum) |  |  |
|**priceId** | **String** | The StripeID &#x60;price_xxx&#x60; that will be added to the subscription |  |
|**tier** | [**TierEnum**](#TierEnum) |  |  |



## Enum: CycleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| _NONE_ | &quot;_NONE_&quot; |
| STARTUP | &quot;STARTUP&quot; |
| GROWTH | &quot;GROWTH&quot; |
| SCALE | &quot;SCALE&quot; |
| ENTERPRISE | &quot;ENTERPRISE&quot; |



