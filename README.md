# hashCode e equals em Java

## hashCode

O método `hashCode` é um método da classe `Object` que retorna um número inteiro que representa um valor de hash do objeto. O valor de hash é usado para indexar coleções de objetos, como `HashMap`. Se dois objetos são iguais de acordo com o método `equals`, então eles devem retornar o mesmo valor de hash.

## equals

O método `equals` é um método da classe `Object` que compara se dois objetos são iguais. Se você sobrescrever o método `equals`, você também deve sobrescrever o método `hashCode`.

## Conclusão

Se você sobrescrever o método `equals`, você também deve sobrescrever o método `hashCode`. Se você não fizer isso, você pode ter problemas ao usar coleções de objetos, como `HashMap`. 

## Exemplo

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
```

Neste exemplo, a classe `Pessoa` sobrescreve os métodos `equals` e `hashCode`. O método `equals` compara se duas pessoas são iguais, enquanto o método `hashCode` retorna um valor de hash baseado no nome e idade da pessoa.

## Referências

- [Java hashCode() and equals() - GeeksforGeeks](https://www.geeksforgeeks.org/overriding-equals-method-in-java/)