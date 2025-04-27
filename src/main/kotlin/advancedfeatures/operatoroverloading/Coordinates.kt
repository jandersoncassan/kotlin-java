package br.com.jandera.advancedfeatures.operatoroverloading

//podemos fazer o overloading de operadores, nesse caso estamos fazendo o overloading das operacões:
// soma (plus), subtração (minus), multiplicação (times) e divisão (div)
// importante sempre utilizar o mesmo nome caso contrario dara erro
data class Coordinates(var x:Int, var y:Int){

    operator fun plus(other: Coordinates): Coordinates{
        return Coordinates(x + other.x, y + other.y)
    }

    operator fun minus(other: Coordinates): Coordinates{
        return Coordinates(x - other.x, y - other.y)
    }

    operator fun times(other: Coordinates): Coordinates{
        return Coordinates(x * other.x, y * other.y)
    }

    operator fun div(other: Coordinates): Coordinates{
        return Coordinates(x / other.x, y / other.y)
    }
}


/*

🔢 Arithmetic Operators
Symbol | Function Name | Description
+      | plus          | Addition
-      | minus         | Subtraction
*      | times         | Multiplication
/      | div           | Division
%      | mod / rem     | Modulus (Remainder)
..     | rangeTo       | Creates a range

🧮 Assignment Operators
Symbol | Function Name | Description
+=     | plusAssign    | Add and assign
-=     | minusAssign   | Subtract and assign
*=     | timesAssign   | Multiply and assign
/=     | divAssign     | Divide and assign
%=     | remAssign     | Modulo and assign

*/
