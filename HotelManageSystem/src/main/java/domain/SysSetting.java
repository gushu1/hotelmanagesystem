package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 系统设置表
 * @TableName sys_setting
 */
@Data
public class SysSetting implements Serializable {
    /**
     * 表id
     */
    private String id;

    /**
     * 系统名称
     */
    private String sysName;

    /**
     * 系统logo图标
     */
    private String sysLogo;

    /**
     * 系统底部信息
     */
    private String sysBottomText;

    /**
     * 系统公告
     */
    private String sysNoticeText;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 用户管理：初始、重置密码
     */
    private String userInitPassword;

    /**
     * 系统颜色
     */
    private String sysColor;

    /**
     * API加密 Y/N
     */
    private String sysApiEncrypt;

    /**
     * OpenAPI限流 Y/N
     */
    private String sysOpenApiLimiterEncrypt;

    /**
     * 密码安全策略 Y/N
     */
    private String sysCheckPwdEncrypt;

    private static final long serialVersionUID = 1L;
}