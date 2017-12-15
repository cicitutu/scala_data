import com.mysql.jdbc.jdbc2.optional.MysqlDataSource

object JdbcData {
  val dataSource = {
    val ds = new MysqlDataSource
    ds.setURL(s"jdbc:mysql://127.0.0.1/student?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull")
    ds.setUser("root")
    ds.setPassword("cicitutu")
    ds
  }

}
