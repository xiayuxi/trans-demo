package com.example.demo.entity.mongo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 用户
 * @author muyuer 182443947@qq.com
 * @version 1.0
 * @date 2019-02-25 09:10
 */
@Data
@Document(collection = "mongo_user")
public class MongoUser {

    private static final long serialVersionUID = 1L;

    /**
     * Id
     */
    @Id
    private ObjectId id;
    /**
     * userId
     */
    private String userId;

    /**
     * userName
     */
    private String userName;

    /**
     * unitId 关联testUser
     */
    private String unitId;
}
