fun main(){
    //collect patient firstname//
    println("Please enter your first name.")
    val firstname : String = readLine() ?: ""
    //collect patient lastname//
    println("Please enter your last name")
    val lastname: String = readLine() ?: ""
    //collect patient address//
    println("Please enter your address")
    val address: String = readLine() ?:""
    //collect info about patient condition//
    println("Please share a bit aboout what is bothering you")
    val ailment: String = readLine() ?:""

    //output collected patient data to terminal//
    println(firstname)
    println(lastname)
    println(address)
    println(ailment)
