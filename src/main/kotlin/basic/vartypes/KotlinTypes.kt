package br.com.jandera.basic.vartypes


fun main(){

    val sImutavel: String = "variavel imutavel, NAO PODE mudar"
    var sMutavel: String = "variavel mutavel, PODE mudar"

    val myPhrase = "i'm a String";
    val myPi = 3.14;
    val myAnswer = 42;

    //== CASO NAO INFORME O VALOR O TIPO PRECISA SER INFORMADO
    val aString: String;
    val aDouble: Double;
    val aInt: Int;

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 99999999999999L
    val myInt = 199
    val myShort: Short = 12
    val myByte: Byte= -127  // -127 a 127

    //==NUMEROS MUITOS GRANDES , PODEMOS UTILIZA '_' PARA SEPARAR OS NUMEROS PARA FACILITAR A LEITURA MAS NAO ALTERA NADA NA CONSISTENCIA
    val aLongNumber = 123_456_789
    val aSameNumber = 123456789
    println(aLongNumber)

    // DIFERENTE DO JAVA KOTLIN NAO FAZ CAST IMPLICITO, PRECISAMOS DECLARAR
    val aInt2: Int= 7
    val aLong2: Long = aInt2.toLong()


}