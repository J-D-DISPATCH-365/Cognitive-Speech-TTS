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
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * TaskOpinionViewModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class TaskOpinionViewModel {
  @SerializedName("opinionId")
  private UUID opinionId = null;

  @SerializedName("opinionContent")
  private String opinionContent = null;

  @SerializedName("createTime")
  private OffsetDateTime createTime = null;

  public TaskOpinionViewModel opinionId(UUID opinionId) {
    this.opinionId = opinionId;
    return this;
  }

   /**
   * The opinion id
   * @return opinionId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The opinion id")
  public UUID getOpinionId() {
    return opinionId;
  }

  public void setOpinionId(UUID opinionId) {
    this.opinionId = opinionId;
  }

  public TaskOpinionViewModel opinionContent(String opinionContent) {
    this.opinionContent = opinionContent;
    return this;
  }

   /**
   * The opinion content
   * @return opinionContent
  **/
  @ApiModelProperty(value = "The opinion content")
  public String getOpinionContent() {
    return opinionContent;
  }

  public void setOpinionContent(String opinionContent) {
    this.opinionContent = opinionContent;
  }

  public TaskOpinionViewModel createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The create time in UTC
   * @return createTime
  **/
  @ApiModelProperty(value = "The create time in UTC")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskOpinionViewModel taskOpinionViewModel = (TaskOpinionViewModel) o;
    return Objects.equals(this.opinionId, taskOpinionViewModel.opinionId) &&
        Objects.equals(this.opinionContent, taskOpinionViewModel.opinionContent) &&
        Objects.equals(this.createTime, taskOpinionViewModel.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opinionId, opinionContent, createTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskOpinionViewModel {\n");
    
    sb.append("    opinionId: ").append(toIndentedString(opinionId)).append("\n");
    sb.append("    opinionContent: ").append(toIndentedString(opinionContent)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

