package Editor;

import static org.junit.jupiter.api.Assertions.*;

class MetinTest {

    @org.junit.jupiter.api.Test
    void bulDegistir() {
        Metin metin = new Metin("Hello, world!");
        metin.bulDegistir("world", "friend");
        assertEquals("Hello, friend!", metin.getMetin());


    }

    @org.junit.jupiter.api.Test
    void aksiyonEkle() {
        Metin metin = new Metin("Hello, world!");
        metin.aksiyonEkle("Hi, world!");
        assertEquals("Hello, world!", metin.getMetin());
        metin.geriAlma();
        assertEquals("Hi, world!", metin.getMetin());
    }

    @org.junit.jupiter.api.Test
    void geriAlma() {
        Metin metin = new Metin("Hello, world!");
        metin.aksiyonEkle("Hi, world!");
        metin.geriAlma();
        assertEquals("Hi, world!", metin.getMetin());
        metin.geriAlma();
        assertEquals("Hello, world!", metin.getMetin());
        metin.geriAlma();
        assertEquals("Hello, world!", metin.getMetin());
    }


}