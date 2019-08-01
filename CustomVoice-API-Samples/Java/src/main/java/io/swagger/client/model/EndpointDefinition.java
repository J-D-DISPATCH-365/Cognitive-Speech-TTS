/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ModelIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EndpointDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class EndpointDefinition {
  @SerializedName("concurrentRecognitions")
  private Integer concurrentRecognitions = null;

  @SerializedName("models")
  private List<ModelIdentity> models = new ArrayList<ModelIdentity>();

  @SerializedName("contentLoggingEnabled")
  private Boolean contentLoggingEnabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("locale")
  private String locale = null;

  public EndpointDefinition concurrentRecognitions(Integer concurrentRecognitions) {
    this.concurrentRecognitions = concurrentRecognitions;
    return this;
  }

   /**
   * The number of concurrent recognitions the endpoint supports
   * minimum: 1
   * maximum: 20
   * @return concurrentRecognitions
  **/
  @ApiModelProperty(value = "The number of concurrent recognitions the endpoint supports")
  public Integer getConcurrentRecognitions() {
    return concurrentRecognitions;
  }

  public void setConcurrentRecognitions(Integer concurrentRecognitions) {
    this.concurrentRecognitions = concurrentRecognitions;
  }

  public EndpointDefinition models(List<ModelIdentity> models) {
    this.models = models;
    return this;
  }

  public EndpointDefinition addModelsItem(ModelIdentity modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Information about the deployed models
   * @return models
  **/
  @ApiModelProperty(required = true, value = "Information about the deployed models")
  public List<ModelIdentity> getModels() {
    return models;
  }

  public void setModels(List<ModelIdentity> models) {
    this.models = models;
  }

  public EndpointDefinition contentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
    return this;
  }

   /**
   * A value indicating whether content logging (audio &amp;amp; transcriptions) is being used for a deployment.  Suppressing content logging will result in a higher cost for the deployment.  Free subscriptions can only deploy true
   * @return contentLoggingEnabled
  **/
  @ApiModelProperty(value = "A value indicating whether content logging (audio &amp; transcriptions) is being used for a deployment.  Suppressing content logging will result in a higher cost for the deployment.  Free subscriptions can only deploy true")
  public Boolean isContentLoggingEnabled() {
    return contentLoggingEnabled;
  }

  public void setContentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
  }

  public EndpointDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndpointDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EndpointDefinition properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public EndpointDefinition putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity
   * @return properties
  **/
  @ApiModelProperty(value = "The custom properties of this entity")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public EndpointDefinition locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale of the contained data
   * @return locale
  **/
  @ApiModelProperty(value = "The locale of the contained data")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointDefinition endpointDefinition = (EndpointDefinition) o;
    return Objects.equals(this.concurrentRecognitions, endpointDefinition.concurrentRecognitions) &&
        Objects.equals(this.models, endpointDefinition.models) &&
        Objects.equals(this.contentLoggingEnabled, endpointDefinition.contentLoggingEnabled) &&
        Objects.equals(this.name, endpointDefinition.name) &&
        Objects.equals(this.description, endpointDefinition.description) &&
        Objects.equals(this.properties, endpointDefinition.properties) &&
        Objects.equals(this.locale, endpointDefinition.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrentRecognitions, models, contentLoggingEnabled, name, description, properties, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointDefinition {\n");
    
    sb.append("    concurrentRecognitions: ").append(toIndentedString(concurrentRecognitions)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    contentLoggingEnabled: ").append(toIndentedString(contentLoggingEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

