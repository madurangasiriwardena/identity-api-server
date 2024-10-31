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



@JsonTypeName("PasswordExpiredUser")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.9.0")
public class PasswordExpiredUser   {
  private String userId;
  private String username;
  private String userStoreDomain;

  /**
   **/
  public PasswordExpiredUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  public PasswordExpiredUser username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("username")
  @NotNull public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public PasswordExpiredUser userStoreDomain(String userStoreDomain) {
    this.userStoreDomain = userStoreDomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userStoreDomain")
  public String getUserStoreDomain() {
    return userStoreDomain;
  }

  @JsonProperty("userStoreDomain")
  public void setUserStoreDomain(String userStoreDomain) {
    this.userStoreDomain = userStoreDomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordExpiredUser passwordExpiredUser = (PasswordExpiredUser) o;
    return Objects.equals(this.userId, passwordExpiredUser.userId) &&
        Objects.equals(this.username, passwordExpiredUser.username) &&
        Objects.equals(this.userStoreDomain, passwordExpiredUser.userStoreDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, userStoreDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordExpiredUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userStoreDomain: ").append(toIndentedString(userStoreDomain)).append("\n");
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

