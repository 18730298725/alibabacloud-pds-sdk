// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class MobileSendSmsCodeRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    // App ID, 当前访问的App
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 图片验证码ID
    @NameInMap("captcha_id")
    public String captchaId;

    // 用户输入的验证码值
    @NameInMap("captcha_text")
    public String captchaText;

    // 环境参数
    @NameInMap("nvc_param")
    @Validation(required = true)
    public String nvcParam;

    // 待发送验证短信的手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 国家编号，默认86，不需要填+号，直接填数字
    @NameInMap("phone_region")
    public String phoneRegion;

    // 验证码用途, 可下发: login、register、change_password
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static MobileSendSmsCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileSendSmsCodeRequest self = new MobileSendSmsCodeRequest();
        return TeaModel.build(map, self);
    }

    public MobileSendSmsCodeRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public MobileSendSmsCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MobileSendSmsCodeRequest setCaptchaId(String captchaId) {
        this.captchaId = captchaId;
        return this;
    }
    public String getCaptchaId() {
        return this.captchaId;
    }

    public MobileSendSmsCodeRequest setCaptchaText(String captchaText) {
        this.captchaText = captchaText;
        return this;
    }
    public String getCaptchaText() {
        return this.captchaText;
    }

    public MobileSendSmsCodeRequest setNvcParam(String nvcParam) {
        this.nvcParam = nvcParam;
        return this;
    }
    public String getNvcParam() {
        return this.nvcParam;
    }

    public MobileSendSmsCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public MobileSendSmsCodeRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public MobileSendSmsCodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
