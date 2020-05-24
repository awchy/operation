package com.dainel.operation.domain;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;


/**
 * entity:Heros
 * 
 * @author wangpengfei
 * @date 2020-5-24
 */
@Data
public class Heros implements Serializable {
      private Integer	id;
      private String	name;
      private float	hpMax;
      private float	hpGrowth;
      private float	hpStart;
      private float	mpMax;
      private float	mpGrowth;
      private float	mpStart;
      private float	attackMax;
      private float	attackGrowth;
      private float	attackStart;
      private float	defenseMax;
      private float	defenseGrowth;
      private float	defenseStart;
      private float	hp5sMax;
      private float	hp5sGrowth;
      private float	hp5sStart;
      private float	mp5sMax;
      private float	mp5sGrowth;
      private float	mp5sStart;
      private float	attackSpeedMax;
      private String	attackRange;
      private String	roleMain;
      private String	roleAssist;
      private Date	birthdate;
}
