package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: FlowerSpecies @Author:
 * Strawberry @Description: @Date: 2022/02/01 12:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FlowerSpecies extends SourceEntity {
  private Long id;
  private Integer code;
  private String name;
  private String introduction;
  private Date createdTime;
  private Date updatedTime;
}
