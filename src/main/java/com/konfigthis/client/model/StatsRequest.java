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
import com.konfigthis.client.model.GetTableSortParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * StatsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StatsRequest {
  public static final String SERIALIZED_NAME_APP_IDS = "app_ids";
  @SerializedName(SERIALIZED_NAME_APP_IDS)
  private List<UUID> appIds = null;

  public static final String SERIALIZED_NAME_CUMULATIVE = "cumulative";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE)
  private Map<String, Boolean> cumulative = null;

  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<GetTableSortParams> params = null;

  public StatsRequest() {
  }

  public StatsRequest appIds(List<UUID> appIds) {
    
    
    
    
    this.appIds = appIds;
    return this;
  }

  public StatsRequest addAppIdsItem(UUID appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

   /**
   * The list of API Keys we want to filter for. Leave the list empty to disable filtering (and return data for all apps) instead.
   * @return appIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "The list of API Keys we want to filter for. Leave the list empty to disable filtering (and return data for all apps) instead.")

  public List<UUID> getAppIds() {
    return appIds;
  }


  public void setAppIds(List<UUID> appIds) {
    
    
    
    this.appIds = appIds;
  }


  public StatsRequest cumulative(Map<String, Boolean> cumulative) {
    
    
    
    
    this.cumulative = cumulative;
    return this;
  }

  public StatsRequest putCumulativeItem(String key, Boolean cumulativeItem) {
    if (this.cumulative == null) {
      this.cumulative = new HashMap<>();
    }
    this.cumulative.put(key, cumulativeItem);
    return this;
  }

   /**
   * Get cumulative
   * @return cumulative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getCumulative() {
    return cumulative;
  }


  public void setCumulative(Map<String, Boolean> cumulative) {
    
    
    
    this.cumulative = cumulative;
  }


  public StatsRequest dateFrom(OffsetDateTime dateFrom) {
    
    
    
    
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * The earliest date we are searching for.
   * @return dateFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The earliest date we are searching for.")

  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }


  public void setDateFrom(OffsetDateTime dateFrom) {
    
    
    
    this.dateFrom = dateFrom;
  }


  public StatsRequest dateTo(OffsetDateTime dateTo) {
    
    
    
    
    this.dateTo = dateTo;
    return this;
  }

   /**
   * The latest date we are searching for.
   * @return dateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest date we are searching for.")

  public OffsetDateTime getDateTo() {
    return dateTo;
  }


  public void setDateTo(OffsetDateTime dateTo) {
    
    
    
    this.dateTo = dateTo;
  }


  public StatsRequest params(List<GetTableSortParams> params) {
    
    
    
    
    this.params = params;
    return this;
  }

  public StatsRequest addParamsItem(GetTableSortParams paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * The sorting parameters for the query
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "The sorting parameters for the query")

  public List<GetTableSortParams> getParams() {
    return params;
  }


  public void setParams(List<GetTableSortParams> params) {
    
    
    
    this.params = params;
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
   * @return the StatsRequest instance itself
   */
  public StatsRequest putAdditionalProperty(String key, Object value) {
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
    StatsRequest statsRequest = (StatsRequest) o;
    return Objects.equals(this.appIds, statsRequest.appIds) &&
        Objects.equals(this.cumulative, statsRequest.cumulative) &&
        Objects.equals(this.dateFrom, statsRequest.dateFrom) &&
        Objects.equals(this.dateTo, statsRequest.dateTo) &&
        Objects.equals(this.params, statsRequest.params)&&
        Objects.equals(this.additionalProperties, statsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appIds, cumulative, dateFrom, dateTo, params, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsRequest {\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    cumulative: ").append(toIndentedString(cumulative)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
    openapiFields.add("app_ids");
    openapiFields.add("cumulative");
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date_from");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatsRequest is not found in the empty JSON string", StatsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("app_ids") != null && !jsonObj.get("app_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_ids` to be an array in the JSON string but got `%s`", jsonObj.get("app_ids").toString()));
      }
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonNull()) {
        JsonArray jsonArrayparams = jsonObj.getAsJsonArray("params");
        if (jsonArrayparams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("params").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
          }

          // validate the optional field `params` (array)
          for (int i = 0; i < jsonArrayparams.size(); i++) {
            GetTableSortParams.validateJsonObject(jsonArrayparams.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StatsRequest>() {
           @Override
           public void write(JsonWriter out, StatsRequest value) throws IOException {
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
           public StatsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatsRequest
  * @throws IOException if the JSON string is invalid with respect to StatsRequest
  */
  public static StatsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatsRequest.class);
  }

 /**
  * Convert an instance of StatsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

