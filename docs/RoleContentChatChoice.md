

# RoleContentChatChoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**toolCalls** | [**List&lt;ToolCall&gt;**](ToolCall.md) | If &#x60;tool_choice&#x60; parameter was passed, and the model supports it, this will return a list of the different calls/functions used. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |
| SYSTEM | &quot;system&quot; |



