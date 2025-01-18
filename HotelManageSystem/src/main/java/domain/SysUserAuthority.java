package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户权限表
 * @TableName sys_user_authority
 */
@Data
public class SysUserAuthority implements Serializable {
    /**
     * 用户权限表id
     */
    private String userAuthorityId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 权限id
     */
    private String authorityId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}