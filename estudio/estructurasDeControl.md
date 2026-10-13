ESTRUCTURAS DE CONTROL: Bloques de código
    El bloque de código surge de la necesidad de agrupar y organizar múltiples instrucciones en una unidad lógica para que ciertas instrucciones se ejecuten juntas. Se suelen delimitar utilizando llaves {}.
    {
        instruccion 1;
        instruccion 2;
        ...
        ...
        instruccion N;
    }

class Ambito {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 20;
            System.out.println(a);
        }
        System.out.println(b);
    }
}

En este ejemplo, el primer sout imprime a = 10 pq las variables del ambito exterior son accesibles desde  ambitos interiores, por el otro lado, el segundo sout da error pq las variables del ambito interior NO son accesibles desde el ambito exterior.

ESTRUCTURAS DE CONTROL: Alternativas
    Condicion simple: Evaluar una condicion y ejecuta el bloque de codigo solo si esa condicion es verdadera
    if (condicion);
    
    Condicion con alternativa: Evalua una condicion y ofrece un segundo bloque de codigo como alternativo, si la condicion resulta ser falsa
    if (condicion);
      se ejecuta si la condicion es verdadera
    else;
      se ejecuta si la condicion es falsa