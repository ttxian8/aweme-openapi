/*
 * 删除客服账号
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterprisePersonaPersonaDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:53.271048+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterprisePersonaPersonaDeleteBody {
  @JsonProperty("persona_id")
  private String personaId = null;

  public EnterprisePersonaPersonaDeleteBody personaId(String personaId) {
    this.personaId = personaId;
    return this;
  }

   /**
   * 客服id
   * @return personaId
  **/
  @Schema(example = "12345", required = true, description = "客服id")
  public String getPersonaId() {
    return personaId;
  }

  public void setPersonaId(String personaId) {
    this.personaId = personaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterprisePersonaPersonaDeleteBody body = (EnterprisePersonaPersonaDeleteBody) o;
    return Objects.equals(this.personaId, body.personaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterprisePersonaPersonaDeleteBody {\n");
    
    sb.append("    personaId: ").append(toIndentedString(personaId)).append("\n");
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
