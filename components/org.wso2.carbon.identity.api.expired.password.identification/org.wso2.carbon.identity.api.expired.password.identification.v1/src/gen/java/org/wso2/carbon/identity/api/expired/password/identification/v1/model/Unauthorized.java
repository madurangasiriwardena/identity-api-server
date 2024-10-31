package org.wso2.carbon.identity.api.expired.password.identification.v1.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Unauthorized")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.9.0")
public class Unauthorized   {
  private String code;
  private String message;
  private String description;

  /**
   **/
  public Unauthorized code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "401", required = true, value = "")
  @JsonProperty("code")
  @NotNull public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public Unauthorized message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Unauthorized", required = true, value = "")
  @JsonProperty("message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public Unauthorized description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "You are unauthorized to make this request", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unauthorized unauthorized = (Unauthorized) o;
    return Objects.equals(this.code, unauthorized.code) &&
        Objects.equals(this.message, unauthorized.message) &&
        Objects.equals(this.description, unauthorized.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unauthorized {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


}

