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
 * @since 2022-12-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Industry implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String city;

    private String county;

    private Long work1;

    private Long work2;

    private Long work3;

    private Long work4;

    private Long work5;

    private Long work6;

    private Long work7;

    private Long work8;

    private Long work9;

    private Long work10;

    private Long flow1;

    private Long flow2;

    private Long flow3;

    private Long flow4;

    private Long flow5;

    private Long flow6;

    private Long flow7;

    private Long flow8;

    private Long flow9;

    private Long flow10;

    private String geojson;

    private Double lon;

    private Double lat;
}
