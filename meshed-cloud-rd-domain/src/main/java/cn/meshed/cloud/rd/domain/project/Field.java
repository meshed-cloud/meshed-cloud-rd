package cn.meshed.cloud.rd.domain.project;

import cn.meshed.cloud.rd.domain.project.constant.GroupTypeEnum;
import cn.meshed.cloud.rd.project.enums.BaseGenericsEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author by Vincent Vic
 * @since 2023-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Field implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段类型（对象类型）
     */
    private String fieldType;

    /**
     * 字段泛型
     */
    private BaseGenericsEnum generic;

    /**
     * 字段描述
     */
    private String explain;

    /**
     * 字段不为空（布尔）
     */
    private Boolean nonNull;

    /**
     * 字段模拟数据
     */
    private String mock;

    /**
     * 字段规则 （json）
     */
    private String rule;

    /**
     * 分组ID（模型/服务的ID）
     */
    private String groupId;

    /**
     * 分组类型
     */
    private GroupTypeEnum groupType;

}
