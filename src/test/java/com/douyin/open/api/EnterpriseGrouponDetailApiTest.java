/*
 * 团购活动详情
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.EnterpriseGrouponGrouponGrouponDetailInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseGrouponDetailApi
 */
@Ignore
public class EnterpriseGrouponDetailApiTest {

    private final EnterpriseGrouponDetailApi api = new EnterpriseGrouponDetailApi();

    /**
     * 团购活动详情
     *
     * * Scope: &#x60;enterprise.groupon&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseGrouponDetailGetTest() {
        String accessToken = null;
        String openId = null;
        List<String> grouponIds = null;
        EnterpriseGrouponGrouponGrouponDetailInlineResponse200 response = api.enterpriseGrouponDetailGet(accessToken, openId, grouponIds);

        // TODO: test validations
    }
}
