package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户快捷菜单表
 * @TableName sys_shortcut_menu
 */
@Data
public class SysShortcutMenu implements Serializable {
    /**
     * 用户快捷菜单id
     */
    private String shortcutMenuId;

    /**
     * 用户快捷菜单名称
     */
    private String shortcutMenuName;

    /**
     * 用户快捷菜单路径
     */
    private String shortcutMenuPath;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 上级id
     */
    private String shortcutMenuParentId;

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