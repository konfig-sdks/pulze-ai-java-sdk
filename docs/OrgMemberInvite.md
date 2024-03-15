

# OrgMemberInvite


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedOn** | **OffsetDateTime** |  |  |
|**auth0Id** | **String** |  |  [optional] |
|**email** | **String** |  |  |
|**inviteStatus** | [**InviteStatusEnum**](#InviteStatusEnum) |  |  |
|**isCurrentUser** | **Boolean** |  |  |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** |  |  |
|**permissions** | **String** |  |  |
|**picture** | **String** |  |  [optional] |
|**token** | **String** |  |  [optional] |



## Enum: InviteStatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| DECLINED | &quot;declined&quot; |
| PENDING | &quot;pending&quot; |



