object DemoGArray {
  def main(args: Array[String]): Unit = {
    var marks1 = Array (4,6,8)
    var marks2 = Array (9,6,8)
    var marks3 = Array (4,6,7)

    var marks = Array(marks1, marks2, marks3)
    for (marka <-marks; markb <- marka ){
      print(markb + " ")
    }

  }
}
