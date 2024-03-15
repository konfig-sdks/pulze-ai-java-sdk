# AppsApi

All URIs are relative to *https://api.pulze.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppForApiKey**](AppsApi.md#getAppForApiKey) | **GET** /v1/apps/self | Get App For Api Key |
| [**updateProperties**](AppsApi.md#updateProperties) | **PUT** /v1/apps/update | Update App And Models |


<a name="getAppForApiKey"></a>
# **getAppForApiKey**
> AppWithModelUpdatesInfo getAppForApiKey().execute();

Get App For Api Key

Retrieves the App for the given API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    try {
      AppWithModelUpdatesInfo result = client
              .apps
              .getAppForApiKey()
              .execute();
      System.out.println(result);
      System.out.println(result.getApp());
      System.out.println(result.getFiles());
      System.out.println(result.getModelSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAppForApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppWithModelUpdatesInfo> response = client
              .apps
              .getAppForApiKey()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAppForApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AppWithModelUpdatesInfo**](AppWithModelUpdatesInfo.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateProperties"></a>
# **updateProperties**
> AppWithModelUpdatesInfo updateProperties(appUpdate).execute();

Update App And Models

Update an App&#39;s properties: description, weights and policies.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    String description = "description_example";
    UUID id = UUID.randomUUID();
    LLMModelPolicies policies = new LLMModelPolicies();
    LLMModelWeights weights = new LLMModelWeights();
    UUID promptId = UUID.randomUUID(); // Prompt ID that we will use for requests
    try {
      AppWithModelUpdatesInfo result = client
              .apps
              .updateProperties(description, id, policies, weights)
              .promptId(promptId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApp());
      System.out.println(result.getFiles());
      System.out.println(result.getModelSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#updateProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppWithModelUpdatesInfo> response = client
              .apps
              .updateProperties(description, id, policies, weights)
              .promptId(promptId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#updateProperties");
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
| **appUpdate** | [**AppUpdate**](AppUpdate.md)|  | |

### Return type

[**AppWithModelUpdatesInfo**](AppWithModelUpdatesInfo.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

