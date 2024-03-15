# ModelsApi

All URIs are relative to *https://api.pulze.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllModels**](ModelsApi.md#getAllModels) | **GET** /v1/models/all | Get All Available Models For App |
| [**getRankOfBest**](ModelsApi.md#getRankOfBest) | **POST** /v1/models/rank | Get Rank Of Best Models For Payload |
| [**listActiveModels**](ModelsApi.md#listActiveModels) | **GET** /v1/models/active | Get Active Models For App |
| [**toggleModelForApp**](ModelsApi.md#toggleModelForApp) | **PUT** /v1/models/{model_id}/toggle | Toggle Model For App |


<a name="getAllModels"></a>
# **getAllModels**
> List&lt;ModelParts&gt; getAllModels().execute();

Get All Available Models For App

Get a list of all the Models which this App can potentially use.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelsApi;
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
      List<ModelParts> result = client
              .models
              .getAllModels()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#getAllModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelParts>> response = client
              .models
              .getAllModels()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#getAllModels");
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

[**List&lt;ModelParts&gt;**](ModelParts.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getRankOfBest"></a>
# **getRankOfBest**
> PulzeEngineModelRanking getRankOfBest(completionRequestPayload).execute();

Get Rank Of Best Models For Payload

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelsApi;
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
    Integer bestOf = 1; // The number of responses to _generate_. Out of those, it will return the best `n`.
    Integer false = 1; // How many completions to generate for each prompt. @default 1 
    Double frequencyPenalty = 0D; // https://platform.openai.com/docs/api-reference/completions/create#completions/create-frequency_penalty Increase the model's likelihood to not repeat tokens/words 
    Object logitBias = null; // COMING SOON https://platform.openai.com/docs/api-reference/completions/create#completions/create-logit_bias Modify the likelihood of specified tokens appearing in the completion.  See here for a detailed explanation on how to use: https://help.openai.com/en/articles/5247780-using-logit-bias-to-define-token-probability 
    Integer logprobs = 56; // COMING SOON https://platform.openai.com/docs/api-reference/completions/create#completions/create-logprobs Include the log probabilities on the logprobs most likely tokens, as well the chosen tokens. 
    Integer maxTokens = 56; // The maximum number of tokens that the response can contain.
    List<RoleContentChatChoice> messages = Arrays.asList(); // The conversation sent (with or without history) (for a /chat/completions request)
    String model = "pulze"; // https://docs.pulze.ai/overview/models Specify the model you'd like Pulze to use. (optional). Can be the full model name, or a subset for multi-matching.  Defaults to our dynamic routing, i.e. best model for this request. 
    Double presencePenalty = 0D; // https://platform.openai.com/docs/api-reference/completions/create#completions/create-presence_penalty Increase the model's likelihood to talk about new topics 
    Object prompt = null;
    Object stop = null;
    Boolean stream = false; // ** COMING SOON ** Specify if you want the response to be streamed or to be returned as a standard HTTP request 
    String suffix = ""; // COMING SOON
    Double temperature = 1D; // Optionally specify the temperature for this request only. Leave empty to allow Pulze to guess it for you.
    Object toolChoice = null;
    List<ToolFunction> tools = Arrays.asList();
    Double topP = 1D; // https://platform.openai.com/docs/api-reference/completions/create#completions/create-top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass 
    try {
      PulzeEngineModelRanking result = client
              .models
              .getRankOfBest()
              .bestOf(bestOf)
              .false(false)
              .frequencyPenalty(frequencyPenalty)
              .logitBias(logitBias)
              .logprobs(logprobs)
              .maxTokens(maxTokens)
              .messages(messages)
              .model(model)
              .presencePenalty(presencePenalty)
              .prompt(prompt)
              .stop(stop)
              .stream(stream)
              .suffix(suffix)
              .temperature(temperature)
              .toolChoice(toolChoice)
              .tools(tools)
              .topP(topP)
              .execute();
      System.out.println(result);
      System.out.println(result.getModels());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#getRankOfBest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PulzeEngineModelRanking> response = client
              .models
              .getRankOfBest()
              .bestOf(bestOf)
              .false(false)
              .frequencyPenalty(frequencyPenalty)
              .logitBias(logitBias)
              .logprobs(logprobs)
              .maxTokens(maxTokens)
              .messages(messages)
              .model(model)
              .presencePenalty(presencePenalty)
              .prompt(prompt)
              .stop(stop)
              .stream(stream)
              .suffix(suffix)
              .temperature(temperature)
              .toolChoice(toolChoice)
              .tools(tools)
              .topP(topP)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#getRankOfBest");
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
| **completionRequestPayload** | [**CompletionRequestPayload**](CompletionRequestPayload.md)|  | |

### Return type

[**PulzeEngineModelRanking**](PulzeEngineModelRanking.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listActiveModels"></a>
# **listActiveModels**
> List&lt;ModelParts&gt; listActiveModels().execute();

Get Active Models For App

Get a list of the Models which are active for a specific App.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelsApi;
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
      List<ModelParts> result = client
              .models
              .listActiveModels()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#listActiveModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelParts>> response = client
              .models
              .listActiveModels()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#listActiveModels");
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

[**List&lt;ModelParts&gt;**](ModelParts.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="toggleModelForApp"></a>
# **toggleModelForApp**
> PulzeToggleModelResponse toggleModelForApp(modelId).enable(enable).execute();

Toggle Model For App

Enable or disable a model.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PulzeAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ModelsApi;
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
    UUID modelId = UUID.randomUUID();
    Boolean enable = true;
    try {
      PulzeToggleModelResponse result = client
              .models
              .toggleModelForApp(modelId)
              .enable(enable)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getModel());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#toggleModelForApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PulzeToggleModelResponse> response = client
              .models
              .toggleModelForApp(modelId)
              .enable(enable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelsApi#toggleModelForApp");
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
| **modelId** | **UUID**|  | |
| **enable** | **Boolean**|  | [optional] [default to true] |

### Return type

[**PulzeToggleModelResponse**](PulzeToggleModelResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

