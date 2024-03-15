

# FrontendSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balance** | [**PaymentDetailsBalance**](PaymentDetailsBalance.md) | Balance details |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency of the user. Currently only \&quot;USD\&quot;. |  |
|**didOnboardingSetup** | **Boolean** | False when it&#39;s the user&#39;s first login/signup for an organization |  |
|**emailVerified** | **Boolean** | True if the email was verified |  |
|**privacyAccepted** | **OffsetDateTime** | Date of last accepted Privacy Policy |  [optional] |
|**subscriptionPaused** | [**SubscriptionPaused**](SubscriptionPaused.md) | Returned to the frontend when the subscription has been paused for any reason. |  [optional] |
|**termsAccepted** | **OffsetDateTime** | Date of last accepted Terms of Service |  [optional] |
|**userDetails** | [**UserDetails**](UserDetails.md) | The basic information for the user |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |



