package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: UserRoles @Author:
 * Strawberry @Description: 用户角色实体 @Date: 2022/01/31 3:13
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserRoles extends SourceEntity {
  private Long id;
  /** 角色名称 */
  private String name;

  /** 角色简介 */
  private String introduction;

  /** 创建时间 */
  private Date createdTime;

  /** 更新时间 */
  private Date updatedTime;
}
