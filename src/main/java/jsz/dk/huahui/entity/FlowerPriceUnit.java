package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: FlowerPriceUnit @Author:
 * Strawberry @Description: @Date: 2022/02/01 12:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FlowerPriceUnit extends SourceEntity {
  private Long id;
  private Integer code;
  private String name;
  private Date createdTime;
  private Date updatedTime;
}
