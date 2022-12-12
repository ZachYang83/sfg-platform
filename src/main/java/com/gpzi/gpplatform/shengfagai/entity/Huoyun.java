package com.gpzi.gpplatform.shengfagai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2022-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Huoyun implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @TableField("countyId")
    private Integer countyId;

    private String o;

    private String d;

    private String city;

    private Double ox;

    private Double oy;

    private Double dx;

    private Double dy;

    private String olonlat;

    private String dlonlat;

    private Long sum1;

    private Long sum2;


}
