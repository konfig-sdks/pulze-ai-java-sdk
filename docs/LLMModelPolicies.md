

# LLMModelPolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxCost** | **Double** | The maximum cost allowed for a request. Only works with compounded requests that require multiple LLM calls. If the value is reached, it will exit with an exception. |  [optional] |
|**maxSameModelRetries** | **Integer** | If an LLM call fails, how many times should Pulze _retry the call to the same LLM_? There will be a maximum of N+1 calls (original + N retries) |  [optional] |
|**maxSwitchModelRetries** | **Integer** | If an LLM call fails, _how many other models_ should Pulze try, chosen by quality descending? It will be a maximum of N+1 models (original + N other models) |  [optional] |
|**optimizeInternalRequests** | [**OptimizeInternalRequestsEnum**](#OptimizeInternalRequestsEnum) | Optimize the internal / intermediate LLM requests, for a big gain in speed and cost savings, at the cost of a potential, and very slight, penalty on quality. The final request (\&quot;SYNTHESIZE\&quot;) is always performed using your original settings. |  [optional] |
|**privacyLevel** | [**PrivacyLevelEnum**](#PrivacyLevelEnum) |          The level of privacy for a given request         0 &#x3D; (UNSUPPORTED -- public logs)         1 &#x3D; Log request, response and all of its metadata (Normal mode)         2 &#x3D; Do not log neither the request prompt nor the response text. Logs are still visible, and all of the request metadata accessible. Retrievable as a log. (TBD)         3 &#x3D; Do not log at all. Internally, a minimal representation may be stored for billing: model name, tokens used, which app it belongs to, and timestamp. Not retrievable as a log. (TBD)          |  [optional] |
|**promptId** | **UUID** | Prompt ID that we will use for requests |  [optional] |



## Enum: OptimizeInternalRequestsEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: PrivacyLevelEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



