/*
 * 团购活动用户申请退款订单列表
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
 * EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:30.282044+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("order_id")
  private String orderId = null;

  /**
   * * 退款申请单状态   * 1: 待确认   * 2: 已确认 
   */
  public enum StatusEnum {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    StatusEnum(Integer value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("create_time")
  private Integer createTime = null;

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 团购券码
   * @return code
  **/
  @Schema(required = true, description = "团购券码")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单id
   * @return orderId
  **/
  @Schema(required = true, description = "订单id")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * * 退款申请单状态   * 1: 待确认   * 2: 已确认 
   * @return status
  **/
  @Schema(required = true, description = "* 退款申请单状态   * 1: 待确认   * 2: 已确认 ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 订单名称
   * @return title
  **/
  @Schema(required = true, description = "订单名称")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 退款申请发起时间，unix时间戳
   * @return createTime
  **/
  @Schema(required = true, description = "退款申请发起时间，unix时间戳")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
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
    EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList inlineResponse200DataList = (EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList) o;
    return Objects.equals(this.code, inlineResponse200DataList.code) &&
        Objects.equals(this.orderId, inlineResponse200DataList.orderId) &&
        Objects.equals(this.status, inlineResponse200DataList.status) &&
        Objects.equals(this.title, inlineResponse200DataList.title) &&
        Objects.equals(this.createTime, inlineResponse200DataList.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, orderId, status, title, createTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
