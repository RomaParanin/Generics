package main.java.converter;

public interface Converter<E, P> {
    P convert(E e);
}
