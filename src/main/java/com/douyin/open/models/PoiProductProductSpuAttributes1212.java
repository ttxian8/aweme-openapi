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
import com.douyin.open.models.PoiProductProductSpuAttributes1212Breakfast;
import com.douyin.open.models.PoiProductProductSpuAttributes1212ExtraBed;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 费用政策
 */
@Schema(description = "费用政策")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductSpuAttributes1212 {
  @JsonProperty("breakfast")
  private PoiProductProductSpuAttributes1212Breakfast breakfast = null;

  @JsonProperty("extra_bed")
  private PoiProductProductSpuAttributes1212ExtraBed extraBed = null;

  @JsonProperty("extra")
  private String extra = null;

  public PoiProductProductSpuAttributes1212 breakfast(PoiProductProductSpuAttributes1212Breakfast breakfast) {
    this.breakfast = breakfast;
    return this;
  }

   /**
   * Get breakfast
   * @return breakfast
  **/
  @Schema(required = true, description = "")
  public PoiProductProductSpuAttributes1212Breakfast getBreakfast() {
    return breakfast;
  }

  public void setBreakfast(PoiProductProductSpuAttributes1212Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public PoiProductProductSpuAttributes1212 extraBed(PoiProductProductSpuAttributes1212ExtraBed extraBed) {
    this.extraBed = extraBed;
    return this;
  }

   /**
   * Get extraBed
   * @return extraBed
  **/
  @Schema(required = true, description = "")
  public PoiProductProductSpuAttributes1212ExtraBed getExtraBed() {
    return extraBed;
  }

  public void setExtraBed(PoiProductProductSpuAttributes1212ExtraBed extraBed) {
    this.extraBed = extraBed;
  }

  public PoiProductProductSpuAttributes1212 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 费用政策自定义内容
   * @return extra
  **/
  @Schema(description = "费用政策自定义内容")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes1212 spuAttributes1212 = (PoiProductProductSpuAttributes1212) o;
    return Objects.equals(this.breakfast, spuAttributes1212.breakfast) &&
        Objects.equals(this.extraBed, spuAttributes1212.extraBed) &&
        Objects.equals(this.extra, spuAttributes1212.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakfast, extraBed, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes1212 {\n");
    
    sb.append("    breakfast: ").append(toIndentedString(breakfast)).append("\n");
    sb.append("    extraBed: ").append(toIndentedString(extraBed)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
