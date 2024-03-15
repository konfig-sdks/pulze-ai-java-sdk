

# FilterLogsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appIds** | **List&lt;UUID&gt;** | The list of API Keys we want to filter for. Leave the list empty to disable filtering (and return data for all apps) instead. |  [optional] |
|**dateFrom** | **OffsetDateTime** | The earliest date we are searching for. |  |
|**dateTo** | **OffsetDateTime** | The latest date we are searching for. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Only logs (requests) with all of the specified labels will be returned. Values get compared between their lowercase forms. |  [optional] |
|**params** | [**List&lt;GetTableSortParams&gt;**](GetTableSortParams.md) | The sorting parameters for the query |  [optional] |
|**query** | **String** | Search for logs containing the &#x60;query&#x60; in their Request or Response. |  [optional] |



