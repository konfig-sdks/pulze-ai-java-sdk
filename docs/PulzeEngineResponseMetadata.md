

# PulzeEngineResponseMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | The ID of the app this request belongs to |  [optional] |
|**category** | **String** | Category assigned to this request (Science, Health, Games...) |  [optional] |
|**costSavings** | [**PulzeEngineTokens**](PulzeEngineTokens.md) | Price difference -- compared with GPT-4 |  [optional] |
|**costs** | [**PulzeEngineTokens**](PulzeEngineTokens.md) | Cost (in $) of the request |  [optional] |
|**error** | **String** | If an error occurs, it will be stored here |  [optional] |
|**extra** | **Object** | Extra data |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Custom labels (metadata) sent along in the request |  [optional] |
|**latency** | **Double** | The time it took for the Provider to return a response |  [optional] |
|**maxTokens** | **Integer** | Maximum number of tokens that can be used in the request+response.Leave empty to make it automatic, and set to &#x60;-1&#x60; to use the maximum context size (model-dependent) |  [optional] |
|**model** | [**ModelParts**](ModelParts.md) | The model used in the request |  [optional] |
|**retries** | **Integer** | The number of retries needed to get the answer. &#x60;null&#x60; or &#x60;0&#x60; means no retries were required |  [optional] |
|**score** | **Double** | The score for the currently used LLM |  [optional] |
|**scores** | [**RankedScoringModels**](RankedScoringModels.md) | A ranking of the best models for a given request |  [optional] |
|**statusCode** | **Integer** | Status code of the response |  [optional] |
|**temperature** | **Object** |  |  [optional] |



