// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * Get user response
 */
public class GetUserResponse extends TeaModel {
    // 头像
    @NameInMap("avatar")
    public String avatar;

    // 用户创建时间
    @NameInMap("created_at")
    public Long createdAt;

    // 默认 Drive ID
    @NameInMap("default_drive_id")
    public String defaultDriveId;

    // 禁止用户自行修改密码
    @NameInMap("deny_change_password_by_self")
    public Boolean denyChangePasswordBySelf;

    // 用户备注信息
    @NameInMap("description")
    public String description;

    // Domain ID
    @NameInMap("domain_id")
    public String domainId;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 下次登录强制修改密码
    @NameInMap("need_change_password_next_login")
    public Boolean needChangePasswordNextLogin;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("permission")
    public java.util.Map<String, ?> permission;

    // 电话
    @NameInMap("phone")
    public String phone;

    // 用户处罚标志
    @NameInMap("punish_flag")
    public Long punishFlag;

    // 角色
    @NameInMap("role")
    public String role;

    // 用户状态
    @NameInMap("status")
    public String status;

    // 用户修改时间
    @NameInMap("updated_at")
    public Long updatedAt;

    // 用户自定义数据，格式为json，可用于配置项、少量临时数据等存储，不超过1K
    @NameInMap("user_data")
    public java.util.Map<String, ?> userData;

    // 用户 ID
    @NameInMap("user_id")
    public String userId;

    // 用户名称
    @NameInMap("user_name")
    public String userName;

    public static GetUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponse self = new GetUserResponse();
        return TeaModel.build(map, self);
    }

    public GetUserResponse setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public GetUserResponse setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetUserResponse setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public GetUserResponse setDenyChangePasswordBySelf(Boolean denyChangePasswordBySelf) {
        this.denyChangePasswordBySelf = denyChangePasswordBySelf;
        return this;
    }
    public Boolean getDenyChangePasswordBySelf() {
        return this.denyChangePasswordBySelf;
    }

    public GetUserResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetUserResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetUserResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetUserResponse setNeedChangePasswordNextLogin(Boolean needChangePasswordNextLogin) {
        this.needChangePasswordNextLogin = needChangePasswordNextLogin;
        return this;
    }
    public Boolean getNeedChangePasswordNextLogin() {
        return this.needChangePasswordNextLogin;
    }

    public GetUserResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetUserResponse setPermission(java.util.Map<String, ?> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, ?> getPermission() {
        return this.permission;
    }

    public GetUserResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetUserResponse setPunishFlag(Long punishFlag) {
        this.punishFlag = punishFlag;
        return this;
    }
    public Long getPunishFlag() {
        return this.punishFlag;
    }

    public GetUserResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetUserResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUserResponse setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public GetUserResponse setUserData(java.util.Map<String, ?> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, ?> getUserData() {
        return this.userData;
    }

    public GetUserResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
