

# PulzeCompletionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bestOf** | **Integer** | The number of responses to _generate_. Out of those, it will return the best &#x60;n&#x60;. |  [optional] |
|**contextWindow** | **Integer** | The maximum context size (tokens) for the provided model |  [optional] |
|**false** | **Integer** | How many completions to generate for each prompt. @default 1  |  [optional] |
|**frequencyPenalty** | **Double** | https://platform.openai.com/docs/api-reference/completions/create#completions/create-frequency_penalty Increase the model&#39;s likelihood to not repeat tokens/words  |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | Headers sent alongside the request -- stored as part of the payload |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | The labels sent alongside the request as a JSON-encoded Dict[str, str] inside of the header \&quot;pulze-labels\&quot;. |  [optional] |
|**logitBias** | **Object** | COMING SOON https://platform.openai.com/docs/api-reference/completions/create#completions/create-logit_bias Modify the likelihood of specified tokens appearing in the completion.  See here for a detailed explanation on how to use: https://help.openai.com/en/articles/5247780-using-logit-bias-to-define-token-probability  |  [optional] |
|**logprobs** | **Integer** | COMING SOON https://platform.openai.com/docs/api-reference/completions/create#completions/create-logprobs Include the log probabilities on the logprobs most likely tokens, as well the chosen tokens.  |  [optional] |
|**maxTokens** | **Integer** | The maximum number of tokens that the response can contain. |  [optional] |
|**messages** | [**List&lt;RoleContentChatChoice&gt;**](RoleContentChatChoice.md) | The conversation sent (with or without history) (for a /chat/completions request) |  [optional] |
|**model** | **String** | https://docs.pulze.ai/overview/models Specify the model you&#39;d like Pulze to use. (optional). Can be the full model name, or a subset for multi-matching.  Defaults to our dynamic routing, i.e. best model for this request.  |  [optional] |
|**policies** | [**LLMModelPolicies**](LLMModelPolicies.md) | Settings for how this request should be processed: Anonimized, public, and more. |  [optional] |
|**presencePenalty** | **Double** | https://platform.openai.com/docs/api-reference/completions/create#completions/create-presence_penalty Increase the model&#39;s likelihood to talk about new topics  |  [optional] |
|**prompt** | **Object** |  |  [optional] |
|**provider** | **String** | The name of the provider for the request |  [optional] |
|**stop** | **Object** |  |  [optional] |
|**stream** | **Boolean** | ** COMING SOON ** Specify if you want the response to be streamed or to be returned as a standard HTTP request  |  [optional] |
|**suffix** | **String** | COMING SOON |  [optional] |
|**temperature** | **Double** | Optionally specify the temperature for this request only. Leave empty to allow Pulze to guess it for you. |  [optional] |
|**toolChoice** | **Object** |  |  [optional] |
|**tools** | [**List&lt;ToolFunction&gt;**](ToolFunction.md) |  |  [optional] |
|**topP** | **Double** | https://platform.openai.com/docs/api-reference/completions/create#completions/create-top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass  |  [optional] |
|**weights** | [**LLMModelWeights**](LLMModelWeights.md) | Optionally specify specific weights for this request only. Leave empty to use the App&#39;s weights (global configuration) |  [optional] |



