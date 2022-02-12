package jsz.dk.huihua.entity;

import jsz.dk.huihua.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui
 * @Package: jsz.dk.huahui.entity
 * @ClassName: FlowerStock
 * @Author: Strawberry
 * @Description:
 * @Date: 2022/02/01 12:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FlowerStock extends SourceEntity {
    private Long id;
    private Long itemId;
    private Integer quantityCount;
    private Integer soldCount;
    private Integer soldDay;
    private Integer soldMonth;
    private Integer soldDayMax;
    private Integer soldMonthMax;
    private Integer quantityRemain;
    private Date createdTime;
    private Date quantityUpdateTime;
    private Date updateTime;
}
