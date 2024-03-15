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
import java.time.OffsetDateTime;

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
 * PaymentDetailsBalance
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentDetailsBalance {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance = 0d;

  public static final String SERIALIZED_NAME_BILLING_ZIP = "billing_zip";
  @SerializedName(SERIALIZED_NAME_BILLING_ZIP)
  private String billingZip;

  public static final String SERIALIZED_NAME_FREE_BALANCE = "free_balance";
  @SerializedName(SERIALIZED_NAME_FREE_BALANCE)
  private Double freeBalance = 0d;

  public static final String SERIALIZED_NAME_LAST_SYNC = "last_sync";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC)
  private OffsetDateTime lastSync;

  public static final String SERIALIZED_NAME_PENDING_EXPENSE = "pending_expense";
  @SerializedName(SERIALIZED_NAME_PENDING_EXPENSE)
  private Double pendingExpense = 0d;

  public static final String SERIALIZED_NAME_SPENDING_LIMIT_HARD = "spending_limit_hard";
  @SerializedName(SERIALIZED_NAME_SPENDING_LIMIT_HARD)
  private Double spendingLimitHard = 0d;

  public static final String SERIALIZED_NAME_SPENDING_LIMIT_SOFT = "spending_limit_soft";
  @SerializedName(SERIALIZED_NAME_SPENDING_LIMIT_SOFT)
  private Double spendingLimitSoft = 0d;

  public PaymentDetailsBalance() {
  }

  public PaymentDetailsBalance balance(Double balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

  public PaymentDetailsBalance balance(Integer balance) {
    
    
    
    
    this.balance = balance.doubleValue();
    return this;
  }

   /**
   * The balance in the account. Synced with Stripe periodically
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The balance in the account. Synced with Stripe periodically")

  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    
    
    
    this.balance = balance;
  }


  public PaymentDetailsBalance billingZip(String billingZip) {
    
    
    
    
    this.billingZip = billingZip;
    return this;
  }

   /**
   * The Zipcode of the address of the Organization
   * @return billingZip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Zipcode of the address of the Organization")

  public String getBillingZip() {
    return billingZip;
  }


  public void setBillingZip(String billingZip) {
    
    
    
    this.billingZip = billingZip;
  }


  public PaymentDetailsBalance freeBalance(Double freeBalance) {
    
    
    
    
    this.freeBalance = freeBalance;
    return this;
  }

  public PaymentDetailsBalance freeBalance(Integer freeBalance) {
    
    
    
    
    this.freeBalance = freeBalance.doubleValue();
    return this;
  }

   /**
   * This represents balance that&#39;s either gifted or earned, and non-redeemable for any cash.
   * @return freeBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "This represents balance that's either gifted or earned, and non-redeemable for any cash.")

  public Double getFreeBalance() {
    return freeBalance;
  }


  public void setFreeBalance(Double freeBalance) {
    
    
    
    this.freeBalance = freeBalance;
  }


  public PaymentDetailsBalance lastSync(OffsetDateTime lastSync) {
    
    
    
    
    this.lastSync = lastSync;
    return this;
  }

   /**
   * The datetime when the local balance (i.e. the value we keep track of) was synced with stripe (and the customer was billed)
   * @return lastSync
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The datetime when the local balance (i.e. the value we keep track of) was synced with stripe (and the customer was billed)")

  public OffsetDateTime getLastSync() {
    return lastSync;
  }


  public void setLastSync(OffsetDateTime lastSync) {
    
    
    
    this.lastSync = lastSync;
  }


  public PaymentDetailsBalance pendingExpense(Double pendingExpense) {
    
    
    
    
    this.pendingExpense = pendingExpense;
    return this;
  }

  public PaymentDetailsBalance pendingExpense(Integer pendingExpense) {
    
    
    
    
    this.pendingExpense = pendingExpense.doubleValue();
    return this;
  }

   /**
   * The usage your account had since it last synced with Stripe. Used for reference purposes, this is the amount we will charge Stripe for.  This value does not only contain the sum of all the log tokens, but it might also contain other expenses, like uptime for custom models or base subscription prices, premium features, etc (all of this might come in the future) 
   * @return pendingExpense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The usage your account had since it last synced with Stripe. Used for reference purposes, this is the amount we will charge Stripe for.  This value does not only contain the sum of all the log tokens, but it might also contain other expenses, like uptime for custom models or base subscription prices, premium features, etc (all of this might come in the future) ")

  public Double getPendingExpense() {
    return pendingExpense;
  }


  public void setPendingExpense(Double pendingExpense) {
    
    
    
    this.pendingExpense = pendingExpense;
  }


  public PaymentDetailsBalance spendingLimitHard(Double spendingLimitHard) {
    
    
    
    
    this.spendingLimitHard = spendingLimitHard;
    return this;
  }

  public PaymentDetailsBalance spendingLimitHard(Integer spendingLimitHard) {
    
    
    
    
    this.spendingLimitHard = spendingLimitHard.doubleValue();
    return this;
  }

   /**
   * When the balance crosses this value, a high-warning email will be sent informing the customer that services will be disrupted if the balance reaches 0
   * @return spendingLimitHard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "When the balance crosses this value, a high-warning email will be sent informing the customer that services will be disrupted if the balance reaches 0")

  public Double getSpendingLimitHard() {
    return spendingLimitHard;
  }


  public void setSpendingLimitHard(Double spendingLimitHard) {
    
    
    
    this.spendingLimitHard = spendingLimitHard;
  }


  public PaymentDetailsBalance spendingLimitSoft(Double spendingLimitSoft) {
    
    
    
    
    this.spendingLimitSoft = spendingLimitSoft;
    return this;
  }

  public PaymentDetailsBalance spendingLimitSoft(Integer spendingLimitSoft) {
    
    
    
    
    this.spendingLimitSoft = spendingLimitSoft.doubleValue();
    return this;
  }

   /**
   * When the balance crosses this value, a warning email will be sent informing the customer
   * @return spendingLimitSoft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "When the balance crosses this value, a warning email will be sent informing the customer")

  public Double getSpendingLimitSoft() {
    return spendingLimitSoft;
  }


  public void setSpendingLimitSoft(Double spendingLimitSoft) {
    
    
    
    this.spendingLimitSoft = spendingLimitSoft;
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
   * @return the PaymentDetailsBalance instance itself
   */
  public PaymentDetailsBalance putAdditionalProperty(String key, Object value) {
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
    PaymentDetailsBalance paymentDetailsBalance = (PaymentDetailsBalance) o;
    return Objects.equals(this.balance, paymentDetailsBalance.balance) &&
        Objects.equals(this.billingZip, paymentDetailsBalance.billingZip) &&
        Objects.equals(this.freeBalance, paymentDetailsBalance.freeBalance) &&
        Objects.equals(this.lastSync, paymentDetailsBalance.lastSync) &&
        Objects.equals(this.pendingExpense, paymentDetailsBalance.pendingExpense) &&
        Objects.equals(this.spendingLimitHard, paymentDetailsBalance.spendingLimitHard) &&
        Objects.equals(this.spendingLimitSoft, paymentDetailsBalance.spendingLimitSoft)&&
        Objects.equals(this.additionalProperties, paymentDetailsBalance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, billingZip, freeBalance, lastSync, pendingExpense, spendingLimitHard, spendingLimitSoft, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsBalance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    billingZip: ").append(toIndentedString(billingZip)).append("\n");
    sb.append("    freeBalance: ").append(toIndentedString(freeBalance)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    pendingExpense: ").append(toIndentedString(pendingExpense)).append("\n");
    sb.append("    spendingLimitHard: ").append(toIndentedString(spendingLimitHard)).append("\n");
    sb.append("    spendingLimitSoft: ").append(toIndentedString(spendingLimitSoft)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("billing_zip");
    openapiFields.add("free_balance");
    openapiFields.add("last_sync");
    openapiFields.add("pending_expense");
    openapiFields.add("spending_limit_hard");
    openapiFields.add("spending_limit_soft");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing_zip");
    openapiRequiredFields.add("last_sync");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentDetailsBalance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentDetailsBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentDetailsBalance is not found in the empty JSON string", PaymentDetailsBalance.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentDetailsBalance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("billing_zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentDetailsBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentDetailsBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentDetailsBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentDetailsBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentDetailsBalance>() {
           @Override
           public void write(JsonWriter out, PaymentDetailsBalance value) throws IOException {
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
           public PaymentDetailsBalance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentDetailsBalance instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentDetailsBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentDetailsBalance
  * @throws IOException if the JSON string is invalid with respect to PaymentDetailsBalance
  */
  public static PaymentDetailsBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentDetailsBalance.class);
  }

 /**
  * Convert an instance of PaymentDetailsBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
