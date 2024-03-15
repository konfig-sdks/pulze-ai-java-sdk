# LogsApi

All URIs are relative to *https://api.pulze.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](LogsApi.md#getById) | **GET** /v1/logs/{log_id} | Get Log By Id |
| [**getMatchingLogs**](LogsApi.md#getMatchingLogs) | **POST** /v1/logs | Get Logs For App |
| [**rateById**](LogsApi.md#rateById) | **POST** /v1/logs/{log_id}/rating | Rate Log By Id |


<a name="getById"></a>
# **getById**
> RequestNormalized getById(logId).execute();

Get Log By Id

Get a specific log by id. If accessing via API Key, this endpoint will only return a log if it belongs to that App. If the log&#39;s App is disabled, this endpoint won&#39;t return it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LogsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.pulze.ai";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    PulzeAi client = new PulzeAi(configuration);
    UUID logId = UUID.randomUUID();
    try {
      RequestNormalized result = client
              .logs
              .getById(logId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppId());
      System.out.println(result.getAt());
      System.out.println(result.getChildren());
      System.out.println(result.getCompletionTokens());
      System.out.println(result.getCompletionTokensCost());
      System.out.println(result.getCompletionTokensCostSavings());
      System.out.println(result.getCostsIncurred());
      System.out.println(result.getCreated());
      System.out.println(result.getFeedback());
      System.out.println(result.getGoodAnswer());
      System.out.println(result.getId());
      System.out.println(result.getLatency());
      System.out.println(result.getModel());
      System.out.println(result.getModelId());
      System.out.println(result.getNamespace());
      System.out.println(result.getOwner());
      System.out.println(result.getParent());
      System.out.println(result.getParentId());
      System.out.println(result.getPayload());
      System.out.println(result.getPrivacyLevel());
      System.out.println(result.getPrompt());
      System.out.println(result.getPromptTokens());
      System.out.println(result.getPromptTokensCost());
      System.out.println(result.getPromptTokensCostSavings());
      System.out.println(result.getProvider());
      System.out.println(result.getRequestType());
      System.out.println(result.getResponse());
      System.out.println(result.getResponseText());
      System.out.println(result.getStatusCode());
      System.out.println(result.getTimestamp());
      System.out.println(result.getTotalTokens());
      System.out.println(result.getTotalTokensCost());
      System.out.println(result.getTotalTokensCostSavings());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestNormalized> response = client
              .logs
              .getById(logId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **logId** | **UUID**|  | |

### Return type

[**RequestNormalized**](RequestNormalized.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getMatchingLogs"></a>
# **getMatchingLogs**
> Object getMatchingLogs(filterLogsRequest).page(page).size(size).execute();

Get Logs For App

Get the list of logs that match the specified filters. When accessing via an App&#39;s API Key, only logs for that app will be returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LogsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.pulze.ai";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    PulzeAi client = new PulzeAi(configuration);
    OffsetDateTime dateFrom = OffsetDateTime.now(); // The earliest date we are searching for.
    List<UUID> appIds = Arrays.asList(); // The list of API Keys we want to filter for. Leave the list empty to disable filtering (and return data for all apps) instead.
    OffsetDateTime dateTo = OffsetDateTime.now(); // The latest date we are searching for.
    Map<String, String> labels = new HashMap(); // Only logs (requests) with all of the specified labels will be returned. Values get compared between their lowercase forms.
    List<GetTableSortParams> params = Arrays.asList(); // The sorting parameters for the query
    String query = ""; // Search for logs containing the `query` in their Request or Response.
    Integer page = 1;
    Integer size = 50;
    try {
      Object result = client
              .logs
              .getMatchingLogs(dateFrom)
              .appIds(appIds)
              .dateTo(dateTo)
              .labels(labels)
              .params(params)
              .query(query)
              .page(page)
              .size(size)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#getMatchingLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .logs
              .getMatchingLogs(dateFrom)
              .appIds(appIds)
              .dateTo(dateTo)
              .labels(labels)
              .params(params)
              .query(query)
              .page(page)
              .size(size)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#getMatchingLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filterLogsRequest** | [**FilterLogsRequest**](FilterLogsRequest.md)|  | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **size** | **Integer**|  | [optional] [default to 50] |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="rateById"></a>
# **rateById**
> RequestNormalized rateById(logId, logResponseRatingRequest).execute();

Rate Log By Id

Rate a specific request by its ID. When accessing it via an App&#39;s API Key, this endpoint will only allow rating a log of that specific app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LogsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.pulze.ai";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    PulzeAi client = new PulzeAi(configuration);
    UUID logId = UUID.randomUUID();
    String feedback = ""; // An optional text with accompanies the feedback's rating
    Boolean goodAnswer = true; // The rating given to this request. It can be good (`True`), bad (`False`) or none (`None` == `null`)
    try {
      RequestNormalized result = client
              .logs
              .rateById(logId)
              .feedback(feedback)
              .goodAnswer(goodAnswer)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppId());
      System.out.println(result.getAt());
      System.out.println(result.getChildren());
      System.out.println(result.getCompletionTokens());
      System.out.println(result.getCompletionTokensCost());
      System.out.println(result.getCompletionTokensCostSavings());
      System.out.println(result.getCostsIncurred());
      System.out.println(result.getCreated());
      System.out.println(result.getFeedback());
      System.out.println(result.getGoodAnswer());
      System.out.println(result.getId());
      System.out.println(result.getLatency());
      System.out.println(result.getModel());
      System.out.println(result.getModelId());
      System.out.println(result.getNamespace());
      System.out.println(result.getOwner());
      System.out.println(result.getParent());
      System.out.println(result.getParentId());
      System.out.println(result.getPayload());
      System.out.println(result.getPrivacyLevel());
      System.out.println(result.getPrompt());
      System.out.println(result.getPromptTokens());
      System.out.println(result.getPromptTokensCost());
      System.out.println(result.getPromptTokensCostSavings());
      System.out.println(result.getProvider());
      System.out.println(result.getRequestType());
      System.out.println(result.getResponse());
      System.out.println(result.getResponseText());
      System.out.println(result.getStatusCode());
      System.out.println(result.getTimestamp());
      System.out.println(result.getTotalTokens());
      System.out.println(result.getTotalTokensCost());
      System.out.println(result.getTotalTokensCostSavings());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#rateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestNormalized> response = client
              .logs
              .rateById(logId)
              .feedback(feedback)
              .goodAnswer(goodAnswer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#rateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **logId** | **UUID**|  | |
| **logResponseRatingRequest** | [**LogResponseRatingRequest**](LogResponseRatingRequest.md)|  | |

### Return type

[**RequestNormalized**](RequestNormalized.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

