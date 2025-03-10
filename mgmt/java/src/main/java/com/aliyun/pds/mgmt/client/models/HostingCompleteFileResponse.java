// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * complete file response
 */
public class HostingCompleteFileResponse extends TeaModel {
    // Content Hash
    @NameInMap("content_hash")
    public String contentHash;

    // content_hash_name
    @NameInMap("content_hash_name")
    public String contentHashName;

    // content_type
    @NameInMap("content_type")
    public String contentType;

    // crc
    @NameInMap("crc")
    public String crc;

    // crc64_hash
    @NameInMap("crc64_hash")
    public String crc64Hash;

    // created_at
    @NameInMap("created_at")
    public String createdAt;

    // description
    @NameInMap("description")
    public String description;

    // domain_id
    @NameInMap("domain_id")
    @Validation(pattern = "[a-z0-9A-Z]+")
    public String domainId;

    // download_url
    @NameInMap("download_url")
    public String downloadUrl;

    // drive_id
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    // file_extension
    @NameInMap("file_extension")
    public String fileExtension;

    // file_path
    @NameInMap("file_path")
    public String filePath;

    // name
    @NameInMap("name")
    @Validation(required = true, pattern = "[a-zA-Z0-9.-]{1,1000}")
    public String name;

    // parent_file_id
    @NameInMap("parent_file_path")
    @Validation(pattern = "[a-z0-9]{1,50}", maxLength = 50, minLength = 40)
    public String parentFilePath;

    // share_id
    @NameInMap("share_id")
    @Validation(pattern = "[0-9]+")
    public String shareId;

    // Size
    @NameInMap("size")
    @Validation(maximum = 53687091200D)
    public Long size;

    // status
    @NameInMap("status")
    public String status;

    // thumbnail
    @NameInMap("thumbnail")
    public String thumbnail;

    // trashed_at
    @NameInMap("trashed_at")
    public String trashedAt;

    // type
    @NameInMap("type")
    public String type;

    // updated_at
    @NameInMap("updated_at")
    public String updatedAt;

    // upload_id
    @NameInMap("upload_id")
    public String uploadId;

    // url
    @NameInMap("url")
    public String url;

    public static HostingCompleteFileResponse build(java.util.Map<String, ?> map) throws Exception {
        HostingCompleteFileResponse self = new HostingCompleteFileResponse();
        return TeaModel.build(map, self);
    }

    public HostingCompleteFileResponse setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public HostingCompleteFileResponse setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public HostingCompleteFileResponse setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public HostingCompleteFileResponse setCrc(String crc) {
        this.crc = crc;
        return this;
    }
    public String getCrc() {
        return this.crc;
    }

    public HostingCompleteFileResponse setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public HostingCompleteFileResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public HostingCompleteFileResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HostingCompleteFileResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public HostingCompleteFileResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public HostingCompleteFileResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public HostingCompleteFileResponse setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public HostingCompleteFileResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public HostingCompleteFileResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HostingCompleteFileResponse setParentFilePath(String parentFilePath) {
        this.parentFilePath = parentFilePath;
        return this;
    }
    public String getParentFilePath() {
        return this.parentFilePath;
    }

    public HostingCompleteFileResponse setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public HostingCompleteFileResponse setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public HostingCompleteFileResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public HostingCompleteFileResponse setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public HostingCompleteFileResponse setTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    public String getTrashedAt() {
        return this.trashedAt;
    }

    public HostingCompleteFileResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HostingCompleteFileResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public HostingCompleteFileResponse setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public HostingCompleteFileResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
