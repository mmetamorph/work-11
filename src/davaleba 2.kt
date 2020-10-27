fun main () {


    val f1 = Fraction(8F, 16F)
    val f2 = Fraction(4F, 2F)
    println(f1.jami(f2))
    println(f1.namravli(f2))
    f1.shekveca()
}
open class Fraction(n: Float, d:Float) {
    private var numerator: Float = n
    private var denominator: Float = d
    override fun toString(): String {
        return "$numerator/$denominator"
    }
    fun jami(fraction: Fraction): Fraction {
        val k = denominator * fraction.denominator
        val v = k/denominator * numerator
        val z = k/fraction.denominator * fraction.numerator
        return Fraction(v+z, k)
    }
    fun namravli(fraction: Fraction): Fraction {
        val nN = numerator * fraction.numerator
        val dN = denominator * fraction.denominator
        return Fraction(nN, dN)
    }
    fun shekveca() {
        var a = numerator
        var b = denominator
        while( a != 0F && b != 0F ){
            if(a > b) {
                a = a % b
            }
            else {
                b = b % a
            }
        }
        val m = a+b
        val nn = numerator/m
        val dd = denominator/m
        this.denominator = dd
        this.numerator = nn
        println("$nn/$dd")
    }
}