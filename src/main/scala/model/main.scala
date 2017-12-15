package model

object main {
  def main(args: Array[String]): Unit = {
    /*
      全年级的学生
     */
    val s = JdbcData.findAllStudent()
    /*
       一班的学生
     */
    val sone = JdbcData.findOneClassesStudent()
    /*
      二班学生
     */
    val stwo = JdbcData.findTwoClassesStudent()
    /*
      三班学生
     */
    val sthree = JdbcData.findThreeClassesStudent()
    println("一班的语文前五是：")
    Method.ChineseTop5(sone)
    println("--------------------------------")
    println("一班的数学前五是：")
    val L = Method.MathematicsTop5(sone)
    println("数学第一名分数是：" + L(0))
    println("数学第二名分数是：" + L(1))
    println("数学第三名分数是：" + L(2))
    println("数学第四名分数是：" + L(3))
    println("数学第五名分数是：" + L(4))
    println("--------------------------------")
    println("一班的英语前五是：")
    Method.EnglishTop5(sone)
    println("--------------------------------")
    println("一班的总分前五是：")
    Method.TotalTop5(sone)
    println("--------------------------------")
    println("二班的语文前五是：")
    Method.ChineseTop5(stwo)
    println("--------------------------------")
    println("二班的数学前五是：")
    val N = Method.MathematicsTop5(stwo)
    println("数学第一名分数是：" + N(0))
    println("数学第二名分数是：" + N(1))
    println("数学第三名分数是：" + N(2))
    println("数学第四名分数是：" + N(3))
    println("数学第五名分数是：" + N(4))
    println("--------------------------------")
    println("二班的英语前五是：")
    Method.EnglishTop5(stwo)
    println("--------------------------------")
    println("二班的总分前五是：")
    Method.TotalTop5(stwo)
    println("--------------------------------")
    println("三班的语文前五是：")
    Method.ChineseTop5(sthree)
    println("--------------------------------")
    println("三班的数学前五是：")
    val f = Method.MathematicsTop5(sthree)
    println("数学第一名分数是：" + f(0))
    println("数学第二名分数是：" + f(1))
    println("数学第三名分数是：" + f(2))
    println("数学第四名分数是：" + f(3))
    println("数学第五名分数是：" + f(4))
    println("--------------------------------")
    println("三班的英语前五是：")
    Method.EnglishTop5(sthree)
    println("--------------------------------")
    println("三班的总分前五是：")
    Method.TotalTop5(sthree)
    println("--------------------------------")

    println("语文平均分:")
    Method.ChineseAgv(s)
    println("--------------------------------")
    println("数学平均分：")
    Method.MathematicsAgv(s)
    println("--------------------------------")
    println("英语平均分：")
    Method.EnglishAgv(s)
    println("--------------------------------")
    println("语文成绩人数及比例:")
    Method.ChineseLevel(s)
    println("--------------------------------")
    println("英语成绩人数及比例:")
    Method.EnglishLevel(s)
    println("--------------------------------")
    println("数学成绩人数及比例:")
    Method.MathematicsLevel(s)
    println("--------------------------------")
    println("全年级总分前20名的是:")
    Method.TheClassTotalScoreTop20(s)
    println("--------------------------------")
    Method.ChineseTop1(s)
    println("--------------------------------")
    Method.EnglishTop1(s)
    println("--------------------------------")
    Method.MathematicsTop1(s)
  }
//  def TotalTop5(l: List[Student]): Unit = {
//    val L = l.sortWith((a: Student, b: Student) => a.chinese + a.english + a.mathematics > b.english + b.mathematics + b.chinese)
//    println("总分第一名是：" + L(0).name + "分数是：" + (L(0).chinese + L(0).english + L(0).mathematics))
//    println("总分第二名是：" + L(1).name + "分数是：" + (L(1).chinese + L(1).english + L(1).mathematics))
//    println("总分第三名是：" + L(2).name + "分数是：" + (L(2).chinese + L(2).english + L(2).mathematics))
//    println("总分第四名是：" + L(3).name + "分数是：" + (L(3).chinese + L(3).english + L(3).mathematics))
//    println("总分第五名是：" + L(4).name + "分数是：" + (L(4).chinese + L(4).english + L(4).mathematics))
//  }
//
//  def ChineseTop5(l: List[Student]): Unit = {
//    val L = l.sortWith((a: Student, b: Student) => a.chinese > b.chinese)
//    println("语文第一名是：" + L(0).name + "分数是：" + L(0).chinese)
//    println("语文第二名是：" + L(1).name + "分数是：" + L(1).chinese)
//    println("语文第三名是：" + L(2).name + "分数是：" + L(2).chinese)
//    println("语文第四名是：" + L(3).name + "分数是：" + L(3).chinese)
//    println("语文第五名是：" + L(4).name + "分数是：" + L(4).chinese)
//  }
//
//
//  def EnglishTop5(l: List[Student]): Unit = {
//    val L = l.sortWith((a: Student, b: Student) => a.english > b.english)
//    println("英语第一名是：" + L(0).name + "分数是：" + L(0).english)
//    println("英语第二名是：" + L(1).name + "分数是：" + L(1).english)
//    println("英语第三名是：" + L(2).name + "分数是：" + L(2).english)
//    println("英语第四名是：" + L(3).name + "分数是：" + L(3).english)
//    println("英语第五名是：" + L(4).name + "分数是：" + L(4).english)
//  }
//
//  def MathematicsTop5(l: List[Student]): List[Double] = {
//    l.map(_.mathematics).sortWith((a, b) => a > b)
//  }
//
//  def sum(l: List[Student], index: Int): Double = {
//    l(index).english + l(index).mathematics + l(index).chinese
//  }
//
//  def ChineseAgv(l: List[Student]): Unit = {
//    val a = BigDecimal(l.map(_.chinese).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
//    println(a)
//  }
//
//  def EnglishAgv(l: List[Student]): Unit = {
//    val a = BigDecimal(l.map(_.english).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
//    println(a)
//  }
//
//  def MathematicsAgv(l: List[Student]): Unit = {
//    val a = BigDecimal(l.map(_.mathematics).sum)./(l.length).setScale(2,BigDecimal.RoundingMode.HALF_UP)
//    println(a)
//  }
//
//  def ChineseLevel(l: List[Student]): Unit = {
//    val len: Double = l.length
//    val D = l.map(_.chinese).filter(_.<(60)).length
//    val C = l.map(_.chinese).filter(_.<(75)).filter(_.>=(60)).length
//    val B = l.map(_.chinese).filter(_.<(90)).filter(_.>=(75)).length
//    val A = l.map(_.chinese).filter(_.>=(90)).length
//    println("语文" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("语文" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("语文" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("语文" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//  }
//
//  def EnglishLevel(l: List[Student]): Unit = {
//    val len: Double = l.length
//    val D = l.map(_.english).filter(_.<(60)).length
//    val C = l.map(_.english).filter(_.<(75)).filter(_.>=(60)).length
//    val B = l.map(_.english).filter(_.<(90)).filter(_.>=(75)).length
//    val A = l.map(_.english).filter(_.>=(90)).length
//    println("英语" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("英语" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("英语" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("英语" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//  }
//
//  def MathematicsLevel(l: List[Student]): Unit = {
//    val len: Double = l.length
//    val D = l.map(_.mathematics).filter(_.<(60)).length
//    val C = l.map(_.mathematics).filter(_.<(75)).filter(_.>=(60)).length
//    val B = l.map(_.mathematics).filter(_.<(90)).filter(_.>=(75)).length
//    val A = l.map(_.mathematics).filter(_.>=(90)).length
//    println("数学" + A + "人：优。占比：" + BigDecimal(A)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("数学" + B + "人：良。占比：" + BigDecimal(B)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("数学" + C + "人：及格。占比：" + BigDecimal(C)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//    println("数学" + D + "人：不及格。占比：" + BigDecimal(D)./(len).setScale(2,BigDecimal.RoundingMode.HALF_UP)*100+"%")
//
//  }
//
//  def TheClassTotalScoreTop20(l: List[Student]): Unit = {
//    val L = l.sortWith((a: Student, b: Student) => a.chinese + a.mathematics + a.english > b.chinese + b.mathematics + b.english)
//    for (i <- 0 to 19) {
//      println(L(i).name + "是年级总分第" + (i + 1) + "名,分数是：" + sum(L, i))
//    }
//  }
//
//  def ChineseTop1(l: List[Student]): Unit = {
//    val m = l.filter(_.sex == "男")
//    val w = l.filter(_.sex == "女")
//    val M = m.sortWith((a: Student, b: Student) => a.chinese > b.chinese).head
//    val W = w.sortWith((a: Student, b: Student) => a.chinese > b.chinese).head
//    println("全年级语文男状元是：" + M.name + "分数为:" + M.chinese)
//    println("全年级语文女状元是：" + W.name + "分数为:" + W.chinese)
//  }
//
//  def EnglishTop1(l: List[Student]): Unit = {
//    val m = l.filter(_.sex == "男")
//    val w = l.filter(_.sex == "女")
//    val M = m.sortWith((a: Student, b: Student) => a.english > b.english).head
//    val W = w.sortWith((a: Student, b: Student) => a.english > b.english).head
//    println("全年级语文男状元是：" + M.name + "分数为:" + M.english)
//    println("全年级语文女状元是：" + W.name + "分数为:" + W.english)
//  }
//
//  def MathematicsTop1(l: List[Student]): Unit = {
//    val m = l.filter(_.sex == "男")
//    val w = l.filter(_.sex == "女")
//    val M = m.sortWith((a: Student, b: Student) => a.mathematics > b.mathematics).head
//    val W = w.sortWith((a: Student, b: Student) => a.mathematics > b.mathematics).head
//    println("全年级语文男状元是：" + M.name + "分数为:" + M.mathematics)
//    println("全年级语文女状元是：" + W.name + "分数为:" + W.mathematics)
//  }
}
