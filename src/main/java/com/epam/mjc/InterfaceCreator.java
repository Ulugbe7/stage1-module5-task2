package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (x) -> x.stream().map(integer -> integer / divider).collect(Collectors.toList());
    }
}
