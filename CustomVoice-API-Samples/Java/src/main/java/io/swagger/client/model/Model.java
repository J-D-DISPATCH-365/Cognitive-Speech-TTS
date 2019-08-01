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
import io.swagger.client.model.Dataset;
import io.swagger.client.model.Model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Model
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class Model {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("baseModel")
  private Model baseModel = null;

  @SerializedName("datasets")
  private List<Dataset> datasets = null;

  /**
   * The kind of this model (e.g. acoustic, language ...)
   */
  @JsonAdapter(ModelKindEnum.Adapter.class)
  public enum ModelKindEnum {
    NONE("None"),
    
    ACOUSTIC("Acoustic"),
    
    LANGUAGE("Language"),
    
    ACOUSTICANDLANGUAGE("AcousticAndLanguage"),
    
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

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOTSTARTED("NotStarted"),
    
    RUNNING("Running"),
    
    SUCCEEDED("Succeeded"),
    
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public Model id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of this entity
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The identifier of this entity")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Model baseModel(Model baseModel) {
    this.baseModel = baseModel;
    return this;
  }

   /**
   * The base model used for adaptation
   * @return baseModel
  **/
  @ApiModelProperty(value = "The base model used for adaptation")
  public Model getBaseModel() {
    return baseModel;
  }

  public void setBaseModel(Model baseModel) {
    this.baseModel = baseModel;
  }

  public Model datasets(List<Dataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Model addDatasetsItem(Dataset datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<Dataset>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Datasets used for adaptation
   * @return datasets
  **/
  @ApiModelProperty(value = "Datasets used for adaptation")
  public List<Dataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<Dataset> datasets) {
    this.datasets = datasets;
  }

  public Model modelKind(ModelKindEnum modelKind) {
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

  public Model name(String name) {
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

  public Model description(String description) {
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

  public Model properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Model putPropertiesItem(String key, String propertiesItem) {
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

  public Model locale(String locale) {
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

  public Model createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * The time-stamp when the object was created
   * @return createdDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the object was created")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Model lastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
    return this;
  }

   /**
   * The time-stamp when the current status was entered
   * @return lastActionDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the current status was entered")
  public OffsetDateTime getLastActionDateTime() {
    return lastActionDateTime;
  }

  public void setLastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
  }

  public Model status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the object
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the object")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.id, model.id) &&
        Objects.equals(this.baseModel, model.baseModel) &&
        Objects.equals(this.datasets, model.datasets) &&
        Objects.equals(this.modelKind, model.modelKind) &&
        Objects.equals(this.name, model.name) &&
        Objects.equals(this.description, model.description) &&
        Objects.equals(this.properties, model.properties) &&
        Objects.equals(this.locale, model.locale) &&
        Objects.equals(this.createdDateTime, model.createdDateTime) &&
        Objects.equals(this.lastActionDateTime, model.lastActionDateTime) &&
        Objects.equals(this.status, model.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, baseModel, datasets, modelKind, name, description, properties, locale, createdDateTime, lastActionDateTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    modelKind: ").append(toIndentedString(modelKind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

