package jsz.dk.huihua.entity;

import jsz.dk.huihua.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: huahui
 * @Package: jsz.dk.huahui.entity
 * @ClassName: FlowerItem
 * @Author: Strawberry
 * @Description:
 * @Date: 2022/02/01 12:01
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class FlowerItem extends SourceEntity {
    private Long id;
    private String name;
    private String scientificName;
    private Integer species;
    private Integer family;
    private Long creator;
    private BigDecimal price;
    private Integer priceType;
    private String origin;
    private String introduction;
    private Date createdTime;
    private Date updatedTme;
}
