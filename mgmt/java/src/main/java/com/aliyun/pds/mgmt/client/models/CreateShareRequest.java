// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * create share request
 */
public class CreateShareRequest extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // drive_id
    @NameInMap("drive_id")
    @Validation(required = true, pattern = "[0-9]+")
    public String driveId;

    // expiration
    @NameInMap("expiration")
    public String expiration;

    // owner
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // owner_type
    @NameInMap("owner_type")
    public String ownerType;

    // permissions
    @NameInMap("permissions")
    public java.util.List<String> permissions;

    // share_file_id
    @NameInMap("share_file_id")
    public String shareFileId;

    // share_file_path
    @NameInMap("share_file_path")
    public String shareFilePath;

    // share_name
    @NameInMap("share_name")
    public String shareName;

    // share create policy
    // 
    // share_policy
    @NameInMap("share_policy")
    public java.util.List<SharePermissionPolicy> sharePolicy;

    // status
    @NameInMap("status")
    public String status;

    public static CreateShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShareRequest self = new CreateShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateShareRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateShareRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateShareRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CreateShareRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateShareRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public CreateShareRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public CreateShareRequest setShareFileId(String shareFileId) {
        this.shareFileId = shareFileId;
        return this;
    }
    public String getShareFileId() {
        return this.shareFileId;
    }

    public CreateShareRequest setShareFilePath(String shareFilePath) {
        this.shareFilePath = shareFilePath;
        return this;
    }
    public String getShareFilePath() {
        return this.shareFilePath;
    }

    public CreateShareRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CreateShareRequest setSharePolicy(java.util.List<SharePermissionPolicy> sharePolicy) {
        this.sharePolicy = sharePolicy;
        return this;
    }
    public java.util.List<SharePermissionPolicy> getSharePolicy() {
        return this.sharePolicy;
    }

    public CreateShareRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
