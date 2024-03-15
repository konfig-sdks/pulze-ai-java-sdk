

# PulzeModelActiveForApp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the model |  |
|**active** | **Boolean** | Whether the model is active for the app. |  [optional] |
|**at** | **String** | Extra model settings inferred from namespace |  [optional] |
|**contextWindow** | **Integer** | The max_tokens for this model |  |
|**id** | **UUID** | Used to uniquely target models when we enable/disable them |  [optional] |
|**model** | **String** | The name of the model. Can belong to many providers |  |
|**namespace** | **String** | The fully qualified (namespaced) model name |  |
|**owner** | **String** | The owner of the model. Sometimes, for a provider/model combination, many instances exist, trained on different data |  [optional] |
|**provider** | **String** | The provider for the model. |  [optional] |
|**until** | **OffsetDateTime** | The most recent data this model has been trained with |  [optional] |
|**url** | **String** | A URL to the model&#39;s page or more informatino |  |



