package com.mtr.smartpassengers;

import java.util.Random;

public final class PassengerNames {

    private static final Random RANDOM = new Random();

    private static final String[] NAMES = {
            "Steve",
            "Alex",
            "Pro Metro",
            "Чарли Фейл",
            "Джек Юг",
            "Владимир Владимирович",
            "Дональд Трамп",
            "создатель мода - дебил!"
    };

    private PassengerNames() {
    }

    public static String randomName() {
        return NAMES[RANDOM.nextInt(NAMES.length)];
    }
}
