package model

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource
import wangzx.scala_commons.sql._

/**
  * 查询数据库里的数据并封装成学生类
  * 12.20
  */
object JdbcData {
  val dataSource = {

    val ds = new MysqlDataSource
    ds.setURL(s"jdbc:mysql://127.0.0.1/student?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull")
    ds.setUser("root")
    ds.setPassword("cicitutu")
    ds
  }
  /**查找全部学生*/
  def findAllStudent():List[Student] ={
    dataSource.rows[Student]("select * from student").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }
  /**查找一班学生*/
  def findOneClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='一班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }
  /**查找二班学生*/
  def findTwoClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='二班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }
  /**查找三班学生*/
  def findThreeClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='三班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }
}
