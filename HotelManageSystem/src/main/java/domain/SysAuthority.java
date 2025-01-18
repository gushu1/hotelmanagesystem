package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 系统权限表
 * @TableName sys_authority
 */
@Data
public class SysAuthority implements Serializable {
    /**
     * 权限id
     */
    private String authorityId;

    /**
     * 权限名称，ROLE_开头，全大写
     */
    private String authorityName;

    /**
     * 权限描述
     */
    private String authorityRemark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 权限内容，可访问的url，多个时用,隔开
     */
    private String authorityContent;

    private static final long serialVersionUID = 1L;
}