package model

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource
import wangzx.scala_commons.sql._

object JdbcData {
  val dataSource = {

    val ds = new MysqlDataSource
    ds.setURL(s"jdbc:mysql://127.0.0.1/student?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull")
    ds.setUser("root")
    ds.setPassword("cicitutu")
    ds
  }

  def findAllStudent():List[Student] ={
    dataSource.rows[Student]("select * from student").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }

  def findOneClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='一班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }

  def findTwoClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='二班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }

  def findThreeClassesStudent():List[Student]={
    dataSource.rows[Student]("select * from student where theClasses='三班'").map(x => Student(x.id,x.name,x.sex,x.chinese,x.mathematics,x.english,x.theClasses))
  }
}
