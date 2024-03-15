

# PaymentDetailsBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balance** | **Double** | The balance in the account. Synced with Stripe periodically |  [optional] |
|**billingZip** | **String** | The Zipcode of the address of the Organization |  |
|**freeBalance** | **Double** | This represents balance that&#39;s either gifted or earned, and non-redeemable for any cash. |  [optional] |
|**lastSync** | **OffsetDateTime** | The datetime when the local balance (i.e. the value we keep track of) was synced with stripe (and the customer was billed) |  |
|**pendingExpense** | **Double** | The usage your account had since it last synced with Stripe. Used for reference purposes, this is the amount we will charge Stripe for.  This value does not only contain the sum of all the log tokens, but it might also contain other expenses, like uptime for custom models or base subscription prices, premium features, etc (all of this might come in the future)  |  [optional] |
|**spendingLimitHard** | **Double** | When the balance crosses this value, a high-warning email will be sent informing the customer that services will be disrupted if the balance reaches 0 |  [optional] |
|**spendingLimitSoft** | **Double** | When the balance crosses this value, a warning email will be sent informing the customer |  [optional] |



