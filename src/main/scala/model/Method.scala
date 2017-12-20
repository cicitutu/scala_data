package model

/**
  * 方法类：所有的方法在此类中
  */
object Method {
  /**
    * 12.20
    * 总分前五的学生
    * @param l
    */
  def TotalTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.chinese + a.english + a.mathematics > b.english + b.mathematics + b.chinese)
    println("总分第一名是：" + L(0).name + "分数是：" + (L(0).chinese + L(0).english + L(0).mathematics))
    println("总分第二名是：" + L(1).name + "分数是：" + (L(1).chinese + L(1).english + L(1).mathematics))
    println("总分第三名是：" + L(2).name + "分数是：" + (L(2).chinese + L(2).english + L(2).mathematics))
    println("总分第四名是：" + L(3).name + "分数是：" + (L(3).chinese + L(3).english + L(3).mathematics))
    println("总分第五名是：" + L(4).name + "分数是：" + (L(4).chinese + L(4).english + L(4).mathematics))
  }
  /**
    * 语文分前五的学生
    * @param l
    */
  def ChineseTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.chinese > b.chinese)
    println("语文第一名是：" + L(0).name + "分数是：" + L(0).chinese)
    println("语文第二名是：" + L(1).name + "分数是：" + L(1).chinese)
    println("语文第三名是：" + L(2).name + "分数是：" + L(2).chinese)
    println("语文第四名是：" + L(3).name + "分数是：" + L(3).chinese)
    println("语文第五名是：" + L(4).name + "分数是：" + L(4).chinese)
  }

  /**
    * 英语分前五的学生
    * @param l
    */
  def EnglishTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.english > b.english)
    println("英语第一名是：" + L(0).name + "分数是：" + L(0).english)
    println("英语第二名是：" + L(1).name + "分数是：" + L(1).english)
    println("英语第三名是：" + L(2).name + "分数是：" + L(2).english)
    println("英语第四名是：" + L(3).name + "分数是：" + L(3).english)
    println("英语第五名是：" + L(4).name + "分数是：" + L(4).english)
  }
  /**
    * 数学分前五的学生
    * @param l
    */
  def MathematicsTop5(l: List[Student]): List[Double] = {
    l.map(_.mathematics).sortWith((a, b) => a > b)
  }
  /**
    * 学生的语数外总分
    * @param l
    */
  def sum(l: List[Student], index: Int): Double = {
    l(index).english + l(index).mathematics + l(index).chinese
  }
  /**
    * 语文平均分
    * @param l
    */
  def ChineseAgv(l: List[Student]): Unit = {
    val a = BigDecimal(l.map(_.chinese).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
    println(a)
  }
  /**
    * 英语平均分
    * @param l
    */
  def EnglishAgv(l: List[Student]): Unit = {
    val a = BigDecimal(l.map(_.english).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
    println(a)
  }
  /**
    * 数学平均分
    * @param l
    */
  def MathematicsAgv(l: List[Student]): Unit = {
    val a = BigDecimal(l.map(_.mathematics).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
    println(a)
  }
  /**
    * 语文占比及人数
    * @param l
    */
  def ChineseLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.chinese).filter(_.<(60)).length
    val C = l.map(_.chinese).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.chinese).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.chinese).filter(_.>=(90)).length
    println("语文" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("语文" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("语文" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("语文" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
  }
  /**
    * 英语占比及人数
    * @param l
    */
  def EnglishLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.english).filter(_.<(60)).length
    val C = l.map(_.english).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.english).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.english).filter(_.>=(90)).length
    println("英语" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("英语" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("英语" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("英语" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
  }
  /**
    * 数学占比及人数
    * @param l
    */
  def MathematicsLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.mathematics).filter(_.<(60)).length
    val C = l.map(_.mathematics).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.mathematics).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.mathematics).filter(_.>=(90)).length
    println("数学" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("数学" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("数学" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
    println("数学" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")

  }
  /**
    * 班级总分前20
    * @param l
    */
  def TheClassTotalScoreTop20(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.chinese + a.mathematics + a.english > b.chinese + b.mathematics + b.english)
    for (i <- 0 to 19) {
      println(L(i).name + "是年级总分第" + (i + 1) + "名,分数是：" + sum(L, i))
    }
  }
  /**
    * 语文状元
    * @param l
    */
  def ChineseTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.chinese > b.chinese).head
    val W = w.sortWith((a: Student, b: Student) => a.chinese > b.chinese).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.chinese)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.chinese)
  }
  /**
    * 英语状元
    * @param l
    */
  def EnglishTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.english > b.english).head
    val W = w.sortWith((a: Student, b: Student) => a.english > b.english).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.english)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.english)
  }
  /**
    * 数学状元
    * @param l
    */
  def MathematicsTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.mathematics > b.mathematics).head
    val W = w.sortWith((a: Student, b: Student) => a.mathematics > b.mathematics).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.mathematics)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.mathematics)
  }
}
