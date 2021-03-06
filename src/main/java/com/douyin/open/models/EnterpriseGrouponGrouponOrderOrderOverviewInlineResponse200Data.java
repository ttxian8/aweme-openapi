/*
 * 团购活动订单汇总信息
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
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:42.971976+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("sold")
  private EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview sold = null;

  @JsonProperty("refunded")
  private EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview refunded = null;

  @JsonProperty("refunding_count")
  private Integer refundingCount = null;

  public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data sold(EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview sold) {
    this.sold = sold;
    return this;
  }

   /**
   * Get sold
   * @return sold
  **/
  @Schema(description = "")
  public EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview getSold() {
    return sold;
  }

  public void setSold(EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview sold) {
    this.sold = sold;
  }

  public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data refunded(EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview refunded) {
    this.refunded = refunded;
    return this;
  }

   /**
   * Get refunded
   * @return refunded
  **/
  @Schema(description = "")
  public EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview getRefunded() {
    return refunded;
  }

  public void setRefunded(EnterpriseGrouponGrouponOrderOrderOverviewOrderOverview refunded) {
    this.refunded = refunded;
  }

  public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data refundingCount(Integer refundingCount) {
    this.refundingCount = refundingCount;
    return this;
  }

   /**
   * 退款中的订单数
   * @return refundingCount
  **/
  @Schema(description = "退款中的订单数")
  public Integer getRefundingCount() {
    return refundingCount;
  }

  public void setRefundingCount(Integer refundingCount) {
    this.refundingCount = refundingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data inlineResponse200Data = (EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.sold, inlineResponse200Data.sold) &&
        Objects.equals(this.refunded, inlineResponse200Data.refunded) &&
        Objects.equals(this.refundingCount, inlineResponse200Data.refundingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, sold, refunded, refundingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sold: ").append(toIndentedString(sold)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    refundingCount: ").append(toIndentedString(refundingCount)).append("\n");
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
