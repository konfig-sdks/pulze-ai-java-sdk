

# PlaygroundCompletionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **UUID** | Optionally, send an App ID belonging to this user&#39;s org and all the logs will be logged into that app. This usually means the user is using the playground from the app&#39;s page itself. |  [optional] |
|**maxTokens** | **Integer** | The maximum number of tokens for the request |  [optional] |
|**messages** | [**List&lt;RoleContentChatChoice&gt;**](RoleContentChatChoice.md) | The list of messages (user/assistant/user/...) for the prompt. At least one message required |  [optional] |
|**model** | **String** | An optional model name. If specified, that model will be used |  [optional] |
|**temperature** | **Double** | The temperature of the request |  [optional] |
|**weights** | [**LLMModelWeights**](LLMModelWeights.md) | @required The weights specific to this request |  [optional] |



