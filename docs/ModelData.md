

# ModelData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the model |  |
|**addedBy** | **String** | The user (auth0_id) who created the model |  [optional] |
|**addedOn** | **OffsetDateTime** | When the model was added. Auto-populated in DB |  [optional] |
|**appId** | **UUID** | The app_id that has access to this model (if only one) |  [optional] |
|**at** | **String** | Extra model settings inferred from namespace |  [optional] |
|**baseCost** | **Double** | A (usually 0) cost added on top of a request. Some models charge per request, not only per token |  |
|**completionTokenCost** | **Double** | The cost of a completion token, in USD |  |
|**contextWindow** | **Integer** | The max_tokens for this model |  |
|**defaultActive** | **Boolean** | This determines if the model will be available + pre-selected when users create new apps. |  |
|**id** | **UUID** | The ID of this model |  [optional] |
|**isChat** | **Boolean** | True if the model is of type Chat Completions, False if it&#39;s a Text Completion model. |  |
|**isFt** | **Boolean** | Whether it&#39;s fine-tuned or not |  |
|**isGdpr** | **Boolean** | True if the model complies with GDPR |  |
|**isOpenSource** | **Boolean** | True if the model is open source |  |
|**isPublic** | **Boolean** | True if the model is publicly accessible to all |  |
|**isPulzeOwner** | **Boolean** | Model has been created and shared by Pulze.ai |  |
|**isRag** | **Boolean** | Whether it&#39;s rag-tuned or not |  |
|**model** | **String** | The name of the model. Can belong to many providers |  |
|**modifiedOn** | **OffsetDateTime** | When the model was updated. Auto-populated in DB |  [optional] |
|**namespace** | **String** | The fully qualified (namespaced) model name |  |
|**orgId** | **UUID** | The org_id that has acccess to this model |  [optional] |
|**owner** | **String** | The owner of the model. Sometimes, for a provider/model combination, many instances exist, trained on different data |  [optional] |
|**promptTokenCost** | **Double** | The cost of a prompt token, in USD |  |
|**provider** | **String** | The provider for the model. |  [optional] |
|**supportsFunctions** | **Boolean** | True if the model supports &#x60;function&#x60;/&#x60;tool&#x60; call |  |
|**supportsJson** | **Boolean** | True if the model supports &#x60;json&#x60;-formatted responses |  |
|**supportsN** | **Boolean** | True if the model supports &#x60;n&#x60; and &#x60;best_of&#x60; -- i.e, multiple responses |  |
|**supportsPenalties** | **Boolean** | True if the model supports &#x60;frequency_penalty&#x60; and &#x60;presence_penalty&#x60; |  |
|**supportsStream** | **Boolean** | True if the model supports streaming responses |  |
|**until** | **OffsetDateTime** | The most recent data this model has been trained with |  [optional] |
|**url** | **String** | A URL to the model&#39;s page or more informatino |  |



