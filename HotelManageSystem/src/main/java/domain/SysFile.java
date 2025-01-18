package domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 附件表
 * @TableName sys_file
 */
@Data
public class SysFile implements Serializable {
    /**
     * 表主键，附件id
     */
    private String id;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件类型
     */
    private String fileType;

    /**
     * 附件大小（MB）
     */
    private String fileSize;

    /**
     * 附件路径
     */
    private String filePath;

    private static final long serialVersionUID = 1L;
}