/*
 * 
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
 * 详情页链接信息
 */
@Schema(description = "详情页链接信息")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductSpuAttributes4101DetailEntry {
  /**
   * 链接类型 (1:H5，2:抖音小程序，3:原生小程序)
   */
  public enum SchemaTypeEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    SchemaTypeEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SchemaTypeEnum fromValue(String text) {
      for (SchemaTypeEnum b : SchemaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("schema_type")
  private SchemaTypeEnum schemaType = null;

  @JsonProperty("url")
  private String url = null;

  /**
   * 平台来源枚举（16电商小店）
   */
  public enum PlatformSourceEnum {
    NUMBER_16(16);

    private Integer value;

    PlatformSourceEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PlatformSourceEnum fromValue(String text) {
      for (PlatformSourceEnum b : PlatformSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("platform_source")
  private PlatformSourceEnum platformSource = null;

  @JsonProperty("platform_name")
  private String platformName = null;

  @JsonProperty("is_test")
  private Integer isTest = null;

  public PoiProductProductSpuAttributes4101DetailEntry schemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
    return this;
  }

   /**
   * 链接类型 (1:H5，2:抖音小程序，3:原生小程序)
   * @return schemaType
  **/
  @Schema(description = "链接类型 (1:H5，2:抖音小程序，3:原生小程序)")
  public SchemaTypeEnum getSchemaType() {
    return schemaType;
  }

  public void setSchemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
  }

  public PoiProductProductSpuAttributes4101DetailEntry url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 详情页链接
   * @return url
  **/
  @Schema(example = "https://open.douyin.com/platform/doc/OpenAPI-poi-product", description = "详情页链接")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PoiProductProductSpuAttributes4101DetailEntry platformSource(PlatformSourceEnum platformSource) {
    this.platformSource = platformSource;
    return this;
  }

   /**
   * 平台来源枚举（16电商小店）
   * @return platformSource
  **/
  @Schema(description = "平台来源枚举（16电商小店）")
  public PlatformSourceEnum getPlatformSource() {
    return platformSource;
  }

  public void setPlatformSource(PlatformSourceEnum platformSource) {
    this.platformSource = platformSource;
  }

  public PoiProductProductSpuAttributes4101DetailEntry platformName(String platformName) {
    this.platformName = platformName;
    return this;
  }

   /**
   * 平台名称
   * @return platformName
  **/
  @Schema(example = "抖音小店", description = "平台名称")
  public String getPlatformName() {
    return platformName;
  }

  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }

  public PoiProductProductSpuAttributes4101DetailEntry isTest(Integer isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * 主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序
   * @return isTest
  **/
  @Schema(example = "1", description = "主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序")
  public Integer getIsTest() {
    return isTest;
  }

  public void setIsTest(Integer isTest) {
    this.isTest = isTest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes4101DetailEntry spuAttributes4101DetailEntry = (PoiProductProductSpuAttributes4101DetailEntry) o;
    return Objects.equals(this.schemaType, spuAttributes4101DetailEntry.schemaType) &&
        Objects.equals(this.url, spuAttributes4101DetailEntry.url) &&
        Objects.equals(this.platformSource, spuAttributes4101DetailEntry.platformSource) &&
        Objects.equals(this.platformName, spuAttributes4101DetailEntry.platformName) &&
        Objects.equals(this.isTest, spuAttributes4101DetailEntry.isTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaType, url, platformSource, platformName, isTest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes4101DetailEntry {\n");
    
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
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
