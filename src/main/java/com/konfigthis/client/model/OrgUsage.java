/*
 * Pulze.ai API
 * At Pulze it's our mission to supercharge today's workforce with AI to maximize the world's prosperity. We are doing so by enabling companies of any size to securely leverage Large Language Models (LLM) and easily build AI features into their apps. Our enterprise platform has access to all best in class LLMs and can route user requests to the most relevant model to get the highest quality response at the best price thanks to our smart meta model. End users can leverage pre-built applications, such as our Marketing AI product, or build custom apps on top of the Pulze Platform.  We are a VC Funded, early stage startup based in San Francisco.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * OrgUsage
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgUsage {
  public static final String SERIALIZED_NAME_COMPLETION_TOKENS = "completion_tokens";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TOKENS)
  private Integer completionTokens;

  public static final String SERIALIZED_NAME_COMPLETION_TOKENS_COST = "completion_tokens_cost";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TOKENS_COST)
  private Double completionTokensCost;

  public static final String SERIALIZED_NAME_COMPLETION_TOKENS_COST_SAVINGS = "completion_tokens_cost_savings";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TOKENS_COST_SAVINGS)
  private Double completionTokensCostSavings;

  public static final String SERIALIZED_NAME_NUM_APPS = "num_apps";
  @SerializedName(SERIALIZED_NAME_NUM_APPS)
  private Integer numApps;

  public static final String SERIALIZED_NAME_NUM_REQUESTS = "num_requests";
  @SerializedName(SERIALIZED_NAME_NUM_REQUESTS)
  private Integer numRequests;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private UUID orgId;

  public static final String SERIALIZED_NAME_PROMPT_TOKENS = "prompt_tokens";
  @SerializedName(SERIALIZED_NAME_PROMPT_TOKENS)
  private Integer promptTokens;

  public static final String SERIALIZED_NAME_PROMPT_TOKENS_COST = "prompt_tokens_cost";
  @SerializedName(SERIALIZED_NAME_PROMPT_TOKENS_COST)
  private Double promptTokensCost;

  public static final String SERIALIZED_NAME_PROMPT_TOKENS_COST_SAVINGS = "prompt_tokens_cost_savings";
  @SerializedName(SERIALIZED_NAME_PROMPT_TOKENS_COST_SAVINGS)
  private Double promptTokensCostSavings;

  public static final String SERIALIZED_NAME_TOTAL_TOKENS = "total_tokens";
  @SerializedName(SERIALIZED_NAME_TOTAL_TOKENS)
  private Integer totalTokens;

  public static final String SERIALIZED_NAME_TOTAL_TOKENS_COST = "total_tokens_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TOKENS_COST)
  private Double totalTokensCost;

  public static final String SERIALIZED_NAME_TOTAL_TOKENS_COST_SAVINGS = "total_tokens_cost_savings";
  @SerializedName(SERIALIZED_NAME_TOTAL_TOKENS_COST_SAVINGS)
  private Double totalTokensCostSavings;

  public OrgUsage() {
  }

  public OrgUsage completionTokens(Integer completionTokens) {
    
    
    
    
    this.completionTokens = completionTokens;
    return this;
  }

   /**
   * Number of tokens the response used
   * @return completionTokens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of tokens the response used")

  public Integer getCompletionTokens() {
    return completionTokens;
  }


  public void setCompletionTokens(Integer completionTokens) {
    
    
    
    this.completionTokens = completionTokens;
  }


  public OrgUsage completionTokensCost(Double completionTokensCost) {
    
    
    
    
    this.completionTokensCost = completionTokensCost;
    return this;
  }

  public OrgUsage completionTokensCost(Integer completionTokensCost) {
    
    
    
    
    this.completionTokensCost = completionTokensCost.doubleValue();
    return this;
  }

   /**
   * Cost (in $) of the response
   * @return completionTokensCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) of the response")

  public Double getCompletionTokensCost() {
    return completionTokensCost;
  }


  public void setCompletionTokensCost(Double completionTokensCost) {
    
    
    
    this.completionTokensCost = completionTokensCost;
  }


  public OrgUsage completionTokensCostSavings(Double completionTokensCostSavings) {
    
    
    
    
    this.completionTokensCostSavings = completionTokensCostSavings;
    return this;
  }

  public OrgUsage completionTokensCostSavings(Integer completionTokensCostSavings) {
    
    
    
    
    this.completionTokensCostSavings = completionTokensCostSavings.doubleValue();
    return this;
  }

   /**
   * Cost (in $) saved in the completion costs comparison to the benchmark model
   * @return completionTokensCostSavings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) saved in the completion costs comparison to the benchmark model")

  public Double getCompletionTokensCostSavings() {
    return completionTokensCostSavings;
  }


  public void setCompletionTokensCostSavings(Double completionTokensCostSavings) {
    
    
    
    this.completionTokensCostSavings = completionTokensCostSavings;
  }


  public OrgUsage numApps(Integer numApps) {
    
    
    
    
    this.numApps = numApps;
    return this;
  }

   /**
   * The number of active apps this Organization has
   * @return numApps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of active apps this Organization has")

  public Integer getNumApps() {
    return numApps;
  }


  public void setNumApps(Integer numApps) {
    
    
    
    this.numApps = numApps;
  }


  public OrgUsage numRequests(Integer numRequests) {
    
    
    
    
    this.numRequests = numRequests;
    return this;
  }

   /**
   * The number of requests this Organization has performed in the current cycle
   * @return numRequests
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of requests this Organization has performed in the current cycle")

  public Integer getNumRequests() {
    return numRequests;
  }


  public void setNumRequests(Integer numRequests) {
    
    
    
    this.numRequests = numRequests;
  }


  public OrgUsage orgId(UUID orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The Org&#39;s ID
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Org's ID")

  public UUID getOrgId() {
    return orgId;
  }


  public void setOrgId(UUID orgId) {
    
    
    
    this.orgId = orgId;
  }


  public OrgUsage promptTokens(Integer promptTokens) {
    
    
    
    
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Number of tokens the request used
   * @return promptTokens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of tokens the request used")

  public Integer getPromptTokens() {
    return promptTokens;
  }


  public void setPromptTokens(Integer promptTokens) {
    
    
    
    this.promptTokens = promptTokens;
  }


  public OrgUsage promptTokensCost(Double promptTokensCost) {
    
    
    
    
    this.promptTokensCost = promptTokensCost;
    return this;
  }

  public OrgUsage promptTokensCost(Integer promptTokensCost) {
    
    
    
    
    this.promptTokensCost = promptTokensCost.doubleValue();
    return this;
  }

   /**
   * Cost (in $) of the prompt
   * @return promptTokensCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) of the prompt")

  public Double getPromptTokensCost() {
    return promptTokensCost;
  }


  public void setPromptTokensCost(Double promptTokensCost) {
    
    
    
    this.promptTokensCost = promptTokensCost;
  }


  public OrgUsage promptTokensCostSavings(Double promptTokensCostSavings) {
    
    
    
    
    this.promptTokensCostSavings = promptTokensCostSavings;
    return this;
  }

  public OrgUsage promptTokensCostSavings(Integer promptTokensCostSavings) {
    
    
    
    
    this.promptTokensCostSavings = promptTokensCostSavings.doubleValue();
    return this;
  }

   /**
   * Cost (in $) saved in the prompt costs comparison to the benchmark model
   * @return promptTokensCostSavings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) saved in the prompt costs comparison to the benchmark model")

  public Double getPromptTokensCostSavings() {
    return promptTokensCostSavings;
  }


  public void setPromptTokensCostSavings(Double promptTokensCostSavings) {
    
    
    
    this.promptTokensCostSavings = promptTokensCostSavings;
  }


  public OrgUsage totalTokens(Integer totalTokens) {
    
    
    
    
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * Number of tokens of (request + response)
   * @return totalTokens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of tokens of (request + response)")

  public Integer getTotalTokens() {
    return totalTokens;
  }


  public void setTotalTokens(Integer totalTokens) {
    
    
    
    this.totalTokens = totalTokens;
  }


  public OrgUsage totalTokensCost(Double totalTokensCost) {
    
    
    
    
    this.totalTokensCost = totalTokensCost;
    return this;
  }

  public OrgUsage totalTokensCost(Integer totalTokensCost) {
    
    
    
    
    this.totalTokensCost = totalTokensCost.doubleValue();
    return this;
  }

   /**
   * Cost (in $) of the (request + response)
   * @return totalTokensCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) of the (request + response)")

  public Double getTotalTokensCost() {
    return totalTokensCost;
  }


  public void setTotalTokensCost(Double totalTokensCost) {
    
    
    
    this.totalTokensCost = totalTokensCost;
  }


  public OrgUsage totalTokensCostSavings(Double totalTokensCostSavings) {
    
    
    
    
    this.totalTokensCostSavings = totalTokensCostSavings;
    return this;
  }

  public OrgUsage totalTokensCostSavings(Integer totalTokensCostSavings) {
    
    
    
    
    this.totalTokensCostSavings = totalTokensCostSavings.doubleValue();
    return this;
  }

   /**
   * Cost (in $) saved in total, in comparison to the benchmark model
   * @return totalTokensCostSavings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cost (in $) saved in total, in comparison to the benchmark model")

  public Double getTotalTokensCostSavings() {
    return totalTokensCostSavings;
  }


  public void setTotalTokensCostSavings(Double totalTokensCostSavings) {
    
    
    
    this.totalTokensCostSavings = totalTokensCostSavings;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OrgUsage instance itself
   */
  public OrgUsage putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgUsage orgUsage = (OrgUsage) o;
    return Objects.equals(this.completionTokens, orgUsage.completionTokens) &&
        Objects.equals(this.completionTokensCost, orgUsage.completionTokensCost) &&
        Objects.equals(this.completionTokensCostSavings, orgUsage.completionTokensCostSavings) &&
        Objects.equals(this.numApps, orgUsage.numApps) &&
        Objects.equals(this.numRequests, orgUsage.numRequests) &&
        Objects.equals(this.orgId, orgUsage.orgId) &&
        Objects.equals(this.promptTokens, orgUsage.promptTokens) &&
        Objects.equals(this.promptTokensCost, orgUsage.promptTokensCost) &&
        Objects.equals(this.promptTokensCostSavings, orgUsage.promptTokensCostSavings) &&
        Objects.equals(this.totalTokens, orgUsage.totalTokens) &&
        Objects.equals(this.totalTokensCost, orgUsage.totalTokensCost) &&
        Objects.equals(this.totalTokensCostSavings, orgUsage.totalTokensCostSavings)&&
        Objects.equals(this.additionalProperties, orgUsage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, completionTokensCost, completionTokensCostSavings, numApps, numRequests, orgId, promptTokens, promptTokensCost, promptTokensCostSavings, totalTokens, totalTokensCost, totalTokensCostSavings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgUsage {\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    completionTokensCost: ").append(toIndentedString(completionTokensCost)).append("\n");
    sb.append("    completionTokensCostSavings: ").append(toIndentedString(completionTokensCostSavings)).append("\n");
    sb.append("    numApps: ").append(toIndentedString(numApps)).append("\n");
    sb.append("    numRequests: ").append(toIndentedString(numRequests)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    promptTokensCost: ").append(toIndentedString(promptTokensCost)).append("\n");
    sb.append("    promptTokensCostSavings: ").append(toIndentedString(promptTokensCostSavings)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    totalTokensCost: ").append(toIndentedString(totalTokensCost)).append("\n");
    sb.append("    totalTokensCostSavings: ").append(toIndentedString(totalTokensCostSavings)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("completion_tokens");
    openapiFields.add("completion_tokens_cost");
    openapiFields.add("completion_tokens_cost_savings");
    openapiFields.add("num_apps");
    openapiFields.add("num_requests");
    openapiFields.add("org_id");
    openapiFields.add("prompt_tokens");
    openapiFields.add("prompt_tokens_cost");
    openapiFields.add("prompt_tokens_cost_savings");
    openapiFields.add("total_tokens");
    openapiFields.add("total_tokens_cost");
    openapiFields.add("total_tokens_cost_savings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("completion_tokens");
    openapiRequiredFields.add("completion_tokens_cost");
    openapiRequiredFields.add("completion_tokens_cost_savings");
    openapiRequiredFields.add("num_apps");
    openapiRequiredFields.add("num_requests");
    openapiRequiredFields.add("org_id");
    openapiRequiredFields.add("prompt_tokens");
    openapiRequiredFields.add("prompt_tokens_cost");
    openapiRequiredFields.add("prompt_tokens_cost_savings");
    openapiRequiredFields.add("total_tokens");
    openapiRequiredFields.add("total_tokens_cost");
    openapiRequiredFields.add("total_tokens_cost_savings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgUsage is not found in the empty JSON string", OrgUsage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgUsage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgUsage>() {
           @Override
           public void write(JsonWriter out, OrgUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgUsage instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrgUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgUsage
  * @throws IOException if the JSON string is invalid with respect to OrgUsage
  */
  public static OrgUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgUsage.class);
  }

 /**
  * Convert an instance of OrgUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

