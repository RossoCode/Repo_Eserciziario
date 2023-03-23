package Java_Production.Exercise31_Records_ternaryOperator_BigInteger;

public record Person(String name, int age , String address ) {
    @Override
    public String toString() {
        return "Name = " + name +
                "\nAge = " + age +
                "\nAddress = " + address;
    }
}
