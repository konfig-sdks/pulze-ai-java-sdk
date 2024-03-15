

# ConversationShare


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | A title for this conversation |  |
|**auth0Id** | **String** | The Auth0-ID of the user that shared this. Could be used by a user to share a conversation between their different organizations (as long as they open it themselves) |  [optional] |
|**continuationOf** | **String** | Will be used for analytics. We can know from which conversation this was shared. |  [optional] |
|**hashedIds** | **String** | To avoid creating duplicated shared links, we use this value as a quick way to verify that we are receiving new IDs |  [optional] |
|**isPublic** | **Boolean** | Whether the conversation is shared publicly or only members of your organization |  [optional] |
|**orgId** | **UUID** | The organization that shared this. Important, as it can be used to filter users belonging to different organizations |  [optional] |
|**shareHash** | **String** | The HASH that was shared. Used to fetch all the conversation items |  |
|**sharedOn** | **OffsetDateTime** | Some extra information, like when was the conversation shared |  |



