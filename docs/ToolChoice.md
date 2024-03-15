

# ToolChoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**function** | [**ToolChoiceFunction**](ToolChoiceFunction.md) | The definition of the function you would like the LLM to guess the parameters for. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | (Note: Not supported by all models yet) // &#x60;json_object&#x60;: If you instruct the model to return a JSON object, the model will respond in a valid JSON format. || &#x60;function&#x60;: If you set this to function, you must also pass the &#x60;function&#x60; parameter with extra information. ||  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |
| JSON_OBJECT | &quot;json_object&quot; |



