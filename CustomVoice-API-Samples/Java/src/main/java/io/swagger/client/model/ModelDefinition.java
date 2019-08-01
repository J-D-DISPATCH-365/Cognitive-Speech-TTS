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
import io.swagger.client.model.DatasetIdentity;
import io.swagger.client.model.ModelIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ModelDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class ModelDefinition {
  @SerializedName("text")
  private String text = null;

  @SerializedName("baseModel")
  private ModelIdentity baseModel = null;

  @SerializedName("datasets")
  private List<DatasetIdentity> datasets = null;

  /**
   * The kind of this model (e.g. acoustic, language ...)
   */
  @JsonAdapter(ModelKindEnum.Adapter.class)
  public enum ModelKindEnum {
    ACOUSTIC("Acoustic"),
    
    ACOUSTICANDLANGUAGE("AcousticAndLanguage"),
    
    NONE("None"),
    
    LANGUAGE("Language"),
    
    CUSTOMVOICE("CustomVoice"),
    
    LANGUAGEGENERATION("LanguageGeneration"),
    
    SENTIMENT("Sentiment"),
    
    LANGUAGEIDENTIFICATION("LanguageIdentification"),
    
    DIARIZATION("Diarization");

    private String value;

    ModelKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelKindEnum fromValue(String text) {
      for (ModelKindEnum b : ModelKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("modelKind")
  private ModelKindEnum modelKind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("locale")
  private String locale = null;

  public ModelDefinition text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text used to adapt this language model
   * @return text
  **/
  @ApiModelProperty(value = "The text used to adapt this language model")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ModelDefinition baseModel(ModelIdentity baseModel) {
    this.baseModel = baseModel;
    return this;
  }

   /**
   * The base model used for adaptation
   * @return baseModel
  **/
  @ApiModelProperty(value = "The base model used for adaptation")
  public ModelIdentity getBaseModel() {
    return baseModel;
  }

  public void setBaseModel(ModelIdentity baseModel) {
    this.baseModel = baseModel;
  }

  public ModelDefinition datasets(List<DatasetIdentity> datasets) {
    this.datasets = datasets;
    return this;
  }

  public ModelDefinition addDatasetsItem(DatasetIdentity datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<DatasetIdentity>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Datasets used for adaptation
   * @return datasets
  **/
  @ApiModelProperty(value = "Datasets used for adaptation")
  public List<DatasetIdentity> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<DatasetIdentity> datasets) {
    this.datasets = datasets;
  }

  public ModelDefinition modelKind(ModelKindEnum modelKind) {
    this.modelKind = modelKind;
    return this;
  }

   /**
   * The kind of this model (e.g. acoustic, language ...)
   * @return modelKind
  **/
  @ApiModelProperty(required = true, value = "The kind of this model (e.g. acoustic, language ...)")
  public ModelKindEnum getModelKind() {
    return modelKind;
  }

  public void setModelKind(ModelKindEnum modelKind) {
    this.modelKind = modelKind;
  }

  public ModelDefinition name(String name) {
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

  public ModelDefinition description(String description) {
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

  public ModelDefinition properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ModelDefinition putPropertiesItem(String key, String propertiesItem) {
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

  public ModelDefinition locale(String locale) {
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
    ModelDefinition modelDefinition = (ModelDefinition) o;
    return Objects.equals(this.text, modelDefinition.text) &&
        Objects.equals(this.baseModel, modelDefinition.baseModel) &&
        Objects.equals(this.datasets, modelDefinition.datasets) &&
        Objects.equals(this.modelKind, modelDefinition.modelKind) &&
        Objects.equals(this.name, modelDefinition.name) &&
        Objects.equals(this.description, modelDefinition.description) &&
        Objects.equals(this.properties, modelDefinition.properties) &&
        Objects.equals(this.locale, modelDefinition.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, baseModel, datasets, modelKind, name, description, properties, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDefinition {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    modelKind: ").append(toIndentedString(modelKind)).append("\n");
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

