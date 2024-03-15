

# AppCustomData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedOn** | **OffsetDateTime** | The timestamp the file was added |  [optional] |
|**appId** | **UUID** | The ID of the App it&#39;s associated with |  |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) | The type of custom data (file, database, ...) |  |
|**fileContent** | **File** | The contents of the file |  [optional] |
|**fileMime** | **String** | The mimetype of the file |  |
|**fileName** | **String** | The name of the file |  |
|**fileSize** | **Integer** | The size of the file in Bytes |  [optional] |
|**id** | **UUID** | The ID |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |



