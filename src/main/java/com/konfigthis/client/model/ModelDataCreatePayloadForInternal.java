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
 * ModelDataCreatePayloadForInternal
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelDataCreatePayloadForInternal {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private UUID appId;

  public static final String SERIALIZED_NAME_AT = "at";
  @SerializedName(SERIALIZED_NAME_AT)
  private String at;

  public static final String SERIALIZED_NAME_BASE_COST = "base_cost";
  @SerializedName(SERIALIZED_NAME_BASE_COST)
  private String baseCost = "0";

  public static final String SERIALIZED_NAME_COMPLETION_TOKEN_COST = "completion_token_cost";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TOKEN_COST)
  private String completionTokenCost;

  public static final String SERIALIZED_NAME_CONTEXT_WINDOW = "context_window";
  @SerializedName(SERIALIZED_NAME_CONTEXT_WINDOW)
  private Integer contextWindow;

  public static final String SERIALIZED_NAME_DEFAULT_ACTIVE = "default_active";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTIVE)
  private Boolean defaultActive;

  public static final String SERIALIZED_NAME_IS_CHAT = "is_chat";
  @SerializedName(SERIALIZED_NAME_IS_CHAT)
  private Boolean isChat;

  public static final String SERIALIZED_NAME_IS_GDPR = "is_gdpr";
  @SerializedName(SERIALIZED_NAME_IS_GDPR)
  private Boolean isGdpr;

  public static final String SERIALIZED_NAME_IS_OPEN_SOURCE = "is_open_source";
  @SerializedName(SERIALIZED_NAME_IS_OPEN_SOURCE)
  private Boolean isOpenSource;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "is_public";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private UUID orgId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_PROMPT_TOKEN_COST = "prompt_token_cost";
  @SerializedName(SERIALIZED_NAME_PROMPT_TOKEN_COST)
  private String promptTokenCost;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SUPPORTS_FUNCTIONS = "supports_functions";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_FUNCTIONS)
  private Boolean supportsFunctions = false;

  public static final String SERIALIZED_NAME_SUPPORTS_JSON = "supports_json";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_JSON)
  private Boolean supportsJson = false;

  public static final String SERIALIZED_NAME_SUPPORTS_N = "supports_n";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_N)
  private Boolean supportsN = false;

  public static final String SERIALIZED_NAME_SUPPORTS_PENALTIES = "supports_penalties";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_PENALTIES)
  private Boolean supportsPenalties = false;

  public static final String SERIALIZED_NAME_SUPPORTS_STREAM = "supports_stream";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_STREAM)
  private Boolean supportsStream = false;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private String until;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ModelDataCreatePayloadForInternal() {
  }

  public ModelDataCreatePayloadForInternal description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ModelDataCreatePayloadForInternal appId(UUID appId) {
    
    
    
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAppId() {
    return appId;
  }


  public void setAppId(UUID appId) {
    
    
    
    this.appId = appId;
  }


  public ModelDataCreatePayloadForInternal at(String at) {
    
    
    
    
    this.at = at;
    return this;
  }

   /**
   * Get at
   * @return at
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAt() {
    return at;
  }


  public void setAt(String at) {
    
    
    
    this.at = at;
  }


  public ModelDataCreatePayloadForInternal baseCost(String baseCost) {
    
    
    
    
    this.baseCost = baseCost;
    return this;
  }

   /**
   * Get baseCost
   * @return baseCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getBaseCost() {
    return baseCost;
  }


  public void setBaseCost(String baseCost) {
    
    
    
    this.baseCost = baseCost;
  }


  public ModelDataCreatePayloadForInternal completionTokenCost(String completionTokenCost) {
    
    
    
    
    this.completionTokenCost = completionTokenCost;
    return this;
  }

   /**
   * Get completionTokenCost
   * @return completionTokenCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompletionTokenCost() {
    return completionTokenCost;
  }


  public void setCompletionTokenCost(String completionTokenCost) {
    
    
    
    this.completionTokenCost = completionTokenCost;
  }


  public ModelDataCreatePayloadForInternal contextWindow(Integer contextWindow) {
    
    
    
    
    this.contextWindow = contextWindow;
    return this;
  }

   /**
   * Get contextWindow
   * @return contextWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContextWindow() {
    return contextWindow;
  }


  public void setContextWindow(Integer contextWindow) {
    
    
    
    this.contextWindow = contextWindow;
  }


  public ModelDataCreatePayloadForInternal defaultActive(Boolean defaultActive) {
    
    
    
    
    this.defaultActive = defaultActive;
    return this;
  }

   /**
   * Get defaultActive
   * @return defaultActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultActive() {
    return defaultActive;
  }


  public void setDefaultActive(Boolean defaultActive) {
    
    
    
    this.defaultActive = defaultActive;
  }


  public ModelDataCreatePayloadForInternal isChat(Boolean isChat) {
    
    
    
    
    this.isChat = isChat;
    return this;
  }

   /**
   * Get isChat
   * @return isChat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsChat() {
    return isChat;
  }


  public void setIsChat(Boolean isChat) {
    
    
    
    this.isChat = isChat;
  }


  public ModelDataCreatePayloadForInternal isGdpr(Boolean isGdpr) {
    
    
    
    
    this.isGdpr = isGdpr;
    return this;
  }

   /**
   * Get isGdpr
   * @return isGdpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsGdpr() {
    return isGdpr;
  }


  public void setIsGdpr(Boolean isGdpr) {
    
    
    
    this.isGdpr = isGdpr;
  }


  public ModelDataCreatePayloadForInternal isOpenSource(Boolean isOpenSource) {
    
    
    
    
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * Get isOpenSource
   * @return isOpenSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOpenSource() {
    return isOpenSource;
  }


  public void setIsOpenSource(Boolean isOpenSource) {
    
    
    
    this.isOpenSource = isOpenSource;
  }


  public ModelDataCreatePayloadForInternal isPublic(Boolean isPublic) {
    
    
    
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    
    
    
    this.isPublic = isPublic;
  }


  public ModelDataCreatePayloadForInternal model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public ModelDataCreatePayloadForInternal orgId(UUID orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOrgId() {
    return orgId;
  }


  public void setOrgId(UUID orgId) {
    
    
    
    this.orgId = orgId;
  }


  public ModelDataCreatePayloadForInternal owner(String owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    
    
    
    this.owner = owner;
  }


  public ModelDataCreatePayloadForInternal promptTokenCost(String promptTokenCost) {
    
    
    
    
    this.promptTokenCost = promptTokenCost;
    return this;
  }

   /**
   * Get promptTokenCost
   * @return promptTokenCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPromptTokenCost() {
    return promptTokenCost;
  }


  public void setPromptTokenCost(String promptTokenCost) {
    
    
    
    this.promptTokenCost = promptTokenCost;
  }


  public ModelDataCreatePayloadForInternal provider(String provider) {
    
    
    
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    
    
    
    this.provider = provider;
  }


  public ModelDataCreatePayloadForInternal supportsFunctions(Boolean supportsFunctions) {
    
    
    
    
    this.supportsFunctions = supportsFunctions;
    return this;
  }

   /**
   * Get supportsFunctions
   * @return supportsFunctions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupportsFunctions() {
    return supportsFunctions;
  }


  public void setSupportsFunctions(Boolean supportsFunctions) {
    
    
    
    this.supportsFunctions = supportsFunctions;
  }


  public ModelDataCreatePayloadForInternal supportsJson(Boolean supportsJson) {
    
    
    
    
    this.supportsJson = supportsJson;
    return this;
  }

   /**
   * Get supportsJson
   * @return supportsJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupportsJson() {
    return supportsJson;
  }


  public void setSupportsJson(Boolean supportsJson) {
    
    
    
    this.supportsJson = supportsJson;
  }


  public ModelDataCreatePayloadForInternal supportsN(Boolean supportsN) {
    
    
    
    
    this.supportsN = supportsN;
    return this;
  }

   /**
   * Get supportsN
   * @return supportsN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupportsN() {
    return supportsN;
  }


  public void setSupportsN(Boolean supportsN) {
    
    
    
    this.supportsN = supportsN;
  }


  public ModelDataCreatePayloadForInternal supportsPenalties(Boolean supportsPenalties) {
    
    
    
    
    this.supportsPenalties = supportsPenalties;
    return this;
  }

   /**
   * Get supportsPenalties
   * @return supportsPenalties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupportsPenalties() {
    return supportsPenalties;
  }


  public void setSupportsPenalties(Boolean supportsPenalties) {
    
    
    
    this.supportsPenalties = supportsPenalties;
  }


  public ModelDataCreatePayloadForInternal supportsStream(Boolean supportsStream) {
    
    
    
    
    this.supportsStream = supportsStream;
    return this;
  }

   /**
   * Get supportsStream
   * @return supportsStream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupportsStream() {
    return supportsStream;
  }


  public void setSupportsStream(Boolean supportsStream) {
    
    
    
    this.supportsStream = supportsStream;
  }


  public ModelDataCreatePayloadForInternal until(String until) {
    
    
    
    
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUntil() {
    return until;
  }


  public void setUntil(String until) {
    
    
    
    this.until = until;
  }


  public ModelDataCreatePayloadForInternal url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
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
   * @return the ModelDataCreatePayloadForInternal instance itself
   */
  public ModelDataCreatePayloadForInternal putAdditionalProperty(String key, Object value) {
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
    ModelDataCreatePayloadForInternal modelDataCreatePayloadForInternal = (ModelDataCreatePayloadForInternal) o;
    return Objects.equals(this.description, modelDataCreatePayloadForInternal.description) &&
        Objects.equals(this.appId, modelDataCreatePayloadForInternal.appId) &&
        Objects.equals(this.at, modelDataCreatePayloadForInternal.at) &&
        Objects.equals(this.baseCost, modelDataCreatePayloadForInternal.baseCost) &&
        Objects.equals(this.completionTokenCost, modelDataCreatePayloadForInternal.completionTokenCost) &&
        Objects.equals(this.contextWindow, modelDataCreatePayloadForInternal.contextWindow) &&
        Objects.equals(this.defaultActive, modelDataCreatePayloadForInternal.defaultActive) &&
        Objects.equals(this.isChat, modelDataCreatePayloadForInternal.isChat) &&
        Objects.equals(this.isGdpr, modelDataCreatePayloadForInternal.isGdpr) &&
        Objects.equals(this.isOpenSource, modelDataCreatePayloadForInternal.isOpenSource) &&
        Objects.equals(this.isPublic, modelDataCreatePayloadForInternal.isPublic) &&
        Objects.equals(this.model, modelDataCreatePayloadForInternal.model) &&
        Objects.equals(this.orgId, modelDataCreatePayloadForInternal.orgId) &&
        Objects.equals(this.owner, modelDataCreatePayloadForInternal.owner) &&
        Objects.equals(this.promptTokenCost, modelDataCreatePayloadForInternal.promptTokenCost) &&
        Objects.equals(this.provider, modelDataCreatePayloadForInternal.provider) &&
        Objects.equals(this.supportsFunctions, modelDataCreatePayloadForInternal.supportsFunctions) &&
        Objects.equals(this.supportsJson, modelDataCreatePayloadForInternal.supportsJson) &&
        Objects.equals(this.supportsN, modelDataCreatePayloadForInternal.supportsN) &&
        Objects.equals(this.supportsPenalties, modelDataCreatePayloadForInternal.supportsPenalties) &&
        Objects.equals(this.supportsStream, modelDataCreatePayloadForInternal.supportsStream) &&
        Objects.equals(this.until, modelDataCreatePayloadForInternal.until) &&
        Objects.equals(this.url, modelDataCreatePayloadForInternal.url)&&
        Objects.equals(this.additionalProperties, modelDataCreatePayloadForInternal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, appId, at, baseCost, completionTokenCost, contextWindow, defaultActive, isChat, isGdpr, isOpenSource, isPublic, model, orgId, owner, promptTokenCost, provider, supportsFunctions, supportsJson, supportsN, supportsPenalties, supportsStream, until, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDataCreatePayloadForInternal {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    baseCost: ").append(toIndentedString(baseCost)).append("\n");
    sb.append("    completionTokenCost: ").append(toIndentedString(completionTokenCost)).append("\n");
    sb.append("    contextWindow: ").append(toIndentedString(contextWindow)).append("\n");
    sb.append("    defaultActive: ").append(toIndentedString(defaultActive)).append("\n");
    sb.append("    isChat: ").append(toIndentedString(isChat)).append("\n");
    sb.append("    isGdpr: ").append(toIndentedString(isGdpr)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    promptTokenCost: ").append(toIndentedString(promptTokenCost)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    supportsFunctions: ").append(toIndentedString(supportsFunctions)).append("\n");
    sb.append("    supportsJson: ").append(toIndentedString(supportsJson)).append("\n");
    sb.append("    supportsN: ").append(toIndentedString(supportsN)).append("\n");
    sb.append("    supportsPenalties: ").append(toIndentedString(supportsPenalties)).append("\n");
    sb.append("    supportsStream: ").append(toIndentedString(supportsStream)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("app_id");
    openapiFields.add("at");
    openapiFields.add("base_cost");
    openapiFields.add("completion_token_cost");
    openapiFields.add("context_window");
    openapiFields.add("default_active");
    openapiFields.add("is_chat");
    openapiFields.add("is_gdpr");
    openapiFields.add("is_open_source");
    openapiFields.add("is_public");
    openapiFields.add("model");
    openapiFields.add("org_id");
    openapiFields.add("owner");
    openapiFields.add("prompt_token_cost");
    openapiFields.add("provider");
    openapiFields.add("supports_functions");
    openapiFields.add("supports_json");
    openapiFields.add("supports_n");
    openapiFields.add("supports_penalties");
    openapiFields.add("supports_stream");
    openapiFields.add("until");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelDataCreatePayloadForInternal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelDataCreatePayloadForInternal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelDataCreatePayloadForInternal is not found in the empty JSON string", ModelDataCreatePayloadForInternal.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("app_id") != null && !jsonObj.get("app_id").isJsonNull()) && !jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      if ((jsonObj.get("at") != null && !jsonObj.get("at").isJsonNull()) && !jsonObj.get("at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("at").toString()));
      }
      if ((jsonObj.get("base_cost") != null && !jsonObj.get("base_cost").isJsonNull()) && !jsonObj.get("base_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_cost").toString()));
      }
      if ((jsonObj.get("completion_token_cost") != null && !jsonObj.get("completion_token_cost").isJsonNull()) && !jsonObj.get("completion_token_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completion_token_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completion_token_cost").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("org_id") != null && !jsonObj.get("org_id").isJsonNull()) && !jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("prompt_token_cost") != null && !jsonObj.get("prompt_token_cost").isJsonNull()) && !jsonObj.get("prompt_token_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_token_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt_token_cost").toString()));
      }
      if ((jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelDataCreatePayloadForInternal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelDataCreatePayloadForInternal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelDataCreatePayloadForInternal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelDataCreatePayloadForInternal.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelDataCreatePayloadForInternal>() {
           @Override
           public void write(JsonWriter out, ModelDataCreatePayloadForInternal value) throws IOException {
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
           public ModelDataCreatePayloadForInternal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelDataCreatePayloadForInternal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelDataCreatePayloadForInternal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelDataCreatePayloadForInternal
  * @throws IOException if the JSON string is invalid with respect to ModelDataCreatePayloadForInternal
  */
  public static ModelDataCreatePayloadForInternal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelDataCreatePayloadForInternal.class);
  }

 /**
  * Convert an instance of ModelDataCreatePayloadForInternal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

