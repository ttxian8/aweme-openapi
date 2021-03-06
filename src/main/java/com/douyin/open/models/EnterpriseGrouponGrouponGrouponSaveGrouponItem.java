/*
 * 创建团购活动
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
import com.douyin.open.models.EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseGrouponGrouponGrouponSaveGrouponItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:07.343758+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponGrouponSaveGrouponItem {
  @JsonProperty("groupon_id")
  private String grouponId = null;

  /**
   * * 团购使用方式   * 1: 到店核销 
   */
  public enum UseTypeEnum {
    NUMBER_1(1);

    private Integer value;

    UseTypeEnum(Integer value) {
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
    public static UseTypeEnum fromValue(String text) {
      for (UseTypeEnum b : UseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("use_type")
  private UseTypeEnum useType = null;

  /**
   * * 券码生成的方式   * 1: 系统生成   * 2: 自定义上传 
   */
  public enum CodeTypeEnum {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    CodeTypeEnum(Integer value) {
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
    public static CodeTypeEnum fromValue(String text) {
      for (CodeTypeEnum b : CodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("code_type")
  private CodeTypeEnum codeType = CodeTypeEnum.NUMBER_1;

  @JsonProperty("merchant_name")
  private String merchantName = null;

  @JsonProperty("service_number")
  private String serviceNumber = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("cover_images")
  private List<String> coverImages = new ArrayList<>();

  @JsonProperty("original_amount")
  private Integer originalAmount = null;

  @JsonProperty("actual_amount")
  private Integer actualAmount = null;

  @JsonProperty("notification")
  private String notification = null;

  @JsonProperty("order_limit")
  private Integer orderLimit = null;

  @JsonProperty("stock")
  private Integer stock = null;

  @JsonProperty("poi_ids")
  private List<String> poiIds = null;

  @JsonProperty("groupon_goods")
  private List<EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods> grouponGoods = new ArrayList<>();

  @JsonProperty("start_time")
  private Long startTime = null;

  @JsonProperty("end_time")
  private Long endTime = null;

  @JsonProperty("h5_url")
  private String h5Url = null;

  /**
   * * 活动状态 创建时可以忽略  * 1：有效  * 2：审核中  * 3：审核失败  * 4：中止 
   */
  public enum StatusEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

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

  @JsonProperty("sold_count")
  private Integer soldCount = null;

  @JsonProperty("audit_msg")
  private String auditMsg = null;

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem grouponId(String grouponId) {
    this.grouponId = grouponId;
    return this;
  }

   /**
   * 团购活动Id，审核失败修改用
   * @return grouponId
  **/
  @Schema(description = "团购活动Id，审核失败修改用")
  public String getGrouponId() {
    return grouponId;
  }

  public void setGrouponId(String grouponId) {
    this.grouponId = grouponId;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem useType(UseTypeEnum useType) {
    this.useType = useType;
    return this;
  }

   /**
   * * 团购使用方式   * 1: 到店核销 
   * @return useType
  **/
  @Schema(required = true, description = "* 团购使用方式   * 1: 到店核销 ")
  public UseTypeEnum getUseType() {
    return useType;
  }

  public void setUseType(UseTypeEnum useType) {
    this.useType = useType;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem codeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
    return this;
  }

   /**
   * * 券码生成的方式   * 1: 系统生成   * 2: 自定义上传 
   * @return codeType
  **/
  @Schema(example = "1", required = true, description = "* 券码生成的方式   * 1: 系统生成   * 2: 自定义上传 ")
  public CodeTypeEnum getCodeType() {
    return codeType;
  }

  public void setCodeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商户名称
   * @return merchantName
  **/
  @Schema(example = "商户名称、用于展示在卡券页", required = true, description = "商户名称")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem serviceNumber(String serviceNumber) {
    this.serviceNumber = serviceNumber;
    return this;
  }

   /**
   * 联系电话
   * @return serviceNumber
  **/
  @Schema(example = "400-xxx-800", required = true, description = "联系电话")
  public String getServiceNumber() {
    return serviceNumber;
  }

  public void setServiceNumber(String serviceNumber) {
    this.serviceNumber = serviceNumber;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 卡券标题
   * @return title
  **/
  @Schema(example = "这是标题", required = true, description = "卡券标题")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem coverImages(List<String> coverImages) {
    this.coverImages = coverImages;
    return this;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem addCoverImagesItem(String coverImagesItem) {
    this.coverImages.add(coverImagesItem);
    return this;
  }

   /**
   * 封面图
   * @return coverImages
  **/
  @Schema(required = true, description = "封面图")
  public List<String> getCoverImages() {
    return coverImages;
  }

  public void setCoverImages(List<String> coverImages) {
    this.coverImages = coverImages;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem originalAmount(Integer originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * 原价(单位分)
   * minimum: 1
   * @return originalAmount
  **/
  @Schema(example = "100", required = true, description = "原价(单位分)")
  public Integer getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Integer originalAmount) {
    this.originalAmount = originalAmount;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem actualAmount(Integer actualAmount) {
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * 实际金额(单位分)
   * minimum: 1
   * @return actualAmount
  **/
  @Schema(example = "100", required = true, description = "实际金额(单位分)")
  public Integer getActualAmount() {
    return actualAmount;
  }

  public void setActualAmount(Integer actualAmount) {
    this.actualAmount = actualAmount;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * 团购须知
   * @return notification
  **/
  @Schema(example = "团购须知呢", required = true, description = "团购须知")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem orderLimit(Integer orderLimit) {
    this.orderLimit = orderLimit;
    return this;
  }

   /**
   * 单用户购买数量上限
   * minimum: 1
   * @return orderLimit
  **/
  @Schema(example = "3", required = true, description = "单用户购买数量上限")
  public Integer getOrderLimit() {
    return orderLimit;
  }

  public void setOrderLimit(Integer orderLimit) {
    this.orderLimit = orderLimit;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * 团购活动库存总数
   * @return stock
  **/
  @Schema(example = "200", required = true, description = "团购活动库存总数")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem poiIds(List<String> poiIds) {
    this.poiIds = poiIds;
    return this;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem addPoiIdsItem(String poiIdsItem) {
    if (this.poiIds == null) {
      this.poiIds = new ArrayList<>();
    }
    this.poiIds.add(poiIdsItem);
    return this;
  }

   /**
   * * 绑定的POI 列表 默认展示全部门店 
   * @return poiIds
  **/
  @Schema(description = "* 绑定的POI 列表 默认展示全部门店 ")
  public List<String> getPoiIds() {
    return poiIds;
  }

  public void setPoiIds(List<String> poiIds) {
    this.poiIds = poiIds;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem grouponGoods(List<EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods> grouponGoods) {
    this.grouponGoods = grouponGoods;
    return this;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem addGrouponGoodsItem(EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods grouponGoodsItem) {
    this.grouponGoods.add(grouponGoodsItem);
    return this;
  }

   /**
   * 团购商品
   * @return grouponGoods
  **/
  @Schema(required = true, description = "团购商品")
  public List<EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods> getGrouponGoods() {
    return grouponGoods;
  }

  public void setGrouponGoods(List<EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods> grouponGoods) {
    this.grouponGoods = grouponGoods;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * * 活动开始时间 unix time 
   * @return startTime
  **/
  @Schema(example = "123343214", required = true, description = "* 活动开始时间 unix time ")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * * 活动截止时间 unix time 
   * @return endTime
  **/
  @Schema(required = true, description = "* 活动截止时间 unix time ")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem h5Url(String h5Url) {
    this.h5Url = h5Url;
    return this;
  }

   /**
   * 团购活动详情页链接
   * @return h5Url
  **/
  @Schema(required = true, description = "团购活动详情页链接")
  public String getH5Url() {
    return h5Url;
  }

  public void setH5Url(String h5Url) {
    this.h5Url = h5Url;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * * 活动状态 创建时可以忽略  * 1：有效  * 2：审核中  * 3：审核失败  * 4：中止 
   * @return status
  **/
  @Schema(description = "* 活动状态 创建时可以忽略  * 1：有效  * 2：审核中  * 3：审核失败  * 4：中止 ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem soldCount(Integer soldCount) {
    this.soldCount = soldCount;
    return this;
  }

   /**
   * 已售出数量
   * @return soldCount
  **/
  @Schema(description = "已售出数量")
  public Integer getSoldCount() {
    return soldCount;
  }

  public void setSoldCount(Integer soldCount) {
    this.soldCount = soldCount;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItem auditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
    return this;
  }

   /**
   * 审核失败原因
   * @return auditMsg
  **/
  @Schema(description = "审核失败原因")
  public String getAuditMsg() {
    return auditMsg;
  }

  public void setAuditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponGrouponSaveGrouponItem grouponItem = (EnterpriseGrouponGrouponGrouponSaveGrouponItem) o;
    return Objects.equals(this.grouponId, grouponItem.grouponId) &&
        Objects.equals(this.useType, grouponItem.useType) &&
        Objects.equals(this.codeType, grouponItem.codeType) &&
        Objects.equals(this.merchantName, grouponItem.merchantName) &&
        Objects.equals(this.serviceNumber, grouponItem.serviceNumber) &&
        Objects.equals(this.title, grouponItem.title) &&
        Objects.equals(this.coverImages, grouponItem.coverImages) &&
        Objects.equals(this.originalAmount, grouponItem.originalAmount) &&
        Objects.equals(this.actualAmount, grouponItem.actualAmount) &&
        Objects.equals(this.notification, grouponItem.notification) &&
        Objects.equals(this.orderLimit, grouponItem.orderLimit) &&
        Objects.equals(this.stock, grouponItem.stock) &&
        Objects.equals(this.poiIds, grouponItem.poiIds) &&
        Objects.equals(this.grouponGoods, grouponItem.grouponGoods) &&
        Objects.equals(this.startTime, grouponItem.startTime) &&
        Objects.equals(this.endTime, grouponItem.endTime) &&
        Objects.equals(this.h5Url, grouponItem.h5Url) &&
        Objects.equals(this.status, grouponItem.status) &&
        Objects.equals(this.soldCount, grouponItem.soldCount) &&
        Objects.equals(this.auditMsg, grouponItem.auditMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouponId, useType, codeType, merchantName, serviceNumber, title, coverImages, originalAmount, actualAmount, notification, orderLimit, stock, poiIds, grouponGoods, startTime, endTime, h5Url, status, soldCount, auditMsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponGrouponSaveGrouponItem {\n");
    
    sb.append("    grouponId: ").append(toIndentedString(grouponId)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    serviceNumber: ").append(toIndentedString(serviceNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    coverImages: ").append(toIndentedString(coverImages)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    actualAmount: ").append(toIndentedString(actualAmount)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    orderLimit: ").append(toIndentedString(orderLimit)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    poiIds: ").append(toIndentedString(poiIds)).append("\n");
    sb.append("    grouponGoods: ").append(toIndentedString(grouponGoods)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    h5Url: ").append(toIndentedString(h5Url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    auditMsg: ").append(toIndentedString(auditMsg)).append("\n");
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
