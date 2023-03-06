package com.example.cloud.demoboothelloworld.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 产量趋势VO
 *
 * @author wwj
 * @since 2021.10.21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MesBoardCapacityTrendItemVO {

    /**
     * y轴数据,产量
     */
    @JsonProperty("yValue")
    private Double yValue;

    /**
     * x轴数据
     */
    @JsonProperty("xValue")
    private String xValue;
}
