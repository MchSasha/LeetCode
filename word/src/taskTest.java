import static org.junit.jupiter.api.Assertions.*;

class taskTest {

    @org.junit.jupiter.api.Test
    void equalFrequency1() {
        String a = "abcc";
        boolean b = task.equalFrequency(a);
        assertEquals(b, true);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency2() {
        String a = "aazz";
        boolean b = task.equalFrequency(a);
        assertEquals(b, false);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency3() {
        String a = "aadjcsdjojcsasdasasadsoopkadokpsoksadkoapzz";
        boolean b = task.equalFrequency(a);
        assertEquals(false, b);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency4(){
        String a = "bac";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency5() {
        String a = "bbac";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency6() {
        String a = "ddaccb";
        boolean b = task.equalFrequency(a);
        assertEquals(false, b);
    }
    @org.junit.jupiter.api.Test
    void equalFrequency7() {
        String a = "cccaa";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }
    @org.junit.jupiter.api.Test
    void equalFrequency8() {
        String a = "aca";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }
    @org.junit.jupiter.api.Test
    void equalFrequency9() {
        String a = "abbcc";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency10() {
        String a = "zz";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }

    @org.junit.jupiter.api.Test
    void equalFrequency11() {
        String a = "aaaaabb";
        boolean b = task.equalFrequency(a);
        assertEquals(false, b);
    }



    @org.junit.jupiter.api.Test
    void equalFrequency12() {
        String a = "xxvbv";
        boolean b = task.equalFrequency(a);
        assertEquals(true, b);
    }

}