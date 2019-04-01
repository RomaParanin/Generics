package main.java.converter;

public interface Converter<E, P> {
    P convertToUser(E e);
    E convertToUserDTO(P p);
}
