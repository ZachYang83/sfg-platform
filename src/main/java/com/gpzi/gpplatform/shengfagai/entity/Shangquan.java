package com.gpzi.gpplatform.shengfagai.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2022-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Shangquan implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String quyu;

    private Long mon1;

    private Long mon2;

    private Long mon3;

    private Long mon4;

    private Long mon5;

    private Long mon6;

    private Long mon7;

    private Long mon8;

    private Long mon9;

    private Long mon10;

    private Double lon;

    private Double lat;

    private String geojson;


}
