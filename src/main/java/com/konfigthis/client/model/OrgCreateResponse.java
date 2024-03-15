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
 * OrgCreateResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgCreateResponse {
  public static final String SERIALIZED_NAME_ORG_DISPLAY_NAME = "org_display_name";
  @SerializedName(SERIALIZED_NAME_ORG_DISPLAY_NAME)
  private String orgDisplayName;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private UUID orgId;

  public static final String SERIALIZED_NAME_ORG_NAME = "org_name";
  @SerializedName(SERIALIZED_NAME_ORG_NAME)
  private String orgName;

  public OrgCreateResponse() {
  }

  public OrgCreateResponse orgDisplayName(String orgDisplayName) {
    
    
    
    
    this.orgDisplayName = orgDisplayName;
    return this;
  }

   /**
   * Get orgDisplayName
   * @return orgDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgDisplayName() {
    return orgDisplayName;
  }


  public void setOrgDisplayName(String orgDisplayName) {
    
    
    
    this.orgDisplayName = orgDisplayName;
  }


  public OrgCreateResponse orgId(UUID orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getOrgId() {
    return orgId;
  }


  public void setOrgId(UUID orgId) {
    
    
    
    this.orgId = orgId;
  }


  public OrgCreateResponse orgName(String orgName) {
    
    
    
    
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOrgName() {
    return orgName;
  }


  public void setOrgName(String orgName) {
    
    
    
    this.orgName = orgName;
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
   * @return the OrgCreateResponse instance itself
   */
  public OrgCreateResponse putAdditionalProperty(String key, Object value) {
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
    OrgCreateResponse orgCreateResponse = (OrgCreateResponse) o;
    return Objects.equals(this.orgDisplayName, orgCreateResponse.orgDisplayName) &&
        Objects.equals(this.orgId, orgCreateResponse.orgId) &&
        Objects.equals(this.orgName, orgCreateResponse.orgName)&&
        Objects.equals(this.additionalProperties, orgCreateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgDisplayName, orgId, orgName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgCreateResponse {\n");
    sb.append("    orgDisplayName: ").append(toIndentedString(orgDisplayName)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
    openapiFields.add("org_display_name");
    openapiFields.add("org_id");
    openapiFields.add("org_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org_id");
    openapiRequiredFields.add("org_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgCreateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgCreateResponse is not found in the empty JSON string", OrgCreateResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgCreateResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("org_display_name") != null && !jsonObj.get("org_display_name").isJsonNull()) && !jsonObj.get("org_display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_display_name").toString()));
      }
      if (!jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
      if (!jsonObj.get("org_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgCreateResponse>() {
           @Override
           public void write(JsonWriter out, OrgCreateResponse value) throws IOException {
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
           public OrgCreateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgCreateResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrgCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgCreateResponse
  * @throws IOException if the JSON string is invalid with respect to OrgCreateResponse
  */
  public static OrgCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgCreateResponse.class);
  }

 /**
  * Convert an instance of OrgCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

