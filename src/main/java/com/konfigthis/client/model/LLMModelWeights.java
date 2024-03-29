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
 * LLMModelWeights
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LLMModelWeights {
  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = 0.4d;

  public static final String SERIALIZED_NAME_LATENCY = "latency";
  @SerializedName(SERIALIZED_NAME_LATENCY)
  private Double latency = 0.4d;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Double quality = 0.4d;

  public LLMModelWeights() {
  }

  public LLMModelWeights cost(Double cost) {
    
    
    
    
    this.cost = cost;
    return this;
  }

  public LLMModelWeights cost(Integer cost) {
    
    
    
    
    this.cost = cost.doubleValue();
    return this;
  }

   /**
   * Prioritizes cost when selecting the most optimized models for your use case.
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.4", value = "Prioritizes cost when selecting the most optimized models for your use case.")

  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    
    
    
    this.cost = cost;
  }


  public LLMModelWeights latency(Double latency) {
    
    
    
    
    this.latency = latency;
    return this;
  }

  public LLMModelWeights latency(Integer latency) {
    
    
    
    
    this.latency = latency.doubleValue();
    return this;
  }

   /**
   * Prioritizes latency and reduces the time delay between submitting a request and receiving the response.
   * @return latency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.4", value = "Prioritizes latency and reduces the time delay between submitting a request and receiving the response.")

  public Double getLatency() {
    return latency;
  }


  public void setLatency(Double latency) {
    
    
    
    this.latency = latency;
  }


  public LLMModelWeights quality(Double quality) {
    
    
    
    
    this.quality = quality;
    return this;
  }

  public LLMModelWeights quality(Integer quality) {
    
    
    
    
    this.quality = quality.doubleValue();
    return this;
  }

   /**
   * Prioritizes the quality and readability of the generated responses.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.4", value = "Prioritizes the quality and readability of the generated responses.")

  public Double getQuality() {
    return quality;
  }


  public void setQuality(Double quality) {
    
    
    
    this.quality = quality;
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
   * @return the LLMModelWeights instance itself
   */
  public LLMModelWeights putAdditionalProperty(String key, Object value) {
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
    LLMModelWeights llMModelWeights = (LLMModelWeights) o;
    return Objects.equals(this.cost, llMModelWeights.cost) &&
        Objects.equals(this.latency, llMModelWeights.latency) &&
        Objects.equals(this.quality, llMModelWeights.quality)&&
        Objects.equals(this.additionalProperties, llMModelWeights.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, latency, quality, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMModelWeights {\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
    openapiFields.add("cost");
    openapiFields.add("latency");
    openapiFields.add("quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LLMModelWeights
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LLMModelWeights.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LLMModelWeights is not found in the empty JSON string", LLMModelWeights.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LLMModelWeights.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LLMModelWeights' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LLMModelWeights> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LLMModelWeights.class));

       return (TypeAdapter<T>) new TypeAdapter<LLMModelWeights>() {
           @Override
           public void write(JsonWriter out, LLMModelWeights value) throws IOException {
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
           public LLMModelWeights read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LLMModelWeights instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LLMModelWeights given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LLMModelWeights
  * @throws IOException if the JSON string is invalid with respect to LLMModelWeights
  */
  public static LLMModelWeights fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LLMModelWeights.class);
  }

 /**
  * Convert an instance of LLMModelWeights to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

