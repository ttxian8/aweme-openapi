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

package com.douyin.open.api;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizeV2Api
 */
@Ignore
public class AuthorizeV2ApiTest {

    private final AuthorizeV2Api api = new AuthorizeV2Api();

    /**
     * 获取授权码(code)
     *
     * 注意该URL要在抖音端内的h5页面请求，这样才能带上抖音的登录态来获取用户的OpenId。 一旦clientKey有静默授权权限login_id，接口会以重定向的方式跳转到redirect_uri，并返回code。 拿到code之后再去调用https://open.douyin.com/oauth/access_token/。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthAuthorizeV2GetTest() {
        String clientKey = null;
        String responseType = null;
        String scope = null;
        String redirectUri = null;
        String state = null;
        api.oauthAuthorizeV2Get(clientKey, responseType, scope, redirectUri, state);

        // TODO: test validations
    }
}
