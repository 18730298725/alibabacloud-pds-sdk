<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Aliyun\PDS\SDK\Models;

use AlibabaCloud\Tea\Model;

/**
 * list share request
 */
class ListShareRequest extends Model {
    protected $_name = [
        'creator' => 'creator',
        'driveId' => 'drive_id',
        'limit' => 'limit',
        'marker' => 'marker',
        'owner' => 'owner',
        'ownerType' => 'owner_type',
        'shareFilePath' => 'share_file_path',
    ];
    public function validate() {
        Model::validatePattern('driveId', $this->driveId, '[0-9]+');
        Model::validateMaximum('limit', $this->limit, 100);
        Model::validateMinimum('limit', $this->limit, 1);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->driveId) {
            $res['drive_id'] = $this->driveId;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->marker) {
            $res['marker'] = $this->marker;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->ownerType) {
            $res['owner_type'] = $this->ownerType;
        }
        if (null !== $this->shareFilePath) {
            $res['share_file_path'] = $this->shareFilePath;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListShareRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['headers'])){
            $model->headers = $map['headers'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['drive_id'])){
            $model->driveId = $map['drive_id'];
        }
        if(isset($map['limit'])){
            $model->limit = $map['limit'];
        }
        if(isset($map['marker'])){
            $model->marker = $map['marker'];
        }
        if(isset($map['owner'])){
            $model->owner = $map['owner'];
        }
        if(isset($map['owner_type'])){
            $model->ownerType = $map['owner_type'];
        }
        if(isset($map['share_file_path'])){
            $model->shareFilePath = $map['share_file_path'];
        }
        return $model;
    }
    public $headers;

    /**
     * @description creator
     * @example tom
     * @var string
     */
    public $creator;

    /**
     * @example 1
     * @var string
     */
    public $driveId;

    /**
     * @description limit
     * @example 50
     * @var int
     */
    public $limit;

    /**
     * @description marker
     * @var string
     */
    public $marker;

    /**
     * @description Owner
     * @example jack
     * @var string
     */
    public $owner;

    /**
     * @description owner_type
     * @example group
     * @var string
     */
    public $ownerType;

    /**
     * @description share_file_path
     * @example /a/b/
     * @var string
     */
    public $shareFilePath;

}
