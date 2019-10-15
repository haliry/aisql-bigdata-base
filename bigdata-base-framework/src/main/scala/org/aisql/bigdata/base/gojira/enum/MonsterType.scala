package org.aisql.bigdata.base.gojira.enum

/**
  * Author: xiaohei
  * Date: 2019/10/14
  * Email: xiaohei.info@gmail.com
  * Host: xiaohei.info
  */
object MonsterType extends Enumeration {
  type MonsterType = Value
  val BEAN = Value("Bean")
  val SPARK_DAO = Value("SparkDao")
  val SPARK_SERVICE = Value("SparkService")
}