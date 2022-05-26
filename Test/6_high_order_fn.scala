@main def run() =
    val salaries = Seq(10000, 30000, 20000)
    val doublesalaries = (x: Int)=> x*2
    val newsalaries = salaries.map(doublesalaries)