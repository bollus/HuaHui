package jsz.dk.huihua.entity;

import jsz.dk.huihua.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @ProjectName: huahui
 * @Package: jsz.dk.huahui.entity
 * @ClassName: OrderRecords
 * @Author: Strawberry
 * @Description:
 * @Date: 2022/02/12 19:36
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderRecords extends SourceEntity {
    private Long orderNo;
    private String tradeNo;
    private Integer tradeType;
    private Integer tradeState;
    private Long guideId;
    private Long operatorId;
    private Long buyerId;
    private BigDecimal OrderAmount;
    private BigDecimal tradeAmount;
    private Integer orderQuantity;
    private Integer isBill;
}
