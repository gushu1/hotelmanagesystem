package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * persistent_logins表，用户实现记住我功能
 * @TableName persistent_logins
 */
@Data
public class PersistentLogins implements Serializable {
    /**
     * id
     */
    private String series;

    /**
     * 登陆账号
     */
    private String username;

    /**
     * cookie令牌
     */
    private String token;

    /**
     * 最后更新时间
     */

    private static final long serialVersionUID = 1L;
}