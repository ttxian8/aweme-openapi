/*
 * 创建动态消息卡片
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
import com.douyin.open.models.EnterpriseImFancyCardCardSaveCardModuleImage;
import com.douyin.open.models.EnterpriseImFancyCardCardSaveModuleAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseImFancyCardCardSaveCardSubModule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:10:06.392159+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImFancyCardCardSaveCardSubModule {
  /**
   * Gets or Sets moduleType
   */
  public enum ModuleTypeEnum {
    TEXT("text"),
    IMAGE("image"),
    IMAGE_TEXT("image_text"),
    BUTTONS("buttons"),
    PHONE_LEADS("phone_leads"),
    BUTTON("button");

    private String value;

    ModuleTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ModuleTypeEnum fromValue(String text) {
      for (ModuleTypeEnum b : ModuleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("module_type")
  private ModuleTypeEnum moduleType = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("image")
  private EnterpriseImFancyCardCardSaveCardModuleImage image = null;

  @JsonProperty("action")
  private EnterpriseImFancyCardCardSaveModuleAction action = null;

  @JsonProperty("props")
  private String props = null;

  public EnterpriseImFancyCardCardSaveCardSubModule moduleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @Schema(required = true, description = "")
  public ModuleTypeEnum getModuleType() {
    return moduleType;
  }

  public void setModuleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
  }

  public EnterpriseImFancyCardCardSaveCardSubModule text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 文本
   * @return text
  **/
  @Schema(example = "卡片名", description = "文本")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public EnterpriseImFancyCardCardSaveCardSubModule image(EnterpriseImFancyCardCardSaveCardModuleImage image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public EnterpriseImFancyCardCardSaveCardModuleImage getImage() {
    return image;
  }

  public void setImage(EnterpriseImFancyCardCardSaveCardModuleImage image) {
    this.image = image;
  }

  public EnterpriseImFancyCardCardSaveCardSubModule action(EnterpriseImFancyCardCardSaveModuleAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public EnterpriseImFancyCardCardSaveModuleAction getAction() {
    return action;
  }

  public void setAction(EnterpriseImFancyCardCardSaveModuleAction action) {
    this.action = action;
  }

  public EnterpriseImFancyCardCardSaveCardSubModule props(String props) {
    this.props = props;
    return this;
  }

   /**
   * 模块属性 json string
   * @return props
  **/
  @Schema(example = "{\"style\": bold}}", description = "模块属性 json string")
  public String getProps() {
    return props;
  }

  public void setProps(String props) {
    this.props = props;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImFancyCardCardSaveCardSubModule cardSubModule = (EnterpriseImFancyCardCardSaveCardSubModule) o;
    return Objects.equals(this.moduleType, cardSubModule.moduleType) &&
        Objects.equals(this.text, cardSubModule.text) &&
        Objects.equals(this.image, cardSubModule.image) &&
        Objects.equals(this.action, cardSubModule.action) &&
        Objects.equals(this.props, cardSubModule.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleType, text, image, action, props);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImFancyCardCardSaveCardSubModule {\n");
    
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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
