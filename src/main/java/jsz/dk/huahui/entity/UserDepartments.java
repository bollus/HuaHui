package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: UserDepartments @Author:
 * Strawberry @Description: 部门实体类 @Date: 2022/02/12 19:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDepartments extends SourceEntity {
  private String name;
  private String introduction;
  private Long leaderId;
  private String contactPhone;
  private String contactEmail;
  private String contactAddress;
}
