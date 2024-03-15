

# RequestNormalized


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **UUID** | The ID of the app that performed the request |  [optional] |
|**at** | **String** | Extra model settings inferred from namespace |  [optional] |
|**children** | [**List&lt;RequestInDBBase&gt;**](RequestInDBBase.md) | The children of the Request. Will equal None unless you use eager loading in the query |  [optional] |
|**completionTokens** | **Integer** | Number of tokens the response used |  |
|**completionTokensCost** | **Double** | Cost (in $) of the response |  |
|**completionTokensCostSavings** | **Double** | Cost (in $) saved in the completion costs comparison to the benchmark model |  |
|**costsIncurred** | **Boolean** | When a request requires multiple intermediate calls, they are stored as &#39;no costs incurred&#39; -- that way we can store the costs, but don&#39;t charge the user |  [optional] |
|**created** | **OffsetDateTime** | When the request was performed |  [optional] |
|**feedback** | **String** | A free text providing more detailed feedback |  [optional] |
|**goodAnswer** | **Boolean** | The rating for the request |  [optional] |
|**id** | **UUID** | ID of the request |  |
|**latency** | **Double** | Time it took for the LLM to respond |  [optional] |
|**model** | **String** | The name of the model. Can belong to many providers |  |
|**modelId** | **UUID** | The ID of the model used |  |
|**namespace** | **String** | The name of the provider&#39;s model which was used to answer the request |  [optional] |
|**owner** | **String** | The owner of the model. Sometimes, for a provider/model combination, many instances exist, trained on different data |  [optional] |
|**parent** | [**RequestInDBBase**](RequestInDBBase.md) | The parent of the Request, if any. Requests which are part of a series of sub-requests (like multiple LLM calls, or RAG) will have the final, resulting Log as parent. |  [optional] |
|**parentId** | **UUID** | Reference to the ID of the parent of this log. A log has a parent when it&#39;s a subrequest used to retrieve the final answer. |  [optional] |
|**payload** | [**PulzeCompletionRequest**](PulzeCompletionRequest.md) | The payload sent with the request |  [optional] |
|**privacyLevel** | [**PrivacyLevelEnum**](#PrivacyLevelEnum) | How much is logged? 1: everything, 2: mask request+response (but show log), 3: Not visible, not retrievable, no information stored. |  [optional] |
|**prompt** | **String** | The prompt in text format |  [optional] |
|**promptTokens** | **Integer** | Number of tokens the request used |  |
|**promptTokensCost** | **Double** | Cost (in $) of the prompt |  |
|**promptTokensCostSavings** | **Double** | Cost (in $) saved in the prompt costs comparison to the benchmark model |  |
|**provider** | **String** | The provider for the model. |  [optional] |
|**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | The type of request (text completion or chat) the user sends and expects back |  [optional] |
|**response** | [**PulzeEngineResponse**](PulzeEngineResponse.md) | The response object |  |
|**responseText** | **String** | The response in text format |  [optional] |
|**statusCode** | **Integer** | The status code of the request to the AI model |  [optional] |
|**timestamp** | **Integer** | The timestamp of the request, in milliseconds |  |
|**totalTokens** | **Integer** | Number of tokens of (request + response) |  |
|**totalTokensCost** | **Double** | Cost (in $) of the (request + response) |  |
|**totalTokensCostSavings** | **Double** | Cost (in $) saved in total, in comparison to the benchmark model |  |



## Enum: PrivacyLevelEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: RequestTypeEnum

| Name | Value |
|---- | -----|
| COMPLETIONS | &quot;completions&quot; |
| CHAT_COMPLETIONS | &quot;chat_completions&quot; |



