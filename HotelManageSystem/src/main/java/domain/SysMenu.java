package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 系统菜单表
 * @TableName sys_menu
 */
@Data
public class SysMenu implements Serializable {
    /**
     * 菜单id
     */
    private String menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单路径
     */
    private String menuPath;

    /**
     * 上级id
     */
    private String menuParentId;

    /**
     * 同级排序权重：0-10
     */
    private Integer sortWeight;

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