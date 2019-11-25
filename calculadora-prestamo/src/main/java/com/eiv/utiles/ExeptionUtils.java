package com.eiv.utiles;

import java.util.function.Supplier;

public class ExeptionUtils {
    
    public static Supplier<? extends RuntimeException> exeptionSupplier(
            String message, Object... args) {
        return () -> new RuntimeException(
                String.format(message, args));
    }

}
