package model

case class Student ( id : Int,
                name : String ,
                sex : String,
                chinese : Double,
                mathematics : Double,
                english : Double,
                theClasses : String){
  override def toString: String = {
    "Student :[name:"+name+"sex:"+sex+"chinese:"+chinese+"mathematics:"+mathematics+"english:"+english+"theClasses:"+theClasses+"]"
  }
}
