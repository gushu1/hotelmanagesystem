package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户菜单表
 * @TableName sys_user_menu
 */
@Data
public class SysUserMenu implements Serializable {
    /**
     * 用户菜单表id
     */
    private String userMenuId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 菜单id
     */
    private String menuId;

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